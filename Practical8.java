import javax.swing.*;
import java.awt.*;

class A2P8 extends JFrame {
    JTextField principal, rate, time, result;

    A2P8() {
        setTitle("Investment Calculator");
        setLayout(new GridLayout(5, 2, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Principal (P):")); principal = new JTextField(); add(principal);
        add(new JLabel("Rate % (R):")); rate = new JTextField(); add(rate);
        add(new JLabel("Time in Years (T):")); time = new JTextField(); add(time);
        add(new JLabel("Amount (A = P(1+R/100)^T):")); result = new JTextField(); result.setEditable(false); add(result);

        JButton calc = new JButton("Calculate");
        calc.addActionListener(e -> {
            double p = Double.parseDouble(principal.getText());
            double r = Double.parseDouble(rate.getText());
            double t = Double.parseDouble(time.getText());
            double amount = p * Math.pow(1 + r / 100, t);
            result.setText(String.format("%.2f", amount));
        });
        add(calc);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new A2P8();
    }
}
