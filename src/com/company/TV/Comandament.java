package com.company.TV;

public class Comandament {

    private boolean lliure;
    private int canal;

    public Comandament() {
        lliure = true;
    }

    public synchronized void agafar() {
        try {
            while (!lliure) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();

    }


    public synchronized void deixar() {
        lliure = true;
        notifyAll();
    }

    public synchronized void setCanal(int v) {
        canal = v;
    }

    public synchronized int getCanal() {
        return canal;
    }
}
