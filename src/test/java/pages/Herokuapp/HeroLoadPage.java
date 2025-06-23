package pages.Herokuapp;

import pages.BasePage;

public class HeroLoadPage extends BasePage {

    private String titleValidation = "//h3[normalize-space()='Dynamically Loaded Page Elements']";
    private String loadButton = "//button[normalize-space()='Start']";
    private String labelValidation = "//h4[normalize-space()='Hello World!']";

    public HeroLoadPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/dynamic_loading/2");
}

    public String titleValidation(){
    return textFromElement(titleValidation);
}

    public void actionLoad(){
    clickElement(loadButton);
            try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
}

    public String msgValidatoin(){
    return textFromElement(labelValidation);
}
    
}
