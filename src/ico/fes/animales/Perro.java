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
public class Perro extends Animal{
    private String raza;
    private int edad;
    private float peso;
    private String nombre;

    public Perro() {
    }

    public Perro(String raza, int edad, float peso, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
    }

    public Perro(String raza, int edad, float peso, String nombre, int numeroDePatas, String especie, String nombreCientifico) {
        super(numeroDePatas, especie, nombreCientifico);
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + ", edad=" + edad + ", peso=" + peso + ", nombre=" + nombre + '}';
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Guaw!!!");
    }
    
    
    

}
