package Clases;

public class Aves extends Animales{


    public Aves(String nombre, Double peso, Double altura, Double edad, String especie) {
        super(nombre, peso, altura, edad, especie);
    }

    public void comer(){

        System.out.println(getPeso()*0.80/(getEdad()*0.5) + getAltura());

    }

}
