package com.company.BoteGalletas;

public class Nen extends Thread{
    private PotGaletes potGaletes;

    public Nen(String nom, PotGaletes c) {
        super(nom);
        potGaletes = c;
    }

    @Override
    public void run() {
        for (;;) {

            int numGaletes = (int) (Math.random() * 5);
            potGaletes.agafarPot();

            if (potGaletes.getCantidadGalletas() <= 0) {
                System.out.println(getName() + " no ha agafat cap galeta perqué no hi ha");

            } else if (numGaletes > potGaletes.getCantidadGalletas()) {
                // agafant galetes
                numGaletes = potGaletes.getCantidadGalletas();
                potGaletes.agafarGaletes(numGaletes);
                System.out.println(getName() + " ha agafat " + numGaletes + " galetes");

            } else if (numGaletes <= 0) {
                System.out.println(getName() + " no ha volgut agafar cap galeta");

            } else if (potGaletes.getCantidadGalletas() > 0) {
                potGaletes.agafarGaletes(numGaletes);
                System.out.println(getName() + " ha agafat " + numGaletes + " galetes");
            }

            try {
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            potGaletes.deixarPot();
            // no menjar més
            try {
                Thread.sleep((long) (Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
