package pages.Herokuapp;

import pages.BasePage;

public class HeroDragAndDropPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Drag and Drop']";
    private String objectA = "//header[normalize-space()='A']";
    private String objectB = "//div[@id='column-b']";

    public HeroDragAndDropPage(){
        super(driver);
    }

    public void navigateToWebpage() {
        navigateTo("https://the-internet.herokuapp.com/drag_and_drop");
    }

    public String titleValidation(){
        return textFromElement(titleLabel);
    }

    public void moveElements(){
        dragAndDropElement(objectA, objectB);
    }
    
}
