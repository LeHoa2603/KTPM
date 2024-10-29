import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forgetpassword {
String email="a@gmail.com";
String mobile="093857462";
String password="12345";
String confirmpassword=password;
    ChromeDriver chromeDriver;
    @BeforeMethod
    public void BeforeRun(){
        WebDriverManager.chromedriver().setup();
        chromeDriver=new ChromeDriver();
    }
    @Test
    public void Run(){
        chromeDriver.get("http://localhost/thuvien/library/adminlogin.php");
        sleep(1000);
        WebElement button=chromeDriver.findElement(By.id("userlogin"));
        button.click();
//        sleep(1000000);
//        chromeDriver.get("http://localhost/thuvien/library/signup.php");
        sleep(1000);
        WebElement button1=chromeDriver.findElement(By.id("forgetpassword"));
        button1.click();
        sleep(1000);
        WebElement regemail= chromeDriver.findElement(By.name("email"));
        regemail.sendKeys("a");
        sleep(1000);
        WebElement change=chromeDriver.findElement(By.name("change"));
        change.click();
        sleep(1000);
        regemail.clear();
        regemail.sendKeys("a@");
        sleep(1000);
        change.click();
        sleep(1000);
        regemail.clear();
        regemail.sendKeys(email);
        sleep(1000);
        change.click();
        sleep(1000);
        WebElement regmobile=chromeDriver.findElement(By.name("mobile"));
        regmobile.sendKeys("123455678978");
        sleep(1000);
        change.click();
        regmobile.clear();
        regmobile.sendKeys("12345");
        sleep(1000);
        change.click();
        sleep(1000);
        regmobile.clear();
        regmobile.sendKeys(mobile);
        sleep(1000);
        change.click();
        WebElement newpassword=chromeDriver.findElement(By.name("newpassword"));
        newpassword.sendKeys(password);
        sleep(1000);
        change.click();
        sleep(1000);
        WebElement resetpassword=chromeDriver.findElement(By.name("confirmpassword"));
        resetpassword.sendKeys("1234");
        sleep(1000);
        change.click();
        sleep(1000);
        resetpassword.sendKeys(confirmpassword);
        sleep(1000);
//        WebElement change=chromeDriver.findElement(By.name("change"));
        change.click();
        sleep(1000);

    }
    @AfterMethod
    public void AfterRun(){
        chromeDriver.quit();
    }
    private void sleep(int time){//thực hiện nghỉ 1 khoảng thời gian
        //khi thưc hiện câu lệnh trên và câu lệnh dưới rất nhanh cần nghỉ 1 khoảng thời gian để có thể kịp xem điều gì đã xảy ra
        try{
            Thread.sleep(time);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
