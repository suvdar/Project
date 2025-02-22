package Lesson_16;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsByTest1 {
    public static WebDriver driver;
    public static MtsHomePage mtsHomePage;
    public static String PAGE_URL = "https://mts.by";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieCancelBtn();
    }

    @AfterAll
    static void after() {
        driver.quit();
    }

    @ParameterizedTest
    @CsvSource({
            "connection-phone, Номер телефона",
            "connection-sum, Сумма",
            "connection-email, E-mail для отправки чека",
            "internet-phone, Номер абонента",
            "internet-sum, Сумма",
            "internet-email, E-mail для отправки чека",
            "score-instalment, Номер счета на 44",
            "instalment-sum, Сумма",
            "instalment-email, E-mail для отправки чека",
            "score-arrears, Номер счета на 2073",
            "arrears-sum, Сумма",
            "arrears-email, E-mail для отправки чека"
    })
    public void checkPlaceholders(String id, String expectedPlaceholder) {
        try {
            String actualPlaceholder = "";
            switch (id) {
                case  ("connection-phone"):
                    actualPlaceholder = mtsHomePage.getConnectionPhonePlaceholder();
                    break;
                case ("connection-sum"):
                    actualPlaceholder = mtsHomePage.getConnectionSumPlaceholder();
                    break;
                case ("connection-email"):
                    actualPlaceholder = mtsHomePage.getConnectionEmailPlaceholder();
                    break;
                case  ("internet-phone"):
                    actualPlaceholder = mtsHomePage.getInternetPhonePlaceholder();
                    break;
                case ("internet-sum"):
                    actualPlaceholder = mtsHomePage.getInternetSumPlaceholder();
                    break;
                case ("internet-email"):
                    actualPlaceholder = mtsHomePage.getInternetEmailPlaceholder();
                    break;
                case  ("score-instalment"):
                    actualPlaceholder = mtsHomePage.getInstalmentScorePlaceholder();
                    break;
                case ("instalment-sum"):
                    actualPlaceholder = mtsHomePage.getInstalmentSumPlaceholder();
                    break;
                case ("instalment-email"):
                    actualPlaceholder = mtsHomePage.getInstalmentEmailPlaceholder();
                    break;
                case  ("score-arrears"):
                    actualPlaceholder = mtsHomePage.getArrearsScorePlaceholder();
                    break;
                case ("arrears-sum"):
                    actualPlaceholder = mtsHomePage.getArrearsSumPlaceholder();
                    break;
                case ("arrears-email"):
                    actualPlaceholder = mtsHomePage.getArrearsEmailPlaceholder();
                    break;
            }
            assertEquals(actualPlaceholder, expectedPlaceholder, id + " плейсхолдер не соответствует");
            System.out.println(id + " плейсхолдер соответствует");
        } catch (NoSuchElementException e) {
            assertTrue(false, id + " плейсхолдер не найден");
        }
    }
}
