import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserSignUp {
    String fullname="hoang";
    String email="hoang@gmail.com";
    String password="1234";
    String confirm=password;

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
        WebElement button=chromeDriver.findElement(By.id("usersignup"));
        button.click();
//        sleep(1000000);
        chromeDriver.get("http://localhost/thuvien/library/signup.php");
        sleep(1000);



            // Load your page or navigate to the URL

            // Find and click the button with id "submit"
            WebElement button1 = chromeDriver.findElement(By.id("submit"));
            button1.click();
            sleep(1000);

            // Find and fill the input fields

            case8();




    }
    @AfterMethod
    public void AfterRun(){
        chromeDriver.quit();
    }
    private void sleep(int time){

        try{
            Thread.sleep(time);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
    public void case1(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953");//nhập 9 số
        sleep(1000);
        text2.sendKeys("hoang@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys(confirm);
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case2(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("");
        sleep(1000);
        mobiletext.sendKeys("");//nhập 9 số
        sleep(1000);
        text2.sendKeys("");
        sleep(1000);
        text3.sendKeys("");
        sleep(1000);
        text4.sendKeys("");
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case3(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("hoang@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys(confirm);
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case4(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("th@gmail");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys(confirm);
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case5(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("thao@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys("123");
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case6(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("thao@gmail.com");
        sleep(1000);
        text3.sendKeys("");
        sleep(1000);
        text4.sendKeys("");
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case7(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("thao@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys(confirm);
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case8(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("");//nhập 9 số
        sleep(1000);
        text2.sendKeys("thao@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys(confirm);
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case9(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("a@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys(confirm);
        sleep(1000);
        button1.click();
        sleep(1000);
    }
    public void case10(){
        WebElement text4 = chromeDriver.findElement(By.name("confirmpassword"));
        WebElement text3 = chromeDriver.findElement(By.name("password"));
        WebElement text2 = chromeDriver.findElement(By.name("email"));
        WebElement mobiletext=chromeDriver.findElement(By.name("mobilephone"));
        WebElement button1 = chromeDriver.findElement(By.id("submit"));
        WebElement text1 = chromeDriver.findElement(By.name("fullanme"));
        text1.sendKeys("hoang");
        sleep(1000);
        mobiletext.sendKeys("0869786953523");//nhập 9 số
        sleep(1000);
        text2.sendKeys("hoang@gmail.com");
        sleep(1000);
        text3.sendKeys(password);
        sleep(1000);
        text4.sendKeys("");
        sleep(1000);
        button1.click();
        sleep(1000);
    }
}
