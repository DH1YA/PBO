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
    private int hargaMenu;
    private String deskripsiMenu;
    
    public String getNamaMenu(){
        return namaMenu;
    }
    
    public void setNamaMenu(String namaMenu){
        this.namaMenu = namaMenu;
    }
    
    public int getHargaMenu(){
        return hargaMenu;
    }
    
    public void setHargaMenu(int hargaMenu){
        this.hargaMenu = hargaMenu;
    }
    
    public String getDeskripsiMenu(){
        return deskripsiMenu;
    }
    
    public void setDeskripsiMenu(String deskripsiMenu){
        this.deskripsiMenu = deskripsiMenu;
    }
    
    public Menu(String namaMenu, int hargaMenu, String deskripsiMenu){
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
        this.deskripsiMenu = deskripsiMenu;
    }
}
