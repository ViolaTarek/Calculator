package com.example.nblenovo.simplecalculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public  class MainActivity extends AppCompatActivity  {


    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnClr;
    Button btnDel;
    Button sub;
    Button add;
    Button mult;
    Button div;
    TextView result;
    Button equal;
    EditText et;
    Double num1=Double.NaN;
    Double num2;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnClr = (Button) findViewById(R.id.btnclr);
        btnDel = (Button) findViewById(R.id.btnDel);
        equal = (Button) findViewById(R.id.equal);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        result = (TextView) findViewById(R.id.result);
        et = (EditText) findViewById(R.id.et);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "9");

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "0");

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                op = add.getText().toString();
                result.setText(num1 + "+");
                et.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                op = sub.getText().toString();
                result.setText(num1 + "-");
                et.setText(null);
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                op = mult.getText().toString();
                result.setText(num1 + "*");
                et.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                op = div.getText().toString();
                result.setText(num1 + "/");
                et.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                result.setText(result.getText().toString() +
                        num2 + " = " + num1);

                op = "0";
            }
        });
        btnClr.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                et.setText(null);
                num2=0.0;
                num1=0.0;
            }
        }));
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=et.getText().toString();
                s=s.substring(0,s.length()-1);
                et.setText(s);
            }
        });
    }

    private void computeCalculation() {
        if (!Double.isNaN(num1)) {
            num2 = Double.parseDouble(et.getText().toString());
            et.setText(null);

            if (op == add.getText().toString())
                num1 = this.num1 + num2;
            else if (op == sub.getText().toString())
                num1 = this.num1 - num2;
            else if (op == mult.getText().toString())
                num1 = this.num1 * num2;
            else if (op == div.getText().toString())
                num1 = this.num1 / num2;
        } else {
            try {
                num1 = Double.parseDouble(et.getText().toString());
            } catch (Exception e) {
            }
        }
    }



}
