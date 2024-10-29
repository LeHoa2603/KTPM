import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class regstudents {
    String username = "admin";
    String password = "12345";

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
        // Mở trang đăng nhập
        chromeDriver.get("http://localhost/thuvien/library/adminlogin.php");

        // Tìm và click vào nút đăng nhập
        WebElement loginButton = chromeDriver.findElement(By.name("login"));
        loginButton.click();

        // Đợi cho trang tải sau khi click nút đăng nhập
        sleep(1000);

        // Nhập username
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys(username);

        // Click nút đăng nhập sau khi nhập username
        loginButton.click();

        // Đợi cho trang tải sau khi click nút đăng nhập
        sleep(1000);

        // Nhập password
        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys(password);

        // Click nút đăng nhập sau khi nhập password
        loginButton.click();

        // Đợi cho trang tải sau khi click nút đăng nhập
        sleep(2000);

        WebElement regstudents=chromeDriver.findElement(By.id("regstudents"));
        regstudents.click();
        sleep(2000);
        WebElement active=chromeDriver.findElement(By.id("active"));
        active.click();
        sleep(2000);
        WebElement inacitve=chromeDriver.findElement(By.id("inactive"));
        inacitve.click();
        sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
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
}
