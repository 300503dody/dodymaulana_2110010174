package STOKBARANG;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private int level;
    private String nama_user;
    private String tgl_lahir;
    private String alamat;
    private String telepon;

    // Constructor
    public User(String username, String password, int level, String nama_user, String tgl_lahir, String alamat, String telepon) {
        this.username = username;
        this.password = password;
        this.level = level;
        this.nama_user = nama_user;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    

    
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Level: " + level);
        System.out.println("Nama: " + nama_user);
        System.out.println("Tanggal Lahir: " + tgl_lahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
    }


}
