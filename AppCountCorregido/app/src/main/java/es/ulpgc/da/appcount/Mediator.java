package es.ulpgc.da.appcount;

public class Mediator{

    View view;
    Model model;
    Presenter presenter;


    public Mediator() {

        view= new View();
        presenter= new Presenter();
        model= new Model();
    }

  public View getView(){
      return this.view;
  }

   public Model getModel(){
       return this.model;
   }
public Presenter getPresenter(){
    return this.presenter;
}
}
