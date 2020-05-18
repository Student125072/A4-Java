package oefeningen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.*;

public class Controller extends JPanel implements oefeningen1.Controller {
    JButton clickButton;
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        model.addObserver(this);
        view = new View();
        this.add(view);
        clickButton = new JButton("+1");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increase();
                // view.setDisplay(model.getCounter().toString());
            }
        });
        this.add(clickButton);
    }

    @Override
    public void update(Observable o, Object arg){
        view.setDisplay(model.getCounter().toString());
    }

}
