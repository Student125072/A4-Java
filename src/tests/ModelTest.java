package tests;

import eindopdr.Model;
import org.junit.Test;
import static org.junit.Assert.*;


class ModelTest {

    @Test
    public void testCalculate() {
        Model model = new Model();

        int answer = model.getAnswer();
        int num1 = 1;
        int num2 = 3;
        String operator = "*";
        model.calculate(num1, operator, num2);

        int newValue = model.getAnswer();
        // ik verwacht dat de waarde is veranderd naar 3
        assertEquals(answer+3, newValue);

        model.setAnswer(2);
        // ik verwacht dat de waarde is veranderd naar 2
        assertNotEquals(1, model.getAnswer());

    }

    @Test
    public void testReset(){
        Model model = new Model();
        int oldAnswer = model.getAnswer();
        model.setAnswer(3);
        assertNotEquals(1, oldAnswer);

        int newAnswer = model.getAnswer();
        model.reset();
        assertEquals(0, newAnswer);
    }

}

