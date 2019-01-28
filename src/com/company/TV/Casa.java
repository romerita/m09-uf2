package com.company.TV;

public class Casa {
    public static void main(String[] args) {
        Comandament c = new Comandament();

        MembreFamilia m1 = new MembreFamilia("Marc", c);
        MembreFamilia m2 = new MembreFamilia("Dani", c);
        MembreFamilia m3 = new MembreFamilia("Maria", c);
        MembreFamilia m4 = new MembreFamilia("Pablo", c);
        MembreFamilia m5 = new MembreFamilia("Nicky", c);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

    }
}
