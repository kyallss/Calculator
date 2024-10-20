package org.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class CalculatorController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    private void onClickBut0() {
        appendToTextField("0");
    }

    @FXML
    private void onClickBut1() {
        appendToTextField("1");
    }

    @FXML
    private void onClickBut2() {
        appendToTextField("2");
    }
    @FXML
    private void onClickBut3() {
        appendToTextField("3");
    }

    @FXML
    private void onClickBut4() {
        appendToTextField("4");
    }

    @FXML
    private void onClickBut5() {
        appendToTextField("5");
    }

    @FXML
    private void onClickBut6() {
        appendToTextField("6");
    }

    @FXML
    private void onClickBut7() {
        appendToTextField("7");
    }

    @FXML
    private void onClickBut8() {
        appendToTextField("8");
    }

    @FXML
    private void onClickBut9() {
        appendToTextField("9");
    }

    @FXML
    private void onPlusClick() {
        setOperator('+');
    }

    @FXML
    private void onMinusClick() {
        setOperator('-');
    }

    @FXML
    private void onMultiplyClick() {
        setOperator('*');
    }

    @FXML
    private void onDivideClick() {
        setOperator('/');
    }

    @FXML
    private void onEqualClick() {
        String op2 = text.getText();
        calc.setOp2(Double.parseDouble(op2));
        calc.calculate();

        if (calc.isError()) {
            showError("Error: Division by zero or invalid operation!");
            text.setText("");
        } else {
            text.setText(String.valueOf(calc.getResult()));
        }
    }

    @FXML
    private void onClearClick() {
        text.setText("");
        calc.reset(); // Reset the calculator state
    }

    private void appendToTextField(String value) {
        String currentText = text.getText();
        text.setText(currentText + value);
    }

    private void setOperator(char operator) {
        String op1 = text.getText();
        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator(operator);
        text.setText(""); // Clear the text field for the second operand
    }
    public double getOp2() {
        return calc.getOp2();
    }

    public char getOperator() {
        return calc.getOperator();
    }

    public boolean isError() {
        return calc.isError(); // returns true if an error occurred
    }
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
