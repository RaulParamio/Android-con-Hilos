package com.example.proyecto2pspdefraulparamio;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.ImageButton;

public class Almacen {

    int turno=1;

    public synchronized void colorea(int idHilo, ImageButton btn) throws InterruptedException {

        while(idHilo!=turno){
            wait();
        }

        if(idHilo==1 ) {
            btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
            Thread.sleep(500);
            turno = 2;
        }

        else if(idHilo==2 ){
            btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            Thread.sleep(500);
            turno=3;

        }

        else if(idHilo==3 ){
            btn.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
            Thread.sleep(500);
            turno=1;

        }
        notifyAll();

    }

}
