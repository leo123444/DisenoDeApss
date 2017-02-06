package es.ulpgc.eite.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class Modelo  extends AppCompatActivity{





    


    
   
  
 public Presentador presentador;

    boolean trueAnswer;
    int quizIndex;
    boolean[] userAnswers = new boolean[20];
    boolean[] quizAnswers = {
            true, // 1
            false, // 2
            false, // 3
            true, // 4
            true, // 5
            true, // 6
            false, // 7
            true, // 8
            false, // 9
            false, // 10
            true, // 11
            true, // 12
            true, // 13
            false, // 14
            true, // 15
            true, // 16
            false, // 17
            false, // 18
            false, // 19
            true // 20
    };
    private QuestionState questionState;
    CheatState cheatState;
    private QuestionStore questionStore;


    public Modelo(){
     this.presentador= new Presentador();
 }



    public void backToQuestionScreen( Presentador presentador){
        presentador.finish();
    }

    public void goToCheatScreen(QuestionActivity activity){
        cheatState = new CheatState();
         cheatState.toolbarVisible = false;
        cheatState.answerVisible = false;
          cheatState.answerBtnClicked =           questionState.answerBtnClicked;


        activity.startActivity(new Intent(activity, Presentador.class));
    }

    private class QuestionState {
        boolean toolbarVisible;
        boolean answerVisible;
        boolean answerBtnClicked;

    }




    private class CheatState {
        boolean toolbarVisible;
        boolean answerVisible;
        boolean answerBtnClicked;
    }






}
