package com.example.practicat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String operador,result;
    String numero1;
    String numero2;
    double resultados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNum1=findViewById(R.id.editTextNum1);
        EditText editTextNum2=findViewById(R.id.editTextNum2);
        TextView textViewresul=findViewById(R.id.textViewResult);

        Button buttonResultado=findViewById(R.id.buttoResult);
        buttonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = editTextNum1.getText().toString();
                 numero2= editTextNum2.getText().toString();

                 if(operador.equals("+")){
                     resultados=  Double.parseDouble(numero1)+ Double.parseDouble(numero2);

                     result= String.valueOf(resultados);
                     textViewresul.setText(result);
                 }
                 if(operador.equals("-")){
                     resultados=  Double.parseDouble(numero1)- Double.parseDouble(numero2);

                     result= String.valueOf(resultados);
                     textViewresul.setText(result);
                 }
                 if(operador.equals("*")){
                     resultados=  Double.parseDouble(numero1)* Double.parseDouble(numero2);

                     result= String.valueOf(resultados);
                     textViewresul.setText(result);
                 }
                 if(operador.equals("/")){
                         if(Double.parseDouble( numero2) !=0){
                             resultados=  Double.parseDouble(numero1)/ Double.parseDouble(numero2);

                             result= String.valueOf(resultados);
                             textViewresul.setText(result);
                         }else
                             textViewresul.setText("por 0");
                 }
            }
        });


        Button buttonRest=findViewById(R.id.buttonRest);
        buttonRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              operador="-";
            }
        });
        Button buttonSuma=findViewById(R.id.buttoMas);
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="+";
            }
        });
        Button buttonDivi=findViewById(R.id.buttoDivi);
        buttonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="/";
            }
        });
        Button buttonMulti=findViewById(R.id.buttoMult);
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="*";
            }
        });

    }
}