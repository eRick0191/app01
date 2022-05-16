package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludar;
    private EditText txtNombre;
    private TextView lblSaludo;
    private TextView btnLimpiar;
    private TextView btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = (Button) findViewById(R.id.btnSaludar);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "Favor de ingresar un nombre",
                            Toast.LENGTH_SHORT).show();
                } else {
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola " + txtSaludar + " Como Estas ? <3");
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "Rellene el campo vacio",
                            Toast.LENGTH_SHORT).show();
                } else {
                    txtNombre.setText("");
                }
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();
            }
        });

    }
}