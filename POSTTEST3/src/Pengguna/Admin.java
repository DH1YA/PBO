
package Pengguna;

import static Main.POSTTEST3.dtMenu;
import static Main.POSTTEST3.isr;
import static Main.POSTTEST3.input;
import Menu.Menu;
import java.io.IOException;


public class Admin extends Pengguna{
    
    public Admin(String namaPengguna, String passwordPengguna, String role) {
        super(namaPengguna, passwordPengguna);
        this.role = role;
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
              
              break;
              
          default:
              admin();
              
      }
  }

    @Override
    public void lihatMenu() {
        super.lihatMenu(); 
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
    
}
