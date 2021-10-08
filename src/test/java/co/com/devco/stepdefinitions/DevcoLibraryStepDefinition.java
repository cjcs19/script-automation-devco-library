package co.com.devco.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.utils.Constantes.DEVCO_LIBRARY_PAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class DevcoLibraryStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) esta en la documentacion de la libreria$")
    public void abrirDocumentacionLibreria(String actor){
        theActorCalled(actor).wasAbleTo(Open.url(DEVCO_LIBRARY_PAGE));
    }
}
