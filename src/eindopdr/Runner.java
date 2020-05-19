package eindopdr;

import javax.swing.*;
import java.awt.*;

public class Runner {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.add(new Controller());
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

}
