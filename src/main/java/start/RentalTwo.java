package start;

/**
 * Created by hjy on 17-7-13.
 * 租赁
 */
public class RentalTwo {

    private Movie _movie;
    private int _daysRented;

    public RentalTwo(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    double getCharge(){
        double result =0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2) {
                    result += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3) {
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    int getFrequentRenterPoints(){
        if ((getMovie().getPriceCode()==Movie.NEW_RELEASE)&&getDaysRented()>1){
            return 2;
        }else {
            return 1;
        }
    }

}
