package co.com.choucair.certificacion.proyectobase.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target BOTON_JOIN_TODAY = Target.the("Boton que nos lleva al formulario de inscripcion")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target TEXTO_PRIMER_NOMBRE = Target.the("Ingreso del Nombre")
            .located(By.id("firstName"));
    public static final Target TEXTO_APELLIDO = Target.the("Ingreso del Apellido")
            .located(By.id("lastName"));
    public static final Target TEXTO_CORREO = Target.the("Ingreso Del Correo")
            .located(By.id("email"));
    public static final Target TEXTO_MES_NACIMIENTO = Target.the("Ingreso Del Mes de Nacimiento")
            .located(By.id("birthMonth"));
    public static final Target TEXTO_DIA_NACIMIENTO = Target.the("Ingreso Del Dia de Nacimiento")
            .located(By.id("birthDay"));
    public static final Target TEXTO_ANO_NACIMIENTO = Target.the("Ingreso Del Mes de Nacimiento")
            .located(By.id("birthYear"));
    public static final Target BOTON_NEXT = Target.the("Boton que nos lleva al Next")
            .located(By.className("btn-blue"));
    public static final Target BOTON_DEVICES = Target.the("Boton que nos lleva al Next")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));
    public static final Target BOTON_LAST_STEP = Target.the("Boton que nos lleva al Next")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
    public static final Target TEXTO_CONTRASENA = Target.the("Ingreso de la Contraseña")
            .located(By.id("password"));
    public static final Target TEXTO_CONFIRMAR_CONTRASENA = Target.the("Ingreso de la Contraseña Nuevamente")
            .located(By.id("confirmPassword"));
    public static final Target BOTON_ACEPTO_TERMINOS = Target.the("Acepto Terminos")
            .located(By.id("termOfUse"));
    public static final Target BOTON_ACEPTO_PRIVACIDAD = Target.the("Acepto Terminos de Privacidad y Securidad")
            .located(By.id("privacySetting"));
    public static final Target BOTON_COMPLETE = Target.the("Ingreso de la Contraseña")
            .located(By.id("laddaBtn"));
    public static final Target MENSAJE_BIENVENIDA = Target.the ("Extrae el mensaje de bienvenida")
            .located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));


}

