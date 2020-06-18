
package calculatorsimple;

import javax.swing.JFrame;

public class CalculatorSimple {

    public static void main(String[] args) {
       CalculatorFrame c = new CalculatorFrame();
       c.setSize(250, 300);
       c.setLocationRelativeTo(null);
       c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c.setVisible(true);
    }
}
