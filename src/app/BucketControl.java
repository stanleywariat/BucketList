package app;

import data.Country;
import data.City;
import utils.DataReader;
import data.Place;
import data.PlaceList;
import utils.PlaceUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class BucketControl {
    //fields to control the program
    public static final int EXIT = 0;
    public static final int ADD_COUNTRY = 1;
    public static final int ADD_CITY = 2;
    public static final int PRINT_COUNTRIES = 3;
    public static final int PRINT_CITIES = 4;

    //field to communication with the user
    private DataReader dataReader;

    //countryList with data
    private PlaceList placeList;

    //constructor
    public BucketControl() {
        placeList = new PlaceList();
        dataReader = new DataReader();
    }


    //the interaction
    public void controlLoop() {
        Option option = null;
        while (option != Option.EXIT) {
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());

                switch (option) {
                    case ADD_COUNTRY:
                        addCountry();
                        break;
                    case PRINT_COUNTRIES:
                        printCountries();
                        break;
                    case ADD_CITY:
                        addCity();
                        break;
                    case PRINT_CITIES:
                        printCities();
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Wrong data");
            }
            catch (NumberFormatException | NoSuchElementException e){
                System.out.println("No option like this");
            }
        }
        dataReader.close();
    }

    //methods
    private void printOptions() {
        System.out.println("Choose the option:");
        for(Option o: Option.values()) {
            System.out.println(o);
        }
    }

    //country
    private void addCountry() {
        Country country = dataReader.readAndCreateNewCountry();
        placeList.addCountry(country);
    }

    private void printCountries() {
        PlaceUtils.printCountries(placeList);
    }

    //city
    private void addCity() {
        City city = dataReader.readAndcreateNewCity();
        placeList.addCity(city);
    }

    private void printCities() {
        PlaceUtils.printCities(placeList);
    }

}