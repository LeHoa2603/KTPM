import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class changepasswords {
    String username = "admin";
    String password = "12345";
    String newpass="1234";

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
        WebElement click=chromeDriver.findElement(By.id("changepassword"));
        click.click();
        sleep(1000);


        WebElement regstudents=chromeDriver.findElement(By.id("changepassword"));
        regstudents.click();
        sleep(2000);


        case7();
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
    public void case1(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.name("change"));
        //changepassword.click();
        sleep(1000);
        currentpassword.sendKeys(password);
        sleep(2000);
        newpassword.sendKeys(newpass);
        sleep(1000);
        confirmpassword.sendKeys(newpass);
        sleep(3000);
        changepassword.click();
        sleep(1000);
    }
    public void case2(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.name("change"));
        sleep(1000);
        currentpassword.sendKeys(" ");
        sleep(2000);
        newpassword.sendKeys("");
        sleep(1000);
        confirmpassword.sendKeys("");
        sleep(3000);
        changepassword.click();
        sleep(1000);
    } public void case3(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.name("change"));
        //changepassword.click();
        sleep(1000);
        currentpassword.sendKeys("123");
        sleep(2000);
        newpassword.sendKeys(newpass);
        sleep(1000);
        confirmpassword.sendKeys(newpass);
        sleep(3000);
        changepassword.click();
        sleep(1000);
    }
    public void case4(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.name("change"));
        //changepassword.click();
        sleep(1000);
        currentpassword.sendKeys(password);
        sleep(2000);
        newpassword.sendKeys(newpass);
        sleep(1000);
        confirmpassword.sendKeys("12345");
        sleep(3000);
        changepassword.click();
        sleep(1000);
    }
    public void case5(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.id("change"));
        //changepassword.click();
        sleep(1000);
        currentpassword.sendKeys("");
        sleep(2000);
        newpassword.sendKeys(newpass);
        sleep(1000);
        confirmpassword.sendKeys(newpass);
        sleep(3000);
        changepassword.click();
        sleep(1000);
    }
    public void case6(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.id("change"));
        //changepassword.click();
        sleep(1000);
        currentpassword.sendKeys(password);
        sleep(2000);
        newpassword.sendKeys("");
        sleep(1000);
        confirmpassword.sendKeys(newpass);
        sleep(3000);
        changepassword.click();
        sleep(1000);
    }
    public void case7(){
        WebElement confirmpassword=chromeDriver.findElement(By.name("confirmpassword"));
        WebElement newpassword= chromeDriver.findElement(By.name("newpassword"));
        WebElement currentpassword=chromeDriver.findElement(By.name("password"));
        WebElement changepassword=chromeDriver.findElement(By.id("change"));
        //changepassword.click();
        sleep(1000);
        currentpassword.sendKeys(password);
        sleep(2000);
        newpassword.sendKeys(newpass);
        sleep(1000);
        confirmpassword.sendKeys("");
        sleep(3000);
        changepassword.click();
        sleep(1000);
    }

}
