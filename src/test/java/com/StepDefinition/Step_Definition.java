package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;
import com.pom.PageObjectManager;
import com.reader.Configuration_Helper;
import com.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver=RunnerClass.driver;
	public static PageObjectManager p = new PageObjectManager(driver);

@Given("^user Launch The Adactin Url$")
public void user_Launch_The_Adactin_Url() throws Throwable {
	String url = Configuration_Helper.getInstance().getInstanceCR().geturl();
	geturl(url);
	
	implicity();
	
    
}

@When("^user Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	 userInput(p.getHomePage().getUsername(),"thiyagarajan");
	
}

@When("^user Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	  userInput(p.getHomePage().getPassword(),"thiyagarajan");
		
}

@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	 clickonElement(p.getHomePage().getClicklogin());
}

@When("^user Select The Hotel Location$")
public void user_Select_The_Hotel_Location() throws Throwable {
	location(p.getSearchHotel().getLocation());

}

@When("^user Select The Hotel$")
public void user_Select_The_Hotel() throws Throwable {
	hotelName(p.getSearchHotel().getHotel());
    
}

@When("^user Select The Room Type$")
public void user_Select_The_Room_Type() throws Throwable {
	roomType(p.getSearchHotel().getRoomType());
	
}

@When("^user Select The Number Of Rooms$")
public void user_Select_The_Number_Of_Rooms() throws Throwable {
	numberOfRoom(p.getSearchHotel().getNumbers());
	
}

@When("^user Enter The Check In Date In Check In Field$")
public void user_Enter_The_Check_In_Date_In_Check_In_Field() throws Throwable {
	
	clickonElement(p.getSearchHotel().getInDate());
	clearOnElement(p.getSearchHotel().getInDate());
	Thread.sleep(3000);
	userInput(p.getSearchHotel().getInDate(), "10/03/2022");
	
}

@When("^user Enter The Check Out Date In  Check Out Field$")
public void user_Enter_The_Check_Out_Date_In_Check_Out_Field() throws Throwable {
	clickonElement(p.getSearchHotel().getOutDate());
	clearOnElement(p.getSearchHotel().getOutDate());
	Thread.sleep(3000);
	userInput(p.getSearchHotel().getOutDate(), "11/03/2022");
}

@When("^user Select The Adults Per Room$")
public void user_Select_The_Adults_Per_Room() throws Throwable {
	numberOfAdult(p.getSearchHotel().getAdult());
	
}

@When("^user Select The Children Per Room$")
public void user_Select_The_Children_Per_Room() throws Throwable {
	numberOfChildren(p.getSearchHotel().getChild());
	
}

@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	clickonElement(p.getSearchHotel().getSubmit());
	Thread.sleep(5000);
}

@When("^user Slecet The Hotel$")
public void user_Slecet_The_Hotel() throws Throwable {

	clickonElement(p.getSelectHotel().getSelectHotel());
	
}

@Then("^user Click The Continue Button And It Navigates To The Book A Hotel Page$")
public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
	clickonElement(p.getSelectHotel().getContinues());
	
	implicity();
}

@When("^user Enter The First Name In First Name Field$")
public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	userInput(p.getBookHotel().getFirst_Name(),"firstName");
	
}

@When("^user Enter The Last Name In Last Name Field$")
public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	userInput(p.getBookHotel().getLast_Name(),"s");
	
}

@When("^user Enter The Address in Address Field$")
public void user_Enter_The_Address_in_Address_Field() throws Throwable {
	userInput(p.getBookHotel().getAddress(),"no 2/16 GKM nagar adalide");
	
}

@When("^user Enter The Credit Card No In Credit Card Field$")
public void user_Enter_The_Credit_Card_No_In_Credit_Card_Field() throws Throwable {
	userInput(p.getBookHotel().getCc_num(),"9087654321098765");
	
}

@When("^user Select The Credit Card Type$")
public void user_Select_The_Credit_Card_Type() throws Throwable {
	ccType(p.getBookHotel().getCc_type());
	
}

@When("^user Select The Credit Card Exp Month$")
public void user_Select_The_Credit_Card_Exp_Month() throws Throwable {
	expMonth(p.getBookHotel().getExpMonth());
	
}

@When("^user Select The Credit Card Exp Year$")
public void user_Select_The_Credit_Card_Exp_Year() throws Throwable {
	expYear(p.getBookHotel().getExpYear());
	
}

@When("^user Enter The CVV Number In CVV Field$")
public void user_Enter_The_CVV_Number_In_CVV_Field() throws Throwable {
	userInput(p.getBookHotel().getCvv(),"687");
}

@Then("^user Click The Book Now Button$")
public void user_Click_The_Book_Now_Button() throws Throwable {
	Thread.sleep(3000);
	
	
	screenShot();
}


	


}
