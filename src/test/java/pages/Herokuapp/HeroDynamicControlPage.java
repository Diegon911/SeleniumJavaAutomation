package pages.Herokuapp;

import pages.BasePage;

public class HeroDynamicControlPage extends BasePage {

        private String titleLabel = "//h4[normalize-space()='Dynamic Controls']";
        private String checkBox = "//input[@type='checkbox']";
        private String removeButton = "//button[normalize-space()='Remove']";
        private String enableButton = "//button[normalize-space()='Enable']";
        private String addButton = "//button[normalize-space()='Add']";
        private String disableButton = "//button[normalize-space()='Disable']";
        private String dynamicLabel = "//p[@id='message']";
        
        public HeroDynamicControlPage(){
        super(driver);
    }

        public void navigateToWebpage() {
        navigateTo("https://the-internet.herokuapp.com/dynamic_controls");
    }

        public String titleValidation(){
        return textFromElement(titleLabel);
    }

        public void actionCheckBox(){
        clickElement(checkBox);
    }

        public void actionRemoveButton(){
        clickElement(removeButton);
    }
    
        public void actionEnableButton(){
        clickElement(enableButton);
    } 

        public void actionAddButton(){
        clickElement(addButton);
    } 

        public void actionDisableButton(){
        clickElement(disableButton);
    } 

        public String dynamiclabelValidation(){
        return textFromElement(dynamicLabel);
    }
    
}
