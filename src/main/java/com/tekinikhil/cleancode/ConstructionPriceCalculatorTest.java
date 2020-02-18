package com.tekinikhil.cleancode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionPriceCalculatorTest 
{
	@Test
	void constructionCostStandard()
	{
		ConstructionPriceCalculator standardMaterial=new ConstructionPriceCalculator();
		standardMaterial.takeInputParameters(55,"standard",false);
		double constructionPrice=standardMaterial.calculateConstructionCost();
		assertEquals(66000,constructionPrice,1);
	}
	@Test
	void constructionCostAboveStandard()
	{
		ConstructionPriceCalculator aboveStandardMaterial=new ConstructionPriceCalculator();
		aboveStandardMaterial.takeInputParameters(60,"aboveStandard");
		double constructionPrice=aboveStandardMaterial.calculateConstructionCost();
		assertEquals(90000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandard()
	{
		ConstructionPriceCalculator highStandardMaterial=new ConstructionPriceCalculator();
		highStandardMaterial.takeInputParameters(100,"highStandard",false);
		double constructionPrice=highStandardMaterial.calculateConstructionCost();
		assertEquals(180000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandardAutoHome()
	{
		ConstructionPriceCalculator highStandardMaterialAuto=new ConstructionPriceCalculator();
		highStandardMaterialAuto.takeInputParameters(400,"highStandard",true);
		double constructionPrice=highStandardMaterialAuto.calculateConstructionCost();
		assertEquals(1000000,constructionPrice,1);
	}
}
