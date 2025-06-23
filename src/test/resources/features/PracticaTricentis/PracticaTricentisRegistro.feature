@PruebasRegistroTricentis
Feature: Prueba de automatizacion con pagina demo de Tricentis
Realizar algunas validaciones de en la pagina de registro DEMO de Tricentis


@ValidacionCamposPaginaRegistroHP
Scenario: Validacion de campos en pagina de registro de tricentis
    Given El usuario ingresa a la pagina Demo Web Shop
    When El usuario da click en la opcion Register
    Then El usuario debe ver el formulario de registro con las etiquetas y campos correctos


@ValidacionCamposMandatoriosPaginaRegistroHP
Scenario: Validacion de campos mandatorios en pagina de registro de tricentis
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario da click en boton Register
    Then El usuario debe ver una etiqueta en rojo en cada campo obligatorio

@ValidacionCorreoInvalidoPaginaRegistroTTF
Scenario Outline: Validacion de correo incorrecto en pagina de registro de tricentis
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario ingresa un correo <email> invalido y da click en boton Register
    Then El usuario debe ver una etiqueta en rojo indicando que el correo es incorrecto

Examples:
    |email   | 
    |example | 
    |test    |
    |test.com|
    |123@    | 

@ValidacionPassInvalidoPaginaRegistroTTF
Scenario Outline: Validacion de password incorrecto con menos de 6 caracteres en pagina de registro de tricentis
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario ingresa un password <password> corto y da click en boton Register
    Then El usuario debe ver una etiqueta en rojo indicando que el password es corto

Examples:
    |password   | 
    |Q          | 
    |QD         |
    |QRC        |
    |RDXB       | 
    |VRLOS      |

@ValidacionConfirmPassInvalidoPaginaRegistroTTF
Scenario Outline: Validacion de confirmacion de password incorrecto
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register e ingresa un password <password> correcto
    When El usuario ingresa una confirmacion de password <cpassword> diferente y da click en registrar
    Then El usuario debe ver una etiqueta en rojo indicando que la confirmacion de password no hace match con el password original

Examples:
    |password  |cpassword | 
    |VRLOSZ3231|KRLOSZ0231|
    |VRLOSZ3231|VRZOZZ3231|
    |VRLOSZ3231|VBLOSZ3230|

@ValidacionRegistroUsuarioCorrectoSinGeneroHP
Scenario Outline: Validacion de alta de usuario nuevo sin genero
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario ingresa un nombre valido <nombre>
    When El usuario ingresa un apellido valido <apellido>
    When El usuario ingresa un email valido <email>
    When El usuario ingresa un password valido <password>
    When El usuario ingresa una confirmacion de password valida <cpassword>
    When El usuario da click en boton Register
    Then El usuario debe ver una etiqueta de confirmacion: registro exitoso y cerrar sesion

Examples:
    |nombre  |apellido|password  |cpassword| 
    |Prueba01|Test01  |TEST001   |TEST001  |
    |Prueba02|Test02  |TEST002   |TEST002  |

@ValidacionRegistroUsuarioCorrectoMasculinoHP
Scenario Outline: Validacion de alta de usuario nuevo masculino
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario selecciona la opcion Male
    When El usuario ingresa un nombre valido <nombre>
    When El usuario ingresa un apellido valido <apellido>
    When El usuario ingresa un email valido <email>
    When El usuario ingresa un password valido <password>
    When El usuario ingresa una confirmacion de password valida <cpassword>
    When El usuario da click en boton Register
    Then El usuario debe ver una etiqueta de confirmacion: registro exitoso y cerrar sesion

Examples:
    |nombre  |apellido|password  |cpassword| 
    |Prueba01|Test01  |TEST001   |TEST001  |
    |Prueba02|Test02  |TEST002   |TEST002  |

@ValidacionRegistroUsuarioCorrectoFemeninoHP
Scenario Outline: Validacion de alta de usuario nuevo femenino
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario selecciona la opcion Female
    When El usuario ingresa un nombre valido <nombre>
    When El usuario ingresa un apellido valido <apellido>
    When El usuario ingresa un email valido <email>
    When El usuario ingresa un password valido <password>
    When El usuario ingresa una confirmacion de password valida <cpassword>
    When El usuario da click en boton Register
    Then El usuario debe ver una etiqueta de confirmacion: registro exitoso y cerrar sesion

Examples:
    |nombre  |apellido|password  |cpassword| 
    |Prueba01|Test01  |TEST001   |TEST001  |
    |Prueba02|Test02  |TEST002   |TEST002  |

@ValidacionRegistroUsuarioRepetidoTTF
Scenario Outline: Validacion de alta de usuario nuevo repetido
    Given El usuario ingresa a la pagina Demo Web Shop y da click en opcion Register
    When El usuario ingresa un nombre valido <nombre>
    When El usuario ingresa un apellido valido <apellido>
    When El usuario ingresa un email repetido <email>
    When El usuario ingresa un password valido <password>
    When El usuario ingresa una confirmacion de password valida <cpassword>
    When El usuario da click en boton Register
    Then El usuario debe ver una etiqueta de error y no debe completarse el registro

Examples:
    |nombre  |apellido|email            |password  |cpassword| 
    |Prueba01|Test01  |Sample@Sample.com|TEST001   |TEST001  |

@ValidacionOpcionesBarraMenuHP
Scenario Outline: Validacion de las opciones disponibles en la barra de menus
    Given El usuario ingresa a la pagina Demo Web Shop
    When El usuario debe ver y navegar por las opciones <option> disponibles en la barra de menu de forma correcta
    Then El usuario debe ver la barra de menu siempre disponible

Examples:
    |option           |
    |Books            |
    |Computers        |
    |Electronics      |
    |Apparel & Shoes  |
    |Digital downloads|
    |Jewelry          |
    |Gift Cards       |

@ValidacionOpcionesOcultasBarraMenuComputersHP
Scenario: Validacion de las opciones ocultas en la barra de menus opcion Computers
    Given El usuario ingresa a la pagina Demo Web Shop
    When El usuario coloca el puntero en la opcion Computers
    Then El usuario debe ver las opciones ocultas dentro de la opcion Computers

@ValidacionOpcionesOcultasBarraMenuElectronicsHP
Scenario: Validacion de las opciones ocultas en la barra de menus opcion Electronics
    Given El usuario ingresa a la pagina Demo Web Shop
    When El usuario coloca el puntero en la opcion Electronics
    Then El usuario debe ver las opciones ocultas dentro de la opcion Electronics


