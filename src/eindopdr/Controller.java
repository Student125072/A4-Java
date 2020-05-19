package eindopdr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JPanel {

    JButton calculateBtn;
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        view = new View();
        this.add(view);

        calculateBtn = new JButton("Calculate");
        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = model.calculate(view.getNum1(), view.getOperator(), view.getNum2());
                view.setAnswer(answer);
            }
        });
        this.add(calculateBtn);
    }


}
