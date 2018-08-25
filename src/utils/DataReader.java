package utils;

import data.Country;
import data.City;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        this.sc = new Scanner(System.in);
    }

    public void close() {
        this.sc.close();
    }

//************* method taking int number
    public int getInt()throws NumberFormatException{
        int number;

        try {
            number = sc.nextInt();
        }
        catch (InputMismatchException e) {
            throw new NumberFormatException("Wrong number");
        }
        sc.nextLine();
        return number;
    }

//************* creating new country
    public Country readAndCreateNewCountry() {
        System.out.println("Country");
        String country = this.sc.nextLine();
        System.out.println("Nature type");
        String natureType = this.sc.nextLine();
        System.out.println("Trip type");
        String tripType = this.sc.nextLine();
        System.out.println("What is the capital city");
        String capital = this.sc.nextLine();

        int preferredMonth;
        int howMuchMoney;
        int howImportant;

        try {
            System.out.println("What is the preferred month");
            preferredMonth = sc.nextInt();
            sc.nextLine();
            System.out.println("How much money");
            howMuchMoney = sc.nextInt();
            sc.nextLine();
            System.out.println("How important is it");
            howImportant = sc.nextInt();
            sc.nextLine();
        }
        catch (InputMismatchException e){
            sc.nextLine();
            throw e;
        }
        return new Country(country, natureType, tripType, preferredMonth, howMuchMoney, howImportant, capital);
    }

//************* creating new city
    public City readAndcreateNewCity() {
        System.out.println("City");
        String city = this.sc.nextLine();
        System.out.println("Nature type");
        String natureType = this.sc.nextLine();
        System.out.println("Trip type");
        String tripType = this.sc.nextLine();
        System.out.println("What is the country");
        String country = this.sc.nextLine();

        int preferredMonth;
        int howMuchMoney;
        int howImportant;

        try {
            System.out.println("What is the preferred month");
            preferredMonth = sc.nextInt();
            sc.nextLine();
            System.out.println("How much money");
            howMuchMoney = sc.nextInt();
            sc.nextLine();
            System.out.println("How important is it");
            howImportant = sc.nextInt();
            sc.nextLine();
        }
        catch (InputMismatchException e){
            sc.nextLine();
            throw e;
        }
        return new City (city, natureType, tripType, preferredMonth, howMuchMoney, howImportant, country);
    }
}
