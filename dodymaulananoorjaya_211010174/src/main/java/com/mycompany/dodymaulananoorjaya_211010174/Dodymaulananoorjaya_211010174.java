 package com.mycompany.dodymaulananoorjaya_211010174;

import STOKBARANG.Barang;
import STOKBARANG.Detail_pembelian;
import STOKBARANG.Detail_penjualan;
import STOKBARANG.Pembelian;
import STOKBARANG.Penjualan;
import STOKBARANG.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import form.frameutama;
/**
 *
 * author ASUS
 */
public class Dodymaulananoorjaya_211010174 {

    public static void main(String[] args) {
        /*// membuat objek admin stok barang
        User user = new User("D001", "Elixer", 1, "Enqonqu", LocalDate.MIN, "jl.zuro", "082150168555");
        user.displayInfo();

        Barang barang = new Barang(1, "Rel", 10.000, 10, "Rokok Electric");
        barang.displayInfo();

        Pembelian pembelian = new Pembelian(1, LocalDate.MIN, "Ryzer", 2, "Rel");
        pembelian.displayInfo();

        Detail_pembelian detailPembelian = new Detail_pembelian(1, 1, 2, 100.000);
        detailPembelian.displayInfo();

        Penjualan penjualan = new Penjualan(1, LocalDate.MIN, "Razor", 3, "Rel");
        penjualan.displayInfo();

        Detail_penjualan detailPenjualan = new Detail_penjualan(1, 1, 9, 100.000);
        detailPenjualan.displayInfo();

        // Membuat ArrayList dari objek Barang
        ArrayList<Barang> barangList = new ArrayList<>();

        // Menambahkan objek Barang ke ArrayList
        barangList.add(barang);

        // Mengakses elemen ArrayList
        barangList.forEach(barangObj -> {
            barangObj.displayInfo();
            System.out.println();
        });

        // Membuat ArrayList dari objek Detail_pembelian
        ArrayList<Detail_pembelian> detailPembelianList = new ArrayList<>();

        // Menambahkan objek Detail_pembelian ke ArrayList
        detailPembelianList.add(detailPembelian);

        // Mengakses elemen ArrayList
        for (Iterator<Detail_pembelian> it = detailPembelianList.iterator(); it.hasNext();) {
            Detail_pembelian detailPembelianObj = it.next();
            detailPembelianObj.displayInfo();
            System.out.println();
        }

        // Membuat ArrayList dari objek Detail_penjualan
        ArrayList<Detail_penjualan> detailPenjualanList = new ArrayList<>();

        // Menambahkan objek Detail_penjualan ke ArrayList
        detailPenjualanList.add(detailPenjualan);

        // Mengakses elemen ArrayList
        for (var it = detailPenjualanList.iterator(); it.hasNext();) {
            Detail_penjualan detailPenjualanObj = it.next();
            detailPenjualanObj.displayInfo();
            System.out.println();*/
        
        frameutama myFrame = new frameutama();

        myFrame.setVisible(true);
        }
}
 
