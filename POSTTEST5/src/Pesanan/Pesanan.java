
package Pesanan;


public class Pesanan {
    private String namaPemesan;
    private int hargaTotal;
    private String tglPesan;
    private String namaMenu;

    public Pesanan(String namaPemesan, int hargaTotal, String tglPesan, String namaMenu) {
        this.namaPemesan = namaPemesan;
        this.hargaTotal = hargaTotal;
        this.tglPesan = tglPesan;
        this.namaMenu = namaMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public String getTglPesan() {
        return tglPesan;
    }

    public void setTglPesan(String tglPesan) {
        this.tglPesan = tglPesan;
    }
    
    
}
