/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STOKBARANG;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Pembelian {
 private int nomor_transaksi;
    private LocalDate tgl;
    private String nama_supplier;
    private int jml;
    private String keterangan;

    // Constructor
    public Pembelian(int nomor_transaksi, LocalDate tgl, String nama_supplier, int jml, String keterangan) {
        this.nomor_transaksi = nomor_transaksi;
        this.tgl = tgl;
        this.nama_supplier = nama_supplier;
        this.jml = jml;
        this.keterangan = keterangan;
    }

    // Getter dan Setter untuk atribut nomor_transaksi
    public int getNomorTransaksi() {
        return nomor_transaksi;
    }

    public void setNomorTransaksi(int nomor_transaksi) {
        this.nomor_transaksi = nomor_transaksi;
    }

    // Getter dan Setter untuk atribut tgl
    public LocalDate getTanggal() {
        return tgl;
    }

    public void setTanggal(LocalDate tgl) {
        this.tgl = tgl;
    }

    // Getter dan Setter untuk atribut nama_supplier
    public String getNamaSupplier() {
        return nama_supplier;
    }

    public void setNamaSupplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
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
    public void displayInfo() {
        System.out.println("Nomor Transaksi: " + nomor_transaksi);
        System.out.println("Tanggal: " + tgl);
        System.out.println("Nama Supplier: " + nama_supplier);
        System.out.println("Jumlah: " + jml);
        System.out.println("Keterangan: " + keterangan);
    }   
}
