package starter.math;
import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;
import java.util.Random;

@RunWith(SerenityRunner.class)
@Narrative(text={"La division es una operación clave en matemáticas."})
public class WhenAddingNumbersTest {


    @Steps
    MathWizSteps miguel;

    private final Random random = new Random();
    private final int[] numeros = {1, 2, 3, 4, 5};
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
    public void sumaAleatoria() {
        // Given
        int numeroAleatorio1 = numeros[random.nextInt(numeros.length)]; // Selecciona un número aleatorio del vector
        int numeroAleatorio2 = numeros[random.nextInt(numeros.length)]; // Selecciona otro número aleatorio del vector

        // When
        miguel.tiene(numeroAleatorio1); // Asigna el primer número
        miguel.suma(numeroAleatorio2); // Multiplica por el segundo número

        // Then
        int resultadoEsperado = numeroAleatorio1 + numeroAleatorio2; // Calcula el resultado esperado
        miguel.deberiaTener(resultadoEsperado); // Verifica el resultado
    }
}