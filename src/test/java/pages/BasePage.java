package pages;


// Importaciones necesarias
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

     /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases
     */
    protected static WebDriver driver;
    private static Actions action;
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    /* 
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
    */
    static {
        //Esto es para trabajar con Chromedriver y alguna extension, descomentar las lineas y colocar opt dentro de ChromeDriver(opt)
        ChromeOptions opt = new ChromeOptions();
        //opt.addArguments("--ignore-certificate-errors");
        //opt.addArguments("--allow-running-insecure-content");
        opt.addExtensions(new File("./ExtensionDriver/SelectorsHub.crx"));
        WebDriverManager.chromedriver().setup();
         //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver(opt);
        action = new Actions(driver);

    }


 
    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como argumento.
     */
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

 
    //Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }

    //Método estático para cerrar la instancia del driver. 
    public static void closeBrowser() {
        driver.quit();          
    }

    //Método estático para cerrar la pestaña o ventana actual
    public static void closeTab() {
        driver.close();          
    }

    //Abrir una nueva pestaña en el navegador
    public void openNewTab(){
        driver.switchTo().newWindow(WindowType.TAB);
    }

    //Cierra todas las pentañas del navegador a excepcion de la principal
    public void closeAdditionTabs(){
        String mainTab = driver.getWindowHandle();
        Set<String> otherTabs = driver.getWindowHandles();
        for (String handle:otherTabs)
        {
            if(!handle.equals(mainTab)){
                driver.switchTo().window(handle);
                driver.close();
            }
        }
                driver.switchTo().window(mainTab);
    }

    //Metodo para obtener la URL actual del navegador web
    public String getURLname(){
        return driver.getCurrentUrl();
    }

    //Método estático para maximizar la ventana del navegador
    public static void maxWindow() {
        driver.manage().window().maximize();          
    }
 
    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath,
    // esperando a que esté presentente en el DOM
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    private WebElement FindE(String target) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(target)));
    }

    private WebElement FindT(String tag){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(tag)));
    }

     //Click en algun elemento
    public void clickElement(String locator) {
        Find(locator).click();
    }

    //Validar que un webelement esta presente en la pagina
    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

    //Validar que un webelement esta habilitado
    public boolean elementIsEnabled(String locator){
        return Find(locator).isEnabled();
    }

    //Validar que un webelement esta seleccionado (para checkbox o radio buttons)
    public boolean elementIsSelected(String locator){
        return Find(locator).isSelected();
    }

    //Escribir algo en un elemento
    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    //Realiza el envio de la tecla UP
    public void up(String locator){
       Find(locator).sendKeys(Keys.ARROW_UP);
    }

    //Reliza el envio de la tecla DOWN
    public void down(String locator){
       Find(locator).sendKeys(Keys.ARROW_DOWN);
    }

    //Reliza el envio de la tecla RIGHT
    public void right(String locator){
       Find(locator).sendKeys(Keys.ARROW_RIGHT);
    }

    //Reliza el envio de la tecla LEFT
    public void left(String locator){
       Find(locator).sendKeys(Keys.ARROW_LEFT);
    }

    //Reliza el envio de la tecla ALT
    public void alt(String locator){
       Find(locator).sendKeys(Keys.ALT);
    }

    //Reliza el envio de la tecla CONTROL
    public void control(String locator){
       Find(locator).sendKeys(Keys.CONTROL);
    }

    //Cargar un archivo a una pagina web
    public void upload(String locator, String fileU){
         Find(locator).sendKeys(fileU);
    }

    //Limpiar texto de un elemento
    public void clearElement(String locator){
        Find(locator).clear();
    }
 
    //Seleccionar opcion de Dropdown por valor
    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
         dropdown.selectByValue(value);
    }
    
    //Seleccionar opcion de Dropdown por Index
    public void selectFromDropdownByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByIndex(index);
    }

    //Seleccionar opcion de Dropdown por Texto visible
    public void selectFromDropdownByVisible(String locator, String word){
        Select dropdown = new Select(Find(locator));
     
        dropdown.selectByVisibleText(word);
    }
 
    //Regresar el numero de opciones en un Dropdown
    public int dropdownSize(String locator){
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

    //Validar las opciones de un dropdown
    public List<String> getDropdownValues(String locator) {
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
        }
         return values;
    }

    //Validar la opcion seleccionada dentro de un Dropdown
    public String getSelectedOptionDropDown(String locator){
        Select dropdown = new Select(Find(locator));
        return dropdown.getFirstSelectedOption().getText();
    }

    //Validar el texto de algun webelement por Xpath
    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    //Validar el texto de algun webelement por Tag
    public String textFromElementTag(String tag){
        return FindT(tag).getText();
    }

    //Validar el atributo de un webelemet
    public String attributeFromElement(String locator, String attributeName){
        return Find(locator).getDomAttribute(attributeName);
    }

    //Realizar Scroll down en la pagina web
    public void scrollDown(int axisX, int axisY){
        action.scrollByAmount(axisX, axisY).perform();
    }

    //Mover el puntero(Mouse) a algun elemento web
    public void OverElement(String locator){
        action.moveToElement(Find(locator)).build().perform();
    }

    //Pasar el puntero(mouse) por algun elemento web
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator)).build().perform();
    }

    //Realizar clic y sostener
    public void holdClick(){
        action.clickAndHold().release().perform();
    }

    //Mover el puntero a algun lado de la pantalla
    public void moveMouseTo(int aX, int aY){
        action.moveByOffset(aX, aY).build().perform();
    }

    //Arrastrar un elemento web
    public void dragAndDropElement(String locator, String target){
        action.dragAndDrop(Find(locator), FindE(target)).build().perform();
    }

    //Utilizar barra deslizante en el navegador(Slider)
    public void dragAndDropBar(String locator, int movX, int movY){
        action.dragAndDropBy(Find(locator), movX, movY).build().perform();
    }    

    //Doble clic en algun elemento web
    public void doubleClick(String locator){
        action.doubleClick(Find(locator)).build().perform();
    }

    //Clic derecho en algun elemento web
    public void rightClick(String locator){
        action.contextClick(Find(locator)).build().perform();
    }

    //Clic y sostener en algun elemento web
    public void ClickAndHold(String locator){
        action.clickAndHold(Find(locator)).release().perform();
    }

    //Devuelve el valor de una celda de una tabla estatica
    public String getValueFromTable(String locator, int row, int column){
        String SelectedCell = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return Find(SelectedCell).getText();
    }

    //Ingresa un valor en una celda de una tabla estatica
    public void setValueOnTable(String locator, int row, int column, String textToSend){
        String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        Find(cellToFill).sendKeys(textToSend);
    }

    //Moverte a otra pantalla por Index
    public void switchToFrameIn(int iFrameIndex){
        driver.switchTo().frame(iFrameIndex);
    }

    //Moverte a otra pantalla por xpath
    public void switchToFrameLoc(String locator){
        driver.switchTo().frame(Find(locator));
    }

    //Moverte a otra pantalla por xpath
    public void switchToFrameIDorName(String NameOrID){
        driver.switchTo().frame(NameOrID);
    }

    //Moverte al frame padre
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    //Moverte al frame principal
    public void switchToDefualtFrame(){
        driver.switchTo().defaultContent();
    }

    //Aceptar mensaje de alerta
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    //Rechazar mensaje de alerta
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    //Escribir algo en mensaje de Alerta
    public void writeAlert(String textToAlert){
        driver.switchTo().alert().sendKeys(textToAlert);
    }



}


 
    