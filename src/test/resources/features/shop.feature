#author : Juan Carlos Gonzalez

Feature: Agregar productos al carrito de compras
  @EscenarioPrincipal
  Scenario Outline: Proceso de compra
    Given Usuario esta en la pagina de logueo
    When El usuario tipea su username en el campo <user-name>
      And El usuario tipea su contrasena en el campo <password>
      And El usuario presiona el boton login
    Then El usuario visualiza la pagina de productos disponibles
    When El usuario agrega productos al carrito
      And El usuario va ver el carrito
    Then El usuario visualiza su lista de productos comprados
    When El usuario confirma su compra presionando el boton checkout
      And Ingresa sus datos de compra <first-name> <last-name> <postal-code>
      And El usuario presiona el boton continue
      And El usuario presiona el boton finish
    Then El usuario visualiza un mensaje de confirmación de compra

    Examples:
        | user-name              | password    | first-name  | last-name |  postal-code |
        | standard_user          | secret_sauce| Juan Carlos | Gonzalez  |  5621        |
        | locked_out_user        | secret_sauce| Carlos      | Diaz      |  2233        |
        | problem_user           | secret_sauce| Joan        | Ortiz     |  4567        |
        | performance_glitch_user| secret_sauce| Jimmy       | Orellana  |  5081        |
        | error_user             | secret_sauce| Rusbel      | Godoy     |  3320        |
        | visual_user            | secret_sauce| Guadalupe   | Pesantes  |  5465        |