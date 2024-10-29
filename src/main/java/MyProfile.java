import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class MyProfile {
    String username="a@gmail.com";
    String password="12345";

    ChromeDriver chromeDriver;

    @BeforeMethod
    public void setup() {
        // Thiết lập WebDriverManager để sử dụng ChromeDriver
        WebDriverManager.chromedriver().setup();
        // Khởi tạo ChromeDriver
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void run() {

        chromeDriver.get("http://localhost/thuvien/library/adminlogin.php");
        WebElement loginuserButton = chromeDriver.findElement(By.id("userlogin"));
        loginuserButton.click();

        // Đợi cho trang tải sau khi click nút đăng nhập

        chromeDriver.get("http://localhost/thuvien/library/index.php");
        sleep(1000);
        WebElement usernameField5 = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField5=chromeDriver.findElement(By.name("password"));
        WebElement loginButton5 = chromeDriver.findElement(By.name("login"));
        usernameField5.sendKeys(username);
        sleep(100);
        passwordField5.sendKeys(password);
        sleep(1000);
        loginButton5.click();
        sleep(2000);
        WebElement account=chromeDriver.findElement(By.id("ddlmenuItem"));
        account.click();
        sleep(1000);
        WebElement profileclick=chromeDriver.findElement(By.name("myprofile"));
        profileclick.click();
        sleep(1000);

        case4();



    }


    @AfterMethod
    public void AfterMethod() {
        // Đóng ChromeDriver khi kết thúc mỗi phương thức kiểm tra
        chromeDriver.quit();
    }

    // Phương thức sleep để đợi một khoảng thời gian
    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            System.out.print(ex.getMessage());
            Thread.currentThread().interrupt();
        }
    }
    public void case1(){

        WebElement fullname=chromeDriver.findElement(By.name("fullanme"));
        fullname.clear();
        sleep(1000);
        WebElement submit=chromeDriver.findElement(By.name("update"));
        sleep(1000);
        submit.click();
        sleep(1000);
    }
    public void case2(){
        WebElement fullname=chromeDriver.findElement(By.name("fullanme"));
        fullname.clear();
        sleep(1000);
        fullname.sendKeys("hoa");
        WebElement mobilenumber=chromeDriver.findElement(By.name("mobilephone"));
        mobilenumber.clear();
        mobilenumber.sendKeys("0956874825");
        WebElement submit=chromeDriver.findElement(By.name("update"));
        sleep(1000);
        submit.click();
        sleep(1000);
    }
    public void case3(){
        WebElement fullname=chromeDriver.findElement(By.name("fullanme"));
        fullname.clear();
        sleep(1000);
        fullname.sendKeys("hoa");
        WebElement mobilenumber=chromeDriver.findElement(By.name("mobilephone"));
        mobilenumber.clear();
        WebElement submit=chromeDriver.findElement(By.name("update"));
        sleep(1000);
        submit.click();
        sleep(1000);
    }
    public void case4(){
        WebElement fullname=chromeDriver.findElement(By.name("fullanme"));
        fullname.clear();
        sleep(1000);
        fullname.sendKeys("hoa");
        WebElement mobilenumber=chromeDriver.findElement(By.name("mobilephone"));
        mobilenumber.clear();
        mobilenumber.sendKeys("01as23659a7785");
        WebElement submit=chromeDriver.findElement(By.name("update"));
        sleep(1000);
        submit.click();
        sleep(1000);
    }
}

