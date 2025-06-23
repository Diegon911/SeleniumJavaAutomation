package pages.Herokuapp;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class HeroJqueryPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='JQueryUI - Menu']";
    private String enableOpt = "//a[normalize-space()='Enabled']";
    private String downloadOpt = "//a[normalize-space()='Downloads']";
    private String excelOpt = "//a[normalize-space()='Excel']";

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); 

    public HeroJqueryPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/jqueryui/menu");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String menuExcelValidation(){
    return textFromElement(excelOpt);
}

    public void gotoEnabled(){
    OverElement(enableOpt);
            try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    
}

    public void gotoDownload(){
    OverElement(downloadOpt);
            try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
}

    public void gotoExcel(){
    OverElement(excelOpt);
            try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
}
    
}
