package Clases;

public class Reptiles extends Animales{

    public Reptiles(String nombre, Double peso, Double altura, Double edad, String especie) {
        super(nombre, peso, altura, edad, especie);
    }

    public void comer(){

        System.out.println(this.getNombre() + (getPeso()*0.35/(getEdad()*0.8) - (getAltura()*2.25)));

    }
}
