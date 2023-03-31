package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in;

        HashMap<Integer,Electronica> hmap = new HashMap<>();
        HashMap<Integer,FyV> hmap2 = new HashMap<>();

        Electronica electronica = new Electronica(56110,"Laptop Lenovo",25000,"Legion 5","Lenovo");
        Electronica electronica2 = new Electronica(56120,"Iphone 14",30000,"Pro Max","Apple");
        Electronica electronica3 = new Electronica(56130,"Camara de video",10000,"Instamatic","Kanon");
        Electronica electronica4 = new Electronica(56140,"Audifonos Logitech",4000,"G733","Logitech");
        FyV fyV = new FyV(20890,"Platano",0,"Fruta",25.50);
        FyV fyV2 = new FyV(20114,"Manzana Roja",0,"Fruta",54.50);
        FyV fyV3 = new FyV(20115,"Manzana Verde",0,"Fruta",49.00);
        FyV fyV4 = new FyV(20116,"Naranja",0,"Fruta",32.00);
        FyV fyV5 = new FyV(20098,"Tomate",0,"Verdura",31.00);
        FyV fyV6 = new FyV(20127,"Aguacate",0,"Verdura",42.00);
        FyV fyV7 = new FyV(20118,"Limon",0,"Verdura",29.90);
        FyV fyV8 = new FyV(20125,"Cebolla Blanca",0,"Verdura",25.00);

        hmap.put(56110,electronica);
        hmap.put(56120,electronica2);
        hmap.put(56130,electronica3);
        hmap.put(56140,electronica4);
        hmap2.put(20890,fyV);
        hmap2.put(20114,fyV2);
        hmap2.put(20115,fyV3);
        hmap2.put(20116,fyV4);
        hmap2.put(20098,fyV5);
        hmap2.put(20127,fyV6);
        hmap2.put(20118,fyV7);
        hmap2.put(20125,fyV8);

        System.out.println("Se inicia la consulta al inventario");
        System.out.println("");

        do {
            System.out.println("Ingrese el SKU del producto que quiere consultar: ");
            System.out.println("");
            System.out.println("Si desea detener el programa ingrese *0*");
             in = sc.nextInt();
                if (hmap.containsKey(in)){
                    System.out.println(hmap.get(in));
                    System.out.println("");
                }else if (hmap2.containsKey(in)){
                    System.out.println(hmap2.get(in));
                    System.out.println("");
                }else {
                    System.out.println("El sku no existe");
                    System.out.println("");
                }
        }while (in!=0);
        System.out.println("El programa se detuvo");
    }

}