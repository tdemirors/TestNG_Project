package Trendyol_Project;

import Utils.GeneralWebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Trendyol extends GeneralWebDriver {

    @Test
    void trendyol(){
        driver.get("https://www.trendyol.com/");

        Trendyol_POM elements = new Trendyol_POM(driver);

        elements.cookies.click();
        elements.searcBox.sendKeys("laptop");
        elements.icon.click();
        Actions actions = new Actions(driver);

        int numElements=100;
        do{
            actions.scrollToElement(elements.cost.get(elements.cost.size()-1)).build().perform();
        }while(elements.cost.size() < numElements);

        double total=0;
        for (int i =0; i < numElements; i++) {
            total+= Double.parseDouble(elements.cost.get(i).getText().replaceAll("[. TL]" , "").replace(",", "."));
        }

       double average = total / numElements;

        System.out.println("Average price of 100 laptops = " + average + " TL");



    }




}
