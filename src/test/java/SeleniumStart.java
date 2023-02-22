import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStart {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/home");
        //wd.navigate().forward();
        //wd.navigate().back();
    }

    @Test
    public void testLogin() {
        WebElement element = wd.findElement(By.tagName("a"));

        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
        List<WebElement> divs = wd.findElements(By.tagName("div"));
        System.out.println(divs.size());
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement active = wd.findElement(By.className("active"));
        System.out.println(active);
        List<WebElement> actives = wd.findElements(By.className("active"));
        System.out.println(actives.size());
        WebElement login = wd.findElement(By.linkText("LOGIN"));
        System.out.println(login);
        List<WebElement> bo = wd.findElements(By.partialLinkText("BO"));
        System.out.println((bo.size()));
        WebElement h1 = wd.findElement(By.tagName("h1"));
        System.out.println(h1);
        List<WebElement>home = wd.findElements(By.partialLinkText("HOME"));
        System.out.println(home.size());

    }

    @AfterMethod
    public void postCondition() {
        //  wd.close();
        wd.quit();

    }
}
