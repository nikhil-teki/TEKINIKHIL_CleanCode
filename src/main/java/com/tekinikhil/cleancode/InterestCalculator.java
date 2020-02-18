package com.tekinikhil.cleancode;

public class InterestCalculator 
{
	public double findSimpleInterest(double principle,double time,double rateOfInterest)
	{
		SimpleInterestCalculator SimpleInterest=new SimpleInterestCalculator(principle,time,rateOfInterest);
		return SimpleInterest.calculateSimpleInterest();
	}
	public double findCompoundInterest(double principle,double time,double rateOfInterest)
	{
		CompoundInterestCalculator CompoundInterest=new CompoundInterestCalculator(principle,time,rateOfInterest);
		return CompoundInterest.calculateCompoundInterest();
	}
}