package models;

public class Conversion {
    private Integer baseValue;

    public Conversion(Integer baseValue) {
        this.baseValue = baseValue;
    }

    public int getCentimeters(){
        return baseValue * 100;
    }

    public int getKilometers(){
        return baseValue / 100;
    }

    public int getMillimeters(){
        return baseValue * 1000;
    }

    public int getDecimeters(){
        return baseValue * 10;
    }
}
