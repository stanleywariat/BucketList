package app;

import java.util.NoSuchElementException;

public enum Option {
    EXIT(0, "leave the program"),
    ADD_COUNTRY(1, "add the new country"),
    ADD_CITY(2,"add the new city"),
    PRINT_COUNTRIES(3, "print countries"),
    PRINT_CITIES(4, "print cities");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String desc) {
        this.value = value;
        this.description = desc;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    public static Option createFromInt(int option) throws NoSuchElementException {
        Option result = null;
        try {
            result = Option.values()[option];
        } catch(ArrayIndexOutOfBoundsException e){
            throw new NoSuchElementException("No element with that ID");
        }
        return result;
    }
}