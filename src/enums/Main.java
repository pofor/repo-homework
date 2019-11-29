package enums;



public class Main {
	
	static double g = 9.82;	
	
public static void main(String[] args) {
	System.out.println(farenheitToCelcius (50));
	System.out.println(KelvinToCelcius(0));
	System.out.println(fluidpressure(FluidTable.WATER, 10));
	System.out.println(pressureUnderWater(10));
	System.out.println(kineticEnergy(2,2));
	System.out.println(fallSpeed(2.5));
	System.out.println(delta(1,10));
	System.out.println(delta(5,1));
	System.out.println(volumetoMass(FluidTable.WATER,1));
	System.out.println(volumeToMassGas(GasTable.AIR,1));
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
public static double pressureUnderWater(double deep) {
	double pressure1 = FluidTable.WATER.density * g * deep;
	return pressure1;
}


public static double kineticEnergy(double mass, double velocity) {
	
	double kineticEnergy = mass * Math.pow(velocity, 2) /2;
	return kineticEnergy;
}
public static double potentialEnergy(double mass, double height) {
	return mass * 9.82 * height;
}
public static double fallSpeed(double height) {
	return Math.sqrt(2 * g * height);
}
public static double delta(double first, double last) {
	double delta = last - first;
	return delta;
}
public static double volumetoMass(FluidTable fluid, double volume) {
	double mass = fluid.density * volume;
	return mass; 
}
public static double volumeToMassGas (GasTable gas, double volume) {
double mass = gas.density * volume;
return mass;
}
public static double volumeToMass(SolidTable solid, double volume) {
	
	
	
	
}
}