package STOKBARANG;

import java.util.ArrayList;

public class Detail_pembelian {
    private int nomor_transaksi;
    private int nomor_barang;
    private int jml;
    private String harga;

    // Constructor
    public Detail_pembelian(int nomor_transaksi, int nomor_barang, int jml, String harga) {
        this.nomor_transaksi = nomor_transaksi;
        this.nomor_barang = nomor_barang;
        this.jml = jml;
        this.harga = harga;
    }

    public int getNomor_transaksi() {
        return nomor_transaksi;
    }

    public void setNomor_transaksi(int nomor_transaksi) {
        this.nomor_transaksi = nomor_transaksi;
    }

    public int getNomor_barang() {
        return nomor_barang;
    }

    public void setNomor_barang(int nomor_barang) {
        this.nomor_barang = nomor_barang;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    

    public void displayInfo() {
        System.out.println("Nomor Transaksi: " + nomor_transaksi);
        System.out.println("Nomor Barang: " + nomor_barang);
        System.out.println("Jumlah: " + jml);
        System.out.println("Harga: " + harga);
    }

 
}
