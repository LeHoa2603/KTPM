import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class AdminLogin {
    String username="admin";
    String password="12345";
    String username1="";
    String password1="";
    String username2="user";
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

       case2();
//       case3();
//       case4();
//       case5();
//       case6();
//        case1();

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
        WebElement loginButton = chromeDriver.findElement(By.name("login"));
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        usernameField.sendKeys(username);
        sleep(1000);
        passwordField.sendKeys(password);
        sleep(1000);
        loginButton.click();
        sleep(2000);

    }
    public void case2(){
        WebElement loginButton = chromeDriver.findElement(By.name("login"));
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        WebElement passwordField=chromeDriver.findElement(By.name("password"));
        usernameField.sendKeys(username);
        sleep(1000);
        passwordField.sendKeys(password2);
        sleep(1000);
        loginButton.click();
        sleep(2000);

    }
//    public void case3(){
//        WebElement loginButton = chromeDriver.findElement(By.name("login"));
//        WebElement usernameField = chromeDriver.findElement(By.name("username"));
//        WebElement passwordField=chromeDriver.findElement(By.name("password"));
//        usernameField.sendKeys(username);
//        sleep(1000);
//        passwordField.sendKeys(password1);
//        sleep(1000);
//        loginButton.click();
//        sleep(2000);
//
//    }
//    public void case4(){
//        WebElement loginButton = chromeDriver.findElement(By.name("login"));
//        WebElement usernameField = chromeDriver.findElement(By.name("username"));
//        WebElement passwordField=chromeDriver.findElement(By.name("password"));
//        usernameField.sendKeys(username1);
//        sleep(1000);
//        passwordField.sendKeys(password1);
//        sleep(1000);
//        loginButton.click();
//        sleep(2000);
//
//    }
//    public void case5(){
//        WebElement loginButton = chromeDriver.findElement(By.name("login"));
//        WebElement usernameField = chromeDriver.findElement(By.name("username"));
//        WebElement passwordField=chromeDriver.findElement(By.name("password"));
//        usernameField.sendKeys(username2);
//        sleep(1000);
//        passwordField.sendKeys(password);
//        sleep(1000);
//        loginButton.click();
//        sleep(2000);
//
//    }
//    public void case6(){
//        WebElement loginButton = chromeDriver.findElement(By.name("login"));
//        WebElement usernameField = chromeDriver.findElement(By.name("username"));
//        WebElement passwordField=chromeDriver.findElement(By.name("password"));
//        usernameField.sendKeys(username2);
//        sleep(1000);
//        passwordField.sendKeys(password1);
//        sleep(1000);
//        loginButton.click();
//        sleep(2000);
//
//    }
}
