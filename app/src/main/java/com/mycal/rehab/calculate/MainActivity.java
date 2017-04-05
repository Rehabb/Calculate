package com.mycal.rehab.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText txt;
    float ValOne , ValTwo ;

    boolean Addition , Subtract ,Multiplication ,Division ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn0  =(Button) findViewById(R.id.no0);
        Button btn1  =(Button) findViewById(R.id.no1);
        Button btn2  =(Button) findViewById(R.id.no2);
        Button btn3  =(Button) findViewById(R.id.no3);
        Button btn4  =(Button) findViewById(R.id.no4);
        Button btn5  =(Button) findViewById(R.id.no5);
        Button btn6  =(Button) findViewById(R.id.no6);
        Button btn7  =(Button) findViewById(R.id.no7);
        Button btn8  =(Button) findViewById(R.id.no8);
        Button btn9  =(Button) findViewById(R.id.no9);
        Button btnsum  =(Button) findViewById(R.id.sum);
        Button btnsub  =(Button) findViewById(R.id.sub);
        Button btnmul  =(Button) findViewById(R.id.mul);
        Button btndiv  =(Button) findViewById(R.id.division);
        Button btnequal  =(Button) findViewById(R.id.equal);
        Button btndot  =(Button) findViewById(R.id.nodot);
        Button btncleal= (Button) findViewById(R.id.clear);

        txt=(EditText) findViewById(R.id.txtcal);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText(txt.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() +"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"9");
            }
        });
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(txt==null)
                 {
                     txt.setText("");
                 }
                else
                 {
                     ValOne =Float.parseFloat(txt.getText()+"");
                     Addition=true;
                     txt.setText(null);
                 }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ValOne=Float.parseFloat(txt.getText()+"");
                Subtract=true;
                txt.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValOne=Float.parseFloat(txt.getText()+"");
                Multiplication=true;
                txt.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValOne=Float.parseFloat(txt.getText()+"");
                Division=true;
                txt.setText(null);
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValTwo =Float.parseFloat(txt.getText()+"");
                if(Addition == true)
                {
                  txt.setText(ValOne+ValTwo+"");
                    Addition=false;
                }
                else if(Subtract==true)
                {
                    txt.setText(ValOne-ValTwo + "");
                    Subtract = false;
                    txt.setText(txt.getText()+"");

                }else if (Multiplication == true)
                {
                    txt.setText(ValOne * ValTwo + "");
                    Multiplication = false;
                }else if (Division== true)
                {
                    txt.setText(ValOne/ValTwo + "");
                    Division= false;
                }
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText(txt.getText()+ ".");
            }
        });
        btncleal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
            }
        });
        }







    }
