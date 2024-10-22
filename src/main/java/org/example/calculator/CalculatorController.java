package org.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class CalculatorController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    public void onClickBut0() {
        appendToTextField("0");
    }

    @FXML
    private void onClickBut1() {
        appendToTextField("1");
    }

    @FXML
    public void onClickBut2() {
        appendToTextField("2");
    }
    @FXML
    public void onClickBut3() {
        appendToTextField("3");
    }

    @FXML
    public void onClickBut4() {
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
    public void onClickBut8() {
        appendToTextField("8");
    }

    @FXML
    public void onClickBut9() {
        appendToTextField("9");
    }

    @FXML
    public void onPlusClick() {
        setOperator('+');
    }

    @FXML
    public void onMinusClick() {
        setOperator('-');
    }

    @FXML
    public void onMultiplyClick() {
        setOperator('*');
    }

    @FXML
    public void onDivideClick() {
        setOperator('/');
    }

    @FXML
    public void onEqualClick() {
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
