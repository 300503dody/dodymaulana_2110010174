package STOKBARANG;

import java.util.ArrayList;

public class Penjualan {
    private int nomor_transaksi;
    private String tgl;
    private String nama_konsumen;
    private int jml;
    private String keterangan;

    // Constructor
    public Penjualan(int nomor_transaksi, String tgl, String nama_konsumen, int jml, String keterangan) {
        this.nomor_transaksi = nomor_transaksi;
        this.tgl = tgl;
        this.nama_konsumen = nama_konsumen;
        this.jml = jml;
        this.keterangan = keterangan;
    }

    public int getNomor_transaksi() {
        return nomor_transaksi;
    }

    public void setNomor_transaksi(int nomor_transaksi) {
        this.nomor_transaksi = nomor_transaksi;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getNama_konsumen() {
        return nama_konsumen;
    }

    public void setNama_konsumen(String nama_konsumen) {
        this.nama_konsumen = nama_konsumen;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    

    
    public void displayInfo() {
        System.out.println("Nomor Transaksi: " + nomor_transaksi);
        System.out.println("Tanggal: " + tgl);
        System.out.println("Nama Konsumen: " + nama_konsumen);
        System.out.println("Jumlah: " + jml);
        System.out.println("Keterangan: " + keterangan);
    }

   
}
