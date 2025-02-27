package Lesson_15;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MtsPage {
    public WebDriver driver;

    public MtsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "section.pay h2")
    private WebElement paySectionTitle;

    @FindBy(css = "div.cookie.show button.cookie__cancel")
    private WebElement cookieCancelBtn;

    @FindBy(xpath = "//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]")
    private WebElement link;

    @FindBy(css = "#connection-phone")
    private WebElement phoneField;

    @FindBy(css = "#connection-sum")
    private WebElement sumField;

    @FindBy(css = "section.pay button[type='submit']")
    private WebElement payBtn;

    @FindBy(css = "iframe.bepaid-iframe")
    private WebElement payFrame;

    @FindBy(xpath = "//section[@class='pay']//img")
    private List<WebElement> payImgages;

    public String getPaySectionTitle() {
        return paySectionTitle.getText().replaceAll("\n|\r\n", " ");
    }

    public void clickCookieCancelBtn() {
        cookieCancelBtn.click();
    }

    public String getLinkUrl() throws NoSuchElementException {
        return link.getAttribute("href");
    }

    public int getRespCode(String urlLink) throws MalformedURLException, IOException {
        URL url = new URL(urlLink);
        HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        return httpURLConnect.getResponseCode();
    }

    public void setPhoneField(String phoneNumber) throws NoSuchElementException {
        phoneField.sendKeys(phoneNumber);
    }

    public void setSumField(String sum) throws NoSuchElementException {
        sumField.sendKeys(sum);
    }

    public void clickPayBtn() throws NoSuchElementException {
        payBtn.click();
    }

    public String getFrameLink() throws NoSuchElementException {
        return payFrame.getAttribute("src");
    }

    public boolean isDisplayedImg(String scr) {
        for (WebElement payImage : payImgages) {
            if (payImage.getAttribute("src").contains(scr)) {
                return payImage.isDisplayed();
            }
        }
        return false;
    }
}
