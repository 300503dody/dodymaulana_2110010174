/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dodymaulananoorjaya_211010174;

import STOKBARANG.Barang;
import STOKBARANG.Detail_pembelian;
import STOKBARANG.Detail_penjualan;
import STOKBARANG.Pembelian;
import STOKBARANG.Penjualan;
import STOKBARANG.User;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Dodymaulananoorjaya_211010174 {

    public static void main(String[] args) {
        // membuat objek admin stok barang
        User User = new User("D001", "Elixer", 1, "Enqonqu", LocalDate.MIN, "jl.zuro", "082150168555");
        User.displayInfo();
        
        Barang Barang = new Barang(1, "Rel", 10.000, 10, "Rokok Electric");
        Barang.displayInfo();
        
        Pembelian Pembelian = new Pembelian(1, LocalDate.MIN, "Ryzer", 2, "Rel");
        Pembelian.displayInfo();
        
        Detail_pembelian Detail_pembelian = new Detail_pembelian(1, 1, 2, 100.000);
        Detail_pembelian.displayInfo();
        
        Penjualan Penjualan = new Penjualan(1, LocalDate.MIN, "Razor", 3, "Rel");
        Penjualan.displayInfo();
        
        Detail_penjualan Detail_penjualan = new Detail_penjualan(1, 1, 9, 100.000);
        Detail_penjualan.displayInfo();
    }
}
