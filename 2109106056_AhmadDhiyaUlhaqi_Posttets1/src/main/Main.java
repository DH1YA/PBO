package main;

import Menu.Admin;
import user.Pengguna;
import Menu.Menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    //        input and arraylis
       static InputStreamReader isr = new InputStreamReader(System.in);
       static BufferedReader input = new BufferedReader(isr);
       static ArrayList<Menu> dtMenu = new ArrayList<>();
        
    public static void main(String[] args) throws IOException {     
        while (true) {            
          System.out.println("=============================");
          System.out.println("  Nusantara Catering Food");
          System.out.println("=============================");
          System.out.println("1. Login User");
          System.out.println("2. Login Admin");
          System.out.println("3. Exit"); 
          
          int pilihan;
          System.out.print("Masukkan Pilihan : ");
          pilihan = Integer.parseInt (input.readLine());
          
            switch (pilihan) {
                case 1:
                    System.out.println("=================================");
                    System.out.println(" Masih tahap pengembangan Masbro");
                    System.out.println("=================================\n\n");
                    break;
                case 2:
                    admin();
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.println(" Terimakasih Pelanggan Yang Terhormat");
                    System.out.println("======================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("!!!Pilihan Tidak Tersedia!!!");
            }//switch
        }//While
        
    }
  
  public static void admin() throws IOException{
    System.out.println("\n");
    System.out.println("==================");
    System.out.println("   Menu Admin     ");
    System.out.println("==================");
    System.out.println("1. Lihat Menu");
    System.out.println("2. Tambah Menu");
    System.out.println("3. Hapus Menu");
    System.out.println("4. Ubah Menu");
    System.out.println("5. Kembali");

    int pilAdmin;
    System.out.print("Masukkan Pilihan : ");
    pilAdmin = Integer.parseInt (input.readLine());
    
      switch (pilAdmin) {
          case 1 :
              lihatMenu();
              admin();
              break;
          case 2:
              tambahMenu();
              admin();
              break;
          case 3 :
              System.out.println("====================");
              System.out.println("    Hapus Menu    ");
              System.out.println("====================");
              if(dtMenu.size() <= 0){
                System.out.println("DAFTAR MENU MASIH KOSONG");             
              }else{
                lihatMenu();
                System.out.println("Pilih nomor menu yang ingin dihapus : "); int noHapus = Integer.parseInt(input.readLine());
                for (int i = 0; i < dtMenu.size(); i++) {
                  if(i == (noHapus-1)){
                      dtMenu.remove(i);
                  }
                  if(i >= dtMenu.size() && i != (noHapus-1)){
                      System.out.println("Pilihan Tidak Tersedia");
                  }
                }                
              }

              admin();
              break;
          case 4 :
              System.out.println("====================");
              System.out.println("    Edit Menu    ");
              System.out.println("====================");
              if(dtMenu.size() <= 0){
                System.out.println("DAFTAR MENU MASIH KOSONG");
              }else{
              lihatMenu();
              System.out.print("Pilih nomor menu yang ingin diubah : "); int noUbah = Integer.parseInt(input.readLine());
              for (int i = 0; i < dtMenu.size(); i++) {
                  if(i == (noUbah-1)){
                      System.out.print("Nama Menu : "); dtMenu.get(i).namaMenu = input.readLine();
                      System.out.print("Harga : ");dtMenu.get(i).hargaMenu = Integer.parseInt(input.readLine());
                      System.out.print("Deskripsi");dtMenu.get(i).deskripsiMenu = input.readLine();
                  }
                  if(i >= dtMenu.size()){
                      System.out.println("Pilihan Tidak Tersedia");
                  }
                }                  
              }

              admin();
              break;
          case 5 :
              
              break;
              
          default:
              admin();
              
      }
  }

public static void lihatMenu(){ 
    System.out.println("\n====================");
    System.out.println("   Daftar Menu    ");
    System.out.println("====================");
    if(dtMenu.size() <= 0){
        System.out.println("DAFTAR MENU MASIH KOSONG");
    }else {
       for (int i = 0; i < dtMenu.size(); i++) {
        System.out.println("Menu ke-"+(i+1));
        System.out.println("Nama Menu : "+dtMenu.get(i).namaMenu);
        System.out.println("Harga Menu : "+dtMenu.get(i).hargaMenu);
        System.out.println("Deskripsi Menu : "+dtMenu.get(i).deskripsiMenu);
        System.out.println("");
        }  
    }
   
}  

public static void tambahMenu() throws IOException{
    System.out.println("====================");
    System.out.println("    Tambah Menu    ");
    System.out.println("====================");
    System.out.print("Masukkan Nama Menu : "); String namaMenu = input.readLine();
    for (int i = 0; i < dtMenu.size(); i++) {
        if(namaMenu.equals(dtMenu.get(i).namaMenu)){
            System.out.println("Nama Menu Telah Dipakai");
            System.out.println("Silahkan Gunakan Nama yang lain");
            tambahMenu();
        }
    }
    System.out.print("Masukkan Harga Menu : "); int harga = Integer.parseInt(input.readLine());
    System.out.print("Masukkan Deskripsi Menu : "); String deskripsi = input.readLine();
    var menu = new Menu(namaMenu,deskripsi,harga);
    dtMenu.add(menu);
}

}
