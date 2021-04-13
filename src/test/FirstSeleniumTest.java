package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\35196\\IdeaProjects\\selenium test\\SeleniumTest\\lib\\seleniumjars\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to("https://foodplanhealth.herokuapp.com/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        writeEmail();

        writePassword();

        pressButton();
    }

    static void writeEmail() throws InterruptedException {
        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("my-app[title='FoodPlan']"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("page-login"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("mwc-textfield[type='email']"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        last2.findElement(By.cssSelector(".mdc-text-field__input"));

        last2.findElement(By.cssSelector("input")).sendKeys("random@email.com");

    }

    static void writePassword() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("my-app[title='FoodPlan']"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("page-login"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("mwc-textfield[type='password']"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        last2.findElement(By.cssSelector(".mdc-text-field__input"));

        last2.findElement(By.cssSelector("input")).sendKeys("password");
    }

    static void pressButton() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("my-app[title='FoodPlan']"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("page-login"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("mwc-button[label='Login']"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        last2.findElement(By.id("button")).click();
    }

}
