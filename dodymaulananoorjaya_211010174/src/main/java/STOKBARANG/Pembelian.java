package STOKBARANG;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pembelian {
    private int nomor_transaksi;
    private String tgl;
    private String nama_supplier;
    private int jml;
    private String keterangan;

    // Constructor
    public Pembelian(int nomor_transaksi, String tgl, String nama_supplier, int jml, String keterangan) {
        this.nomor_transaksi = nomor_transaksi;
        this.tgl = tgl;
        this.nama_supplier = nama_supplier;
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

    public String getNama_supplier() {
        return nama_supplier;
    }

    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
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

    // Getter dan Setter (dihapus untuk keperluan contoh)
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
