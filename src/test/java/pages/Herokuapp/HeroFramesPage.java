package pages.Herokuapp;

import pages.BasePage;

public class HeroFramesPage extends BasePage {

    public HeroFramesPage(){
        super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/nested_frames");
}

    public void frameBottom(){
    switchToFrameIDorName("frame-bottom");
}

    public void frameTop(){
    switchToFrameIDorName("frame-top");
}

    public void frameLeft(){
    switchToFrameIDorName("frame-left");
}

    public void frameMiddle(){
    switchToFrameIDorName("frame-middle");
}

    public void frameRight(){
    switchToFrameIDorName("frame-right");
}

    public String bottomText(){
    return textFromElementTag("body");
}

    public String leftText(){
    return textFromElementTag("body");
}

    public String middleText(){
    return textFromElementTag("body");
}

    public String rightText(){
    return textFromElementTag("body");
}

    public void returnFrame(){
    switchToParentFrame();
}

    public void returnDefaultFrame(){
    switchToDefualtFrame();
}



  
}
