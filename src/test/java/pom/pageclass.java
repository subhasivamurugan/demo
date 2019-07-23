package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {
WebDriver driver=null;
By lnc=By.xpath("//a[@href='/login']");
By uname=By.name("Email");
By pass=By.name("Password");
By login=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");

public pageclass(WebDriver driver) {
 this.driver=driver;
}
public void ClickLink() {
 driver.findElement(lnc).click();
}
public void typename(String Username) {
 driver.findElement(uname).sendKeys(Username);
}
public void typepass(String Password) {
 driver.findElement(pass).sendKeys(Password);
}
public void login() {
 driver.findElement(login).click();
}
}
