package educalc.operation;

import educalc.Operation;
import java.util.Date;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public class DateAddition<T extends Date> implements Operation<T> {
    @Override
    public String resultFor(T first, T second) {
        return String.valueOf(new Date(first.getTime() + second.getTime()));
    }
}
