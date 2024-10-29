import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class Book {
    String username="admin";
    String password="12345";
    String bookname="Math";
    String category="Tham khảo";
    String author="Nhà xuất bản Kim Đồng";
    String price="12000";
//    String resetcategory="A";
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
        WebElement book= chromeDriver.findElement(By.id("book"));
        book.click();
        sleep(1000);
        WebElement addBookLink = chromeDriver.findElement(By.id("addbook"));
        // Ấn vào liên kết "Add Book"
        addBookLink.click();
        WebElement add=chromeDriver.findElement(By.name("add"));
            case3();
//
//        WebElement editbook= chromeDriver.findElement(By.id("editbook"));
//        editbook.click();
//        WebElement resetCategory= chromeDriver.findElement(By.name("category"));
//        resetCategory.sendKeys(resetcategory);
//        sleep(2000);
//        WebElement update=chromeDriver.findElement(By.name("update"));
//        update.click();
//        sleep(2000);
//        WebElement delete= chromeDriver.findElement(By.name("delete"));
//        delete.click();
//        sleep(2000);
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

        WebElement add=chromeDriver.findElement(By.name("add"));
        WebElement bookName= chromeDriver.findElement(By.name("bookname"));
        sleep(1000);
        bookName.sendKeys(bookname);
        sleep(1000);
        WebElement categorybook=chromeDriver.findElement(By.name("category"));
        categorybook.sendKeys(category);
        sleep(1000);
        WebElement authorbook= chromeDriver.findElement(By.id("authorbook"));
        authorbook.sendKeys(author);
        sleep(1000);
        WebElement pricebook= chromeDriver.findElement(By.name("price"));
        pricebook.sendKeys(price);
        sleep(1000);

    }
    public void case2(){
        WebElement add=chromeDriver.findElement(By.name("add"));
        WebElement bookName= chromeDriver.findElement(By.name("bookname"));
        sleep(1000);
        bookName.sendKeys(" ");
        sleep(1000);
        add.click();
        sleep(1000);
    }
    public void case3(){
        WebElement add=chromeDriver.findElement(By.name("add"));
        WebElement bookName= chromeDriver.findElement(By.name("bookname"));
        bookName.sendKeys(bookname);
        sleep(1000);
        WebElement categorybook=chromeDriver.findElement(By.name("category"));
        categorybook.sendKeys("");
        sleep(1000);
        add.click();
        sleep(1000);
    }
    public void case4(){
        WebElement add=chromeDriver.findElement(By.name("add"));
        WebElement bookName= chromeDriver.findElement(By.name("bookname"));
        bookName.sendKeys(bookname);
        sleep(1000);
        WebElement categorybook=chromeDriver.findElement(By.name("category"));
        categorybook.sendKeys(category);
        sleep(1000);
        WebElement authorbook= chromeDriver.findElement(By.id("authorbook"));
        authorbook.sendKeys("");
        sleep(1000);
        add.click();
        sleep(1000);
    }
    public void case5(){
        WebElement add=chromeDriver.findElement(By.name("add"));
        WebElement bookName= chromeDriver.findElement(By.name("bookname"));
        bookName.sendKeys(bookname);
        sleep(1000);
      WebElement categorybook=chromeDriver.findElement(By.name("category"));
      categorybook.sendKeys(category);
        sleep(1000);
      WebElement authorbook= chromeDriver.findElement(By.id("authorbook"));
      authorbook.sendKeys(author);
        sleep(1000);
      WebElement pricebook= chromeDriver.findElement(By.name("price"));
      pricebook.sendKeys("");
      sleep(1000);
      add.click();
      sleep(1000);
    }

    public void case6(){
        WebElement add=chromeDriver.findElement(By.name("add"));
        WebElement bookName= chromeDriver.findElement(By.name("bookname"));
        bookName.sendKeys(bookname);
        sleep(1000);
        WebElement categorybook=chromeDriver.findElement(By.name("category"));
        categorybook.sendKeys(category);
        sleep(1000);
        WebElement authorbook= chromeDriver.findElement(By.id("authorbook"));
        authorbook.sendKeys(author);
        sleep(1000);
        WebElement pricebook= chromeDriver.findElement(By.name("price"));
        pricebook.sendKeys("aa");
        sleep(1000);
        add.click();
        sleep(1000);
    }




}
