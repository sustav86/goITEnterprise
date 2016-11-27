package educalc;

import educalc.engine.CalcEngine;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by SUSTAVOV on 26.11.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        String line;
        System.out.println("*** Calculator ***");
        System.out.println("print q - quit from calculator");
        System.out.println("print set type - to change the type");
        System.out.println("list of support types: ");
        System.out.println("n - integral");
        System.out.println("d - Date");
        System.out.println("default integral type");
        System.out.println("format of Date type: 01.01.1999");

        CalcEngine mainCalc = new CalcEngine("n");

        try (Scanner scanner = new Scanner(System.in)) {

            line = scanner.nextLine();
            while (!"q".equals(line)) {
                if (line.contains("set")) {
                    mainCalc.setCurrentType(line.split(" ")[1]);
                } else {
                    System.out.println(line + "=" + mainCalc.getResult(line));
                }

                line = scanner.nextLine();

            }

        } catch (ParseException ex) {
            System.out.println("Wrong type. Try again");
        }

    }
}
