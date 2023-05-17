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
public class User {
 private String username;
    private String password;
    private int level;
    private String nama_user;
    private LocalDate tgl_lahir;
    private String alamat;
    private String telepon;

    // Constructor
    public User(String username, String password, int level, String nama_user, LocalDate tgl_lahir, String alamat, String telepon) {
        this.username = username;
        this.password = password;
        this.level = level;
        this.nama_user = nama_user;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    // Getter dan Setter untuk atribut username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan Setter untuk atribut password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter dan Setter untuk atribut level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter dan Setter untuk atribut nama_user
    public String getNamaUser() {
        return nama_user;
    }

    public void setNamaUser(String nama_user) {
        this.nama_user = nama_user;
    }

    // Getter dan Setter untuk atribut tgl_lahir
    public LocalDate getTanggalLahir() {
        return tgl_lahir;
    }

    public void setTanggalLahir(LocalDate tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    // Getter dan Setter untuk atribut alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk atribut telepon
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // Metode lainnya
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Level: " + level);
        System.out.println("Nama: " + nama_user);
        System.out.println("Tanggal Lahir: " + tgl_lahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
    }   
}
