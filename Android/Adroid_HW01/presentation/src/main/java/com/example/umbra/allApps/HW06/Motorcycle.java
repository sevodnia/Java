package com.example.umbra.allApps.HW06;


import java.util.ArrayList;

public class Motorcycle {
    private String path;
    private String name;

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    private ArrayList<Motorcycle> motos = new ArrayList<>();

    public Motorcycle(String path, String name) {
        this.path = path;
        this.name = name;
    }


    public Motorcycle() {

    }


    @Override
    public String toString() {
        return "Motorcycle{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", motos=" + motos +
                '}';
    }

    public ArrayList getMotorcycles() {

        Motorcycle moto0 = new Motorcycle("https://img.av.by/article/article_image/article_252_2.jpg", "BROUGH SUPERIOR SS80");
        motos.add(moto0);
        Motorcycle moto1 = new Motorcycle("https://img.av.by/article/article_image/article_252_5.jpg", " JAWA 250/350");
        motos.add(moto1);
        Motorcycle moto2 = new Motorcycle("https://img.av.by/article/article_image/article_252_8.jpg", "HONDA CB750");
        motos.add(moto2);
        Motorcycle moto3 = new Motorcycle("https://img.av.by/article/article_image/article_252_13.jpg", "MOTO GUZZI V8");
        motos.add(moto3);
        Motorcycle moto4 = new Motorcycle("https://img.av.by/article/article_image/article_252_16.jpg", "MTT Y2K");
        motos.add(moto4);
        Motorcycle moto5 = new Motorcycle("https://img.av.by/article/article_image/article_252_19.jpg", "PIAGGIO VESPA");
        motos.add(moto5);
        Motorcycle moto6 = new Motorcycle("https://img.av.by/article/article_image/article_252_20.jpg", "BRITTEN V1000");
        motos.add(moto6);
        Motorcycle moto7 = new Motorcycle("https://img.av.by/article/article_image/article_252_25.jpg", "DUCATI 916");
        motos.add(moto7);
        Motorcycle moto8 = new Motorcycle("https://img.av.by/article/article_image/article_252_26.jpg", "HARLEY DAVIDSON KNUCKLEHEAD");
        motos.add(moto8);
        Motorcycle moto9 = new Motorcycle("https://img.av.by/article/article_image/article_252_31.jpg", " HONDA GOLD WING");
        motos.add(moto9);


        return motos;
    }


}
