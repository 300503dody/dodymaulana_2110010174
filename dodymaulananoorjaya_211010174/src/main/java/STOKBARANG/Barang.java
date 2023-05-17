/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STOKBARANG;

/**
 *
 * @author ASUS
 */
public class Barang {
 private int nomor_barang;
    private String nama_barang;
    private double harga;
    private int jml;
    private String keterangan;

    // Constructor
    public Barang(int nomor_barang, String nama_barang, double harga, int jml, String keterangan) {
        this.nomor_barang = nomor_barang;
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.jml = jml;
        this.keterangan = keterangan;
    }

    // Getter dan Setter untuk atribut nomor_barang
    public int getNomorBarang() {
        return nomor_barang;
    }

    public void setNomorBarang(int nomor_barang) {
        this.nomor_barang = nomor_barang;
    }

    // Getter dan Setter untuk atribut nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    // Getter dan Setter untuk atribut harga
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter dan Setter untuk atribut jml
    public int getJumlah() {
        return jml;
    }

    public void setJumlah(int jml) {
        this.jml = jml;
    }

    // Getter dan Setter untuk atribut keterangan
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    // Metode lainnya
    public double getTotalHarga() {
        return harga * jml;
    }

    public void displayInfo() {
        System.out.println("Nomor Barang: " + nomor_barang);
        System.out.println("Nama Barang: " + nama_barang);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jml);
        System.out.println("Keterangan: " + keterangan);
    } 
}
