package edu.ucsd.cs110.temperature;

/**
 * Created by andyzh95 on 2/21/17.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius convert = new Celsius((this.getValue()-32)*5/9);
        return convert;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit convert = new Fahrenheit(this.getValue());
        return convert;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.getValue()+" F";
    }
}