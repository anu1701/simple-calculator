package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,add,sub,mul,div,rem,res,clr;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=(Button) findViewById(R.id.button0);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        rem=(Button) findViewById(R.id.rem);
        res=(Button) findViewById(R.id.res);
        clr=(Button) findViewById(R.id.clr);
        editText=(EditText) findViewById(R.id.editText);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("/");
            }
        });
        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("%");
            }
        });
       clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(" ");
            }
        });
       res.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String data=editText.getText().toString();
               if(data.contains("+")){
                   String operand[]=data.split("[+]");
                   double op1=Double.parseDouble(operand[0]);
                   double op2=Double.parseDouble(operand[1]);
                   double res=op1+op2;
                   editText.setText(String.valueOf(res));
               }else if(data.contains("-")){
                   String operand[]=data.split("-");
                   double op1=Double.parseDouble(operand[0]);
                   double op2=Double.parseDouble(operand[1]);
                   double res=op1-op2;
                   editText.setText(String.valueOf(res));
               }else if(data.contains("*")){
                   String operand[]=data.split("[*]");
                   double op1=Double.parseDouble(operand[0]);
                   double op2=Double.parseDouble(operand[1]);
                   double res=op1*op2;
                   editText.setText(String.valueOf(res));
               }else if(data.contains("/")){
                   String operand[]=data.split("/");
                   double op1=Double.parseDouble(operand[0]);
                   double op2=Double.parseDouble(operand[1]);
                   double res=op1/op2;
                   editText.setText(String.valueOf(res));
               }else if(data.contains("%")){
                   String operand[]=data.split("%");
                   double op1=Double.parseDouble(operand[0]);
                   double op2=Double.parseDouble(operand[1]);
                   double res=op1%op2;
                   editText.setText(String.valueOf(res));
               }
           }
       });
    }
}