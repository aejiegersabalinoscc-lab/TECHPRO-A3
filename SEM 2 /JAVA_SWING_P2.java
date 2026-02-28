import javax.swing.*;
import java.awt.event.*;

public class JAVA_SWING_P2 {
    public static void main(String[] args) {
    
      
        JFrame frame = new JFrame("Example 2");
        JButton button = new JButton("Click Me");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button was clicked!");
            }
        });
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
