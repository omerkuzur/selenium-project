package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");


        WebElement cookies = driver.findElement(By.xpath("//*[@id=\'sp-cc-accept\']"));
        cookies.click();

        WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
        searchText.click();
        searchText.sendKeys("iphone 14 pro");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement appleButton = driver.findElement(By.xpath("//*[@id=\'p_89/Apple\']/span/a/div/label/i"));
        appleButton.click();

        WebElement phoneClickOne = driver.findElement(By.xpath("//*[@id=\'n/13709880031\']/span/a/span"));
        phoneClickOne.click();

        WebElement phoneClickTwo = driver.findElement(By.xpath("//*[@id=\'n/13709907031\']/span/a/span"));
        phoneClickTwo.click();

        WebElement sortListClick = driver.findElement(By.xpath("//*[@id=\'search\']/span/div/h1/div/div[2]/div/div/form"));
        sortListClick.click();

        WebElement sortAmount = driver.findElement(By.xpath("//*[@id=\'s-result-sort-select_1\']"));
        sortAmount.click();

        Thread.sleep(2000);

        WebElement lowPrice = driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[4]/div/a/span/span[2]/span[1]"));
        System.out.println(lowPrice.getText());



    }
}
