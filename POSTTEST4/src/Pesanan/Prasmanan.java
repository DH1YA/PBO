
package Pesanan;


public class Prasmanan extends Pesanan {
    private int porsi;

    public Prasmanan(int porsi, String namaPemesan, int hargaTotal, String tglPesan, String namaMenu) {
        super(namaPemesan, hargaTotal, tglPesan, namaMenu);
        this.porsi = porsi;
    }

    public int getPorsi() {
        return porsi;
    }

    public void setPorsi(int porsi) {
        this.porsi = porsi;
    }
    
     

}
