package Trains;
import javax.swing.*;
import java.awt.*;

public class Trains {
    public Trains(JFrame oldFrame){
        JFrame frame = new JFrame("Trains");
        frame.setSize(500, 900);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setLocationRelativeTo(oldFrame);
        frame.getContentPane().setBackground(Color.decode("#EBFFD8"));

        JPanel panel = new JPanel(new GridLayout(9, 18, 10, 10));
        panel.setBackground(null);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

    }
}
