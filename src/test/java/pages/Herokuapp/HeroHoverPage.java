package pages.Herokuapp;

import pages.BasePage;

public class HeroHoverPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Hovers']";
    private String imageHover1 = "//div[@class='example']//div[1]//img[1]";
    private String imageHover2 = "//div[@class='row']//div[2]//img[1]";
    private String imageHover3 = "//div[3]//img[1]";
    private String nameUser1 = "//h5[normalize-space()='name: user1']";
    private String nameUser2 = "//h5[normalize-space()='name: user2']";
    private String nameUser3 = "//h5[normalize-space()='name: user3']";

    public HeroHoverPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/hovers");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public void hoverElement1(){
    hoverOverElement(imageHover1);
}

    public String user1Validation(){
    return textFromElement(nameUser1);
}

    public void hoverElement2(){
    hoverOverElement(imageHover2);
}

    public String user2Validation(){
    return textFromElement(nameUser2);
}

    public void hoverElement3(){
    hoverOverElement(imageHover3);
}

    public String user3Validation(){
    return textFromElement(nameUser3);
}
    
}
