package pages.Herokuapp;

import pages.BasePage;

public class HeroDownloadPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='File Downloader']";
    private String file1 = "//a[normalize-space()='SampleFile.txt']";
    private String file2 = "//a[normalize-space()='name.txt']";

    public HeroDownloadPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/download");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}
    
    public void downloadFile1(){
        clickElement(file1);
}

    public void downloadFile2(){
        clickElement(file2);
}




    
}
