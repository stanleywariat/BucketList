package data;

public class City extends Place {
    //fields

    private String whatCountry;



    public String getWhatCountry() {
        return whatCountry;
    }

    public void setWhatCountry(String whatCountry) {
        this.whatCountry = whatCountry;
    }



    //constructor
    public City(String name, String natureType, String tripType, int preferedMonth, int howMuchMoney, int howImportant,
                   String whatCountry) {
        super(name, natureType, tripType, preferedMonth, howMuchMoney, howImportant);
        this.setWhatCountry(whatCountry);
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", trip type:" + this.getTripType() +
                ", nature type:" + this.getNatureType() + ", prefered month:" + this.getPreferedMonth() +
                ", how much money do we need:" + this.getHowMuchMoney() + ", how important: " + this.getHowImportant() +
                "capital city: " + this.getWhatCountry();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return whatCountry != null ? whatCountry.equals(city.whatCountry) : city.whatCountry == null;
    }

    @Override
    public int hashCode() {
        return whatCountry != null ? whatCountry.hashCode() : 0;
    }
}
