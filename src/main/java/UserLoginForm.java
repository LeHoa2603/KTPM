import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class UserLoginForm {
    String username="a@gmail.com";
    String password="12345";
    String username1="";
    String password1="";
    String username2="b@gmail.com";
    String password2="123";
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

        case6();


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
        WebElement usernameField = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        WebElement loginButton = chromeDriver.findElement(By.name("login"));
        usernameField.sendKeys(username);
        sleep(1000);
        passwordField.sendKeys(password);
        sleep(1000);
        loginButton.click();
        sleep(2000);
    }
    public void case2() {
        WebElement usernameField = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        WebElement loginButton = chromeDriver.findElement(By.name("login"));
        usernameField.sendKeys(username);
        sleep(1000);
        passwordField.sendKeys(password2);
        sleep(1000);
        loginButton.click();
        sleep(2000);
    }
    public void case3(){
        WebElement usernameField = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        WebElement loginButton = chromeDriver.findElement(By.name("login"));
        usernameField.sendKeys(username);
        sleep(1000);
        passwordField.sendKeys(password1);
        sleep(1000);
        loginButton.click();
        sleep(2000);
        usernameField.clear();
    }
    public void case4(){
        WebElement usernameField = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        WebElement loginButton = chromeDriver.findElement(By.name("login"));

        //case1: ten dang nhap dung, khong mat khau
        usernameField.sendKeys(username1);
        sleep(1000);
        passwordField.sendKeys(password1);
        sleep(1000);
        loginButton.click();
        sleep(2000);
        usernameField.clear();
    }
    public void case5(){
        WebElement usernameField = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        WebElement loginButton = chromeDriver.findElement(By.name("login"));

        //case1: ten dang nhap dung, khong mat khau
        usernameField.sendKeys(username2);
        sleep(1000);
        passwordField.sendKeys(password);
        sleep(1000);
        loginButton.click();
        sleep(2000);
        usernameField.clear();
    }
    public void case6(){
        WebElement usernameField = chromeDriver.findElement(By.name("emailid"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        WebElement loginButton = chromeDriver.findElement(By.name("login"));

        //case1: ten dang nhap dung, khong mat khau
        usernameField.sendKeys(username2);
        sleep(1000);
        passwordField.sendKeys(password1);
        sleep(1000);
        loginButton.click();
        sleep(2000);
        usernameField.clear();
    }
}

