package pages.Herokuapp;

import pages.BasePage;

public class HeroGeoPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Geolocation']";
    private String whereButton = "//button[@onclick='getLocation()']";
    private String latitudeNumber = "//div[@id='lat-value']";
    private String longitudeNumber = "//div[@id='long-value']";

    public HeroGeoPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/geolocation");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String latitudeValidation(){
    return textFromElement(latitudeNumber);
}

    public String longitudeValidation(){
    return textFromElement(longitudeNumber);
}

    public void whereClic(){
    clickElement(whereButton);
}


    
}
