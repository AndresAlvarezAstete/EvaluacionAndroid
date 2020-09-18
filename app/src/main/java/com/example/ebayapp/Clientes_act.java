package com.example.ebayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Clientes_act extends AppCompatActivity {

        private Spinner spin;
        private EditText producto;
        private Button calcular;
        private TextView saldoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spin = (Spinner)findViewById(R.id.sp);
        producto = (EditText)findViewById(R.id.et);
        calcular = (Button)findViewById(R.id.bt);
        saldoFinal = (TextView)findViewById(R.id.tv);

        String[] clientes = {"Clientes", "Mario", "Constanza", "Fernanda"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, clientes);
        spin.setAdapter(adapt);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String opcion = spin.getSelectedItem().toString();
                int valor1 = 0;
                int valor2 = 0;

                //int Horno = Integer.parseInt(producto.getText().toString());

                if (opcion.equals("Mario"))
                {
                    valor1 = 500000;
                }

                if (opcion.equals("Constanza"))
                {
                    valor1 = 320000;
                }

                if (opcion.equals("Fernanda"))
                {
                    valor1 = 120000;
                }

                if (producto.getText().toString().equals("Horno"))
                {
                    valor2 = 45000;
                }

                if (producto.getText().toString().equals("Espejo"))
                {
                    valor2 = 100000;
                }

                if (producto.getText().toString().equals("Sillas"))
                {
                    valor2 = 80000;
                }

                int valorFinal = valor1 - valor2;

                saldoFinal.setText("Su saldo final es: " + valorFinal);

            }
        });
    }

}