package eindopdr;


import java.beans.PropertyChangeSupport;

public class Model {
    int answer = 0;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public String calculate(int num1, String operator, int num2) {


        switch (operator) {
            case "/" -> answer = num1 / num2;
            case "-" -> answer = num1 - num2;
            case "+" -> answer = num1 + num2;
            case "*" -> answer = num1 * num2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        }

        return num1 + operator + num2 + " = " + this.getAnswer();
    }

    public Integer getAnswer(){
        return answer;
    }

    public void setAnswer(int number){
        int currentAnswer = this.answer;
        this.answer = number;
        this.pcs.firePropertyChange("answer", currentAnswer, this.answer);
    }

    public void reset(){
        setAnswer(0);
    }

}
