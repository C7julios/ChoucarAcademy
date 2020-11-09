package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the ("selecciona Cursos y Certificaciones")
                  .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the ("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the ("Da click para buscar el curso")
            .located(By.xpath("//button[contains(text(),'Ir')]"));
    public static final Target SELECT_COURSE = Target.the ("Da click para buscar el curso")
            .located(By.xpath("//a[contains(text(),'ISTQB Agile Tester Extension')]"));
    public static final Target NAME_COURSE = Target.the ("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'ISTQB Agile Tester Extension')]"));

}
