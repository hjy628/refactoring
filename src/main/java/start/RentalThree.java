package start;

/**
 * Created by hjy on 17-7-13.
 * 租赁
 */
public class RentalThree {

    private MovieOne _movie;
    private int _daysRented;

    public RentalThree(MovieOne _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public MovieOne getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    double getCharge(){
        return _movie.getCharge(_daysRented);
    }

    int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(_daysRented);
    }

}
