package openBankAccount;

import org.testng.annotations.Test;

import annotations.Base_Class;

public class SavingsBankAccount extends Base_Class
{
	@Test(groups = {"smoke","regression"})
	public void savings()
	{
		System.out.println("Can save money");
	}
}
