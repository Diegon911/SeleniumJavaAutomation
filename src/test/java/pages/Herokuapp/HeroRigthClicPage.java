package pages.Herokuapp;

import pages.BasePage;

public class HeroRigthClicPage extends BasePage {

    private String titleValidation = "//h3[normalize-space()='Context Menu']";
    private String rightClicArea = "//div[@id='hot-spot']";

    public HeroRigthClicPage(){
    super(driver);
}

    public void iNavigateToWeb(){
        navigateTo("https://the-internet.herokuapp.com/context_menu");
}

    public String validationText(){
        return textFromElement(titleValidation);
    }

    public void actionClic(){
        rightClick(rightClicArea);
    }

    public void closAlert(){
        acceptAlert();
    }
    

}
