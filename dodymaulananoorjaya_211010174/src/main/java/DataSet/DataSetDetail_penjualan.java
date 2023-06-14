/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */

public class DataSetDetail_penjualan {
    private ArrayList<Integer> nomor_transaksi;
    private ArrayList<Integer> nomor_barang;
    private ArrayList<Integer> jml;
    private ArrayList<String> harga;

    public void insertnomor_transaksi(Integer isi) {
        nomor_transaksi.add(isi);
    }

    public ArrayList<Integer> getnomor_transaksi(Integer isi) {
        return this.nomor_transaksi;
    }
    
     public void insertnomor_barang(Integer isi) {
        nomor_barang.add(isi);
    }

    public ArrayList<Integer> getnomor_barang(Integer isi) {
        return this.nomor_barang;
    }
    
    public void insertjml(Integer isi) {
        jml.add(isi);
    }
    public ArrayList<Integer> getjml(Integer isi) {
        return this.jml;
    }
    
    public void insertharga(String isi) {
        harga.add(isi);
    }
    public ArrayList<String> getharga (String isi) {
        return this.harga;
    }
    
    
}