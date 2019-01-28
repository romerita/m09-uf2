package com.company.BoteGalletas;

public class PotGaletes {
    private boolean lliure;
    private int cantidadGalletas = 10;

    public PotGaletes() {
        lliure = true;
    }


    public synchronized void agafarPot() {
        try {
            while (!lliure) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();

    }

    public synchronized void agafarGaletes(int i) {
        cantidadGalletas = cantidadGalletas - i;
    }

    public synchronized void omplirPotGaletes(int i) {
        cantidadGalletas += i;
    }

    public synchronized int getCantidadGalletas() {
        return cantidadGalletas;
    }

    public synchronized void deixarPot() {
        lliure = true;
        notifyAll();
    }

}
