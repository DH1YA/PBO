
package Pengguna;

import Main.POSTTEST3;
import static Main.POSTTEST3.dtMenu;
import Menu.Menu;
import static Main.POSTTEST3.isr;
import static Main.POSTTEST3.input;
import java.io.IOException;

import Pengguna.Pelanggan;
import java.util.ArrayList;


public abstract class Pengguna {
   protected String namaPengguna;
   protected String passwordPengguna;
   protected String role;
   
    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getPasswordPengguna() {
        return passwordPengguna;
    }

    public void setPasswordPengguna(String passwordPengguna) {
        this.passwordPengguna = passwordPengguna;
    }
   
   
   
   public abstract void lihatMenu();
   
   
   public void lihatPesanan(){ 
        if(POSTTEST3.dtPrasmanan.size() <= 0 && POSTTEST3.dtKotakan.size() <=0){
            System.out.println("DAFTAR PESANAN MASIH KOSOGN");
        }else {
            System.out.println("\n===========================");
            System.out.println("   Daftar Pesanan Prasmanan    ");
            System.out.println("============================");
           for (int i = 0; i < POSTTEST3.dtPrasmanan.size(); i++) {
            System.out.println("No. "+(i+1));
            System.out.println("Nama Pemesan : "+ POSTTEST3.dtPrasmanan.get(i).getNamaPemesan());
            System.out.println("Nama Menu : Rp "+POSTTEST3.dtPrasmanan.get(i).getNamaMenu());
            System.out.println("Total Harga : "+POSTTEST3.dtPrasmanan.get(i).getHargaTotal());
            System.out.println("Tanggal Pengiriman : "+ POSTTEST3.dtPrasmanan.get(i).getTglPesan());
            System.out.println("");
            
            System.out.println("\n===========================");
            System.out.println("   Daftar Pesanan Kotakan    ");
            System.out.println("============================");
           for (int j = 0; j < POSTTEST3.dtKotakan.size(); j++) {
            System.out.println("No. "+(j+1));
            System.out.println("Nama Pemesan : "+ POSTTEST3.dtKotakan.get(i).getNamaPemesan());
            System.out.println("Nama Menu : "+POSTTEST3.dtKotakan.get(i).getNamaMenu());
            System.out.println("Buah : "+POSTTEST3.dtKotakan.get(i).getBuah());
            System.out.println("Minum : "+POSTTEST3.dtKotakan.get(i).getMinuman());
            System.out.println("Total Harga : "+POSTTEST3.dtKotakan.get(i).getHargaTotal());
            System.out.println("Tanggal Pengiriman : "+ POSTTEST3.dtKotakan.get(i).getTglPesan());
            System.out.println("");
                }  
            }
        }
   } 
   
      public boolean login( String pw, ArrayList<Admin> dtAdmin, String nama) throws IOException{
       System.out.println("login Admin");
       for (int i = 0; i < dtAdmin.size(); i++) {
           if(dtAdmin.get(i).getNamaPengguna().equals(nama)){
               if(dtAdmin.get(i).getPasswordPengguna().equals(pw)){
                 return true;  
               }
           }
       }
       return false;
   }
   
   public boolean login(String nama, String pw, ArrayList<Pelanggan> dtPelanggan){
       System.out.println("login User");
       for (int i = 0; i < dtPelanggan.size(); i++) {
           if(dtPelanggan.get(i).getNamaPengguna().equals(nama)){
               if(dtPelanggan.get(i).getPasswordPengguna().equals(pw)){
                   return true;
               }
           }
       }
       return false;
   }
   


    public Pengguna(String namaPengguna, String passwordPengguna) {
        this.namaPengguna = namaPengguna;
        this.passwordPengguna = passwordPengguna;
    }
       
    

    
}