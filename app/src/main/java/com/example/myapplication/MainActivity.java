package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miMetodo();
    }

    private void miMetodo(){
        System.out.println("Hola");
    }

    public void mensaje(View v){
//        mensaje por consola
        System.out.println("Hola desde boton!!!");
//        mensaje con un tiempo de duracion
        Toast toast = Toast.makeText(this, "Hola desde boton", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.setText("Cambio de texto del mensaje del boton");
        toast.show();
//        mensaje en el textView
        final TextView helloTextView = (TextView) findViewById(R.id.textView);
        helloTextView.setText("Hola Desde boton!!!");
//        sistema de numeracion decimal 0 --> 9 (10 digitos)
//        sistema de numeracion hexadecimal 0 --> 9, A,B,C,D,E,F (16 digitos)
//        helloTextView.setTextColor(0xFF00f4b6);
        helloTextView.setTextColor(getResources().getColor(R.color.myColor));
        helloTextView.setTextSize(36);
    }
}