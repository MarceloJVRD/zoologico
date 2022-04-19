package Clases;

public class Mamiferos extends Animales {

    public Mamiferos(String nombre, Double peso, Double altura, Double edad, String especie) {
        super(nombre, peso, altura, edad, especie);
    }

    public void comer(){

        System.out.println(getPeso()*0.5/getEdad() - getAltura());


    }

}
