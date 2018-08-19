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
        StringBuilder print = new StringBuilder();
        print.append(getName());
        print.append(", ");
        print.append(getTripType());
        print.append(", ");
        print.append(getNatureType());
        print.append(", ");
        print.append(getPreferedMonth());
        print.append(", ");
        print.append(getHowMuchMoney());
        print.append(", ");
        print.append(getHowImportant());
        print.append(", ");
        print.append(getWhatCountry());
        print.append(", ");
        return print.toString();
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
