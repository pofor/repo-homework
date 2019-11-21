package enums;

public class Main {
	
public static void main(String[] args) {
	System.out.println(farenheitToCelcius (50));
	System.out.println(KelvinToCelcius(0));
	System.out.println(pressureUnderWater(10));
	System.out.println(kineticEnergy(2,2));
}
public static double farenheitToCelcius (double farenheit) {
	double celcius = ((farenheit - 32)*5)/9;
	return celcius; 
}
public static double KelvinToCelcius (double kelvin) {
	double celcius = (kelvin-273.15);
	return celcius;
}
public static double fluidpressure(FluidTable fluid, double deep) {
	
	double pressureWATER = (FluidTable.WATER.density * 9.82 * deep);
	return pressureWATER;
}
public static double kineticEnergy(double mass, double velocity) {
	
	double kineticEnergy = mass * Math.pow(velocity, 2) /2;
	return kineticEnergy;
}
}