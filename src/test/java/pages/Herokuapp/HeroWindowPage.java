package pages.Herokuapp;

import pages.BasePage;

public class HeroWindowPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Opening a new window']";
    private String openWindow = "//a[normalize-space()='Click Here']";

    public HeroWindowPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/windows");
}    

    public String titleValidation() {
    return textFromElement(titleLabel);
} 

    public void newTab(){
    clickElement(openWindow);
}

    public void closeExtraTabs(){
    closeAdditionTabs();
}

}
