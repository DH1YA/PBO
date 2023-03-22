
package Pengguna;

import Main.POSTTEST3;
import static Main.POSTTEST3.dtMenu;
import Menu.Menu;
import static Main.POSTTEST3.isr;
import static Main.POSTTEST3.input;
import java.io.IOException;

public class Pengguna {
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
   
   
   
   public void lihatMenu(){ 
        if(dtMenu.size() <= 0){
            System.out.println("DAFTAR MENU MASIH KOSONG");
        }else {
           for (int i = 0; i < dtMenu.size(); i++) {
            System.out.println("Menu ke-"+(i+1));
            System.out.println("Nama Menu : "+ dtMenu.get(i).getNamaMenu() );
            System.out.println("Harga Menu : Rp "+dtMenu.get(i).getHargaMenu());
            System.out.println("Deskripsi Menu : "+dtMenu.get(i).getDeskripsiMenu());
            System.out.println("");
                }  
            }
    } 
   
   
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
           for (int j = 0; i < POSTTEST3.dtKotakan.size(); i++) {
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
   
//   public void login(){
//       for (int i = 0; i < data.size(); i++) {
//           if(data.get(i).getNamaPengguna().equals(usrName)){
//               if(data.get(i).getPasswordPengguna().equals(pw)){
//                   
//               }
//           }
//       }
//   }

    public Pengguna(String namaPengguna, String passwordPengguna) {
        this.namaPengguna = namaPengguna;
        this.passwordPengguna = passwordPengguna;
    }
       
    

    
}
