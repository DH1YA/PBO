
package Pesanan;


final public class Prasmanan extends Pesanan {
    final private int porsi;

    public Prasmanan(int porsi, String namaPemesan, int hargaTotal, String tglPesan, String namaMenu) {
        super(namaPemesan, hargaTotal, tglPesan, namaMenu);
        this.porsi = porsi;
    }

    public int getPorsi() {
        return porsi;
    }    

}
