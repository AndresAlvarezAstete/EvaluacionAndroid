package com.example.ebayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class Commentary_act extends AppCompatActivity {

    private Spinner spin;
    private ProgressBar bar;
    private int progreso;
    private RatingBar rating;
    private Button calificar;
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentary_act);

        spin = (Spinner)findViewById(R.id.sp);
        bar = (ProgressBar)findViewById(R.id.pb);
        rating = (RatingBar)findViewById(R.id.rat);
        calificar = (Button)findViewById(R.id.bt);


        String[] productos = {"Productos a Calificar", "Televisor", "Refrigerador", "Horno", "Lavadora"};

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productos);
        spin.setAdapter(adapt);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
            {
                progreso = 0;
                rating.setRating(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {

            }

        });

        calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String opcion = spin.getSelectedItem().toString();

                if (opcion.equals("Televisor"))
                {
                    Timer t = new Timer();
                    TimerTask tt = new TimerTask() {
                        @Override
                        public void run()
                        {
                            progreso++;
                            bar.setProgress(progreso);
                        }
                    };

                    long delay = 0;
                    long period = 100;

                    t.schedule(tt, delay, period);

                    rating.setRating(3);
                }

                if (opcion.equals("Refrigerador"))
                {
                    Timer t = new Timer();
                    TimerTask tt = new TimerTask() {
                        @Override
                        public void run()
                        {
                            progreso++;
                            bar.setProgress(progreso);
                        }
                    };

                    long delay = 0;
                    long period = 100;

                    t.schedule(tt, delay, period);

                    rating.setRating(3);
                }

                if (opcion.equals("Horno"))
                {
                    Timer t = new Timer();
                    TimerTask tt = new TimerTask() {
                        @Override
                        public void run()
                        {
                            progreso++;
                            bar.setProgress(progreso);
                        }
                    };

                    long delay = 0;
                    long period = 100;

                    t.schedule(tt, delay, period);

                    rating.setRating(3);
                }

                if (opcion.equals("Lavadora"))
                {
                    Timer t = new Timer();
                    TimerTask tt = new TimerTask() {
                        @Override
                        public void run()
                        {
                            progreso++;
                            bar.setProgress(progreso);
                        }
                    };

                    long delay = 0;
                    long period = 100;

                    t.schedule(tt, delay, period);

                    rating.setRating(3);
                }
            }
        });
    }


}