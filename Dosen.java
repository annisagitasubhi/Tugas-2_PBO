package Tugas2OOP;

public class Dosen extends Elemen {
    private int jumlahHariKerja;
    //subclass constructor
    public Dosen(String nama, int jumlahHarikerja) {
        super(nama);
        this.jumlahHariKerja = jumlahHarikerja * 8;
    }

    public int getJamSibuk() {/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
        dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
        return jumlahHariKerja;
    }

    public void infoJamSibuk() {/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
        dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }
} 