package pages.Herokuapp;

import pages.BasePage;

public class HeroSliderPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Horizontal Slider']";
    private String sliderControl = "//input[@value='0']";
    private String sliderValue = "//span[@id='range']";
    
    public HeroSliderPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/horizontal_slider");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String sliderValue(){
    return textFromElement(sliderValue);
}

    public void moveSliderOne(){
    dragAndDropBar(sliderControl, 1, 0);
}

    public void moveSliderTwo(){
    dragAndDropBar(sliderControl, 10, 0);
}

    public void moveSliderThree(){
    dragAndDropBar(sliderControl, 20, 0);
}

    public void moveSliderFour(){
    dragAndDropBar(sliderControl, 30, 0);
}

    public void moveSliderFive(){
    dragAndDropBar(sliderControl, 40, 0);
}

    public void moveSliderSix(){
    dragAndDropBar(sliderControl, 50, 0);
}

    public void moveSliderSeven(){
    dragAndDropBar(sliderControl, 60, 0);
}

    
}
