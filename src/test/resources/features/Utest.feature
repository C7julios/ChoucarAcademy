# Autor: Carlos
@stories
Feature: Utest
  Como un usuario, Quiero realizar el registro en la pagina Utest.com

  @scenario1
  Scenario: Registro en la aplicacion
    Given que brandon quiere registrarse en la pagina de Utest
    When el ingresa los datos en el formulario de Utest
      | strPrimerNombre   | strApellido | strCorreo          | strMesNacimiento  | strDiaNacimiento | strAnoNacimiento | strContrasena |
      | Carlos            | Sanchez     | cjnnoeitra@gmail.com| July              | 10               | 1993             | Ae8F!S%)4GAeA*$E|
    Then el mensaje de registro exitoso aparece en pantalla
      | strMensaje              |
      | Welcome to the world's largest community of freelance software testers! |