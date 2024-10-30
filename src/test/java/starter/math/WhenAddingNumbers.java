package starter.math;
import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;
import java.util.Random;

@RunWith(SerenityRunner.class)
@Narrative(text={"La matematica es importante."})
public class WhenAddingNumbers {


    @Steps
    MathWizSteps miguel;

    private Random random = new Random();
    private int[] numeros = {1, 2, 3, 4, 5};
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

    @Test
    public void multiplicacion(){
        // Given
        miguel.tiene(3);
        // When
        miguel.multiplica(4);
        // Then
        miguel.resultadoFactor(12);
    }

    @Test
    public void division(){
        // Given
        miguel.tiene(8);
        // When
        miguel.divide(4);
        // Then
        miguel.deberiaTener(2);
    }

    @Test
    public void multiplicacionAleatoria() {
        // Given
        int numeroAleatorio1 = numeros[random.nextInt(numeros.length)]; // Selecciona un número aleatorio del vector
        int numeroAleatorio2 = numeros[random.nextInt(numeros.length)]; // Selecciona otro número aleatorio del vector

        // When
        miguel.tiene(numeroAleatorio1); // Asigna el primer número
        miguel.multiplica(numeroAleatorio2); // Multiplica por el segundo número

        // Then
        int resultadoEsperado = numeroAleatorio1 * numeroAleatorio2; // Calcula el resultado esperado
        miguel.resultadoFactor(resultadoEsperado); // Verifica el resultado
    }

    @Test
    public void divisionAleatoria() {
        // Given
        int numeroAleatorio1 = numeros[random.nextInt(numeros.length)]; // Selecciona un número aleatorio del vector
        int numeroAleatorio2;

        // Asegúrate de que no seleccionas cero para evitar una excepción de división por cero
        do {
            numeroAleatorio2 = numeros[random.nextInt(numeros.length)];
        } while (numeroAleatorio2 == 0);

        // When
        miguel.tiene(numeroAleatorio1); // Asigna el primer número
        miguel.divide(numeroAleatorio2); // Divide por el segundo número

        // Then
        int resultadoEsperado = numeroAleatorio1 / numeroAleatorio2; // Calcula el resultado esperado
        miguel.resultadoFactor(resultadoEsperado); // Verifica el resultado
    }
}