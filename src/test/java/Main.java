import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.operadriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.click();
        fullName.sendKeys("Murat Bektas");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.click();
        eMail.sendKeys("mb@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAddress.click();
        currentAddress.sendKeys("Vakfıkebir/TRABZON");


        /* Selenium'da aşağı kaydırma */
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350)", "");
        /*  ------------------------------------------------------------- */

        WebElement permanentAddress= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.click();
        permanentAddress.sendKeys("Merkez/BİLECİK");

        WebElement button= driver.findElement(By.id("submit"));
        button.click();


        //driver.quit();

       /*
        WebElement element2= driver.findElement(By.cssSelector(""));
        WebElement element3= driver.findElement(By.xpath(""));
        WebElement element4= driver.findElement(By.name(""));
        WebElement element5= driver.findElement(By.linkText(""));
        WebElement element6= driver.findElement(By.className(""));

        element1.click(); // tıklama komutu
        element1.sendKeys(""); // elemana text yollayabiliyoruz.*/

    }
}






