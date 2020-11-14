/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan44.hukumohm;

/**
 *
 * @author Rheiza
 * NAMA     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061

 */
public class PBOIF210119061Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Baterai baterai = new Baterai();
        System.out.println();
        
        Baterai baterai1 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai1.hitungTegangan() + " volt");
    }
    
}
