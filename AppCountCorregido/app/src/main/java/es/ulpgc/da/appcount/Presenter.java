package es.ulpgc.da.appcount;

public class Presenter {
    Mediator mediator;
  

    public Presenter() {
        mediator = new Mediator();
        
    }

    public void buttonPlusPressed() {
       mediator. getModel().increment();
       mediator.getView(). setDisplay (mediator.getModel().getCounter().toString());
    }

    public void buttonMinusPressed() {
        mediator.getModel().decrement();
        mediator.getView().setDisplay (mediator.getModel().getCounter().toString());
    }
}
