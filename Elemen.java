package Tugas2OOP;

public class Elemen {
  private String nama;
  //constructor
  public  Elemen (String nama){ 
    this.nama = nama;
  }
  
  public String getNama(){
    return nama;
  }
  public int getJamSibuk(){/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
    dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
    return 0;
  }
  public void infoJamSibuk(){/*polymorphism konsep overriding karena method ini ada pada superclass (Elemen) 
    dan subclass (mahasiswa, dosen, dan asdos) dan memberikan informasi yang berbeda*/
  }
}