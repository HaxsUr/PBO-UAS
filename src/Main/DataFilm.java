
package Main;

public class DataFilm {
    //atribut
    //enkapsulasi
    private String studio;
    public String nama,genre;
    public int harga,jumlah;
    //konstruktor
public DataFilm(){}
//overloading
public DataFilm(String nama, String genre, int harga, String studio){
this.nama = nama;
this.genre = genre;
this.harga = harga;
this.studio= studio;
}
//overloading
public DataFilm(String nama, String genre){
this.nama=nama;
this.genre=genre;
}
//perkalian
int total(int harga,int jumlah){
return harga*jumlah;
}
//mutator
public void setJumlah(int jumlah){
this.jumlah= jumlah;
}
//accessor
public int getJumlah(){
return this.jumlah;
}

void tampil(){
System.out.println("\nNama Film\t: " + nama);
System.out.println("Genre Film\t: " + genre);
System.out.println("Nama Studio\t: " + studio);
System.out.println("Harga Tiket\t: Rp." + harga);
}
String totalHarga(){
return "Total Bayar\t: " + total(this.harga,this.jumlah);
}
}

