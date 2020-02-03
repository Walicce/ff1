package com.company;

public class cAirship extends cPlane {
    int AmountOfPeople ;

    @Override
    public String toString() {
        return "cAirship{" +
                "AmountOfPeople=" + AmountOfPeople +
                "name='" + name + '\'' +
        ", level=" + level +
                ", nation='" + nation + '\'' +
                '}';
    }
}
