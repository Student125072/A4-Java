package eindopdr;

import javax.swing.*;

public class View extends JPanel {

    private JTextField operator;
    private JTextField num1;
    private JTextField num2;
    private JLabel answer_label;

    public View(){
        num1 = new JTextField(10);
        operator = new JTextField(1);
        num2 = new JTextField(10);
        answer_label = new JLabel("Answer will appear here.");
        this.add(num1);
        this.add(operator);
        this.add(num2);
        this.add(answer_label);
    }

    public void setAnswer(String answer){
        answer_label.setText(answer);
    }

    public Integer getNum1(){
        return Integer.parseInt(num1.getText());
    }

    public Integer getNum2(){
        return Integer.parseInt(num2.getText());
    }

    public String getOperator(){
        return operator.getText();
    }

}
