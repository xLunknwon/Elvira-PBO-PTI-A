 // 4. Setelah method dihapus pada interface Identitas, maka akan terjadi error
        // pada program, terutama pada class Manusia karena method tampilkanNama() pada
        // class Manusia mehthod tersebut menggunakan override. Seharusnya tidak perlu
        // menggunakan Override karena pada interfacenya method tersebut sudah dihapus.
public interface Identitas {
    public void tampilkanNama();

    public void tampilkanUmur();
}