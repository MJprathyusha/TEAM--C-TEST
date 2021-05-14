package com.hackathon.selenium.pageelements;

import org.openqa.selenium.By;

public class OpencartHomePageElements {

	public static By OPENCART_MYACCOUNT = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");

	public static By OPENCART_LOGIN = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");

	public static By OPENCART_REGISTER = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

	public static By CURRENCY = By.xpath("//*[@id=\"form-currency\"]/div/button/span");

	public static By WISHLIST = By.xpath("//*[@id=\"wishlist-total\"]/span");

	public static By SHOPPING_CART = By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");

	public static By CHECK_OUT = By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span");

}
