public class uppgift {
	
public static void main(String[] args) {
	System.out.println(farenheitToCelcius (50));
}
public static double farenheitToCelcius (double farenheit) {
	double celcius = ((farenheit - 32)*5)/9;
	return celcius; 
}

}
