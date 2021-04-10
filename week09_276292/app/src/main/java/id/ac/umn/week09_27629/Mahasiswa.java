package id.ac.umn.week09_27629;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "tblMahasiswa")
public class Mahasiswa implements Serializable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "nim")
    private String nim;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "nomorhp")
    private String nomorhp;

    public Mahasiswa(String nim, String nama, String email, String nomorhp) {
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.nomorhp = nomorhp;
    }

    @NonNull
    public String getNim() {
        return this.nim;
    }

    public void setNim(@NonNull String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorhp() {
        return this.nomorhp;
    }

    public void setNomorhp(String nohp) {
        this.nomorhp = nohp;
    }
}