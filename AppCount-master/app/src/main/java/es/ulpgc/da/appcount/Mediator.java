public class Mediator{

 private Integer counter;

    public Mediator() {
        counter=0;
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

}
