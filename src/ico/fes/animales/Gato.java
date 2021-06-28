/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author rodolfodom
 */
public class Gato extends Animal {
    private String raza;
    private int edad;
    private String Nombre;
    private float peso;

    public Gato() {
    }

    public Gato(String raza, int edad, String Nombre, float peso) {
        this.raza = raza;
        this.edad = edad;
        this.Nombre = Nombre;
        this.peso = peso;
    }

    public Gato(String raza, int edad, String Nombre, float peso, int numeroDePatas, String especie, String nombreCientifico) {
        super(numeroDePatas, especie, nombreCientifico);
        this.raza = raza;
        this.edad = edad;
        this.Nombre = Nombre;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + ", edad=" + edad + ", Nombre=" + Nombre + ", peso=" + peso + '}';
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido();//To change body of generated methods, choose Tools | Templates.
        System.out.println("Miaw!!!!");
    }
    
}
