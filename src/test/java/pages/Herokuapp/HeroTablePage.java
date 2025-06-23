package pages.Herokuapp;

import pages.BasePage;

public class HeroTablePage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Data Tables']";
    private String sortLastName = "//table[@id='table1']//span[contains(text(),'Last Name')]";
    private String table1 = "/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]";

    public HeroTablePage(){
    super(driver);
}
  
    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/tables");
}

    public String titleValidation(){
    return textFromElement(titleLabel);    
}

    public void sortLastNameColumn(){
    clickElement(sortLastName);
}

    public String orderVerify(){
    return textFromElement(table1);
}





}
