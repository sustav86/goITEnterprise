package educalc.operation;

import educalc.Operation;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public class IntegralSubtraction implements Operation<Double> {
    @Override
    public String resultFor(Double first, Double second) {
        return String.valueOf(first - second);
    }
}
