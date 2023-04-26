package openBankAccount;

import org.testng.annotations.Test;

import annotations.Base_Class;

public class CurrentAccount extends Base_Class
{
	@Test(groups = {"smoke","regression"})
	public void cureentAcc()
	{
		System.out.println("will get current");
	}
}
