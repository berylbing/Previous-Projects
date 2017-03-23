package org.algorithm.topicDetected.cluster;

public class Energy {
	public double energyFunction(double nutr){
		double energy=10*nutr/(1+10*nutr);
		return energy;
	}
	public double gtNutrition(double sim,double n1,double n2){
		double gn=sim*Math.log(0.6*n1+0.4*n2+2)/(1+Math.log(0.6*n1+0.4*n2+2));
		return gn;
	}
	public double nutritionFunction(double energy){
		double nutrition=energy/10*(1-energy);
		return nutrition;
		
	}
}
