package Trendyol_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Trendyol_POM {

public Trendyol_POM(WebDriver driver){
    PageFactory.initElements(driver, this);
}
@FindBy(id = "onetrust-accept-btn-handler")
public WebElement cookies;
@FindBy(className = "search-box")
    public WebElement searcBox;
@FindBy(className = "search-icon")
    public WebElement icon;
@FindBy(className = "prc-box-dscntd")
public List <WebElement> cost;


}
