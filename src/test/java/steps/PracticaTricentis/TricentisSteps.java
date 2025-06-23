package steps.PracticaTricentis;

import java.util.Random;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.PracticaTricentis.PaginaRegistroTricentis;
import pages.PracticaTricentis.PaginaTricentis;

public class TricentisSteps {

    private String generateRandomEmail() {
    Random random = new Random();
    int randomNumber = random.nextInt(10000); // Generar un número aleatorio entre 0 y 9999
    return "example" + randomNumber + "@example.com";
    }

    PaginaTricentis mainPage = new PaginaTricentis();
    PaginaRegistroTricentis registerPage = new PaginaRegistroTricentis();
    

    @Given("^El usuario ingresa a la pagina Demo Web Shop$")
    public void iNavigateToWeb() {
        mainPage.navigateToWebpage();
    }

    @Given("^El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register$")
    public void navigateAndClick() {
        mainPage.navigateToWebpage();
        mainPage.selectRegister();
    }

    @Given("^El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register e ingresa un password (.+) correcto$")
    public void navigateAndClickEnterPass(String criteria) {
        mainPage.navigateToWebpage();
        mainPage.selectRegister();
        registerPage.sendPass(criteria);
    }

    @When("^El usuario da click en la opcion Register$")
    public void clickOnregister(){
        mainPage.selectRegister();
    }
    
    @When("^El usuario ingresa una confirmacion de password valida (.+)$")
    public void sendCPass(String criteria){
        registerPage.sendConfPass(criteria);
    }

    @When("^El usuario ingresa un correo (.+) invalido y da click en boton Register$")
    public void sendEAndClick(String criteria){
        registerPage.sendEmail(criteria);
        registerPage.clickOnRegisterButton();
    }

    @When("^El usuario ingresa un password (.+) corto y da click en boton Register$")
    public void sendPAndClick(String criteria){
        registerPage.sendPass(criteria);
        registerPage.clickOnRegisterButton();
    }

    @When("^El usuario ingresa una confirmacion de password (.+) diferente y da click en registrar$")
    public void sendConfPassAndClick(String criteria){
        registerPage.sendConfPass(criteria);
        registerPage.clickOnRegisterButton();
    }

    @When("^El usuario da click en boton Register$")
    public void clickOnregisterbutton(){
        registerPage.clickOnRegisterButton();
    }

    @When("^El usuario ingresa un nombre valido (.+)$")
    public void sendNombre(String criteria){
        registerPage.sendName(criteria);
    }

    @When("^El usuario selecciona la opcion Male$")
    public void selectMale(){
        registerPage.clickOnRadioMaleButton();
    }

    @When("^El usuario selecciona la opcion Female$")
    public void selectFemale(){
        registerPage.clickOnRadioFemaleButton();
    }

    @When("^El usuario ingresa un apellido valido (.+)$")
    public void sendApellido(String criteria){
        registerPage.sendLastName(criteria);
    }

    @When("^El usuario ingresa un email valido (.+)$")
    public void sendCorreo(String criteria){
        registerPage.sendEmail(generateRandomEmail());
    }

    @When("^El usuario ingresa un email repetido (.+)$")
    public void sendCorreoRep(String criteria){
        registerPage.sendEmail(criteria);
    }

    @When("^El usuario ingresa un password valido (.+)$")
    public void sendPassword(String criteria){
        registerPage.sendPass(criteria);
    }

    @When("^El usuario debe ver y navegar por las opciones (.+) disponibles en la barra de menu de forma correcta$")
    public void navigationMenuBar(String section) {
        mainPage.clicOnMenuBar(section);
    }

    @When("^El usuario coloca el puntero en la opcion Computers$")
    public void navigationComputerMenuBar() {
        mainPage.overComputerMenuBar();
    }

    @When("^El usuario coloca el puntero en la opcion Electronics$")
    public void navigationElectronicsMenuBar() {
        mainPage.overelectonicsMenuBar();
    }

    @Then("^El usuario debe ver el formulario de registro con las etiquetas y campos correctos$")
    public void textoRegistro() {
        Assert.assertEquals("Register", registerPage.etiquetaRegistro());
    }

    public void textoTuInformacion() {
        Assert.assertEquals("Your Personal Details", registerPage.etiquetaYpd());
    }
    
    public void textoGenero() {
        Assert.assertEquals("Gender:", registerPage.etiquetaGender());
    }

    public void textoMasculino() {
        Assert.assertEquals("gender-male", registerPage.etiquetaMale());
    }

    public void textoFemenido() {
        Assert.assertEquals("gender-female", registerPage.etiquetaFemale());
    }

    public void textoNombre() {
        Assert.assertEquals("FirstName", registerPage.etiquetaFirstName());
        Assert.assertTrue(registerPage.trueTextboxName(),"El elemento no esta presente");
    }

    public void textoApellido() {
        Assert.assertEquals("LastName", registerPage.etiquetaLastName());
        Assert.assertTrue(registerPage.trueTextboxLastName(),"El elemento no esta presente");
    }

    public void textoCorreo() {
        Assert.assertEquals("Email", registerPage.etiquetaEmail());
        Assert.assertTrue(registerPage.trueTextboxEmail(),"El elemento no esta presente");
    }

    public void textoTuPassword() {
        Assert.assertEquals("Your Password", registerPage.etiquetaYp());
    }

    public void textoPassword() {
        Assert.assertEquals("Password", registerPage.etiquetaPassword());
        Assert.assertTrue(registerPage.trueTextboxPass(),"El elemento no esta presente");
    }

    public void textoConfirmaPassword() {
        Assert.assertEquals("ConfirmPassword", registerPage.etiquetaConfirmPassword());
        Assert.assertTrue(registerPage.trueTextboxConPass(),"El elemento no esta presente");
    }

    public void botonRegistrar(){
        Assert.assertEquals("register-button", registerPage.botonRegister());
    }

    @Then("^El usuario debe ver una etiqueta en rojo en cada campo obligatorio$")
    public void textoNombreMandatorio() {
        Assert.assertEquals("First name is required.", registerPage.etiquetaNombreMandatorio());
    }

    public void textoApellidoMandatorio() {
        Assert.assertEquals("Last name is required.", registerPage.etiquetaApellidoMandatorio());
    }

    public void textoEmailMandatorio() {
        Assert.assertEquals("Email is required.", registerPage.etiquetaEmailMandatorio());
    }

    public void textoPassMandatorio() {
        Assert.assertEquals("Password is required.", registerPage.etiquetaPassMandatorio());
    }

    public void textoConfPassMandatorio() {
        Assert.assertEquals("Password is required.", registerPage.etiquetaConfPassMandatorio());
    }

    @Then("^El usuario debe ver una etiqueta en rojo indicando que el correo es incorrecto$")
    public void textoEmailIncorrecto() {
        Assert.assertEquals("Wrong email", registerPage.etiquetaEmailInvalido());
    }

    @Then("^El usuario debe ver una etiqueta en rojo indicando que el password es corto$")
    public void textoPassIncorrecto() {
        Assert.assertEquals("The password should have at least 6 characters.", registerPage.etiquetaPassInvalido());
    }

    @Then("^El usuario debe ver una etiqueta en rojo indicando que la confirmacion de password no hace match con el password original$")
    public void textoCPassIncorrecto() {
        Assert.assertEquals("The password and confirmation password do not match.", registerPage.etiquetaConfPassInvalido());
    }

    @Then("^El usuario debe ver una etiqueta de confirmacion: registro exitoso y cerrar sesion$")
    public void textoNuevoUser() {
        Assert.assertEquals("Your registration completed", registerPage.etiquetaNuevoUser());
        registerPage.clickOnLogoutOption();
    }

    @Then("^El usuario debe ver una etiqueta de error y no debe completarse el registro$")
    public void textoUserRepetido() {
        Assert.assertEquals("The specified email already exists", registerPage.etiquetaUserrepetido());
    }

    @Then("^El usuario debe ver la barra de menu siempre disponible$")
    public void menuBarDisponible() {
        Assert.assertTrue(mainPage.trueMenuBar(),"El elemento no esta presente");
    }

    @Then("^El usuario debe ver las opciones ocultas dentro de la opcion Computers$")
    public void menuCompBarOculto() {
        Assert.assertTrue(mainPage.trueDesktopOption(),"El elemento no esta presente");
        Assert.assertTrue(mainPage.trueNooteBookOption(),"El elemento no esta presente");
        Assert.assertTrue(mainPage.trueAccessoriesOption(),"El elemento no esta presente");
    }

    @Then("^El usuario debe ver las opciones ocultas dentro de la opcion Electronics$")
    public void menuelecBarOculto() {
        Assert.assertTrue(mainPage.trueCameraOption(),"El elemento no esta presente");
        Assert.assertTrue(mainPage.trueCellOption(),"El elemento no esta presente");
    }

    




}
