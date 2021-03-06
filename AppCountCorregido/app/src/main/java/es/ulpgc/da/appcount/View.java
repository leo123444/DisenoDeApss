package es.ulpgc.da.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class View extends Activity {
    private Mediator mediator;
   
    private Button buttonPlus;
    private Button buttonMinus;
    TextView display;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Inicializo los componentes de mi vista
        buttonPlus = (Button) findViewById(R.id.button1);
        buttonMinus = (Button) findViewById(R.id.button2);
         mediator=new Mediator();
       display = (TextView) findViewById(R.id.display);

        
       

        //  Registro los listeners de mis botones
        buttonPlus.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mediator.getPresenter().buttonPlusPressed();
            }
        });

        buttonMinus.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mediator.getPresenter().buttonMinusPressed();
            }
        });

    }
    public void setDisplay(String text) {
        display.setText(text);
    }


}
