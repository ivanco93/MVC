package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Controller extends AppCompatActivity {

    TextView Text1;
    TextView Text2;
    UsuarioModel usuarioModel = new UsuarioModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = (TextView) findViewById(R.id.textView);
        Text1.setText("Dato normal");

        usuarioModel.setNombre("Dato en MVC");

        Text2 = (TextView) findViewById(R.id.textView2);
        Text2.setText(usuarioModel.getNombre());
    }
}
