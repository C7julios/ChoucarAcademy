package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistroUtest implements Task {
    private String strPrimerNombre;
    private String strApellido;
    private String strCorreo;
    private String strMesNacimiento;
    private String strDiaNacimiento;
    private String strAnoNacimiento;
    private String strContrasena;
    private String strMensaje;

    public RegistroUtest(String strPrimerNombre, String strApellido, String strCorreo,
                         String strMesNacimiento, String strDiaNacimiento,
                         String strAnoNacimiento, String strContrasena ) {
        this.strPrimerNombre = strPrimerNombre;
        this.strApellido = strApellido;
        this.strCorreo = strCorreo;
        this.strMesNacimiento = strMesNacimiento;
        this.strDiaNacimiento = strDiaNacimiento;
        this.strAnoNacimiento = strAnoNacimiento;
        this.strContrasena = strContrasena;
        this.strMensaje = strMensaje;
    }

    public static RegistroUtest onThePage(String strPrimerNombre, String strApellido, String strCorreo,
                                          String strMesNacimiento, String strDiaNacimiento,
                                          String strAnoNacimiento, String strContrasena) {
        return Tasks.instrumented(RegistroUtest.class, strPrimerNombre, strApellido, strCorreo,
                strMesNacimiento, strDiaNacimiento, strAnoNacimiento, strContrasena );
    }


    private UtestPage utestPage;
    public static RegistroUtest thePage() {
        return Tasks.instrumented(RegistroUtest.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Click.on(UtestPage.BOTON_JOIN_TODAY));
        actor.attemptsTo(Enter.theValue(strPrimerNombre).into(UtestPage.TEXTO_PRIMER_NOMBRE));
        actor.attemptsTo(Enter.theValue(strApellido).into(UtestPage.TEXTO_APELLIDO));
        actor.attemptsTo(Enter.theValue(strCorreo).into(UtestPage.TEXTO_CORREO));
        actor.attemptsTo(SelectFromOptions.byVisibleText(strMesNacimiento).from(UtestPage.TEXTO_MES_NACIMIENTO));
        actor.attemptsTo(SelectFromOptions.byVisibleText(strDiaNacimiento).from(UtestPage.TEXTO_DIA_NACIMIENTO));
        actor.attemptsTo(SelectFromOptions.byVisibleText(strAnoNacimiento).from(UtestPage.TEXTO_ANO_NACIMIENTO));
        actor.attemptsTo(Click.on(UtestPage.BOTON_NEXT));
        actor.attemptsTo(Click.on(UtestPage.BOTON_DEVICES));
        actor.attemptsTo(Click.on(UtestPage.BOTON_LAST_STEP));
        actor.attemptsTo(Enter.theValue(strContrasena).into(UtestPage.TEXTO_CONTRASENA));
        actor.attemptsTo(Enter.theValue(strContrasena).into(UtestPage.TEXTO_CONFIRMAR_CONTRASENA));
        actor.attemptsTo(Click.on(UtestPage.BOTON_ACEPTO_TERMINOS));
        actor.attemptsTo(Click.on(UtestPage.BOTON_ACEPTO_PRIVACIDAD));
        actor.attemptsTo(Click.on(UtestPage.BOTON_COMPLETE));
    }
}
