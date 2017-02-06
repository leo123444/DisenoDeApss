package es.ulpgc.eite.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vista extends AppCompatActivity {
    public Presentador pr;
    String confirmLabel;
    Toolbar toolbarScreen;



   boolean answerVisible;

    Button buttonTrue;
    Button buttonFalse;

    private boolean confirmBtnClicked;




    String falseLabel;
    String trueLabel;
    String correctLabel;
    String incorrectLabel;
    TextView labelConfirm;
    TextView labelAnswer;


    String  cheatLabel;
    String nextLabel;
    public  boolean toolbarVisible;

    public Vista() {
        falseLabel = "False";
        trueLabel = "True";
        correctLabel = "Correct!";
        incorrectLabel = "Incorrect!";
        cheatLabel = "Cheat";
        nextLabel = "Next";
        falseLabel = "False";
        trueLabel = "True";
        confirmLabel = "Are you sure?";
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_cheat);

          labelConfirm = (TextView) findViewById(R.id.labelConfirm);
         labelAnswer = (TextView) findViewById(R.id.labelAnswer);



         buttonTrue = (Button) findViewById(R.id.buttonTrue);
         buttonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.onTrueBtnClicked();
            }
        });
        buttonFalse = (Button) findViewById(R.id.buttonFalse);
         buttonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.onFalseBtnClicked();
            }
        });


        toolbarScreen = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbarScreen);

        pr.onScreenStarted();
    }


    void setAnswerVisibility(boolean visible) {
        answerVisible = visible;
    }

    String[] quizQuestions = {
            "Christian Bale played Batman in 'The Dark Knight Rises'?", // 1
            "The Gremlins movie was released in 1986?",  // 2
            "Brad Pitt played Danny Ocean in Ocean's Eleven, Ocean's Twelve and Ocean's Thirteen?",  // 3
            "A spoon full of sugar' came from the 1964 movie Mary Poppins?",  // 4
            "The song “I don't want to miss a thing” featured in Armageddon?", // 5
            "Will Smith has a son called Jaden?", // 6
            "Mark Ruffalo played Teddy Daniels in Shutter Island?", // 7
            "Mike Myers starred in the 'Cat in the Hat' 2003 children's movie?", // 8
            "Ryan Reynolds is married to Scarlett Johansson?", // 9
            "The movie 'White House Down' was released in 2014?",  // 10
            "Michael Douglas starred in Basic Instinct, Falling Down and The Game?", // 11
            "Colin Firth won an Oscar for his performance in the historical movie 'The King's Speech'?",  // 12
            "Cameron Diaz and Ashton Kutcher starred in the movie 'What happens in Vegas'?", // 13
            "Arnold Schwarzenegger played lead roles in Rocky, Rambo and Judge Dredd?", // 14
            "The Titanic movie featured the song 'My Heart Will Go On'?", // 15
            "Eddie Murphy narrates the voice of Donkey in the Shrek movies?", // 16
            "Nicole Kidman played Poison Ivy in 'Batman and Robin'?", // 17
            "The Lara Croft: Tomb Raider movie was released in 2003?", // 18
            "Hallie Berry played the character Rogue in X Men?", // 19
            "The Teenage Mutant Ninja Turtles are named after famous artists?", // 20
    };

    public void setButtonLabels() {
        setTrueButton(pr.getTrueLabel());
        setFalseButton(pr.getFalseLabel());
        setConfirm(pr.getConfirmLabel());
    }


    void hideAnswer() {
        labelAnswer.setVisibility(View.INVISIBLE);
    }

    void setAnswer(String txt) {
        labelAnswer.setText(txt);
    }

    private void setConfirm(String text) {
        labelConfirm.setText(text);
    }

    private void setFalseButton(String label) {
        buttonFalse.setText(label);
    }

    private void setTrueButton(String label) {
        buttonTrue.setText(label);
    }

    void showAnswer() {
        labelAnswer.setVisibility(View.VISIBLE);
    }


    public void setAnswerBtnClicked(boolean clicked) {
        pr.answerBtnClicked = clicked;
    }

    void hideToolbar() {
       toolbarScreen. setVisibility(View.GONE);
    }
}