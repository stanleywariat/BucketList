package data;

public class Country extends Place {
    //fields

    private String capitalCity;



    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }



    //constructor
    public Country(String name, String natureType, String tripType, int preferedMonth, int howMuchMoney, int howImportant,
                   String capitalCity) {
        super(name, natureType, tripType, preferedMonth, howMuchMoney, howImportant);
        this.setCapitalCity(capitalCity);
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", trip type:" + this.getTripType() +
                ", nature type:" + this.getNatureType() + ", prefered month:" + this.getPreferedMonth() +
                ", how much money do we need:" + this.getHowMuchMoney() + ", how important: " + this.getHowImportant() +
                "capital city: " + this.getCapitalCity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return capitalCity != null ? capitalCity.equals(country.capitalCity) : country.capitalCity == null;
    }

    @Override
    public int hashCode() {
        return capitalCity != null ? capitalCity.hashCode() : 0;
    }
}
