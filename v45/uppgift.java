public class uppgift {
	
public static void main(String[] args) {
	System.out.println(farenheitToCelcius (50));
	System.out.println(KelvinToCelcius(0));
}
public static double farenheitToCelcius (double farenheit) {
	double celcius = ((farenheit - 32)*5)/9;
	return celcius; 
}
public static double KelvinToCelcius (double kelvin) {
	double celcius = (kelvin-273.15);
	return celcius;
}

}
