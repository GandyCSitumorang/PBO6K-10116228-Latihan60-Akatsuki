/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan60.akatsuki;
/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripsi Program : program ini berisi program yang berisikan karakter dari 
 *                    dari serial Naruto
 */
public class PBO6K10116228Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PemimpinAkatsuki pa = new PemimpinAkatsuki("Pain");
        pa.setPemimpin("Pemimpin");
        pa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + pa.getPemimpin());
        
        System.out.println("");
    
        AnggotaAkatsuki aa = new AnggotaAkatsuki("Uchiha");
        aa.setAnggota("Anggota");
        aa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + aa.getAnggota());
        System.out.println("");
    }
    
}
