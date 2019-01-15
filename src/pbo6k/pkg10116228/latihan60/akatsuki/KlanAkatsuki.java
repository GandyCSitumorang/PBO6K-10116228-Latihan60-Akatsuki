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
public class KlanAkatsuki {
    protected String nama;
    protected String klan;
    protected String pasangan;
    
    
    public KlanAkatsuki(String nama, String klan, String pasangan){
        this.nama=nama;
        this.klan=klan;
        this.pasangan=pasangan;
       }
    
    public void tampilAnggota(){
        System.out.println("Nama : "+nama);
        System.out.println("Klan : "+klan);
        System.out.println("pasangan : "+pasangan);
    }

}
