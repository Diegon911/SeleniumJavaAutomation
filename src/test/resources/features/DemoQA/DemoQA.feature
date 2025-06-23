@PruebasPaginaDemoQA
Feature: Automatizar diversas acciones de practica en DemoQA
Practicar y realizar actividades de practica para la automatizacion


@ValidacionDeClics
Scenario: Realizar un doble clic y clic derecho
    Given El usuario ingresa a la pagina DemoQA Buttons
    When El usuario hace un doble clic, clic derecho y clic dinamico
    Then El usuario debe ver los mensajes de confirmacion

@ValidacionDeAlertas
Scenario: Realizar la validacion del comportamiento de las alertas
    Given El usuario ingresa a la pagina DemoQA Alerts
    When El usuario da clic en los botones de alertas
    Then El usuario debe ver el mensaje de confirmacion de alerta

@ValidacionDeSortableLista
Scenario: Realizar la validacion del comportamiento de webelements en una lista que pueden ser acomodados
    Given El usuario ingresa a la pagina DemoQA Sortables
    When El usuario reordena los elementos de la lista
    Then El usuario debe validar el nuevo orden de la lista

@ValidacionDeSortableGrid
Scenario: Realizar la validacion del comportamiento de webelements en una red que pueden ser acomodados
    Given El usuario ingresa a la pagina DemoQA Sortables
    When El usuario reordena los elementos del grid
    Then El usuario debe validar el nuevo orden del grid

@ValidacionDeFrames
Scenario: Realizar la validacion del comportamiento de frames
    Given El usuario ingresa a la pagina DemoQA frames
    When El usuario ingresa al frame 1 y valida el texto
    When El usuario ingresa al frame 2 y valida el texto

@ValidacionDeFramesAnidados
Scenario: Realizar la validacion del comportamiento de frames anidados
    Given El usuario ingresa a la pagina DemoQA frames anidados
    When El usuario ingresa al parent frame y valida el texto
    When El usuario ingresa al child frame y valida el texto

@ValidacionDeCargaArchivo
Scenario: Realizar la validacion del comportamiento de cargar un archivo
    Given El usuario ingresa a la pagina DemoQA upload
    When El usuario carga el archivo deseado
    Then El usuario valida el mensaje de confirmacion de la carga

@ValidacionDeBarraDeslizante
Scenario: Realizar la validacion del comportamiento de una barra deslizante
    Given El usuario ingresa a la pagina DemoQA slider
    When El usuario mueve la barra deslizante
    Then El usuario valida el movimiento de la barra deseado

@ValidacionDeArrastrarSoltar
Scenario: Realizar la validacion del comportamiento de elementos que se pueden arrastrar
    Given El usuario ingresa a la pagina DemoQA droppable
    When El usuario mueve el elemento Drag me dentro del area indicada
    Then El usuario valida el mensaje correcto





 




