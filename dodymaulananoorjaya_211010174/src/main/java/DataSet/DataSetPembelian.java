/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import STOKBARANG.Barang;
import java.util.ArrayList;

public class DataSetPembelian {
    private ArrayList<Integer> nomor_transaksi;
    private ArrayList<String> tgl;
    private ArrayList<String> nama_supplier;
    private ArrayList<Integer> jml;
    private ArrayList<String> keterangan;
    

    public DataSetPembelian() {
    nomor_transaksi=new ArrayList<Integer>();
    tgl=new ArrayList<String>();
   nama_supplier=new ArrayList<String>();
    jml=new ArrayList<Integer>();
    keterangan=new ArrayList<String>();
    }

    public void insertnomor_transaksi(Integer isi) {
        nomor_transaksi.add(isi);
    }

    public ArrayList<Integer> getnomor_transaksi(Integer isi) {
        return this.nomor_transaksi;
    }
    
    public void inserttgl(String isi) {
        tgl.add(isi);
    }
    public ArrayList<String> gettgl(String isi) {
        return this.tgl;
    }
    public void insertnama_supplier(String isi) {
        nama_supplier.add(isi);
    }
    public ArrayList<String> getnama_supplier (String isi) {
        return this.nama_supplier;
    }
    public void insertjml(Integer isi) {
        jml.add(isi);
    }
    public ArrayList<Integer> getjml(Integer isi) {
        return this.jml;
    }
    public void insertketerangan(String isi) {
        keterangan.add(isi);
    }
    public ArrayList<String> getketerangan(String isi) {
        return this.keterangan;
    }

   
    
}