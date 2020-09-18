package com.example.ebayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Product_act extends AppCompatActivity {

    private EditText nombre;
    private EditText monto;
    private TextView resultado;
    private CheckBox domicilio;
    private CheckBox sucursal;
    private CheckBox gratis;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_act);

        nombre = (EditText)findViewById(R.id.txtNombre);
        monto = (EditText)findViewById(R.id.txtMonto);
        resultado = (TextView)findViewById(R.id.txtResultado);

        domicilio = (CheckBox)findViewById(R.id.chbDomicilio);
        sucursal = (CheckBox)findViewById(R.id.chbSucursal);
        gratis = (CheckBox)findViewById(R.id.chbGratis);

        calcular = (Button)findViewById(R.id.btnCalcular);

        calcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int montoProducto = 0;
                int montoInicial = 0;
                int montoFinal = 0;
                String strFinal = "";

                if (nombre.getText().toString().equals("Televisor"))
                {
                    montoProducto = 129000;
                    if (domicilio.isChecked()){
                        montoProducto += 14500;
                    }

                    montoInicial = Integer.parseInt(monto.getText().toString());
                    montoFinal = montoInicial - montoProducto;

                    if (montoFinal > 0){
                        strFinal = String.valueOf(montoFinal);

                    }
                    else{
                        strFinal = "Monto inferior al del producto";

                    }
                    resultado.setText(strFinal);

                }
                else if (nombre.getText().toString().equals("Microondas"))
                {
                    montoProducto = 50000;
                    if (domicilio.isChecked()){
                        montoProducto += 5500;
                    }

                    montoInicial = Integer.parseInt(monto.getText().toString());
                    montoFinal = montoInicial - montoProducto;

                    if (montoFinal > 0){
                        strFinal = String.valueOf(montoFinal);

                    }
                    else{
                        strFinal = "Monto inferior al del producto";

                    }
                    resultado.setText(strFinal);

                }
                else if (nombre.getText().toString().equals("Lavadora"))
                {
                    montoProducto = 100000;
                    if (domicilio.isChecked()){
                        montoProducto += 25000;
                    }

                    montoInicial = Integer.parseInt(monto.getText().toString());
                    montoFinal = montoInicial - montoProducto;

                    if (montoFinal > 0){
                        strFinal = String.valueOf(montoFinal);

                    }
                    else{
                        strFinal = "Monto inferior al del producto";

                    }
                    resultado.setText(strFinal);

                }
                else
                {

                    resultado.setText("Producto no existe");
                }

            }
        });
    }
}