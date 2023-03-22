
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

public class Pelanggan extends Pengguna {

    public Pelanggan(String namaPengguna, String passwordPengguna) {
        super(namaPengguna, passwordPengguna);
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

    int pilAdmin;
    System.out.print("Masukkan Pilihan : ");
    pilAdmin = Integer.parseInt (input.readLine());
    
      switch (pilAdmin) {
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
              tambahKotakan(namaPengguna);
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
