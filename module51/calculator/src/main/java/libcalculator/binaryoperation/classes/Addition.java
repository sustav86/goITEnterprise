package libcalculator.binaryoperation.classes;

import libcalculator.binaryoperation.interfaces.BinaryOperation;

/**
 * Created by SUSTAVOV on 20.11.2016.
 */
public class Addition implements BinaryOperation {
    public double resultFor(double left, double right) {
        return left + right;
    }

}
