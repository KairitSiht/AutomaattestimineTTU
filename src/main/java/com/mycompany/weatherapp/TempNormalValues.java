package com.mycompany.weatherapp;

/**
 *
 * @author Kairit
 */

public class TempNormalValues {
    public String isTempANormalTemp(double temp){
        String validation = "noOk";
        if(temp < 100 && temp > -100){
            validation = "ok";
        }
        return validation;
    }
}
