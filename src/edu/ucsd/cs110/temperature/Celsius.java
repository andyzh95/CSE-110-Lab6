package edu.ucsd.cs110.temperature;

import java.util.Calendar;

/**
 * Created by andyzh95 on 2/21/17.
 */
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius convert = new Celsius(this.getValue());
        return convert;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit convert = new Fahrenheit(this.getValue()*9/5 + 32);
        return convert;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.getValue() +" C";
    }
}