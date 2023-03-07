/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;


/**
 *
 * @author ACER
 */
public class Menu {
    public String namaMenu;
    public String deskripsiMenu;
    public int hargaMenu;

    public Menu(String namaMenu, String deskripsiMenu, int hargaMenu) {
        this.namaMenu = namaMenu;
        this.deskripsiMenu = deskripsiMenu;
        this.hargaMenu = hargaMenu;
    }
    
    public void tampilMenu(){
        System.out.println("Nama Menu   : "+this.namaMenu);
        System.out.println("Harga       : "+ this.hargaMenu);
        System.out.println("Deskripsi   : "+ this.deskripsiMenu);    
    }
    
    
    
    
}
