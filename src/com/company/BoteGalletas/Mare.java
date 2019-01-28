package com.company.BoteGalletas;

import java.util.Random;

public class Mare extends Thread{
    private PotGaletes potGaletes;
    Random random = new Random();
    private boolean randomOmplir;

    public Mare(String nom, PotGaletes c) {
        super(nom);
        potGaletes = c;
    }

    @Override
    public void run() {
        for (;;) {

            randomOmplir = random.nextBoolean();
            potGaletes.agafarPot();

            if (potGaletes.getCantidadGalletas() <= 0) {
                if (randomOmplir) {
                    potGaletes.omplirPotGaletes((int) (Math.random() * 10 + 1));
                    System.out.println("\n" + getName() + " ha posat " + potGaletes.getCantidadGalletas() + " galetes dins del pot\n");
                } else {
                    System.out.println("\n" + getName() + " no ha omplert el pot de galetes, perque han menjat massa\n");
                }

            }

            try {
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            potGaletes.deixarPot();
            // no menjar més
            try {
                Thread.sleep((long) (Math.random() * 15000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
