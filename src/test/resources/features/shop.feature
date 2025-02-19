#author : Juan Carlos Gonzalez

Feature: Inicio de Sesion
  Yo como usuario necesito iniciar sesión en el sitio web con mis credenciales
  @InicioSesionExitoso
  Scenario: Iniciar sesión exitosamente
    Given que el usuario navega a la página de inicio de sesion
    When Ingresa las credenciales de acceso correctas
    Then deberia ver el catalogo de productos

