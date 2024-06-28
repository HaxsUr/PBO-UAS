
package Main;
public class FilmHorror extends DataFilm{
    //overriding
    public FilmHorror(String nama, String genre, int harga, String studio) {
        super(nama, genre, harga, studio);
        this.genre="Horror";
    }
    
}
