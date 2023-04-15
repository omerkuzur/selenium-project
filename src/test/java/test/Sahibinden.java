package test;

import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sahibinden {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sahibinden.com/");

        WebElement ignore = driver.findElement(By.xpath("//*[@id=\'onetrust-reject-all-handler\']"));
        ignore.click();

        WebElement car = driver.findElement(By.xpath("//*[@id='container']/div[3]/div/aside/div[1]/nav/ul[5]/li[2]/ul/li[1]/a"));
        car.click();


        WebElement allCarModel = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/a[1]"));
        allCarModel.click();


        WebElement octaviaClick = driver.findElement(By.xpath("//*[@id=\'categoryListContainer\']/div[3]/ul/li[19]/ul/li[6]/a"));
        octaviaClick.click();

        WebElement kmClick = driver.findElement(By.xpath("//*[@id=\'_cllpsID_a4\']"));
        kmClick.click();

        WebElement kmMin = driver.findElement(By.xpath("//*[@id=\'searchResultLeft-a4\']/dl/dd/div/input[1]"));
        kmMin.click();
        kmMin.sendKeys("60000");

        WebElement kmMax = driver.findElement(By.xpath("//*[@id=\'searchResultLeft-a4\']/dl/dd/div/input[2]"));
        kmMax.click();
        kmMax.sendKeys("150000");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\'searchResultsSearchForm\']/div[1]/div[3]/div[25]/button"));
        searchButton.click();

        Thread.sleep(2000);

        WebElement sortKm = driver.findElement(By.xpath("//*[@id=\'searchResultsTable\']/thead/tr/td[5]/a"));
        sortKm.click();

        Thread.sleep(2000);

        WebElement count = driver.findElement(By.xpath("//*[@id=\'searchResultsSearchForm\']/div[1]/div[4]/div[1]/div[2]/div[1]/div/div[1]/div/div[3]/span"));
        String[] words = count.getText().split(" ");
        String a = words[0];
        System.out.println(a);
        a = a.replaceAll("\\.", "");
        Integer c = Integer.valueOf(a);
        System.out.println(c);


        List<String> headTextList = new ArrayList<String>();
        String den = "//*[@id=\'searchResultsTable\']/tbody/tr[";
        String den1 ="]/td[3]/a";
        for(int i = 1; i<10; i++){
            String indis = Integer.toString(i);
            WebElement text = driver.findElement(By.xpath(den + indis + den1));
            headTextList.add(text.getText());
        }
        for(Object str: headTextList){
            System.out.println(str);
        }




    }
}
