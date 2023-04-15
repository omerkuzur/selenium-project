package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAmazonStepDef{

    WebDriver driver = null;

    public void chromeBrowser(){
        WebDriver driver = new ChromeDriver();
    }

    @When("Navigate Amazon Page")
    public void navigateTo(){
        driver.get("https://www.amazon.com.tr/");
    }

    @Then("accept cookies")
    public void acceptCookies(){
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\'sp-cc-accept\']"));
    }

    @Then("click space text and send keys")
    public void searchTransaction(){
        WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
    }

    @Then("search button click")
    public void searchButtonClick(){
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
    }

    @Then("apple button click")
    public void appleButtonClick(){
        WebElement appleButton = driver.findElement(By.xpath("//*[@id=\'p_89/Apple\']/span/a/div/label/i"));
    }
    @Then("phone button click")
    public void phoneClickOne(){
        WebElement phoneClickOne = driver.findElement(By.xpath("//*[@id=\'n/13709880031\']/span/a/span"));
    }
    @Then("second phone button click")
    public void phoneClickTwo(){
        WebElement phoneClickTwo = driver.findElement(By.xpath("//*[@id=\'n/13709907031\']/span/a/span"));
    }

    @Then("sorting list click")
    public void sortListClick(){
        WebElement sortListClick = driver.findElement(By.xpath("//*[@id=\'search\']/span/div/h1/div/div[2]/div/div/form"));
    }
    @Then("sorting")
    public void sortAmount(){
        WebElement sortAmount = driver.findElement(By.xpath("//*[@id=\'s-result-sort-select_1\']"));
    }
    @Then("print cheapest price")
    public void printLowPrice(){
        WebElement lowPrice = driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[4]/div/a/span/span[2]/span[1]"));
    }

}
