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
    private String namaMenu;
    private String deskripsiMenu;
    private int hargaMenu;

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getDeskripsiMenu() {
        return deskripsiMenu;
    }

    public void setDeskripsiMenu(String deskripsiMenu) {
        this.deskripsiMenu = deskripsiMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(int hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    
    
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
