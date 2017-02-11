package es.ulpgc.eite.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class Modelo  extends AppCompatActivity{





    


    
   public Mediador mediador;
  
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

    public Modelo(Mediador mediador) {
       this.mediador= mediador;
       this.presentador= mediador.getPresentador();
    }


    public void backToQuestionScreen( Presentador presentador){
        presentador.finish();
    }

   
}
