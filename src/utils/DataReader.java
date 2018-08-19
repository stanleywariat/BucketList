package utils;

import data.Country;
import data.Place;
import data.City;
import java.util.Scanner;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        this.sc = new Scanner(System.in);
    }

    public void close() {
        this.sc.close();
    }

    public int getInt(){
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Country readAndCreateNewCountry() {
        System.out.println("Country");
        String country = this.sc.nextLine();
        System.out.println("Nature type");
        String natureType = this.sc.nextLine();
        System.out.println("Trip type");
        String tripType = this.sc.nextLine();
        System.out.println("Preferred month");
        int preferredMonth = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("How much money");
        int howMuchMoney = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("How important is it");
        int howImportant = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("What is the capital city");
        String capital = this.sc.nextLine();
        return new Country(country, natureType, tripType, preferredMonth, howMuchMoney, howImportant, capital);
    }

    public City readAndcreateNewCity() {
        System.out.println("City");
        String city = this.sc.nextLine();
        System.out.println("Nature type");
        String natureType = this.sc.nextLine();
        System.out.println("Trip type");
        String tripType = this.sc.nextLine();
        System.out.println("Preferred month");
        int preferredMonth = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("How much money");
        int howMuchMoney = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("How important is it");
        int howImportant = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("What is the country");
        String country = this.sc.nextLine();
        return new City (city, natureType, tripType, preferredMonth, howMuchMoney, howImportant, country);
    }
}
