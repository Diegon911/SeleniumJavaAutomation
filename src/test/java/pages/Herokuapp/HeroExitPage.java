package pages.Herokuapp;

import pages.BasePage;

public class HeroExitPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Exit Intent']";
    private String closeModal = "//p[normalize-space()='Close']";

    public HeroExitPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/exit_intent");
}

    public String titleValidation(){
    return textFromElement(titleLabel); 
}

    public void moveMouse(){
    moveMouseTo(0, 0);
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeModal(){
    clickElement(closeModal);
    }

}
