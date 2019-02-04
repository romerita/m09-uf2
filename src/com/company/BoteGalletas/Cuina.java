package com.company.BoteGalletas;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Cuina {
    public static void main(String[] args) throws InterruptedException {
        PotGaletes potGaletes = new PotGaletes();

        Nen n1 = new Nen("Eustaquio", potGaletes);
        Nen n2 = new Nen("Umberto", potGaletes);
        Nen n3 = new Nen("Juana", potGaletes);
        Mare mare = new Mare("Hambrosio", potGaletes);


        n1.start();
        n2.start();
        n3.start();
        mare.start();


//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);

//        executorService.awaitTermination(30, TimeUnit.SECONDS);
//        executorService.shutdown();

    }
}
