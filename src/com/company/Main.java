package com.company;

import Clases.Animales;
import Clases.Aves;
import Clases.Mamiferos;
import Clases.Reptiles;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mamiferos m1 = new Mamiferos("Bobby", 45.00, 0.6, 5.00, "Lobo");

        m1.comer();

        Reptiles r1 = new Reptiles("Alberto", 65.00, 0.2, 2.00, "Cocodrilo");

        r1.comer();

        Aves a1 = new Aves("Rupert", 7.00, 0.75, 13.00, "Condor");

        a1.comer();

        List<Animales> zoologico = new ArrayList();

        zoologico.add(m1);
        zoologico.add(r1);
        zoologico.add(a1);

        Integer resultado = 0;

        for (Animales a : zoologico){
            if(a.getNombre().contains("t")){
                resultado = resultado + 1;
            }
        }

        System.out.println(resultado);

        for (Animales a : zoologico){

            if(a.getNombre().contains("t")){

                System.out.println(a.getNombre());
            }
        }
    }
}
