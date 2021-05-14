package com.hackathon.selenium.pageelements;

import org.openqa.selenium.By;

public class IphonePageElements {
	
	public static By SEARCH = By.xpath("//*[@id=\"search\"]/input");
	
	public static By SEARCH_ICON = By.xpath("//*[@id=\"search\"]/span/button/i");
	
	public static By IPHONE = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a");
	
	public static By QUANTITY = By.xpath("//*[@id=\"input-quantity\"]");
	
	public static By ADD_TO_CART = By.xpath("//*[@id=\"button-cart\"]");
	
	public static By SHIPPING_CART = By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]");
	
	public static By CHECKOUT = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
	
	

}
