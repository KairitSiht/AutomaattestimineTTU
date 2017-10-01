/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import com.mycompany.weatherapp.LowestLow;
import com.mycompany.weatherapp.TempNormalValues;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kairit
 */
public class JUnit {
    
    public JUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    
    public void isTemperatureInNormalValues(){
        TempNormalValues test = new TempNormalValues();
        String output = test.isTempANormalTemp(222.2);
	assertEquals("noOk", output);
    }
    public void isTheFormatJSON(){}
    public void areGEOValuesInAPromisedWay(){}
   
    public void isTheLowestReallyTheLowestTemp(){
        LowestLow test = new LowestLow();
        double output =test.LowTemp(-11.2);
        assertEquals(2.3, output);
        
    }
    public void isTheHighestReallyTheHighestTemp(){}
    public void isinfoGivenForThreeDaysOnly(){}
 
    @Test	
    public void isTheStatus200Test() throws Exception {
        String targetUrl = "https://api.openweathermap.org/";

        try {
                URL url = new URL(targetUrl);
                HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
                urlConn.connect();

                assertEquals(HttpURLConnection.HTTP_OK, urlConn.getResponseCode());
            } 
        catch (IOException e) {
                System.err.println("Cannot connect to the required website");
                e.printStackTrace();
                throw e;
            }
        }
    }
    

