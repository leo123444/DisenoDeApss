package es.ulpgc.da.appcount;

public class Presenter {
    Mediator mediator;
  

    public Presenter() {
        mediator = new Mediator();
        
    }

    public void buttonPlusPressed() {
        mediator.increment();
        mediator.setDisplay (mediator.getCounter().toString());
    }

    public void buttonMinusPressed() {
        mediator.decrement();
        mediator.setDisplay (mediator.getCounter().toString());
    }

}
