package STOKBARANG;

import java.util.ArrayList;

public class Detail_penjualan {
    private int nomor_transaksi;
    private int nomor_barang;
    private int jml;
    private String harga;

    // Constructor
    public Detail_penjualan(int nomor_transaksi, int nomor_barang, int jml, String harga) {
        this.nomor_transaksi = nomor_transaksi;
        this.nomor_barang = nomor_barang;
        this.jml = jml;
        this.harga = harga;
    }

    

    public void displayInfo() {
        System.out.println("Nomor Transaksi: " + nomor_transaksi);
        System.out.println("Nomor Barang: " + nomor_barang);
        System.out.println("Jumlah: " + jml);
        System.out.println("Harga: " + harga);
    }


}
