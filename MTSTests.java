package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTSTests {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.mts.by/");
        WebElement acceptCookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree")));
        if (acceptCookieButton != null && acceptCookieButton.isDisplayed()) {
            acceptCookieButton.click();
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("BlockHeading is visible")
    public void checkBlockHeadingIsVisible() {
        WebElement paymentSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='pay']//h2")));
        String title = paymentSection.getText();
        System.out.println(title);
    }

    @Test
    @DisplayName("BlockHeading is present")
    public void checkBlockHeadingIsPresent() {
        WebElement paymentSection = driver.findElement(By.xpath("//section[@class='pay']//h2"));
        String title = paymentSection.getText();
        System.out.println(title);
    }

    @Test
    @DisplayName("Payment logos are displayed")
    public void checkPaymentLogosAreDisplayed() {
        WebElement logos = driver.findElement(By.xpath("//div[@class='pay__partners']//ul"));

        String[] expectedLogos = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"};
        for (String text : expectedLogos) {
            WebElement logo = logos.findElement(By.xpath(".//img[@alt='" + text + "']"));
            assertTrue(logo.isDisplayed(), text + " logo is not displayed");
        }
    }

    @Test
    @DisplayName("Service details link works correctly")
    public void checkServiceDetailsLink() {
                WebElement serviceDetailsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Подробнее о сервисе")));
                String currentUrl = driver.getCurrentUrl();
                serviceDetailsLink.click();
                wait.until(ExpectedConditions.urlToBe("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")); // Замените на актуальный URL для "Подробнее о сервисе"
                String newUrl = driver.getCurrentUrl();
        assertTrue(!currentUrl.equals(newUrl), "URL has not changed after clicking the service details link");
    }
}
