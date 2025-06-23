package pages.Herokuapp;

import pages.BasePage;

public class HeroKeyDetectPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Key Presses']";
    private String inputTextBox = "//input[@id='target']";
    private String msgValidation = "//p[@id='result']";

    public HeroKeyDetectPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/key_presses?");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String enterKeyValidation(){
    return textFromElement(msgValidation);
}

    public void enterUp(){
    up(inputTextBox);
}

    public void enterDown(){
    down(inputTextBox);
}

    public void enterLeft(){
    left(inputTextBox);
}

    public void enterRight(){
    right(inputTextBox);
}

    public void enterAlt(){
    alt(inputTextBox);
}

    public void enterControl(){
    control(inputTextBox);
}

    
}
