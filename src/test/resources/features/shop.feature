#author : Juan Carlos Gonzalez

Feature: Realizar compra
  Yo como usuario necesito hacer un proceso de compra
  @RealizarCompraExitosa
  Scenario Outline: Realizar compra exitosamente
    Given que el usuario navega a la página de inicio de sesion
    When Ingresa las credenciales de acceso correctas "<username>" "<password>"
    When Agrega productos al carrito de compras
    And Hace click en el boton del carrito
    When Hace click en el boton checkout
    And Completa el formulario con sus datos "<firstname>" "<lastname>" "<postalcode>"
    And Hace click en el boton continue
    And hace clic en el botón finish
    Then visualiza el mensaje "Thank you for your order!"
    Examples:
      | username      | password     | firstname   | lastname | postalcode |
      | standard_user | secret_sauce | Juan Carlos | Gonzalez | 256        |

