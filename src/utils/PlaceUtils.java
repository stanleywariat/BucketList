package utils;

import data.City;
import data.Country;
import data.Place;
import data.PlaceList;

public class PlaceUtils {
    //*********** printing the countries
    public static void printCountries(PlaceList placeList){
        Place[] places = placeList.getPlaces();
        boolean country = false;

        for (Place c: places) {
            if (c instanceof Country) {
                System.out.println(c);
                country = true;
            }
            if (!country) {
                System.out.println("No countries");
                country = true;
            }
        }
    }
    //*********** printing the cities
    public static void printCities(PlaceList placeList){
        Place[] places = placeList.getPlaces();
        boolean city = false;

        for (Place c: places) {
            if (c instanceof City) {
                System.out.println(c);
                city = true;
            }
            if (!city) {
                System.out.println("No cities");
                city = true;
            }
        }
    }
}
