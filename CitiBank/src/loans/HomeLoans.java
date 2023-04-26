package loans;

import org.testng.annotations.Test;

import annotations.Base_Class;

public class HomeLoans extends Base_Class
{
	@Test(groups = {"smoke","regression"})
	public void homeConstruction()
	{
		System.out.println("To Construct a house");
	}
	
	@Test(groups = {"system","regression"})
	public void homeBuy()
	{
		System.out.println("To buy a house");
	}
	
	@Test(groups = {"system","regression"})
	public void homePledge()
	{
		System.out.println("Pledge and get money");
	}
}
