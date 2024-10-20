package org.example.calculator;

public class Calculator {

    private double op1;
    private double op2;
    private char operator;
    private double result;
    private boolean isError; // To track errors like division by zero

    // Method to perform calculation based on the operator
    public void calculate() {
        isError = false;

        if (this.operator == '+') {
            this.result = this.op1 + this.op2;
        } else if (this.operator == '-') {
            this.result = this.op1 - this.op2;
        } else if (this.operator == '*') {
            this.result = this.op1 * this.op2;
        } else if (this.operator == '/') {
            if (this.op2 == 0) {
                isError = true;
                this.result = 0;
            } else {
                this.result = this.op1 / this.op2;
            }
        } else {
            isError = true; // invalid operator
        }
    }

    // Getter and setter methods
    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public boolean isError() {
        return isError; // returns true if an error occurred
    }

    public void reset() {
        this.op1 = 0;
        this.op2 = 0;
        this.operator = ' ';
        this.result = 0;
        this.isError = false; // reset error state
    }
}

