package org.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

        private CalculatorController calculator;

        @BeforeEach
        public void setUp() {
            calculator = new CalculatorController();
            // Initialize the calculator controller 
        }

        @Test
        public void testAddition() {
            calculator.onClickBut2(); 
            calculator.onPlusClick(); 
            calculator.onClickBut3(); 
            calculator.onEqualClick(); 
            assertEquals("5", calculator.getText()); // Result should be '5'
        }

        @Test
        public void testSubtraction() {
            calculator.onClickBut9(); 
            calculator.onMinusClick(); 
            calculator.onClickBut4(); 
            calculator.onEqualClick(); 
            assertEquals("5", calculator.getText()); // Result should be '5'
        }

        @Test
        public void testMultiplication() {
            calculator.onClickBut3(); 
            calculator.onMultiplyClick(); 
            calculator.onClickBut4(); 
            calculator.onEqualClick(); 
            assertEquals("12", calculator.getText()); // Result should be '12'
        }

        @Test
        public void testDivisionByZero() {
            calculator.onClickBut8(); 
            calculator.onDivideClick(); 
            calculator.onClickBut0(); 
            calculator.onEqualClick(); 
            assertTrue(calculator.isError()); // Should set error flag for division by zero
        }


    }
