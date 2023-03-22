
package Main;

//import buat class
import Menu.Menu;
import Pengguna.Admin;
import Pengguna.Pengguna;
import Pengguna.Pelanggan;
import Pesanan.Pesanan;
import Pesanan.Kotakan;
import Pesanan.Prasmanan;
//

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class POSTTEST3 {
   public static InputStreamReader isr = new InputStreamReader(System.in);
   public static BufferedReader input = new BufferedReader(isr);
   
   public static ArrayList<Kotakan> dtKotakan = new ArrayList();
   public static ArrayList<Prasmanan> dtPrasmanan = new ArrayList();
   public static ArrayList<Menu> dtMenu = new ArrayList<>();
   public static ArrayList<Pengguna> dtPengguna = new ArrayList<>();

    
    
    
    static Admin admin = new Admin("admin","admin","admin");
    static Pelanggan pelanggan = new Pelanggan("adi","adi");
    
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
                case 1 -> {
                    pelanggan.pelanggan();
                 }
                case 2 -> admin.admin();
                case 3 -> {
                    System.out.println("======================================");
                    System.out.println(" Terimakasih Pelanggan Yang Terhormat");
                    System.out.println("======================================");
                    System.exit(0);
                 }
                default -> System.out.println("!!!Pilihan Tidak Tersedia!!!");
            }//switch
        }//While

    }
    
    }
