package data;

public class PlaceList {
    public static final int MAX_PLACES = 1000;
    private Place[] places;
    private int placesNumber;

    public PlaceList() {
        places = new Place[MAX_PLACES];
    }

//*************** methods
    //*********** adding the new place
    public void addPlace(Place place){
            if(placesNumber < MAX_PLACES){
                places[placesNumber] = place;
                placesNumber++;
            } else{
                System.out.println("Max number of places reached");
            }
    }
    //*********** adding the new country
    public void addCountry(Country country){
        addPlace(country);
    }
    //*********** adding the new city
    public void addCity(City city){
        addPlace(city);
    }
    //*********** printing the countries
    public void printCountries(){
        boolean country = false;

        for (Place c: places) {
            if (c instanceof Country) {
                System.out.println(c);
                country = true;
            }
            if (!country)
                System.out.println("No countries");
        }
    }
    //*********** printing the cities
    public void printCities(){
        boolean city = false;

        for (Place c: places) {
            if (c instanceof City) {
                System.out.println(c);
                city = true;
            }
        }
            if (!city)
                System.out.println("No cities");
    }
    //***************
}