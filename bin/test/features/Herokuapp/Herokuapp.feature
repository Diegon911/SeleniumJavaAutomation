@PracticasHerokuapp
Feature: Automatizar acciones en Herokuapp
Practicar y realizar actividades de practica para la automatizacion

@ValidacionAB
Scenario: Realizar una validacion de texto
    Given El usuario ingresa a la pagina Herokuapp ABtest
    Then El usuario valida el texto en pantalla

@ValidacionAddRemove
Scenario: Realizar un clic para agregar y eliminar un elemento
    Given El usuario ingresa a la pagina Herokuapp AddRemove
    When El usuario da clic en el boton Add Element
    Then El usuario valida la aparicion de un nuevo boton
    When El usuario da clic en el elemento nuevo Delete
    Then El usuario valida que el elemento delete desaparece

@ValidacionImagenes
Scenario: Realizar una validacion de imagenes con link roto
    Given El usuario ingresa a la pagina Herokuapp image
    When El usuario valida el estatus de las imagenes
    Then El usuario debe ver 1 imagen correcta y 2 imagenes rotas

@ValidacionCheckBox
Scenario: Realizar una validacion de checkbox
    Given El usuario ingresa a la pagina Herokuapp checkbox y valida su estatus actual
    When El usuario marca y desmarca las checkboxes
    Then El usuario debe validar el estatus de las checkboxes y ambas deben estar deseleccionadas

@ValidacionDragAndDrop
Scenario: Realizar una validacion de arrastrar un elemento
    Given El usuario ingresa a la pagina Herokuapp Drag and Drop
    Then El usuario mueve el objeto A al lugar del objeto B

@ValidacionDropDown
Scenario: Realizar una validacion utilizando Dropdown
    Given El usuario ingresa a la pagina Herokuapp Dropdown
    When El usuario valida las opciones del dropdown
    Then El usuario selecciona la opcion 2

@ValidacionLoad
Scenario: Realizar una validacion en una pantalla de carga
    Given El usuario ingresa a la pagina Herokuapp Loaded Page
    When El usuario da clic en el boton para cargar
    Then El usuario valida el mensaje despues de la carga

@ValidacionAd
Scenario: Realizar una validacion en una pagina con un comercial
    Given El usuario ingresa a la pagina Herokuapp Ad
    When El usuario cierra el comercial
    Then El usuario valida el texto de la pagina

#@ValidacionModal(problema con bordes del navegador)
#Scenario: Realizar una validacion de un modal cuando el mouse sale de pantalla
#    Given El usuario ingresa a la pagina Herokuapp Exit
#    When El usuario mueve el mouse fuera de la pantalla para activar un mensaje en pantalla
#    Then El usuario cierra el mensaje y valida que regrese a la pantalla anterior

@ValidacionUpload
Scenario: Realizar una validacion de cargar un archivo
    Given El usuario ingresa a la pagina Herokuapp Upload
    When El usuario selecciona un archivo para cargar 
    Then El usuario cargar el archivo y valida la carga exitosa

@ValidacionFloatingMenu
Scenario: Realizar una validacion en un menu flotante
    Given El usuario ingresa a la pagina Herokuapp Floating Menu
    When El usuario realiza un scrolldown
    Then El usuario navega por el menu y valida la seleccion correcta

@ValidacionForgotPassword
Scenario: Realizar una validacion en recuperacion de password
    Given El usuario ingresa a la pagina Herokuapp Forgot Password
    When El usuario ingresa un correo electronico valido y da clic en retrieve password
    Then El usuario valida el mensaje correcto en pantalla

#@ValidacionLoginFake(Problema con notificacion de seguridad de chrome)
#Scenario: Realizar una validacion en login simple
#    Given El usuario ingresa a la pagina Herokuapp Login
#    When El usuario da clic en login sin usuario ni pass
#    Then El usuario valida el mensaje de error en el login
#    When El usuario da clic en login con Usuario y Pass correctos
#    Then El usuario valida el mensaje de exitoso en el login
#    When El usuario da clic en logout
#    Then El usuario valida el mensaje de logout

@ValidacionFrames
Scenario: Realizar una validacion de frames
    Given El usuario ingresa a la pagina Herokuapp frames
    Then El usuario realiza la validacion de los frames en la pagina

@ValidacionGeolocation
Scenario: Realizar una validacion con geolocalizacion
    Given El usuario ingresa a la pagina Herokuapp Geolocation
    When El usuario da clic en el boton Where i am
    Then El usuario valida las coordenadas que se muestran

@ValidacionSliderPage
Scenario: Realizar una validacion con barra Slider
    Given El usuario ingresa a la pagina Herokuapp Slider
    When El usuario aumenta y disminuye el valor del slider
    Then El usuario valida el valor del slider

@ValidacionHoverPage
Scenario: Realizar una validacion con elementos Hover
    Given El usuario ingresa a la pagina Herokuapp Hover
    Then El usuario coloca el mouse sobre las imagenes y valida el texto que aparece

@ValidacionInputPage
Scenario: Realizar una validacion con elementos Input
    Given El usuario ingresa a la pagina Herokuapp Input
    Then El usuario valida que puede aumentar y disminuir el valor

@ValidacionJqueryMenu
Scenario: Realizar una validacion con elementos Input
    Given El usuario ingresa a la pagina Herokuapp Jquery
    Then El usuario valida que puede desplegar el menu de Jquery

@ValidacionAlertsHero
Scenario: Realizar una validacion con alertas
    Given El usuario ingresa a la pagina Herokuapp Alerts
    When El usuario da clic en la primera alerta
    Then El usuario acepta la alerta y se cierra, se valida un mensaje de confirmacion success
    When El usuario da clic en la segunda alerta
    Then El usuario acepta la alerta y se cierra, se valida un mensaje de confirmacion Ok
    When El usuario da clic en la segunda alerta nuevamente
    Then El usuario cancela la alerta y se cierra, se valida un mensaje de confirmacion Cancel
    When El usuario da clic en la tercera alerta 
    Then El usuario cancela la alerta y se cierra, se valida un mensaje de confirmacion null
    When El usuario da clic en la tercera alerta nuevamente
    Then El usuario escribe un mensaje y acepta la alerta y se cierra, se valida un mensaje de confirmacion personalizado

@ValidacionEnterKeys
Scenario: Realizar una validacion con deteccion de teclas
    Given El usuario ingresa a la pagina Herokuapp Key Presses
    When El usuario presiona la tecla flecha arriba
    Then El usuario debe ver un mensaje que indique la tecla UP
    When El usuario presiona la tecla flecha abajo
    Then El usuario debe ver un mensaje que indique la tecla DOWN
    When El usuario presiona la tecla flecha derecha
    Then El usuario debe ver un mensaje que indique la tecla RIGHT
    When El usuario presiona la tecla flecha izquierda
    Then El usuario debe ver un mensaje que indique la tecla LEFT
    When El usuario presiona la tecla alter
    Then El usuario debe ver un mensaje que indique la tecla ALT
    When El usuario presiona la tecla control
    Then El usuario debe ver un mensaje que indique la tecla CONTROL


@ValidacionMultiWindow
Scenario: Realizar una validacion de mutiple ventanas
    Given El usuario ingresa a la pagina Herokuapp windows
    When El usuario realiza un clic para abrir 2 pestañas nuevas
    Then El usuario debe cerrar la pestaña nueva y validar regresar a la pantalla original

@ValidacionNotification
Scenario: Realizar una validacion de mensaje de notificacion
    Given El usuario ingresa a la pagina Herokuapp notification
    When El usuario realiza un clic para generar una notificacion
    Then El usuario debe validar el texto de la notificacion

@ValidacionShadowDOM
Scenario: Realizar una validacion de shadow DOM
    Given El usuario ingresa a la pagina Herokuapp shadow
    Then El usuario realiza una validacion de texto en shadow DOM

@ValidacionClicDerecho
Scenario: Realizar una validacion de clic derecho
    Given El usuario ingresa a la pagina Herokuapp contextmenu
    When El usuario realiza un clic derecho sobre el area marcada
    Then El usuario debe cerrar la alerta y validar que regrese a la pantalla anterior

@ValidacionTabla
Scenario: Realizar una validacion de contenido de una tabla
    Given El usuario ingresa a la pagina Herokuapp Table
    When El usuario ordena una columna
    Then El usuario debe validar que el orden de la columna cambie