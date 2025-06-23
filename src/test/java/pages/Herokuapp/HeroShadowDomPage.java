package pages.Herokuapp;

import pages.BasePage;

public class HeroShadowDomPage extends BasePage {

    private String titleLabel = "//h1[normalize-space()='Simple template']";
    private String shadowText = "//span[@slot='my-text']";
    private String shadowText2 = "//li[1]";
    private String shadowText3 = "//li[normalize-space()='In a list!']";

    public HeroShadowDomPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/shadowdom");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String shadowText1Validation(){
    return textFromElement(shadowText);
}

    public String shadowText2Validation(){
    return textFromElement(shadowText2);
}

    public String shadowText3Validation(){
    return textFromElement(shadowText3);
}
    
}
