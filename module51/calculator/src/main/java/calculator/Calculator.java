package calculator;


import libcalculator.binaryoperation.classes.Addition;
import libcalculator.binaryoperation.classes.Division;
import libcalculator.binaryoperation.classes.Multiplication;
import libcalculator.binaryoperation.classes.Subtraction;
import libcalculator.binaryoperation.interfaces.BinaryOperation;
import libcalculator.dateoperation.interfaces.DateOperation;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by SUSTAVOV on 20.11.2016.
 */
public class Calculator {
    public Map<Character, BinaryOperation> bOperations;
    private Map<Character, DateOperation> dOperations;
    private int typeOperation;

    private void setBinaryOperations() {
        bOperations.put('+', new Addition());
        bOperations.put('-', new Subtraction());
        bOperations.put('/', new Division());
        bOperations.put('*', new Multiplication());
    }

    private void setDateOperations() {
        dOperations.put('+', (DateOperation) new Addition());
        dOperations.put('-', (DateOperation) new Subtraction());
        dOperations.put('/', (DateOperation) new Division());
        dOperations.put('*', (DateOperation) new Multiplication());
    }

    public Calculator() {
        setBinaryOperations();
        setDateOperations();
    }

    public void setTypeOperation(int typeOperation) {
        this.typeOperation = typeOperation;
    }



    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {

        }




    }
}
