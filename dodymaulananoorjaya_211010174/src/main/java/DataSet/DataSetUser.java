/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import STOKBARANG.Barang;
import java.util.ArrayList;

public class DataSetUser {
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<Integer> level;
    private ArrayList<String> nama_user;
    private ArrayList<String> tgl_lahir;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    

    public DataSetUser() {
    username=new ArrayList<String>();
    password=new ArrayList<String>();
   level=new ArrayList<Integer>();
    nama_user=new ArrayList<String>();
    tgl_lahir=new ArrayList<String>();
    alamat=new ArrayList<String>();
    telepon=new ArrayList<String>();
    }
    
     public void insertusername(String isi) {
        this.username.add(isi);
    }

    public ArrayList<String> getusername() {
        return this.username;
    }
    
     public void insertpassword(String isi) {
        this.password.add(isi);
    }

    public ArrayList<String> getpassword() {
        return this.password;
    }
    
     public void insertlevel(Integer isi) {
        this.level.add(isi);
    }

    public ArrayList<Integer> getlevel() {
        return this.level;
    }
    
     public void insertnama_user(String isi) {
        this.nama_user.add(isi);
    }

    public ArrayList<String> getnama_user() {
        return this.nama_user;
    }
    
     public void inserttgl_lahir(String isi) {
        this.tgl_lahir.add(isi);
    }

    public ArrayList<String> gettgl_lahir() {
        return this.tgl_lahir;
    }
    
     public void insertalamat(String isi) {
        this.alamat.add(isi);
    }

    public ArrayList<String> getalamat() {
        return this.alamat;
    }
    
     public void inserttelepon(String isi) {
        this.telepon.add(isi);
    }

    public ArrayList<String> gettelepon() {
        return this.telepon;
    }
}