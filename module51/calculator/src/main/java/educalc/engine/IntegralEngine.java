package educalc.engine;

import educalc.operation.IntegralAddition;
import educalc.operation.IntegralDivision;
import educalc.operation.IntegralMultiplication;
import educalc.operation.IntegralSubtraction;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public class IntegralEngine extends TypeEngine {

    public IntegralEngine() {
        array.put("+", new IntegralAddition());
        array.put("-", new IntegralSubtraction());
        array.put("*", new IntegralMultiplication());
        array.put("/", new IntegralDivision());
    }
}
