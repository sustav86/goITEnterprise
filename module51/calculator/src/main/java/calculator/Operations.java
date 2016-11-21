package calculator;

/**
 * Created by SUSTAVOV on 20.11.2016.
 */
public interface Operations<T, U, R> {
    R addition(T left, U right);
    R multiplication(T left, U right);
    R division(T left, U right);
    R subtraction(T left, U right);
    R resultFor(T left, U right);
}
