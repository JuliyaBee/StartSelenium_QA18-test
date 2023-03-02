import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStartHW {


    WebDriver wd;


    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        //   wd.get("https://ilcarro.web.app/search");
        wd.navigate().to("https://telranedu.web.app/login");
        //  wd.navigate().forward();
        //  wd.navigate().back();

    }

    @Test
    public void testLogin() {
//        WebElement container = wd.findElement(By.className("container"));
//        System.out.println(container.getTagName());
//        System.out.println(container.getAttribute("id"));
//        WebElement div =wd.findElement(By.tagName("div"));
//        System.out.println(div.getText());
//        List<WebElement>divs = wd.findElements(By.tagName("div"));
//        System.out.println(divs.size());
//                WebElement element = wd.findElement(By.tagName("a"));
//        List<WebElement> elements = wd.findElements(By.tagName("a"));
//        System.out.println((elements.size()));
//       WebElement active =  wd.findElement(By.className("active"));
//        System.out.println(active.getTagName());
//       WebElement phone = wd.findElement(By.tagName("h1"));
//        System.out.println(phone.getText());
//       WebElement log = wd.findElement(By.linkText("LOGIN"));
//        System.out.println(log.getAttribute("login"));

//        WebElement container = wd.findElement(By.cssSelector(".container"));
//        WebElement div = wd.findElement(By.cssSelector("div"));
//        WebElement a = wd.findElement(By.cssSelector("a"));
//        List<WebElement> divs = wd.findElements(By.cssSelector("div"));
//        List<WebElement> elements = wd.findElements(By.cssSelector("a"));
//        WebElement active = wd.findElement(By.cssSelector(".active"));
//        WebElement log = wd.findElement(By.cssSelector("[href='/login']"));
//        WebElement password = wd.findElement(By.cssSelector("[name='password']"));
//        WebElement root = wd.findElement(By.cssSelector("#root"));
//        WebElement element = wd.findElement(By.cssSelector("a"));
//        WebElement form = wd.findElement(By.cssSelector("form"));
//        WebElement login_login__3EHKB = wd.findElement(By.cssSelector(".login_login__3EHKB"));
//        WebElement login = wd.findElement(By.cssSelector("[href='/login']"));
//        WebElement login_style = wd.findElement(By.cssSelector("[style*='border: 1px solid black;'] "));
//        WebElement navbar = wd.findElement(By.cssSelector("[class^='navbar']"));
//        WebElement style = wd.findElement(By.cssSelector("[style$='color: white;']"));
        WebElement container = wd.findElement(By.xpath("//*[@class='container']"));
        wd.findElement(By.xpath("//div[@id='root' and @class='container']"));
        wd.findElement(By.xpath("//div"));
        wd.findElement(By.xpath("//a"));
        wd.findElement(By.xpath("//div//a"));
        wd.findElement(By.xpath("//div//a[@class='active']"));
        wd.findElement(By.xpath("//div//a[contains(@href,'login')]"));
        wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']/a[@href='/login']"));
        wd.findElement(By.xpath("//input[@name='password']"));
        wd.findElement(By.xpath("//div[@class='login_login__3EHKB']/form/input[@placeholder='Password']"));
        wd.findElement(By.xpath("//div[@id='root']"));
        wd.findElement(By.xpath("//div[@class='login_login__3EHKB']/form"));
        wd.findElement(By.xpath("//input[@name='email']/.."));
        wd.findElement(By.xpath("//*[starts-with(@style,'border')]"));
        wd.findElement(By.xpath("//div[starts-with(@class,'navbar')]"));
        wd.findElement(By.xpath("//a[contains(@style,'border: 1px solid black; background-color: black; color: white;')]"));

    }

    @AfterMethod
    public void postCondition() {
        System.out.println("End postCondition");
        //  wd.close();
        wd.quit();
    }
}
