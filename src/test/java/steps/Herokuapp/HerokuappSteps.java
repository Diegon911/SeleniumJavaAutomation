package steps.Herokuapp;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.*;
import pages.Herokuapp.HeroAdPage;
import pages.Herokuapp.HeroAddRemovePage;
import pages.Herokuapp.HeroAlertsPage;
import pages.Herokuapp.HeroCheckBoxPage;
import pages.Herokuapp.HeroDownloadPage;
import pages.Herokuapp.HeroDragAndDropPage;
import pages.Herokuapp.HeroDropDownPage;
import pages.Herokuapp.HeroDynamicControlPage;
import pages.Herokuapp.HeroExitPage;
import pages.Herokuapp.HeroFloatingPage;
import pages.Herokuapp.HeroForgotPage;
import pages.Herokuapp.HeroFramesPage;
import pages.Herokuapp.HeroGeoPage;
import pages.Herokuapp.HeroHoverPage;
import pages.Herokuapp.HeroImagePage;
import pages.Herokuapp.HeroInputPage;
import pages.Herokuapp.HeroJqueryPage;
import pages.Herokuapp.HeroKeyDetectPage;
import pages.Herokuapp.HeroLoadPage;
import pages.Herokuapp.HeroLoginFakePage;
import pages.Herokuapp.HeroNotificationPage;
import pages.Herokuapp.HeroRigthClicPage;
import pages.Herokuapp.HeroShadowDomPage;
import pages.Herokuapp.HeroSliderPage;
import pages.Herokuapp.HeroTablePage;
import pages.Herokuapp.HeroTextValidationPage;
import pages.Herokuapp.HeroUploadPage;
import pages.Herokuapp.HeroWindowPage;

public class HerokuappSteps {

    SoftAssert soft = new SoftAssert();
    HeroTextValidationPage heroKuappText = new HeroTextValidationPage();
    HeroAddRemovePage heroKuappAddRemove = new HeroAddRemovePage();
    HeroImagePage heroKuappImage = new HeroImagePage();
    HeroCheckBoxPage heroKuappCheck = new HeroCheckBoxPage(); 
    HeroRigthClicPage heroKuappRightClic = new HeroRigthClicPage();
    HeroDragAndDropPage heroKuappDragDrop = new HeroDragAndDropPage();
    HeroDropDownPage heroKuappDropDown = new HeroDropDownPage();
    HeroDynamicControlPage heroKuappDynamic = new HeroDynamicControlPage();
    HeroLoadPage heroKuappLoad = new HeroLoadPage();
    HeroAdPage heroKuappAd = new HeroAdPage();
    HeroExitPage heroKuappExit = new HeroExitPage();
    HeroDownloadPage heroKuappDownload = new HeroDownloadPage();
    HeroUploadPage heroKuappUpload = new HeroUploadPage();
    HeroFloatingPage heroKuappFloating = new HeroFloatingPage();
    HeroForgotPage heroKuappForgot = new HeroForgotPage();
    HeroLoginFakePage heroKuappLogin = new HeroLoginFakePage();
    HeroFramesPage heroKuappFrames = new HeroFramesPage();
    HeroGeoPage heroKuappGeo = new HeroGeoPage();
    HeroSliderPage heroKuappSlider = new HeroSliderPage();
    HeroHoverPage heroKuappHover = new HeroHoverPage();
    HeroInputPage heroKuappInput = new HeroInputPage(); 
    HeroJqueryPage heroKuappJquery = new HeroJqueryPage();
    HeroAlertsPage heroKuappAlert = new HeroAlertsPage();
    HeroKeyDetectPage heroKuappKey = new HeroKeyDetectPage();
    HeroWindowPage heroKuappWindow = new HeroWindowPage();
    HeroNotificationPage heroKuappNoti = new HeroNotificationPage();
    HeroShadowDomPage heroKuappShadow = new HeroShadowDomPage();
    HeroTablePage heroKuappTable = new HeroTablePage();

    //Steps de TextValidationPage
    @Given("^El usuario ingresa a la pagina Herokuapp ABtest$")
    public void iNavigateToWeb() {
        heroKuappText.navigateToWebpage();
    }

    @Then("^El usuario valida el texto en pantalla$")
    public void textValidation() {
        Assert.assertEquals("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).", heroKuappText.msgValidation());
    }

    //Steps de AddRemovePage
    @Given("^El usuario ingresa a la pagina Herokuapp AddRemove$")
    public void iNavigateToWebAdd() {
        heroKuappAddRemove.navigateToWebpage();
        soft.assertEquals("Add/Remove Elements", heroKuappAddRemove.titleValidationAddRemove());
        soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario da clic en el boton Add Element$")
    public void addElementAction(){
        heroKuappAddRemove.addAction();
    }

    @Then("^El usuario valida la aparicion de un nuevo boton$")
    public void enableButtonValidation(){
        Assert.assertTrue(heroKuappAddRemove.deleteButtonPresent(), "El boton no esta presente");
    }

    @When("^El usuario da clic en el elemento nuevo Delete$")
    public void deleteElementAction(){
        heroKuappAddRemove.deleteAction();
    }

    @Then("^El usuario valida que el elemento delete desaparece$")
    public void disableButtonValidation(){
        Assert.assertTrue(heroKuappAddRemove.addButtonPresent(), "El boton esta presente");
    }

    //Steps de ImagePage
    @Given("^El usuario ingresa a la pagina Herokuapp image$")
    public void iNavigateToWebImg(){
        heroKuappImage.navigateToWebpage();
    }

    @When("^El usuario valida el estatus de las imagenes$")
    public void imgScrValidation(){
        soft.assertEquals("asdf.jpg", heroKuappImage.getSrcImg1());
        soft.assertEquals("hjkl.jpg", heroKuappImage.getSrcImg2());
        soft.assertEquals("img/avatar-blank.jpg", heroKuappImage.getSrcImg3());
        soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario debe ver 1 imagen correcta y 2 imagenes rotas$")
    public void imgValidation(){
        heroKuappImage.validateImg1();
        Assert.assertEquals("Not Found", heroKuappImage.image1Validation());
        heroKuappImage.validateImg2();
        Assert.assertEquals("Not Found", heroKuappImage.image2Validation());
        heroKuappImage.validateImg3();
        Assert.assertTrue(heroKuappImage.image3Validation(), "La imagen no esta presente");

    }

    //Steps de CheckBoxesPage
    @Given("^El usuario ingresa a la pagina Herokuapp checkbox y valida su estatus actual$")
    public void iNavigateToWebCheck(){
        heroKuappCheck.navigateToWebpage();
        soft.assertFalse(heroKuappCheck.verifyChechbox1(), "El checkbox esta seleccionado");
        soft.assertTrue(heroKuappCheck.verifyChechbox2(), "El checkbox no esta seleccionado");
        soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario marca y desmarca las checkboxes$")
    public void actionCheckBox(){
       heroKuappCheck.actionChechbox1();
       heroKuappCheck.actionChechbox2();
       heroKuappCheck.actionChechbox1();
    }

    @Then("^El usuario debe validar el estatus de las checkboxes y ambas deben estar deseleccionadas$")
    public void verifyCheckbox(){
        Assert.assertFalse(heroKuappCheck.verifyChechbox1(), "El checkbox esta seleccionado");
        Assert.assertFalse(heroKuappCheck.verifyChechbox2(), "El checkbox esta seleccionado");
    }

    //Steps de RightClicPage
    @Given("^El usuario ingresa a la pagina Herokuapp contextmenu$")
    public void iNavigateToWebContext(){
        heroKuappRightClic.iNavigateToWeb();
        soft.assertEquals("Context Menu", heroKuappRightClic.validationText());
        soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario realiza un clic derecho sobre el area marcada$")
    public void actionRightClic(){
       heroKuappRightClic.actionClic();
       heroKuappRightClic.closAlert();
    }

    @Then("^El usuario debe cerrar la alerta y validar que regrese a la pantalla anterior$")
    public void dissmisAlert(){
        Assert.assertEquals("Context Menu", heroKuappRightClic.validationText());
    }

    //Steps de DragAndDropPage
    @Given("^El usuario ingresa a la pagina Herokuapp Drag and Drop$")
    public void iNavigateToWebDragDrop(){
        heroKuappDragDrop.navigateToWebpage();
        soft.assertEquals("Drag and Drop", heroKuappDragDrop.titleValidation());
        soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario mueve el objeto A al lugar del objeto B$")
    public void moveElement(){
        heroKuappDragDrop.moveElements();
    }

    //Steps de DropDownPage
    @Given("^El usuario ingresa a la pagina Herokuapp Dropdown$")
    public void iNavigateToWebDropDown(){
        heroKuappDropDown.navigateToWebpage();
        soft.assertEquals("Dropdown List", heroKuappDropDown.titleValidationDropDown());
        soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario valida las opciones del dropdown$")
    public void dropDownValidation(){
        List<String> lista = heroKuappDropDown.dropdownOptions();
        List<String> listaEsperada = Arrays.asList("Please select an option",
                                                        "Option 1",
                                                        "Option 2");
        soft.assertEquals(listaEsperada, lista);
        soft.assertEquals(3, heroKuappDropDown.opcAmount());
        soft.assertAll();
    }

    @Then("^El usuario selecciona la opcion 2$")
    public void selectOption2(){
        heroKuappDropDown.selectOption();
        Assert.assertEquals("Option 2", heroKuappDropDown.optionDropDownValidation());
    }

    //Steps de Dynamic Controls
    @Given("^El usuario ingresa a la pagina Herokuapp Dynamic Controls$")
    public void iNavigateToWebDynamic(){
    heroKuappDynamic.navigateToWebpage();
    soft.assertEquals("Dynamic Controls", heroKuappDynamic.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario realiza un clic en el boton Remove y Enable$")
    public void dynamicActions1(){
    heroKuappDynamic.actionCheckBox();
    heroKuappDynamic.actionRemoveButton();
    soft.assertEquals("It's gone!", heroKuappDynamic.dynamiclabelValidation());
    heroKuappDynamic.actionEnableButton();
    soft.assertEquals("It's enabled!", heroKuappDynamic.dynamiclabelValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario realiza un clic en el boton Add y Disable$")
    public void dynamicActions2(){
    heroKuappDynamic.actionAddButton();
    soft.assertEquals("It's back!", heroKuappDynamic.dynamiclabelValidation());
    heroKuappDynamic.actionDisableButton();
    soft.assertEquals("It's disabled!", heroKuappDynamic.dynamiclabelValidation());
    soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario valida los mensajes correctos$")
    public void dynamicActions3(){
    heroKuappDynamic.actionCheckBox();
    heroKuappDynamic.actionRemoveButton();
    soft.assertEquals("It's gone!", heroKuappDynamic.dynamiclabelValidation());
    heroKuappDynamic.actionEnableButton();
    soft.assertEquals("It's enabled!", heroKuappDynamic.dynamiclabelValidation());
    soft.assertAll("Validacion Fallida");
    }

    //Steps de LoadPage
    @Given("^El usuario ingresa a la pagina Herokuapp Loaded Page$")
    public void iNavigateToWebLoad(){
    heroKuappLoad.navigateToWebpage();
    soft.assertEquals("Dynamically Loaded Page Elements", heroKuappLoad.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario da clic en el boton para cargar$")
    public void actionLoadButton(){
    heroKuappLoad.actionLoad();
    }

    @Then("^El usuario valida el mensaje despues de la carga$")
    public void msgValidation(){
    Assert.assertEquals("Hello World!", heroKuappLoad.msgValidatoin());
    }

    //Steps de AdPage
    @Given("^El usuario ingresa a la pagina Herokuapp Ad$")
    public void iNavigateToWebAd(){
    heroKuappAd.navigateToWebpage();
    }

    @When("^El usuario cierra el comercial$")
    public void closeAd(){
    heroKuappAd.closeAd();   
    soft.assertEquals("Entry Ad", heroKuappAd.titleValidation());
    soft.assertAll("Validacion Fallida"); 
    }

    @Then("^El usuario valida el texto de la pagina$")
    public void msgValidatoin(){
    Assert.assertEquals("Displays an ad on page load.", heroKuappAd.msgValidaton());
    }

    //Steps de ExitPage
    @Given("^El usuario ingresa a la pagina Herokuapp Exit$")
    public void iNavigateToWebExit(){
    heroKuappExit.navigateToWebpage();
    soft.assertEquals("Exit Intent", heroKuappExit.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario mueve el mouse fuera de la pantalla para activar un mensaje en pantalla$")
    public void moveMouse(){
    heroKuappExit.moveMouse();
    }
    
    @Then("^El usuario cierra el mensaje y valida que regrese a la pantalla anterior$")
    public void closeModal(){
    heroKuappExit.closeModal();
    Assert.assertEquals("Exit Intent", heroKuappExit.titleValidation());   
    }

    //Steps de DownloadPage
    @Given("^El usuario ingresa a la pagina Herokuapp Download$")
    public void iNavigateToWebDownload(){
    heroKuappDownload.navigateToWebpage();
    soft.assertEquals("File Downloader", heroKuappDownload.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario realiza la descarga de 2 archivos$")
    public void downloadAction(){
    heroKuappDownload.downloadFile1();
    heroKuappDownload.downloadFile2();
    }

    //Steps de UploadPage
    @Given("^El usuario ingresa a la pagina Herokuapp Upload$")
    public void iNavigateToWebUpload(){
    heroKuappUpload.navigateToWebpage();
    soft.assertEquals("File Uploader", heroKuappUpload.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario selecciona un archivo para cargar$")
    public void fileUpload(){
    heroKuappUpload.uploadFile();
    heroKuappUpload.uploadAction();
    }

    @Then("^El usuario cargar el archivo y valida la carga exitosa$")
    public void uploadValidation(){
    Assert.assertEquals("File Uploaded!", heroKuappUpload.uploadValidation());
    }

    //Steps de FloatingPage
    @Given("^El usuario ingresa a la pagina Herokuapp Floating Menu$")
    public void iNavigateToWebFloat(){
    heroKuappFloating.navigateToWebpage();
    soft.assertEquals("Floating Menu", heroKuappFloating.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario realiza un scrolldown$")
    public void downPage(){
    heroKuappFloating.scrollDown();
    }

    @Then("^El usuario navega por el menu y valida la seleccion correcta$")
    public void validationMenu(){
    heroKuappFloating.homeSelected();
    Assert.assertTrue(heroKuappFloating.urlValidation().contains("home"), "Validacion Fallida");
    heroKuappFloating.newsSelected();
    Assert.assertTrue(heroKuappFloating.urlValidation().contains("news"), "Validacion Fallida");
    heroKuappFloating.contactSelected();
    Assert.assertTrue(heroKuappFloating.urlValidation().contains("contact"), "Validacion Fallida");
    heroKuappFloating.aboutSelected();
    Assert.assertTrue(heroKuappFloating.urlValidation().contains("about"), "Validacion Fallida");
    }

    //Steps de ForgotPage
    @Given("^El usuario ingresa a la pagina Herokuapp Forgot Password$")
    public void iNavigateToWebForgot(){
    heroKuappForgot.navigateToWebpage();
    soft.assertEquals("Forgot Password", heroKuappForgot.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario ingresa un correo electronico valido y da clic en retrieve password$")
    public void witeEmail(){
    heroKuappForgot.sendEmail();
    heroKuappForgot.sendAction();
    }

    @Then("^El usuario valida el mensaje correcto en pantalla$")
    public void msgForgotValidation(){
    Assert.assertEquals("Internal Server Error", heroKuappForgot.msgValidation());
    }

    //Steps de LoginFakePage
    @Given("^El usuario ingresa a la pagina Herokuapp Login$")
    public void iNavigateToWeblogin(){
    heroKuappLogin.navigateToWebpage();
    soft.assertEquals("Login Page", heroKuappLogin.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario da clic en login sin usuario ni pass$")
    public void errorLogin(){
    heroKuappLogin.loginClic();
    }

    @Then("^El usuario valida el mensaje de error en el login$")
    public void msgErrorValidatoin(){
    soft.assertTrue(heroKuappLogin.errorValidation().contains("Your username is invalid!"), "Validacion Fallida");
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario da clic en login con Usuario y Pass correctos$")
    public void successLogin(){
    heroKuappLogin.sendUser();
    heroKuappLogin.sendPass();
    heroKuappLogin.loginClic();
    }

    @Then("^El usuario valida el mensaje de exitoso en el login$")
    public void msgSuccessValidation(){
    soft.assertFalse(heroKuappLogin.secureValidation().contains("You logged into a secure area!"), "Validacion Fallida");
    soft.assertEquals("Secure Area", heroKuappLogin.secureValidation());
    soft.assertAll("Validacion Fallida");    
    }

    @When("^El usuario da clic en logout$")
    public void logoutClic(){
    heroKuappLogin.logoutClic();
    }

    @Then("^El usuario valida el mensaje de logout$")
    public void msgLogoutValidation(){
    Assert.assertFalse(heroKuappLogin.logoutValidation().contains("You logged out of the secure area!"), "Validacion Fallida");  
    }

    //Steps de FramePage
    @Given("^El usuario ingresa a la pagina Herokuapp frames$")
    public void iNavigateToWebFrames(){
    heroKuappFrames.navigateToWebpage();
    }

    @Then("^El usuario realiza la validacion de los frames en la pagina$")
    public void textframeValidation(){
    heroKuappFrames.frameTop();
    heroKuappFrames.frameLeft();
    Assert.assertEquals("LEFT", heroKuappFrames.leftText());
    heroKuappFrames.returnFrame();
    heroKuappFrames.frameMiddle();
    Assert.assertEquals("MIDDLE", heroKuappFrames.middleText());
    heroKuappFrames.returnFrame();
    heroKuappFrames.frameRight();
    Assert.assertEquals("RIGHT", heroKuappFrames.rightText());
    heroKuappFrames.returnDefaultFrame();
    heroKuappFrames.frameBottom();
    Assert.assertEquals("BOTTOM", heroKuappFrames.bottomText());
    }

    //Steps de GeoPage
    @Given("^El usuario ingresa a la pagina Herokuapp Geolocation$")
    public void iNavigateToWebGeo(){
    heroKuappGeo.navigateToWebpage();
    soft.assertEquals("Geolocation", heroKuappGeo.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario da clic en el boton Where i am$")
    public void whereAction(){
    heroKuappGeo.whereClic();
    }

    @Then("^El usuario valida las coordenadas que se muestran$")
    public void coordValidation(){
    Assert.assertTrue(heroKuappGeo.latitudeValidation().contains("19"), "Validacion Fallida");  
    Assert.assertTrue(heroKuappGeo.longitudeValidation().contains("-99"), "Validacion Fallida");
    }

    //Steps de SliderPage
    @Given("^El usuario ingresa a la pagina Herokuapp Slider$")
    public void iNavigateToWebSlider(){
    heroKuappSlider.navigateToWebpage();
    soft.assertEquals("Horizontal Slider", heroKuappSlider.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario aumenta y disminuye el valor del slider$")
    public void moveSliderBar(){
    heroKuappSlider.moveSliderOne();
    heroKuappSlider.moveSliderTwo();
    heroKuappSlider.moveSliderThree();
    heroKuappSlider.moveSliderFour();
    heroKuappSlider.moveSliderFive();
    heroKuappSlider.moveSliderSix();
    heroKuappSlider.moveSliderSeven();
    heroKuappSlider.moveSliderOne();
    }

    @Then("^El usuario valida el valor del slider$")
    public void valueValidation(){
    Assert.assertEquals("2.5", heroKuappSlider.sliderValue());
    }

    //Steps de HoverPage
    @Given("^El usuario ingresa a la pagina Herokuapp Hover$")
    public void iNavigateToWebHover(){
    heroKuappHover.navigateToWebpage();
    soft.assertEquals("Hovers", heroKuappHover.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario coloca el mouse sobre las imagenes y valida el texto que aparece$")
    public void hoverValidatoins(){
    heroKuappHover.hoverElement1();
    Assert.assertEquals("name: user1", heroKuappHover.user1Validation());
    heroKuappHover.hoverElement2();
    Assert.assertEquals("name: user2", heroKuappHover.user2Validation());
    heroKuappHover.hoverElement3();
    Assert.assertEquals("name: user3", heroKuappHover.user3Validation());
    }

    //Steps de InputPage
    @Given("^El usuario ingresa a la pagina Herokuapp Input$")
    public void iNavigateToWebInput(){
    heroKuappInput.navigateToWebpage();
    soft.assertEquals("Inputs", heroKuappInput.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario valida que puede aumentar y disminuir el valor$")
    public void inputValidation(){
    heroKuappInput.clicInput();
    for(int i = 0; i < 30; i++){
    heroKuappInput.addNumbers();    
        }
    for(int i = 30; i > 10; i--){
    heroKuappInput.sustractNumbers();
        }
    }

    //Steps de JqueryPage
    @Given("^El usuario ingresa a la pagina Herokuapp Jquery$")
    public void iNavigateToWebJquery(){
    heroKuappJquery.navigateToWebpage();
    soft.assertEquals("JQueryUI - Menu", heroKuappJquery.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario valida que puede desplegar el menu de Jquery$")
    public void expandMenu(){
    heroKuappJquery.gotoEnabled();
    heroKuappJquery.gotoDownload();
    heroKuappJquery.gotoExcel();
    Assert.assertTrue(heroKuappJquery.menuExcelValidation().contains("Excel"), "Validacion Fallida");
    }

    //Steps de AlertPage
    @Given("^El usuario ingresa a la pagina Herokuapp Alerts$")
    public void iNavigateToWebAlert(){
    heroKuappAlert.navigateToWebpage();
    soft.assertEquals("JavaScript Alerts", heroKuappAlert.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario da clic en la primera alerta$")
    public void alertTest1(){
    heroKuappAlert.alertType1();
    heroKuappAlert.alertOk();
    }

    @Then("^El usuario acepta la alerta y se cierra, se valida un mensaje de confirmacion success$")
    public void alertTest1Msg(){
    
    Assert.assertEquals("You successfully clicked an alert", heroKuappAlert.msgResult());
    }

    @When("^El usuario da clic en la segunda alerta$")
    public void alertTest2(){
    heroKuappAlert.alertType2();
    heroKuappAlert.alertOk();
    }

    @Then("^El usuario acepta la alerta y se cierra, se valida un mensaje de confirmacion Ok$")
    public void alertTest2Msg(){
    Assert.assertEquals("You clicked: Ok", heroKuappAlert.msgResult());
    }

    @When("^El usuario da clic en la segunda alerta nuevamente$")
    public void alertTest3(){
    heroKuappAlert.alertType2();
    heroKuappAlert.alertCancel();
    }

    @Then("^El usuario cancela la alerta y se cierra, se valida un mensaje de confirmacion Cancel$")
    public void alertTest4Msg(){
    Assert.assertEquals("You clicked: Cancel", heroKuappAlert.msgResult());
    }

    @When("^El usuario da clic en la tercera alerta$")
    public void alertTest5(){
    heroKuappAlert.alertType3();
    heroKuappAlert.alertCancel();
    }

    @Then("^El usuario cancela la alerta y se cierra, se valida un mensaje de confirmacion null$")
    public void alertTest5Msg(){
    Assert.assertEquals("You entered: null", heroKuappAlert.msgResult());
    }

    @When("^El usuario da clic en la tercera alerta nuevamente$")
    public void alertTest6(){
    heroKuappAlert.alertType3();
    heroKuappAlert.alertMsg();
    heroKuappAlert.alertOk();
    }

    @Then("^El usuario escribe un mensaje y acepta la alerta y se cierra, se valida un mensaje de confirmacion personalizado$")
    public void alertTest6Msg(){ 
    Assert.assertEquals("You entered: Test", heroKuappAlert.msgResult());
    }

    //Steps de KeyDetectionPage
    @Given("^El usuario ingresa a la pagina Herokuapp Key Presses$")
    public void iNavigateToWebKey(){
    heroKuappKey.navigateToWebpage();
    soft.assertEquals("Key Presses", heroKuappKey.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario presiona la tecla flecha arriba$")
    public void upArrow(){
    heroKuappKey.enterUp();
    }

    @Then("^El usuario debe ver un mensaje que indique la tecla UP$")
    public void upArrowValidation(){ 
    Assert.assertEquals("You entered: UP", heroKuappKey.enterKeyValidation());
    }

    @When("^El usuario presiona la tecla flecha abajo$")
    public void downArrow(){
    heroKuappKey.enterDown();
    }

    @Then("^El usuario debe ver un mensaje que indique la tecla DOWN$")
    public void downArrowValidation(){ 
    Assert.assertEquals("You entered: DOWN", heroKuappKey.enterKeyValidation());
    }

    @When("^El usuario presiona la tecla flecha derecha$")
    public void rightArrow(){
    heroKuappKey.enterRight();
    }

    @Then("^El usuario debe ver un mensaje que indique la tecla RIGHT$")
    public void rightArrowValidation(){ 
    Assert.assertEquals("You entered: RIGHT", heroKuappKey.enterKeyValidation());
    }

    @When("^El usuario presiona la tecla flecha izquierda$")
    public void leftArrow(){
    heroKuappKey.enterLeft();
    }

    @Then("^El usuario debe ver un mensaje que indique la tecla LEFT$")
    public void leftArrowValidation(){ 
    Assert.assertEquals("You entered: LEFT", heroKuappKey.enterKeyValidation());
    }

    @When("^El usuario presiona la tecla alter$")
    public void alterKey(){
    heroKuappKey.enterAlt();
    }

    @Then("^El usuario debe ver un mensaje que indique la tecla ALT$")
    public void alterKeyValidation(){ 
    Assert.assertEquals("You entered: ALT", heroKuappKey.enterKeyValidation());
    }

    @When("^El usuario presiona la tecla control$")
    public void controlKey(){
    heroKuappKey.enterControl();
    }

    @Then("^El usuario debe ver un mensaje que indique la tecla CONTROL$")
    public void controlKeyValidation(){ 
    Assert.assertEquals("You entered: CONTROL", heroKuappKey.enterKeyValidation());
    }

    //Steps de WindowPage
    @Given("^El usuario ingresa a la pagina Herokuapp windows$")
    public void iNavigateToWebWindow(){
    heroKuappWindow.navigateToWebpage();
    soft.assertEquals("Opening a new window", heroKuappWindow.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario realiza un clic para abrir 2 pestañas nuevas$")
    public void openNewTab(){
    heroKuappWindow.newTab();
    heroKuappWindow.newTab();
    }

    @Then("^El usuario debe cerrar la pestaña nueva y validar regresar a la pantalla original$")
    public void returnTab(){
    heroKuappWindow.closeExtraTabs();
    Assert.assertEquals("Opening a new window", heroKuappWindow.titleValidation());
    }

    //Steps de NotificationPage
    @Given("^El usuario ingresa a la pagina Herokuapp notification$")
    public void iNavigateToWebNoti(){
    heroKuappNoti.navigateToWebpage();
    soft.assertEquals("Notification Message", heroKuappNoti.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario realiza un clic para generar una notificacion$")
    public void invokeNotification(){
    heroKuappNoti.clicNotification();
    }

    @Then("^El usuario debe validar el texto de la notificacion$")
    public void msgValidationNoti(){
    Assert.assertTrue(heroKuappNoti.notificationValidation().contains("Action successful") 
    || 
    heroKuappNoti.notificationValidation().contains("Action unsuccesful"));
    }

    //Steps de ShadowPage
    @Given("^El usuario ingresa a la pagina Herokuapp shadow$")
    public void iNavigateToWebDOM(){
    heroKuappShadow.navigateToWebpage();
    soft.assertEquals("Simple template", heroKuappShadow.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @Then("^El usuario realiza una validacion de texto en shadow DOM$")
    public void textShadowValidation(){
    Assert.assertEquals("Let's have some different text!", heroKuappShadow.shadowText1Validation());
    Assert.assertEquals("Let's have some different text!", heroKuappShadow.shadowText2Validation());
    Assert.assertEquals("In a list!", heroKuappShadow.shadowText3Validation());
    }

    //Steps de TablePage
    @Given("^El usuario ingresa a la pagina Herokuapp Table$")
    public void iNavigateToWebTable(){
    heroKuappTable.navigateToWebpage();
    soft.assertEquals("Data Tables", heroKuappTable.titleValidation());
    soft.assertAll("Validacion Fallida");
    }

    @When("^El usuario ordena una columna$")
    public void changeOrder(){
    heroKuappTable.sortLastNameColumn();
    }

    @Then("^El usuario debe validar que el orden de la columna cambie$")
    public void sortValidation(){
    heroKuappTable.orderVerify();
    Assert.assertEquals("Bach", heroKuappTable.orderVerify());
    }

    

}