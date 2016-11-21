package libcalculator.dateoperation.classes;

import libcalculator.dateoperation.interfaces.DateOperation;

import java.util.Date;

/**
 * Created by SUSTAVOV on 20.11.2016.
 */
public class Division implements DateOperation {
    public Date resultFor(Date left, Date right) {
        return new Date(left.getTime() / right.getTime());
    }
}
