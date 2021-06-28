/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalherenciapoo2209;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author rodolfodom
 */
public class AnimalHerenciaPOO2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro koda = new Perro("Antiguo Pastor inglés", 8, 30, "Koda", 4, "Perro", "Canis lupus familiaris");
        System.out.println(koda);
        
        Gato pelusa = new Gato("Egipcio", 4, "Pelusa", 4.5f, 4, "Gato", "Felis catus");
        System.out.println(pelusa);
    }
    
}
