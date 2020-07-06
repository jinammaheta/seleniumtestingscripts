
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Testing {
    WebDriver webdriver;
    public void invokeBrowser() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\sem8\\seleniumjars\\chromedriver_win32\\chromedriver.exe");
        webdriver=new ChromeDriver();
        webdriver.get("localhost:5000");
        webdriver.manage().window().maximize();
        webdriver.findElement(By.className("card")).click();
        webdriver.findElement(By.id("s20")).click();
        webdriver.findElement(By.id("s21")).click();
        webdriver.findElement(By.id("s22")).click();
        webdriver.findElement(By.cssSelector("button[type=submit")).click();
        Thread.sleep(3000);
        webdriver.findElement(By.xpath("//div[@class=\"modal-body\"]/input[1]")).click();
        webdriver.findElement(By.xpath("//div[@class=\"modal-body\"]/input[2]")).click();
        webdriver.findElement(By.xpath("//div[@class=\"modal-body\"]/input[3]")).click();
        webdriver.findElement(By.cssSelector("input[type=submit")).click();
        webdriver.navigate().back();
        webdriver.navigate().back();
        webdriver.navigate().back();
        webdriver.findElements(By.className("card")).get(1).click();
        Select disease=new Select(webdriver.findElement(By.id("disease")));
        disease.selectByIndex(2);
//        webdriver.findElement(By.id("choose")).click();
        WebElement uploadElement = webdriver.findElement(By.id("file"));
        uploadElement.sendKeys("C:\\Users\\Admin\\Desktop\\sem7\\final year project\\datasets\\chest-xray-pneumonia\\chest_xray\\test\\NORMAL\\IM-0003-0001.jpeg");
        webdriver.findElement(By.cssSelector("input[type=submit]"));
    }
    
    public static void main(String[] args) throws InterruptedException {
        Testing t1=new Testing();
        t1.invokeBrowser();
    }
}
