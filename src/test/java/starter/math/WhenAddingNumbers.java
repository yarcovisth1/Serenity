package starter.math;
import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"La matematica es importante."})
public class WhenAddingNumbers {


    @Steps
    MathWizSteps miguel;

    @Test
    public void suma() {
        // Given
        miguel.tiene(1);
        // When
        miguel.suma(2);
        // Then
        miguel.deberiaTener(3);
    }
    @Test
    public void multiplicacion(){
        // Given
        miguel.tiene(3);
        // When
        miguel.multiplica(4);
        // Then
        miguel.resultadoFactor(12);
    }
}