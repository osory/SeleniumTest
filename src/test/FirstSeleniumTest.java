package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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

        pressLogin();

        pressNewPlan();

        writeName();

        chooseSettings();

        clientId();

        avoidFood();

        chooseMealTime();

        pressMakePlan();
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

        last2.findElement(By.cssSelector("input")).sendKeys("cunha.cas@gmail.com");

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

        last2.findElement(By.cssSelector("input")).sendKeys("123456");
    }

    static void pressLogin() throws InterruptedException {

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

    static void pressNewPlan() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("#button-container > mwc-button.primary-button.item"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        last2.findElement(By.id("button")).click();
    }

    static void writeName() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan-first"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("div > zone-element:nth-child(1) > zone-foodplan-name"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        WebElement shadowDomHostElement3 = last2.findElement(By.cssSelector("#name-textfield"));
        WebElement last3 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement3);

        Thread.sleep(1000);

        last3.findElement(By.cssSelector(".mdc-text-field__input"));

        last3.findElement(By.cssSelector("input")).sendKeys("Primeira Dieta");

    }

    static void chooseSettings() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan-first"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("div > zone-element:nth-child(2) > zone-foodplan-settings"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        WebElement shadowDomHostElement3 = last2.findElement(By.cssSelector("#b3"));
        WebElement last3 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement3);

        Thread.sleep(1000);

        last3.findElement(By.id("button")).click();

        Thread.sleep(1000);

        WebElement shadowDomHostElement4 = last2.findElement(By.cssSelector("#b6"));
        WebElement last4 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement4);

        Thread.sleep(1000);

        last4.findElement(By.id("button")).click();

    }

    static void clientId() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan-first"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("div > zone-element:nth-child(3) > zone-foodplan-client"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        WebElement shadowDomHostElement3 = last2.findElement(By.cssSelector("#name-textfield"));
        WebElement last3 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement3);

        Thread.sleep(1000);

        last3.findElement(By.cssSelector(".mdc-text-field__input"));

        last3.findElement(By.cssSelector("input")).sendKeys("Fabio Oliveira");

    }
    static void avoidFood() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan-first"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("div > zone-element:nth-child(4) > zone-foodplan-food"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        WebElement shadowDomHostElement3 = last2.findElement(By.cssSelector("#name-textfield"));
        WebElement last3 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement3);

        Thread.sleep(1000);

        last3.findElement(By.cssSelector(".mdc-text-field__input"));

        last3.findElement(By.cssSelector("input")).sendKeys("Bolo de arroz");

        Thread.sleep(1000);

        WebElement shadowDomHostElement4 = last2.findElement(By.cssSelector("div:nth-child(3) > mwc-list"));

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(shadowDomHostElement4).click().perform();

    }

    static void chooseMealTime() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan-first"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("div > zone-element:nth-child(5) > zone-foodplanevents"));
        WebElement last2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement2);

        Thread.sleep(1000);

        WebElement shadowDomHostElement3 = last2.findElement(By.cssSelector("#addMeal-container > div > mwc-formfield:nth-child(1)"));

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(shadowDomHostElement3).click().perform();

        Thread.sleep(1000);

        WebElement shadowDomHostElement4 = last2.findElement(By.cssSelector("#addMeal-container > mwc-button"));
        WebElement last4 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement4);

        last4.findElement(By.id("button")).click();

    }

    static void pressMakePlan() throws InterruptedException {

        Thread.sleep(1000);

        WebElement shadowDomHostElement0 = driver.findElement(By.cssSelector("body > my-app"));
        WebElement last0 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement0);

        Thread.sleep(1000);

        WebElement shadowDomHostElement1 = last0.findElement(By.cssSelector("#app > page-foodplan-first"));
        WebElement last1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement1);

        Thread.sleep(1000);

        WebElement shadowDomHostElement2 = last1.findElement(By.cssSelector("#btn-main"));
        
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(shadowDomHostElement2).click().perform();
    }

}
