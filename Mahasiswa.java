package Tugas2OOP;

public class Mahasiswa extends Elemen{
    private int sks;
    //subclass constructor
    public Mahasiswa(String nama, int sks) {
        super(nama);
        this.sks = sks * 3;
    }

    public int getJamSibuk() {/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
        dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
        return sks;
    }

    public void infoJamSibuk() {/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
        dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }
}

class Asdos extends Mahasiswa{
    private int jamNgasdos;
    //subclass constructor
    public Asdos(String nama, int sks, int jamNgasdos){
        super (nama, sks); 
        this.jamNgasdos = jamNgasdos + sks * 3;
    }

    public int getJamSibuk (){/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
        dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
        return jamNgasdos;
    }

    public void infoJamSibuk (){/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
        dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
        System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }
}