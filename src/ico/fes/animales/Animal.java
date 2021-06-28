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
public class Animal {
    private int numeroDePatas;
    private String especie;
    private String nombreCientifico;

    public Animal() {
    }

    public Animal(int numeroDePatas, String especie, String nombreCientifico) {
        this.numeroDePatas = numeroDePatas;
        this.especie = especie;
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroDePatas=" + numeroDePatas + ", especie=" + especie + ", nombreCientifico=" + nombreCientifico + '}';
    }

    public void emitirSonido(){
        System.out.println("emitiendo sonido...");
    }
    
}
