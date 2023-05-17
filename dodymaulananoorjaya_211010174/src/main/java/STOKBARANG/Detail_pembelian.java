/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STOKBARANG;

/**
 *
 * @author ASUS
 */
public class Detail_pembelian {
private int nomor_transaksi;
    private int nomor_barang;
    private int jml;
    private double harga;

    // Constructor
    public Detail_pembelian(int nomor_transaksi, int nomor_barang, int jml, double harga) {
        this.nomor_transaksi = nomor_transaksi;
        this.nomor_barang = nomor_barang;
        this.jml = jml;
        this.harga = harga;
    }

    // Getter dan Setter untuk atribut nomor_transaksi
    public int getNomorTransaksi() {
        return nomor_transaksi;
    }

    public void setNomorTransaksi(int nomor_transaksi) {
        this.nomor_transaksi = nomor_transaksi;
    }

    // Getter dan Setter untuk atribut nomor_barang
    public int getNomorBarang() {
        return nomor_barang;
    }

    public void setNomorBarang(int nomor_barang) {
        this.nomor_barang = nomor_barang;
    }

    // Getter dan Setter untuk atribut jml
    public int getJumlah() {
        return jml;
    }

    public void setJumlah(int jml) {
        this.jml = jml;
    }

    // Getter dan Setter untuk atribut harga
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode lainnya
    public double getTotalHarga() {
        return harga * jml;
    }

    public void displayInfo() {
        System.out.println("Nomor Transaksi: " + nomor_transaksi);
        System.out.println("Nomor Barang: " + nomor_barang);
        System.out.println("Jumlah: " + jml);
        System.out.println("Harga: " + harga);
    }    
}
