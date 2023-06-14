package STOKBARANG;

import java.util.ArrayList;

public class Barang {
    private String nomor_barang;
    private String nama_barang;
    private String harga;
    private String jml;
    private String keterangan;

    // Constructor
    public Barang(String nomor_barang, String nama_barang, String harga, String jml, String keterangan) {
        this.nomor_barang = nomor_barang;
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.jml = jml;
        this.keterangan = keterangan;
    }
    public String getNomor_barang() {
        return nomor_barang;
    }

    public void setNomor_barang(String nomor_barang) {
        this.nomor_barang = nomor_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJml() {
        return jml;
    }

    public void setJml(String jml) {
        this.jml = jml;
    }

    public String getKeterangan() {
        return keterangan;
    }


    public void displayInfo() {
        System.out.println("Nomor Barang: " + nomor_barang);
        System.out.println("Nama Barang: " + nama_barang);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jml);
        System.out.println("Keterangan: " + keterangan);
    }

}
