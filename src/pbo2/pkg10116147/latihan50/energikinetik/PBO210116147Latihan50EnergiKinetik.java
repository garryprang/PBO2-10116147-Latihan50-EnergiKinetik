/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan50.energikinetik;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan perhitungan energi kinetik.
 */

public class PBO210116147Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EnergiKinetik ek = new EnergiKinetik();
        
        System.out.println("========= Program Menghitung Energi Kinetik =========");
        System.out.println("Massa benda = 145" + "g");
        ek.setMassa(145);
        System.out.println("Kecepatan benda = 25" + "m/s");
        ek.setKecepatan(25);
        System.out.println();
        System.out.println("Energi kinetiknya adalah " + ek.energiKinetik(145, 25));
        System.out.println("Usaha yang dilakukan dalam keadaan diam adalah "
        + ek.ekDiam(0.5*145*25*25));
    }
    
}
