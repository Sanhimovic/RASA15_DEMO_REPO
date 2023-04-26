package openBankAccount;

import org.testng.annotations.Test;

import annotations.Base_Class;

public class ZeroBalance extends Base_Class
{
	@Test(groups = {"system","regression"})
	public void zeroForOlderPeople()
	{
		System.out.println("Zero Balance.. No job");
	}
	
	@Test(groups = {"smoke","regression"})
	public void zeroForStudents()
	{
		System.out.println("Searching for job..");
	}
}