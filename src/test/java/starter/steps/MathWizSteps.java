package starter.steps;

import net.serenitybdd.annotations.Step;

import java.util.Scanner;

public class MathWizSteps {
    Scanner scanner = new Scanner(System.in);
    private int total =0;
    String actor;

    @Step("#actor tiene {0}")
    public void tiene(int amount) {
        total = amount;
    }

    @Step("#actor agrega {0}")
    public void suma(int amount) {
        total += amount;
    }

    @Step("#actor deberia tener {0}")
    public void deberiaTener(int expectedTotal) {
        if (total != expectedTotal) {
            throw new AssertionError("Expected Total"+
                    expectedTotal+ "but was"+total);
        }
        System.out.println("La suma es igual: "+expectedTotal);
    }

    @Step("#actor multiplica por {0}")
    public void multiplica(int factor){
         total *= factor;
    }

    @Step("#actor deberia ver {0}")
    public void resultadoFactor(int numFactor) {
        if (total != numFactor) {
            throw new AssertionError("Expected Total"+
                    numFactor+ "but was"+total);
        }
        System.out.println("El factor es igual: "+numFactor);
    }
}
