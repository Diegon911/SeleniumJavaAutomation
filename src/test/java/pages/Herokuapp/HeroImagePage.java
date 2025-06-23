package pages.Herokuapp;

import pages.BasePage;
public class HeroImagePage extends BasePage {

        private String img1 = "//img[@src='asdf.jpg']";
        private String img2 = "//img[@src='hjkl.jpg']";
        private String img3 = "//img[@src='img/avatar-blank.jpg']";
        private String validationImg1 = "//h1[normalize-space()='Not Found']";
        private String validationImg2 = "//h1[normalize-space()='Not Found']";
        private String validationImg3 = "//img[@src='https://the-internet.herokuapp.com/img/avatar-blank.jpg']";


        public HeroImagePage(){
        super(driver);
    }

        public void navigateToWebpage() {
        navigateTo("https://the-internet.herokuapp.com/broken_images");
    }

        public String getSrcImg1(){
            return attributeFromElement(img1, "src");
    }

        public String getSrcImg2(){
            return attributeFromElement(img2, "src");
    }

        public String getSrcImg3(){
            return attributeFromElement(img3, "src");
    }

        public void validateImg1() {
        navigateTo("https://the-internet.herokuapp.com/asdf.jpg");
    }

        public String image1Validation(){
           return textFromElement(validationImg1);
    }

        public void validateImg2() {
        navigateTo("https://the-internet.herokuapp.com/hjkl.jpg");
    }

        public String image2Validation(){
           return textFromElement(validationImg2);
    }

        public void validateImg3() {
        navigateTo("https://the-internet.herokuapp.com/img/avatar-blank.jpg");
    }

        public Boolean image3Validation(){
           return elementIsDisplayed(validationImg3);
    }    
    
    
}
