package com.mycompany.weatherapp;

/**
 *
 * @author Kairit
 */
public class LowestLow {
    public double LowTemp(double temp){
      double lowest= 0.0;
      for(int i= 0; i <3 ;i++){
          if(temp< lowest)
              temp = lowest;
      }
      return lowest;
    }
}
