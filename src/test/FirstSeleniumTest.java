package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\35196\\IdeaProjects\\selenium test\\lib\\seleniumjars\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to("https://foodplanhealth.herokuapp.com/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement root1 = driver.findElement(By.cssSelector("my-app"));
        WebElement shadow_root1 = expand_shadow_element(root1);

        WebElement root2 = shadow_root1.findElement(By.cssSelector("mwc-drawer"));
        WebElement shadow_root2= expand_shadow_element(root2);

        WebElement root3 = shadow_root2.findElement(By.name("appContent"));
        WebElement shadow_root3 = expand_shadow_element(root3);

        WebElement root4 = shadow_root3.findElement(By.cssSelector("div#main-content"));
        WebElement shadow_root4 = expand_shadow_element(root4);

        WebElement root5 = shadow_root4.findElement(By.cssSelector("div#container"));
        WebElement shadow_root5 = expand_shadow_element(root5);

        WebElement root6 = shadow_root5.findElement(By.cssSelector("login-container"));
        WebElement shadow_root6 = expand_shadow_element(root6);

        WebElement root7 = shadow_root6.findElement(By.cssSelector("mwc-textfield"));
        WebElement shadow_root7 = expand_shadow_element(root7);

        WebElement root8 = shadow_root7.findElement(By.cssSelector("mdc-text-field__ripple"));
        WebElement shadow_root8 = expand_shadow_element(root8);

        WebElement login = shadow_root8.findElement(By.cssSelector("mdc-text-field__input"));

        String js = "arguments[0].setAttribute('value','fabio.oliveira@ubi.pt')";
        ((JavascriptExecutor) driver).executeScript(js, login);

    }

    public static WebElement expand_shadow_element(WebElement element)
    {
        WebElement shadow_root = (WebElement)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", element);
        return shadow_root;
    }
}
