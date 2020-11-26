/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan62_LivingThings;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program living things
 */
public abstract class LivingThing {
    public abstract void walk(String nama);

    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
}
