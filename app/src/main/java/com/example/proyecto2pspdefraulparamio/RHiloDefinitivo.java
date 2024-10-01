package com.example.proyecto2pspdefraulparamio;

import android.widget.ImageButton;
import java.util.ArrayList;

public class RHiloDefinitivo implements Runnable{
    int idHilo;
    int rangofinal;
    int rangoempieza;
    ArrayList<ImageButton> albotones;
    Almacen al;

    public RHiloDefinitivo(int idHilo, int rangofinal, int rangoempieza, ArrayList<ImageButton> albotones, Almacen al) {
        this.idHilo = idHilo;
        this.rangofinal = rangofinal;
        this.rangoempieza = rangoempieza;
        this.albotones = albotones;
        this.al = al;
    }


    @Override
    public void run() {

        for(int i = rangoempieza; i < rangofinal; i++){
            try {
                al.colorea(idHilo, albotones.get(i));
            } catch (InterruptedException e){
                e.getMessage();
            }
        }


    }
}
