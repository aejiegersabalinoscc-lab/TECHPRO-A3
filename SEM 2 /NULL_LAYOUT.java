import javax.swing.JButton;
import javax.swing.JFrame;

public class NULL_LAYOUT {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ABSOLUTE POSITIONING");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        // 1. DISABLE THE LAYOUT MANAGER
        frame.setLayout(null);
        JButton btn1 = new JButton("BUTTON 1");
        // 2. SET BOUNDS: (X, Y, WIDTH, HEIGHT)
        // (50, 50) IS THE TOP-LEFT CORNER: 150PX WIDE, 40PX TALL
        btn1.setBounds(50, 50, 150, 40);
        JButton btn2 = new JButton("BUTTON 2");
        // PLACE THIS ONE LOWER AND FURTHER RIGHT
        btn2.setBounds(150, 120, 150, 40);
        frame.add(btn1);
        frame.add(btn2);
        frame.setVisible(true);
	}
}
