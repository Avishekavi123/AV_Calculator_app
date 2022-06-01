package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText2;
    private ImageButton addbutton,subbutton,divbutton,multibutton;
    private Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,
            button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,
            button23;
    private TextView result,textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2=findViewById(R.id.editTextNumber2);
        addbutton= (ImageButton) findViewById(R.id.imageButton);
        subbutton= (ImageButton) findViewById(R.id.imageButton2);
        divbutton=(ImageButton) findViewById(R.id.imageButton4);
        multibutton=(ImageButton) findViewById(R.id.imageButton3);
        result=findViewById(R.id.textView);
        textView3=findViewById(R.id.textView3);

        button=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button10=findViewById(R.id.button10);
        button11=findViewById(R.id.button11);
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);
        button14=findViewById(R.id.button14);
        button15=findViewById(R.id.button15);
        button16=findViewById(R.id.button16);
        button17=findViewById(R.id.button17);
        button18=findViewById(R.id.button18);
        button19=findViewById(R.id.button19);
        button20=findViewById(R.id.button20);
        button21=findViewById(R.id.button21);
        button22=findViewById(R.id.button22);
        button23=findViewById(R.id.button23);




        addbutton.setOnClickListener(this);
        subbutton.setOnClickListener(this);
        divbutton.setOnClickListener(this);
        multibutton.setOnClickListener(this);




        editText2.setCursorVisible(false);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"1");

            }
        });

         button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"2");
            }
        });   button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"3");
            }
        });   button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"4");
            }
        });   button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"5");
            }
        });   button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"6");
            }
        });   button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"7");
            }
        });   button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"8");
            }
        });   button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"9");
            }
        });   button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"0");
            }
        });   button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+".");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText("");
                textView3.setText("");
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String val=editText2.getText().toString();
               val=val.substring(0,val.length()-1);
               editText2.setText(val);
                //String val1=textView3.getText().toString();
                //val1=val.substring(0,val1.length()-1);


            }
        });
                //experimental button
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   editText2.setText(editText2.getText() + "+");
                   String val = editText2.getText().toString();
                   val = val.substring(0, val.length());
                   textView3.setText(val);
                 //  double num1 = Double.parseDouble(val);


//
//                String val2=editText2.getText().toString();
//                    String lost=textView3.getText().toString();
//                   val2=val2.substring(lost.length()+1,val2.length());
//                    //double num2=Double.parseDouble(val2);
//                    textView3.setText(val2);



            }
        });subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"-");
                String val = editText2.getText().toString();
                val = val.substring(0, val.length());
                textView3.setText(val);
            }
        });
        multibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"*");
                String val = editText2.getText().toString();
                val = val.substring(0, val.length());
                textView3.setText(val);
            }
        });
        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"/");
                String val = editText2.getText().toString();
                val = val.substring(0, val.length());
                textView3.setText(val);
            }
        });


        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"(");
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+")");
            }
        });
         button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"^2");
            }
        });
         button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"√");

            }
        });

         button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"!");
            }
        });

         button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"!");
            }
        });
         button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"ln(");
            }
        });


         button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"sin(");
            }
        });

         button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"cos(");
            }
        });


         button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText()+"tan(");
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText2.getText().toString();
                val=val.substring(0,val.length()-1);
                editText2.setText(val);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userex=editText2.getText().toString();
                String val = editText2.getText().toString();
                val = val.substring(0, val.length());
                textView3.setText(val);


                Expression exp=new Expression(userex);//importing the library
                String result=String.valueOf(exp.calculate());
                editText2.setText(result);
                editText2.setSelection(result.length());

            }
        });












    }

    //AC C numbers and +,-,*,/  are set others are to be set




    @Override
    public void onClick(View view) {

//        if(view.getId()==R.id.button21)
//        {
//            double sum=10;
//            String ab;
//            textView3.setText("Result= "+ab);
//
//        }


    }
}