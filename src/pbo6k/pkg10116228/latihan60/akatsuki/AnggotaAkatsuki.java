/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan60.akatsuki;

/**
 *
 * @author MY PC
 */
public class AnggotaAkatsuki extends KlanAkatsuki{
    private String anggota;
    
    public AnggotaAkatsuki(String nama, String klan, String pasangan) {
        super(nama, klan, pasangan);
        this.nama=nama;
        this.klan=klan;
        this.pasangan=pasangan;
    }

    AnggotaAkatsuki(String uchiha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }
    
}
