
package Pengguna;

import static Main.POSTTEST3.dtMenu;
import static Main.POSTTEST3.isr;
import static Main.POSTTEST3.input;
import Menu.Menu;
import java.io.IOException;
import java.util.ArrayList;


public class Admin extends Pengguna{
    String kontak;
    final String role = "Admin";
    
    public Admin(String namaPengguna, String passwordPengguna) {
        super(namaPengguna, passwordPengguna);
    }   
    
@Override
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
        
public void admin() throws IOException{
    System.out.println("\n");
    System.out.println("==================");
    System.out.println("   Menu Admin     ");
    System.out.println("==================");
    System.out.println("1. Lihat Menu");
    System.out.println("2. Tambah Menu");
    System.out.println("3. Hapus Menu");
    System.out.println("4. Ubah Menu");
    System.out.println("5. Lihat Profil");
    System.out.println("6. Edit Profil");
    System.out.println("7. Kembali");

    int pilAdmin;
    System.out.print("Masukkan Pilihan : ");
    pilAdmin = Integer.parseInt (input.readLine());
    
      switch (pilAdmin) {
          case 1  :
              System.out.println("\n====================");
              System.out.println("   Daftar Menu    ");
              System.out.println("====================");
              lihatMenu();
              admin();
              break;
          case 2:
              tambahMenu();
              admin();
              break;
          case 3 :
              hapusMenu();
              admin();
              break;
          case 4 :
              editMenu();
              admin();
              break;
          case 5 :
              lihatProfil();
              admin();
              break;
          case 6 :
              editProfil();
              admin();
              break;
          case 7 :
              
              break;
              
          default:
              admin();
              
      }
  }

    final public void lihatMenu(){
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

    public  void tambahMenu() throws IOException{
        System.out.println("====================");
        System.out.println("    Tambah Menu    ");
        System.out.println("====================");
        System.out.print("Masukkan Nama Menu : "); String namaMenu = input.readLine();
        for (int i = 0; i < dtMenu.size(); i++) {
            if(namaMenu.equals(dtMenu.get(i).getNamaMenu())){
                System.out.println("Nama Menu Telah Dipakai");
                System.out.println("Silahkan Gunakan Nama yang lain");
                tambahMenu();
            }
        }
        System.out.print("Masukkan Harga Menu : Rp"); int harga = Integer.parseInt(input.readLine());
        System.out.print("Masukkan Deskripsi Menu : "); String deskripsi = input.readLine();
        Menu menu = new Menu(namaMenu,harga,deskripsi);
        dtMenu.add(menu);
    }
    
    public  void editMenu() throws IOException{
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
                System.out.print("Nama Menu : "); dtMenu.get(i).setNamaMenu(input.readLine());
                System.out.print("Harga : Rp ");dtMenu.get(i).setHargaMenu(Integer.parseInt(input.readLine()));
                System.out.print("Deskripsi : ");dtMenu.get(i).setNamaMenu(input.readLine());
            }
            if(noUbah > dtMenu.size()){
                System.out.println("!!!Pilihan Tidak Tersedia!!!\n");
                editMenu();
            }
          }                  
        } 
    } 
    
    public  void hapusMenu() throws IOException{
        System.out.println("====================");
        System.out.println("    Hapus Menu    ");
        System.out.println("====================");
        if(dtMenu.size() <= 0){
          System.out.println("DAFTAR MENU MASIH KOSONG");             
        }else{
          lihatMenu();
          System.out.println("Pilih nomor menu yang ingin dihapus : "); int noHapus = Integer.parseInt(input.readLine());
          if(noHapus > dtMenu.size()){
            System.out.println("!!!Pilihan Tidak Tersedia!!!\n");
            hapusMenu();
            }
          for (int i = 0; i < dtMenu.size(); i++) {
            if(i == (noHapus-1)){
                dtMenu.remove(i);
            }
          }                
        } 
    }
     public void lihatProfil(){
        System.out.println("=======================");
        System.out.println("    Lihat Profil    ");
        System.out.println("=======================");
        System.out.println("Nama : " + this.namaPengguna);
        if (this.kontak == null){
            System.out.println("kontak : -");
        }else{
            System.out.println("kontak :" + this.kontak);
        }
        
    }
    
    public void editProfil() throws IOException{

            System.out.println("=======================");
            System.out.println("    Edit Profil    ");
            System.out.println("=======================");
            System.out.print("Masukkan Nama : ");
            this.namaPengguna = input.readLine();
            System.out.print("Masukkan Kontak : ");
            this.kontak = input.readLine();            
    }
    
}
