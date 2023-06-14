/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import STOKBARANG.Barang;
import java.util.ArrayList;

public class DataSetBarang {
    private ArrayList<String> nomor_barang;
    private ArrayList<String> nama_barang;
    private ArrayList<String> harga;
    private ArrayList<String> jml;
    private ArrayList<String> keterangan;
    

    public DataSetBarang() {
    nomor_barang=new ArrayList<String>();
    nama_barang=new ArrayList<String>();
    harga=new ArrayList<String>();
    jml=new ArrayList<String>();
    keterangan=new ArrayList<String>();
    }

    public void insertnomor_barang(String isi) {
        this.nomor_barang.add(isi);
    }

    public ArrayList<String> getnomor_barang() {
        return this.nomor_barang;
    }
    
    public void insertnama_barang(String isi) {
        this.nama_barang.add(isi);
    }
    public ArrayList<String> getnama_barang() {
        return this.nama_barang;
    }
    public void insertharga(String isi) {
        this.harga.add(isi);
    }
    public ArrayList<String> getharga () {
        return this.harga;
    }
    public void insertjml(String isi) {
        this.jml.add(isi);
    }
    public ArrayList<String> getjml() {
        return this.jml;
    }
    public void insertketerangan(String isi) {
        this.keterangan.add(isi);
    }
    public ArrayList<String> getketerangan() {
        return this.keterangan;
    }
   
    
}
