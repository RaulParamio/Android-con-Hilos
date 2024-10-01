package com.example.proyecto2pspdefraulparamio;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    int numid = 1;
    public static ArrayList<ImageButton> albotones = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = findViewById(R.id.linearlayout);

        for (int i = 1; i <= 6; i++) {
            LinearLayout linear = new LinearLayout(getApplicationContext());
            linear.setOrientation(LinearLayout.HORIZONTAL);
            ll.setId(View.generateViewId());
            for (int j = 1; j <= 4; j++) {
                ImageButton btn = new ImageButton(getApplicationContext());
                btn.setMinimumHeight(200);
                btn.setMinimumWidth(250);
                btn.setId(numid);
                numid++;
                albotones.add(btn);
                linear.addView(btn);
            }
            ll.addView(linear);
        }

        for(int i=0;i<8;i++) {
            albotones.get(i).setImageResource(R.drawable.ic_baseline_lens_24);

        }
        for(int i=8;i<16;i++) {
            albotones.get(i).setImageResource(R.drawable.ic_baseline_favorite_24);

        }
        for(int i=16;i<24;i++) {
            albotones.get(i).setImageResource(R.drawable.ic_baseline_lightbulb_24);

        }

    }






    public void onClickempezar(View v){
        Almacen al = new Almacen();

        Thread hilo1 = new Thread(new RHiloDefinitivo(1,8,0, albotones, al));
        Thread hilo2 = new Thread(new RHiloDefinitivo(2,16,8, albotones, al));
        Thread hilo3 = new Thread(new RHiloDefinitivo(3,24,16, albotones, al));

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }


}