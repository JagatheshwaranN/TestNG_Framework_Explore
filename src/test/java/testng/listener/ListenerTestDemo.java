package testng.listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTestDemo {

	@Test
	public void buyProduct() {
		System.out.println("Buy home appliances in the Home Depo store at Shopping Mall");
	}

	@Test
	public void goForMovie() {
		System.out.println("Go for movie streaming in the PVR at Shopping Mall");
	}

	@Test
	public void eatFood() {
		System.out.println("Eat food in the McDonalds at Shopping Mall");
	}

	@Test
	public void playGame() {
		System.out.println("Play games in the Arena at Shopping Mall");
	}

	@Test(dependsOnMethods = "parkVehicle")
	public void takeMassage() {
		System.out.println("Relax yourself by taking massage in the Spa at Shopping Mall");
	}

	@Test
	public void parkVehicle() {
		System.out.println("Park the vehicle in the parking space at Shopping Mall");
		Assert.fail("Failing this test case to demonstrate the behavior of Listener when test case fail");
	}

}
