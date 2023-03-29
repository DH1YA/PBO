
package Pengguna;

import static Main.POSTTEST3.dtMenu;
import static Main.POSTTEST3.dtPrasmanan;
import static Main.POSTTEST3.dtKotakan;
import static Main.POSTTEST3.isr;
import static Main.POSTTEST3.input;
import Menu.Menu;
import Pesanan.Kotakan;
import Pesanan.Prasmanan;
import java.io.IOException;
import java.util.ArrayList;

public class Pelanggan extends Pengguna {
    String alamat;
    String kontak;
    
    public Pelanggan(String namaPengguna, String passwordPengguna) {
        super(namaPengguna, passwordPengguna);
    }
    
    @Override
    public void lihatPesanan(){ 
        if(dtPrasmanan.size() <= 0 && dtKotakan.size() <=0){
            System.out.println("DAFTAR PESANAN MASIH KOSOGN");
        }else {
            System.out.println("\n===========================");
            System.out.println("   Daftar Pesanan Prasmanan    ");
            System.out.println("============================");
           for (int i = 0; i < dtPrasmanan.size(); i++) {
            System.out.println("No. "+(i+1));
            System.out.println("Nama Pemesan : "+ dtPrasmanan.get(i).getNamaPemesan());
            System.out.println("Nama Menu : Rp "+ dtPrasmanan.get(i).getNamaMenu());
            System.out.println("Total Harga : "+ dtPrasmanan.get(i).getHargaTotal());
            System.out.println("Tanggal Pengiriman : "+ dtPrasmanan.get(i).getTglPesan());
            System.out.println("");
            
            System.out.println("\n===========================");
            System.out.println("   Daftar Pesanan Kotakan    ");
            System.out.println("============================");
           for (int j = 0; j <  dtKotakan.size(); j++) {
            System.out.println("No. "+(j+1));
            System.out.println("Nama Pemesan : "+  dtKotakan.get(i).getNamaPemesan());
            System.out.println("Nama Menu : "+ dtKotakan.get(i).getNamaMenu());
            System.out.println("Buah : "+ dtKotakan.get(i).getBuah());
            System.out.println("Minum : "+ dtKotakan.get(i).getMinuman());
            System.out.println("Total Harga : "+ dtKotakan.get(i).getHargaTotal());
            System.out.println("Tanggal Pengiriman : "+ dtKotakan.get(i).getTglPesan());
            System.out.println("");
                }  
            }
        }
   } 
    
    @Override
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
    
    public void pelanggan() throws IOException{
    System.out.println("\n");
    System.out.println("==================");
    System.out.println("   Menu Pelanggan     ");
    System.out.println("==================");
    System.out.println("1. Lihat Menu");
    System.out.println("2. Pesan Prasmanan");
    System.out.println("3. Pesan Kotakan");
    System.out.println("4. Tampilkan Pesanan");
    System.out.println("5. Kembali");

    int pilPelanggan;
    System.out.print("Masukkan Pilihan : ");
    pilPelanggan = Integer.parseInt (input.readLine());
    
      switch (pilPelanggan) {
          case 1  :
              System.out.println("\n====================");
              System.out.println("   Daftar Menu    ");
              System.out.println("====================");
              lihatMenu();
              pelanggan();
              break;
          case 2:
              tambahPrasmanan(this.namaPengguna);
              pelanggan();
              break;
          case 3 :
              tambahKotakan(this.namaPengguna);
              pelanggan();
              break;
          case 4 :
              lihatPesanan();
              pelanggan();
              break;
          case 5 :
              
              break;
              
          default:
              pelanggan();
              
      }
  }

    public void tambahPrasmanan(String namaPemesan) throws IOException{
        System.out.println("=======================");
        System.out.println("    Pesan Prasmanan    ");
        System.out.println("=======================");
        if(dtMenu.size() <= 0){
          System.out.println("DAFTAR MENU MASIH KOSONG");
        }else{
            lihatMenu();
            System.out.println("");
            System.out.print("Pilih nomor menu yang ingin dipesan : "); int noPesan = Integer.parseInt(input.readLine());
            
            for (int i = 0; i < dtMenu.size(); i++) {
                if(i == (noPesan-1)){
                    System.out.println("Masukkan Jumlah Porsi : ");int porsi = Integer.parseInt(input.readLine());
                    String namaMenu = dtMenu.get(i).getNamaMenu();
                    int total = dtMenu.get(i).getHargaMenu() * porsi;
                    System.out.print("Tanggal Pengantaran : ");String tglPesan = input.readLine();
                    Prasmanan pesanPras = new Prasmanan(porsi, namaPemesan, total, tglPesan, namaMenu);
                    dtPrasmanan.add(pesanPras);
                }
                if(noPesan > dtMenu.size()){
                    System.out.println("!!!Pilihan Tidak Tersedia!!!\n");
                    tambahPrasmanan(namaPemesan);
                }
          }
        }       
    }
    
    public void tambahKotakan(String namaPemesan) throws IOException{
        System.out.println("=======================");
        System.out.println("    Pesan Kotakan    ");
        System.out.println("=======================");
        if(dtMenu.size() <= 0){
          System.out.println("DAFTAR MENU MASIH KOSONG");
        }else{
            lihatMenu();
            System.out.println("");
            System.out.print("Pilih nomor menu yang ingin dipesan : "); int noPesan = Integer.parseInt(input.readLine());
            
            for (int i = 0; i < dtMenu.size(); i++) {
                if(i == (noPesan-1)){
                    System.out.println("Masukkan Jumlah Kotak yang ingin dipesan : ");int jumlah = Integer.parseInt(input.readLine());
                    String namaMenu = dtMenu.get(i).getNamaMenu();
                    int total = dtMenu.get(i).getHargaMenu() * jumlah;
                    
                    System.out.println("Apakah ingin disertai dengan Minuman? [Y/N]");
                    String minum;
                    if(input.readLine().equalsIgnoreCase("y")) minum = "dengan minuman";
                    else minum ="tidak dengan minuman";
                    
                    System.out.println("");
                    System.out.println("Apakah ingin disertai dengan Buah? [Y/N]");
                    String buah;
                    if(input.readLine().equalsIgnoreCase("y")) buah = "dengan buah";
                    else buah ="tidak dengan buah";
                    
                    System.out.print("Tanggal Pengantaran : ");String tglPesan = input.readLine();
                    Kotakan pesanKotakan = new Kotakan(minum,buah, jumlah, namaPemesan, total,tglPesan, namaMenu);
                    dtKotakan.add(pesanKotakan);
                }
                if(noPesan > dtMenu.size()){
                    System.out.println("!!!Pilihan Tidak Tersedia!!!\n");
                    tambahPrasmanan(namaPemesan);
                }
          }
        }       
    }

}
