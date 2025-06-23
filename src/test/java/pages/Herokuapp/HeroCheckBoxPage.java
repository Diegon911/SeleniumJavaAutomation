package pages.Herokuapp;

import pages.BasePage;

public class HeroCheckBoxPage extends BasePage {

        private String checkBox1 = "//input[1]";
        private String checkBox2 = "//input[2]";

        public HeroCheckBoxPage(){
        super(driver);
    }

        public void navigateToWebpage() {
            navigateTo("https://the-internet.herokuapp.com/checkboxes");
    }

        public void actionChechbox1(){
            clickElement(checkBox1);
    }

        public void actionChechbox2(){
            clickElement(checkBox2);
    }

        public Boolean verifyChechbox1(){
            return elementIsSelected(checkBox1);
    }

        public Boolean verifyChechbox2(){
            return elementIsSelected(checkBox2);
    }




    

}
