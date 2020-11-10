package co.com.choucair.certificacion.proyectobase.questions;

import co.com.choucair.certificacion.proyectobase.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RespuestaRegistroUtest implements Question<Boolean>{
    private String question;

    public RespuestaRegistroUtest(String question){
        this.question = question;
    }
    public static RespuestaRegistroUtest toThe(String question){
        return new RespuestaRegistroUtest(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String registroCompleto= Text.of(UtestPage.MENSAJE_BIENVENIDA).viewedBy(actor).asString();

        if (question.equals(registroCompleto)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

