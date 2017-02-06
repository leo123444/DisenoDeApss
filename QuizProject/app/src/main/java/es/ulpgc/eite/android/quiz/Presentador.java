package es.ulpgc.eite.android.quiz;

import android.support.v7.app.AppCompatActivity;

public class Presentador extends AppCompatActivity{
   Modelo modelo;
    Vista vista;
  boolean answerBtnClicked;

boolean confirmBtnClicked;

 public Presentador(){

        this.modelo=new Modelo();
        this.vista=new Vista();



 }

    public Modelo getQuestionStore() {
        return modelo;
    }


    public String getCurrentAnswer() {
        if(modelo.quizAnswers[modelo.quizIndex] == modelo.userAnswers[modelo.quizIndex]) {
            return vista.correctLabel;
        } else {
            return vista.incorrectLabel;
        }
    }

    void onScreenStarted() {
        //quizApp = (QuizApp) getApplication();


       vista. setButtonLabels();
       vista. checkVisibility();


        if(isAnswerBtnClicked()){
          vista.  setAnswer(getCurrentAnswer());
        }
    }
    void onFalseBtnClicked() {
        finish();
        //quizApp.backToQuestionScreen(this);
    }

    void onTrueBtnClicked() {
      vista.  setAnswer(getAnswer());
        vista.setAnswerVisibility(true);
        confirmBtnClicked = true;
       vista. checkAnswerVisibility();
    }






    private String getAnswer() {
        if(modelo.trueAnswer) {
            return vista.trueLabel;
        } else {
            return vista.falseLabel;
        }
    }

    



    public String getCurrentQuestion() {
        return vista.quizQuestions[modelo.quizIndex];
    }

    
    public String getNextQuestion() {
        modelo.quizIndex++;
        return getCurrentQuestion();
    }


    public boolean isAnswerBtnClicked() {
        return answerBtnClicked;
    }

    public boolean isAnswerVisible() {
        return vista.answerVisible;
    }

    public boolean isToolbarVisible() {
        return vista.toolbarVisible;
    }
    private void setAnswer(boolean answer){
        modelo.trueAnswer = answer;
    }



}
