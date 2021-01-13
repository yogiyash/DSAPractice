package concepts.oops.solid;

import java.util.ArrayList;
import java.util.List;

public class OpenClosedPrincipalExample {

    public static void main(String[] args) {


        List<NaiveCalculatorOperation> naiveOps = new ArrayList<>();
        NaiveAdd n_add = new NaiveAdd(6.0, 5.0);
        NaiveSubtract n_sub = new NaiveSubtract(6.0, 5.3);
        naiveOps.add(n_add);
        naiveOps.add(n_sub);
        naiveCalculate(naiveOps);

        List<CalculatorOperation> ops = new ArrayList<>();
        Addition add = new Addition(6.0, 6.0);
        Subtraction sub = new Subtraction(6.0, 5.0);
        ops.add(add);
        ops.add(sub);
        calculate(ops);


    }


    /**
     * Correct way OCP, changes in add and subtracts will not effect the outside code hence close  for modification
     *
     * @param operations list of operations to perform
     */
    static void calculate(List<CalculatorOperation> operations) {
        operations.stream().map(ops -> {
            ops.calculate();
            return ops.getResult();
        }).filter(op -> op > 2.0d).forEach(System.out::println);
    }

    /**
     * Leaving Implementation of outside class
     * incorrect OCP, changes in add and subtract will effect the outside code
     *
     * @param operations list of operations to perform
     */
    static void naiveCalculate(List<NaiveCalculatorOperation> operations) {
        operations.stream().map(
                operation -> {

                    if (operation instanceof NaiveAdd) {
                        NaiveAdd obj = (NaiveAdd) operation;
                        //operation defined outside class
                        obj.setResult(obj.getLeft() + obj.getRight());


                    } else if (operation instanceof NaiveSubtract) {
                        NaiveSubtract obj = (NaiveSubtract) operation;
                        //operation defined outside class
                        obj.setResult(obj.getLeft() - obj.getRight());
                    }
                    return operation.getResult();
                }
        ).filter(obj -> obj > 2.0d).forEach(System.out::println);
    }


}

interface CalculatorOperation {
    void calculate();

    double getResult();
}

interface NaiveCalculatorOperation {
    double getResult();
}

class NaiveAdd implements NaiveCalculatorOperation {
    private final double left;
    private final double right;
    private double result;

    NaiveAdd(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}


class NaiveSubtract implements NaiveCalculatorOperation {
    private final double left;
    private final double right;
    private double result;

    NaiveSubtract(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}


class Addition implements CalculatorOperation {
    private final double left;
    private final double right;
    private double result;

    Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public void calculate() {
        result = left + right;
    }


    public double getResult() {
        return result;
    }


}

class Subtraction implements CalculatorOperation {
    private final double left;
    private final double right;
    private double result;

    Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public void calculate() {
        result = left - right;
    }

    @Override
    public double getResult() {
        return result;
    }
}