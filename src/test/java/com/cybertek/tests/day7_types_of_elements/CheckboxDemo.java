package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {

    @Test

            public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));

        //How to verify checkbox is selected or not?
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //Verify Checkbox1 is NOT selected, 2 is selected
        Assert.assertFalse(checkbox1.isSelected(),"Verify Checkbox1 is NOT selected");
        Assert.assertTrue(checkbox2.isSelected(),"Verify Checkbox2 is selected");

        //how to check checkbox?
        //just like a radio button we use click() method
       Thread.sleep(2000);
        checkbox1.click();

        //Verify after click
        Assert.assertTrue(checkbox1.isSelected(),"Verify Checkbox1 is selected");
        Assert.assertTrue(checkbox2.isSelected(),"Verify Checkbox2 is selected");

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        Thread.sleep(2000);
        driver.quit();

    }
}
