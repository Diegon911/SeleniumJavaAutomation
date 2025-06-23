package pages.Herokuapp;

import pages.BasePage;

public class HeroFloatingPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Floating Menu']";
    private String homeMenu = "//a[normalize-space()='Home']";
    private String newsMenu = "//a[normalize-space()='News']";
    private String contactMenu = "//a[normalize-space()='Contact']";
    private String aboutMenu = "//a[normalize-space()='About']";

    public HeroFloatingPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/floating_menu");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public void scrollDown(){
    scrollDown(0, 300);  
}

    public void homeSelected(){
    clickElement(homeMenu);
}

    public void newsSelected(){
    clickElement(newsMenu);
}

    public void contactSelected(){
    clickElement(contactMenu);
}

    public void aboutSelected(){
    clickElement(aboutMenu);
}

    public String urlValidation(){
    return getURLname();
}


}
