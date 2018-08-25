package data;

public class PlaceList {
    public static final int MAX_PLACES = 1000;
    private Place[] places;
    private int placesNumber;

    //***********constructor
    public PlaceList() {
        places = new Place[MAX_PLACES];
    }

    //********** getter, setter
    public Place[] getPlaces() {
        return places;
    }

    public void setPlaces(Place[] places) {
        this.places = places;
    }

    public int getPlacesNumber() {
        return placesNumber;
    }

    public void setPlacesNumber(int placesNumber) {
        this.placesNumber = placesNumber;
    }
    //***********************************************


    //*************** methods
    //*********** adding the new place
    public void addPlace(Place place)throws ArrayIndexOutOfBoundsException{
        if (placesNumber == MAX_PLACES) {
            throw new ArrayIndexOutOfBoundsException("MAX PLACES IS" + MAX_PLACES);
        }
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

    //***************
}