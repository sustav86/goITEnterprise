package educalc.engine;

import educalc.operation.DateAddition;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public class DateEngine extends TypeEngine {

    public DateEngine() {
        array.put("+", new DateAddition());
    }

}
