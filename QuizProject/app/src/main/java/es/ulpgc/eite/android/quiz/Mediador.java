package es.ulpgc.eite.android.quiz;

/**
 * Created by eleonora on 11/02/2017.
 */

public class Mediador {
    Modelo modelo;
    Vista vista;
    Presentador presentador;
    boolean answerBtnClicked;

    boolean confirmBtnClicked;

public Mediador(){
    this.modelo= new Modelo(this);
    this. presentador=new Presentador(this);
    this.vista= new Vista(this);
}
public Modelo getModelo(){
    if(this.modelo==null){
        modelo= new Modelo(this);
    }
 return modelo;
}

    public Presentador getPresentador(){
        if(this.presentador==null){
            presentador= new Presentador(this);
        }
        return presentador;
    }

    public Vista getVista(){
        if(this.vista==null){
            vista= new Vista(this);
        }
        return vista;
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
    private void checkToolbarVisibility(){
        if (!isToolbarVisible()) {
           vista. hideToolbar();
        }
    }
    void checkVisibility(){
        checkToolbarVisibility();
        checkAnswerVisibility();
    }

    void checkAnswerVisibility(){
        if(isAnswerVisible()==false) {
           vista. hideAnswer();
        } else {
            vista.showAnswer();
        }

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
