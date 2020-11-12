/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan41.massajenis;

/**
 *
 * @author 
 * Nama     : Reihan Wiyanda
 * Kelas    : IF-1
 * Nim      : 10119011
 */
public class IF110119011Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kb = new Kubus();
        kb.setSisi(5);
        kb.setMassa(250);
        System.out.println("====Massa Jenis Kubus====");
        System.out.println("Sisi\t: " + kb.getSisi());
        System.out.println("Massa\t: " + kb.getMassa());
        
        System.out.println();
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("Volume\t: " + kb.hitungVolume(kb.getSisi()));
        System.out.println("Massa Jenis: " + kb.hitungMassaJenis(kb.getMassa(), kb.getSisi()));
    }
    
}
