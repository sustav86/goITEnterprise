package educalc.engine;

import educalc.Operation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public class CalcEngine {
    private String currentType;
    private String result;

    public CalcEngine(String currentType) {
        this.currentType = currentType;
    }

    public void setCurrentType(String currentType) {
        this.currentType = currentType;
    }

    public String getResult(String line) throws ParseException {

        Operation operation;
        String[] variables;
        TypeEngine typeEngine = null;

        if (currentType.equals("d")) {
            typeEngine = new DateEngine();
            operation = typeEngine.getOperation(line);
        } else if (currentType.equals("n")) {
            typeEngine = new IntegralEngine();
            operation = typeEngine.getOperation(line);
        } else {
            return "Not support type";
        }

        if (operation == null) {
            return "This type not support this operation";
        }

        String currentOperation = typeEngine.getCurrentOperation();
        if (currentOperation.equals("+")) currentOperation = "[+]";
        variables = line.split(currentOperation);

        if (variables.length != 2) {
            return "Error number of operands";
        }

        Object first = null;
        Object second = null;

        if (currentType.equals("d")) {
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            first = format.parse(variables[0]);
            second = format.parse(variables[1]);
        } else if (currentType.equals("n")) {
            first = Double.parseDouble(variables[0]);
            second = Double.parseDouble(variables[1]);
        } else {
            return "Something wrong!";
        }

        result = operation.resultFor(first, second);

        return result;
    }
}
