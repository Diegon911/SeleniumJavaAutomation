@PruebasRegistro
Feature: Prueba de automatizacion con pagina de herramientas
Realizar algunas validaciones y comprobar que el framework de automatizacion funciona

# NOTA: Para ejecutar el escenario varias veces, es necesario cambiar el correo por uno diferente al actual

@RegistroNuevoHP
Scenario Outline: Registro de usuario correcto
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario es guardado exitosamente y regreso a la pagina de Login

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|Testing@091|


@RegistroUserRepetidoTTF
Scenario Outline: Registro de usuario repetido
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email repetido <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque ya existe

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email        |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|Test@test.com|Testing@091|

@RegistroUserSinNombreTTF
Scenario Outline: Registro de usuario sin nombre
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene nombre

  Examples:
  |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email                |password    |
  |Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|TestingT120@test.com|Testing@0911|

@RegistroUserSinApellidoTTF
Scenario Outline: Registro de usuario sin apellido
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene apellido

  Examples:
  |nombre |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |password   |
  |Test123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|Testing@091|

@RegistroUserSinFechaNacTTF
Scenario Outline: Registro de usuario sin fecha de nacimiento
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene fecha de nacimiento

  Examples:
  |nombre |apellido  |direccion     |codigo postal|ciudad  |estado   |telefono  |email               |password   |
  |Test123|Testing123|TestAddress99 |09999        |TestCity|TestState|5555555555|TestingX101@test.com|Testing@091|

@RegistroUserSinDireccionTTF
Scenario Outline: Registro de usuario sin direccion
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene direccion

  Examples:
  |nombre |apellido  |fecha nacimiento|codigo postal|ciudad  |estado   |telefono  |email               |password   |
  |Test123|Testing123|01011991        |09999        |TestCity|TestState|5555555555|TestingX101@test.com|Testing@091|

@RegistroUserSinCodigoPostalTTF
Scenario Outline: Registro de usuario sin codigo postal
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene codigo postal

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |ciudad  |estado   |telefono  |email               |password   |
  |Test123|Testing123|01011991        |TestAddress99 |TestCity|TestState|5555555555|TestingX101@test.com|Testing@091|

@RegistroUserSinCiudadTTF
Scenario Outline: Registro de usuario sin ciudad
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene ciudad

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|estado   |telefono  |email               |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestState|5555555555|TestingX101@test.com|Testing@091|

@RegistroUserSinEstadoTTF
Scenario Outline: Registro de usuario sin estado
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene estado

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |telefono  |email               |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|5555555555|TestingX101@test.com|Testing@091|

@RegistroUserSinPaisTTF
Scenario Outline: Registro de usuario sin pais
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene pais

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email              |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|TestingX101@test.com|Testing@091|

@RegistroUserSinTelefonoTTF
Scenario Outline: Registro de usuario sin telefono
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene telefono

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |email               |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|TestingX101@test.com|Testing@091|

@RegistroUserSinCorreo
Scenario Outline: Registro de usuario sin correo
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene correo

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|Testing@091|

@RegistroUserConCorreoInvalido
Scenario Outline: Registro de usuario con correo invalido
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email invalido <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque el correo es invalido

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email               |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|1234567890          |Testing@091|

@RegistroUserSinPassword
Scenario Outline: Registro de usuario sin password
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque no tiene password

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email               |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|TestingX101@test.com|

@RegistroUserConPasswordCorto
Scenario Outline: Registro de usuario con password corto
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque tiene password corto

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email               |password   |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|TestingX101@test.com|091        |

@RegistroUserConPasswordNoAceptado
Scenario Outline: Registro de usuario con password no aceptado
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en Sign in
  When Yo doy click en Register your account
  When Yo ingreso nombre de forma correcta <nombre>
  When Yo ingreso apellido de forma correcta <apellido>
  When Yo ingreso fecha de nacimiento de forma correcta <fecha nacimiento> 
  When Yo ingreso direccion de forma correcta <direccion>
  When Yo ingreso codigo postal de forma correcta <codigo postal>
  When Yo ingreso ciudad de forma correcta <ciudad>
  When Yo ingreso estado de forma correcta <estado>
  When Yo ingreso pais de forma correcta
  When Yo ingreso telefono de forma correcta <telefono>
  When Yo ingreso email de forma correcta <email>
  When Yo ingreso password de forma correcta <password>
  When Yo doy click en registrar
  Then El usuario no se pudo registrar porque tiene password no aceptado

  Examples:
  |nombre |apellido  |fecha nacimiento|direccion     |codigo postal|ciudad  |estado   |telefono  |email               |password       |
  |Test123|Testing123|01011991        |TestAddress99 |09999        |TestCity|TestState|5555555555|TestingX101@test.com|.......        |

@ValidacionDropDownPractica
Scenario: Validacion de cuentas opciones tiene el dropdown SORT
  Given Yo navego a practicesoftwaretesting.com
  When Yo doy click en el dropdown SORT
  Then El usuario obtiene el numero y opciones correctos

 