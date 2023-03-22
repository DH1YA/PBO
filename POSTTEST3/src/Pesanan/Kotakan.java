
package Pesanan;


public class Kotakan extends Pesanan{
    String minuman, buah;
    int jumlah;

    public Kotakan(String minuman, String buah, int jumlah, String namaPemesan, int hargaTotal, String tglPesan, String namaMenu) {
        super(namaPemesan, hargaTotal, tglPesan, namaMenu);
        this.minuman = minuman;
        this.buah = buah;
        this.jumlah = jumlah;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public String getBuah() {
        return buah;
    }

    public void setBuah(String buah) {
        this.buah = buah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
   
    
    
}
