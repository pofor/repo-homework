package enums;

import java.util.Scanner;

public class Main {
	
	static double g = 9.82;	
	static double R = 8.3144621;
	static double G = 6.67408*Math.pow(10, -11);
	static double p_0 = 1000;
	static double c = 299792458;
	
	
	
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
	System.out.println(volumeToMass(SolidTable.IRON,1));
	System.out.println(svtVelocity(10,5)); 
	System.out.println(svtDistance(10,5));
	System.out.println(svtTime(10,2)); 
	System.out.println(work(50,10));
	System.out.println(power(1000,2));
	System.out.println(heatSolid(SolidTable.IRON,1,2)); 
	System.out.println(heatFluid(FluidTable.WATER,1,10));
	System.out.println(heatGas(GasTable.AIR,1,1));
	System.out.println(velocityToHeight(9.82));
	
	
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
return solid.density * volume;
}
public static double svtVelocity(double distance, double time) {
return distance/time;
}
public static double svtDistance(double velocity, double time) {
return velocity * time;
}
public static double svtTime(double distance, double velocity) {
return distance/velocity;
}
public static double work(double force, double distance) {
return force * distance;
}
public static double power(double work, double time) {

return work/time;
}
public static double heatSolid(SolidTable solid, double mass, double deltaT) {

return solid.heatCapacity * mass * deltaT;
}
public static double heatFluid(FluidTable fluid, double mass, double deltaT) {

return fluid.heatCapacity * mass * deltaT;
}

public static double heatGas(GasTable gas, double mass, double deltaT) {

return gas.heatCapacity * mass * deltaT;
}

public static double velocityToHeight(double velocity) {

return Math.pow(velocity, 2)/ (2 * g);
}

public static double Force (double mass) {

return mass * g;
}




}
