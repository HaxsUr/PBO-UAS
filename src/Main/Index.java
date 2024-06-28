
package Main;
//inport file
import java.util.Scanner;
public class Index {
    public static void main(String[] args){
        //objek
        DataFilm film= new DataFilm("Tarzan","Action",70000,"DreamWorks");
        FilmHorror film2= new FilmHorror("Noctura","",60000,"KeyEast");
        DataFilm film3 = new DataFilm("Azab Kubur","Horror",45000,"UNK");
        DataFilm film4 = new DataFilm("Paludin","Adventure",60000,"Dreamword");
        //array
        String[] tempatBioskop={"XXI","KCM"};
        
        //pilihan
        System.out.println("Pilihan Film :");
        System.out.println("1. Tarzan");
        System.out.println("2. Noctura");
        System.out.println("3. Azab Kubur");
        System.out.println("4. Paludin");
        
        //input data io sederhana
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pembelian : ");
        String jumlah = scanner.nextLine();
        int j = Integer.parseInt(jumlah);
        
        //perulangan
        for(int i=0;i<j; i++){
        System.out.print("Masukkan Pilihan Film : ");
        int pilih = scanner.nextInt();
        //pilihan
        if(pilih==1){
                film.tampil();
                System.out.println("Tempat Bioskop\t: "+tempatBioskop[0]);
                System.out.print("Masukkan Jumlah Tiket\t: ");
                int tiket = scanner.nextInt();
                film.setJumlah(tiket);
                System.out.println("Jumlah Tiket\t: "+film.getJumlah());
                System.out.println(film.totalHarga()); 
                System.out.println("");
        } else if(pilih==2){
                film2.tampil(); 
                System.out.println("Tempat Bioskop : "+tempatBioskop[1]);
                System.out.print("Masukkan Jumlah Tiket\t: ");
                int tiket = scanner.nextInt();
                film.setJumlah(tiket);
                System.out.println("Jumlah Tiket\t: "+film.getJumlah());
                System.out.println(film.totalHarga());
                System.out.println("");
        }   else if(pilih==3){
                film3.tampil(); 
                System.out.println("Tempat Bioskop : "+tempatBioskop[1]);
                System.out.print("Masukkan Jumlah Tiket\t: ");
                int tiket = scanner.nextInt();
                film.setJumlah(tiket);
                System.out.println("Jumlah Tiket\t: "+film.getJumlah());
                System.out.println(film.totalHarga());
                System.out.println("");
        } else if(pilih==4){
                film4.tampil(); 
                System.out.println("Tempat Bioskop : "+tempatBioskop[0]);
                System.out.print("Masukkan Jumlah Tiket\t: ");
                int tiket = scanner.nextInt();
                film.setJumlah(tiket);
                System.out.println("Jumlah Tiket\t: "+film.getJumlah());
                System.out.println(film.totalHarga());
                System.out.println("");
        }  else { System.out.println("Pilihan Tidak Ada");}
        }
    }
    
}
