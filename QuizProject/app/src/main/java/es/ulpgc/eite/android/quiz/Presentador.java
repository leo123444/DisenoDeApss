package es.ulpgc.eite.android.quiz;

import android.support.v7.app.AppCompatActivity;

public class Presentador extends AppCompatActivity{
  Mediador mediador;


 public Presentador(Mediador mediador){
this.mediador=mediador;




 }

    public Modelo getQuestionStore() {
        return mediador.getModelo();
    }


    public String getCurrentAnswer() {
        if(mediador.getModelo().quizAnswers[mediador.getModelo().quizIndex] == mediador.getModelo().userAnswers[mediador.getModelo().quizIndex]) {
            return mediador.getVista().correctLabel;
        } else {
            return mediador.getVista().incorrectLabel;
        }
    }

    void onScreenStarted() {
        //quizApp = (QuizApp) getApplication();


       mediador.getVista(). setButtonLabels();
      mediador.getVista(). checkVisibility();


        if(mediador.isAnswerBtnClicked()){
         mediador.getVista().  setAnswer(getCurrentAnswer());
        }
    }
    void onFalseBtnClicked() {
        finish();
        //quizApp.backToQuestionScreen(this);
    }

    void onTrueBtnClicked() {
        mediador.getVista().  setAnswer(getAnswer());
        mediador. getVista().setAnswerVisibility(true);
        mediador.confirmBtnClicked = true;
        mediador.getVista(). checkAnswerVisibility();
    }






    private String getAnswer() {
        if(mediador.getModelo().trueAnswer) {
            return mediador.getVista().trueLabel;
        } else {
            return mediador.getVista().falseLabel;
        }
    }

    



    public String getCurrentQuestion() {
        return mediador.getVista().quizQuestions[mediador.getModelo().quizIndex];
    }

    
    public String getNextQuestion() {
       mediador.getModelo().quizIndex++;
        return getCurrentQuestion();
    }



    private void setAnswer(boolean answer){
       mediador. getModelo().trueAnswer = answer;
    }



}
