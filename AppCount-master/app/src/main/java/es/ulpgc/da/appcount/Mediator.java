public class Mediator{

 private Integer counter;

    public Mediator() {
        counter=0;
       View view = new View();
    }

    public Integer getCounter() {
        return counter;
    }

    public void increment() {
        this.counter++;
    }

    public void decrement() {
        this.counter--;
    }

public void setDisplay(String text) {
        view.display.setText(text);
    }


}
