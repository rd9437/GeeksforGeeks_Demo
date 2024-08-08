package com.objectrepository.demo;		

import java.io.FileInputStream;		
import java.io.FileNotFoundException;		
import java.io.IOException;		
import java.util.Properties;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class DemoOR {				

public static void main(String[] args) throws IOException {										
	
// Create WebDriver Instance		
    WebDriver driver;			
    System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
    driver = new ChromeDriver();					
    driver.get("http://yourownwebsite"); //Add your own website here					
    driver.manage().window().maximize();			
// Load the properties File		
    Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\demo.properties");									
    obj.load(objfile);					
// Nagigate to link Mobile Testing and Back		
    driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();							
    driver.navigate().back();			
// Enter Data into Form		
    driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("example@gmail.com"); //Add you own mail address								
    driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();							
  }		

}		
