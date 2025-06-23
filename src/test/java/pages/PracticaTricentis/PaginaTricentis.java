package pages.PracticaTricentis;

import pages.BasePage;

public class PaginaTricentis extends BasePage {

    private String registerOption = "//a[@class='ico-register']";
    private String menuBar = "//ul[@class='top-menu']//a[normalize-space()='%s']";
    private String computerOptionBar = "//ul[@class='top-menu']//a[normalize-space()='Computers']";
    private String electronicsOptionBar = "//ul[@class='top-menu']//a[normalize-space()='Electronics']";
    private String topMenuBar = "//ul[@class='top-menu']";
    private String desktopsOption = "//ul[@class='top-menu']//a[normalize-space()='Desktops']";
    private String notebooksOption = "//ul[@class='top-menu']//a[normalize-space()='Notebooks']";
    private String accessoriesOption = "//ul[@class='top-menu']//a[normalize-space()='Accessories']";
    private String cameraPhotoOption = "//ul[@class='top-menu']//a[normalize-space()='Camera, photo']";
    private String cellPhonesOption = "//ul[@class='top-menu']//a[normalize-space()='Cell phones']";
    
    public PaginaTricentis() {
        super(driver);
    }

    public void navigateToWebpage() {
        navigateTo("https://demowebshop.tricentis.com/");
    }

    public void selectRegister(){
        clickElement(registerOption);
    }

    public void clicOnMenuBar(String section){
        String xpathSection = String.format(menuBar, section);
        clickElement(xpathSection);
    }

    public boolean trueMenuBar(){
        return elementIsDisplayed(topMenuBar);
    }

    public boolean trueDesktopOption(){
        return elementIsDisplayed(desktopsOption);
    }

    public boolean trueNooteBookOption(){
        return elementIsDisplayed(notebooksOption);
    }

    public boolean trueAccessoriesOption(){
        return elementIsDisplayed(accessoriesOption);
    }

    public boolean trueCameraOption(){
        return elementIsDisplayed(cameraPhotoOption);
    }

    public boolean trueCellOption(){
        return elementIsDisplayed(cellPhonesOption);
    }

    public void overComputerMenuBar(){
        hoverOverElement(computerOptionBar);
    }

    public void overelectonicsMenuBar(){
        hoverOverElement(electronicsOptionBar);
    }

}
