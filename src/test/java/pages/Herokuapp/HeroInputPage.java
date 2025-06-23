package pages.Herokuapp;

import pages.BasePage;

public class HeroInputPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Inputs']";
    private String inputTextbox = "//input[@type='number']";
    

    public HeroInputPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/inputs");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public void clicInput(){
    clickElement(inputTextbox);
}
    
    public void addNumbers(){
    up(inputTextbox);
    }

    public void sustractNumbers(){
    down(inputTextbox);
    }

    public String valueTextbox(){    
    return textFromElement(inputTextbox);
}

    public String valueAttribute(){
    return attributeFromElement(inputTextbox, "type");
}
    
}
