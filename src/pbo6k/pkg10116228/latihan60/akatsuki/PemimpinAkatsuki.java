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
public class PemimpinAkatsuki extends KlanAkatsuki{
    private String pemimpin;
    
    public PemimpinAkatsuki(String nama, String klan, String pasangan) {
        super(nama, klan, pasangan);
        this.nama=nama;
        this.klan=klan;
        this.pasangan=pasangan;
    }

    PemimpinAkatsuki(String pain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public void setPemimpin(String pemimpin) {
        this.pemimpin = pemimpin;
    }
    
}
