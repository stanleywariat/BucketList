package data;

public class Place {
    private String name;
    private String natureType;
    private String tripType;
    private int preferredMonth;
    private int howMuchMoney;
    private int howImportant;

//constructor
    protected Place(String name, String natureType, String tripType, int preferredMonth, int howMuchMoney, int howImportant) {
        setName(name);
        setNatureType(natureType);
        setTripType(tripType);
        setPreferedMonth(preferredMonth);
        setHowMuchMoney(howMuchMoney);
        setHowImportant(howImportant);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getNatureType() {
        return this.natureType;
    }

    public void setNatureType(String natureType) {
        this.natureType = natureType;
    }

    public String getTripType() {
        return this.tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public int getPreferedMonth() {
        return this.preferredMonth;
    }

    public void setPreferedMonth(int preferredMonth) {
        this.preferredMonth = preferredMonth;
    }

    public int getHowMuchMoney() {
        return this.howMuchMoney;
    }

    public void setHowMuchMoney(int howMuchMoney) {
        this.howMuchMoney = howMuchMoney;
    }

    public int getHowImportant() {
        return this.howImportant;
    }

    public void setHowImportant(int howImportant) {
        this.howImportant = howImportant;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", trip type:" + this.getTripType() + ", nature type:" +
                this.getNatureType() + ", preferred month:" + this.getPreferedMonth() + ", how much money do we need:" +
                this.getHowMuchMoney() + ", how important: " + this.getHowImportant();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (preferredMonth != place.preferredMonth) return false;
        if (howMuchMoney != place.howMuchMoney) return false;
        if (howImportant != place.howImportant) return false;
        if (name != null ? !name.equals(place.name) : place.name != null) return false;
        if (natureType != null ? !natureType.equals(place.natureType) : place.natureType != null) return false;
        return tripType != null ? tripType.equals(place.tripType) : place.tripType == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (natureType != null ? natureType.hashCode() : 0);
        result = 31 * result + (tripType != null ? tripType.hashCode() : 0);
        result = 31 * result + preferredMonth;
        result = 31 * result + howMuchMoney;
        result = 31 * result + howImportant;
        return result;
    }
}

