package com.selenium.hackathon2.pageelements;

import org.openqa.selenium.By;

public class YLightingPageElements {
	
	public static By LOGO = By.xpath("//*[@class=\"logo-link lu-sprite\"]");
	
	public static By SEARCH = By.xpath("//input[@id=\"searchinput\"]");
	
	public static By SEARCH_ICON = By.xpath("//*[@id=\"simplesearchbtn\"]/i");
	
	public static By VIEW_CART = By.xpath("//*[@href=\"https://www.ylighting.com/cart\"]");
	
	public static By APPLY_COUPON = By.xpath("//*[@name=\"dwfrm_cart_couponCode\"]");
	
	public static By APPLY_ICON = By.xpath("//*[@name=\"dwfrm_cart_addCoupon\"]");
	
	public static By ZIP_CODE = By.xpath("//input[@placeholder=\"Enter ZIP\"]");
	
	public static By ZIP_GO = By.xpath("//*[@class=\"taxCalcBtn\"]");
	
	public static By VERIFY_QUANTITY = By.xpath("//*[@class=\"qty-increment-decrement qty-increment\"]");
	
	public static By REMOVE_CART = By.xpath("//*[@value=\"Remove\"]");
	
	public static By SIGNOUT = By.xpath("//a[@href=\"/logout\"]"); 

}
