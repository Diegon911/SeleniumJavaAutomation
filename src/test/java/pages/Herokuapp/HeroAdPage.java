package pages.Herokuapp;

import pages.BasePage;

public class HeroAdPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Entry Ad']";
    private String closeAd = "//p[normalize-space()='Close']";
    private String textLabel = "//p[normalize-space()='Displays an ad on page load.']";

    public HeroAdPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/entry_ad");
    try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
}

    public String titleValidation() {
    return textFromElement(titleLabel);
    
}

    public void closeAd() {
    clickElement(closeAd);
}

    public String msgValidaton() {
    return textFromElement(textLabel);
}
    
}
