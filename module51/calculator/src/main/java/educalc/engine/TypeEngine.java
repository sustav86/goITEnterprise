package educalc.engine;

import educalc.Operation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public abstract class TypeEngine {
    protected Map<String, Operation> array = new HashMap<>();
    protected String currentOperation;

    protected String getCurrentOperation() {
        return currentOperation;
    }

    protected Operation getOperation(String line) {
        for (Map.Entry<String, Operation> operation: array.entrySet()) {
            String key = operation.getKey();
            if (line.contains(key)) {
                currentOperation = key;
                return array.get(key);
            }

        }

        return null;
    }
}
