package Tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.Assert;

import Pages.Demos;

public class DemosTest extends Demos {

	@Test(priority = 0)
	public void verifyPageTitle() throws IOException {
		validatePageTitle();
	}

	@Test(priority = 1)
	public void verifyDragAnDropFunctionality() throws IOException {
		validateDragAnDropFunctionality();
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void verifyCalenderFunctinality() throws InterruptedException, IOException {
		validateCalenderFunctinality();
		Assert.assertTrue(true);
	}

}
