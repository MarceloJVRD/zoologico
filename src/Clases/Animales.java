package Clases;

public class Animales {

    private String nombre;
    private Double peso;
    private Double altura;
    private Double edad;
    private String especie;

    public Animales(String nombre, Double peso, Double altura, Double edad, String especie) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}
