/**
 * Covert from Fahrenheit to Celcius degree.
 * @param fahrenheit Temperature in degrees Fahrenheit.
 * @retun Equivalent temperature in degrees Celsius.
 */ 
 
public double fahrenheitToCelsius(double fahrenheit) {
  return (fahrenheit - 32) * 5 / 9;
}

/** 
 * Print a temprature in  both Fahrenheit and Celsius degrees.
 * @param fahrenheit Temperature in degrees Fahrenheit.
 */

public void printTemperature(double fahrenheit) {
   System.out.println("F: "+ fahrenheit);
   System.out.println("C: "+ fahrenheitToCelsius(fahrenheit));
 }
