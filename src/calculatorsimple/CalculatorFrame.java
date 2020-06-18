package calculatorsimple;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame {
    
    double firstNumber;
    double secondNumber;
    double result;
    String operator;
    private Object math;
    
    
    
    JTextField txt = new JTextField(20);
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton eqal = new JButton("=");
    JButton clear = new JButton("C");
    JButton root = new JButton("√");
    JButton dot = new JButton(".");
    JButton pm = new JButton("+-");
    JButton s = new JButton("BP");
    
    

    public CalculatorFrame(){
    
        super("Calculator");
        JPanel panel1 = new JPanel();
        txt.setPreferredSize(new Dimension(230,40));
        txt.setHorizontalAlignment(JTextField.RIGHT);
        txt.setEditable(false);
        txt.setFont(new Font("sansserif",Font.BOLD, 12));
        panel1.add(txt);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5,4));
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btn0);
        panel2.add(add);
        panel2.add(sub);
        panel2.add(mul);
        panel2.add(div);
        panel2.add(eqal);
        panel2.add(root);
        panel2.add(dot);
        panel2.add(pm);
        panel2.add(clear);
        panel2.add(s);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(panel1,BorderLayout.NORTH);
        panel.add(panel2,BorderLayout.CENTER);
        add(panel);
        
        btn1.addActionListener(new LisentOne());
        btn2.addActionListener(new LisentTwo());
        btn3.addActionListener(new LisentThree());
        btn4.addActionListener(new LisentFour());
        btn5.addActionListener(new LisentFive());
        btn6.addActionListener(new LisentSix());
        btn7.addActionListener(new LisentSeven());
        btn8.addActionListener(new LisentEight());
        btn9.addActionListener(new LisentNine());
        btn0.addActionListener(new LisentZero());
        add.addActionListener(new LisentAdd());
        sub.addActionListener(new LisentSub());
        mul.addActionListener(new LisentMul());
        div.addActionListener(new LisentDiv());
        eqal.addActionListener(new LisentEqal());
        clear.addActionListener(new LisentClear());
        root.addActionListener(new LisentRoot());
        dot.addActionListener(new LisentDot());
        pm.addActionListener(new LisentPM());
        s.addActionListener(new LisentS());
    }

   class LisentOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         String display =txt.getText()+btn1.getText();
        txt.setText(display);
        }
        
   }
   
    class LisentTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn2.getText();
            txt.setText(display);
        }
        
   }
    
     class LisentThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn3.getText();
            txt.setText(display);
        }
        
   }
     
      class LisentFour implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          String display = txt.getText()+btn4.getText();
          txt.setText(display); 
        }
        
   }
    
    
    class LisentFive implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn5.getText();
            txt.setText(display);
        }
        
   }
       
    class LisentSix implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn6.getText();
            txt.setText(display);
        }
        
   }
        
    class LisentSeven implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           String display = txt.getText()+btn7.getText();
            txt.setText(display); 
        }
        
         }
         
        
    class LisentEight implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn8.getText();
            txt.setText(display);
        }
        
   }
        
   
         
    class LisentNine implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn9.getText();
            txt.setText(display);
        }
        
   }
          
    class LisentZero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String display = txt.getText()+btn0.getText();
            txt.setText(display);
        }
        
   }
           
    class LisentAdd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            firstNumber = Double.parseDouble(txt.getText());
            txt.setText(null);
            operator = "+"; 
        }
        
   }
            
    class LisentSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            firstNumber = Double.parseDouble(txt.getText());
            txt.setText(null);
            operator = "-";
        }
        
   }
             
    class LisentMul implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            firstNumber = Double.parseDouble(txt.getText());
            txt.setText(null);
            operator = "*";
        }
        
   }
              
    class LisentDiv implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            firstNumber = Double.parseDouble(txt.getText());
            txt.setText(null);
            operator = "/";
        }
        
   }
               
    class LisentEqal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
               String answer;
       secondNumber=Double.parseDouble(txt.getText());
       if(operator=="+")
       {
       
           result = firstNumber+secondNumber;
           answer = String.format("%.2f",result);
           txt.setText(answer);
       }
       else if(operator=="-")
       {
       
           result = firstNumber-secondNumber;
           answer = String.format("%.2f",result);
           txt.setText(answer);
       }
       else if(operator=="*")
       {
       
           result = firstNumber*secondNumber;
           answer = String.format("%.2f",result);
           txt.setText(answer);
       }
       else if(operator=="/")
       {
       
           result = firstNumber/secondNumber;
           answer = String.format("%.2f",result);
           txt.setText(answer);
       }
       else if(operator=="%")
       {
       
           result = firstNumber%secondNumber;
           answer = String.format("%.2f",result);
           txt.setText(answer);
       }
    }  
        }
    
    class LisentClear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          txt.setText(null);
        }
        
   }
                 
    class LisentRoot implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        double ops = Double.parseDouble(String.valueOf(txt.getText()));
        ops = Math.sqrt(ops);
        txt.setText(String.valueOf(ops));
        }
        
   }
                  
    class LisentDot implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(!txt.getText().contains("."));
       {
       
           txt.setText(txt.getText()+dot.getText());
       }
        }
        
   }
                   
    class LisentPM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        double ops = Double.parseDouble(String.valueOf(txt.getText()));
       ops=ops*(-1);
       txt.setText(String.valueOf(ops)); 
        }
        
   }
                    
    class LisentS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String bsp = null;
       if(txt.getText().length()>0)
       {
       
           StringBuilder stb = new StringBuilder(txt.getText());
           stb.deleteCharAt(txt.getText().length()-1);
           bsp=stb.toString();
           txt.setText(bsp);
       }
        }   
   }
}