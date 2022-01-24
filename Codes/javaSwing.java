import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class javaSwing {

    public static void main(String[] args) {
        // ImageIcon ima = new ImageIcon("3.jpg");
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        JLabel labe = new JLabel();
        labe.setText("Bro Do u even code");

        labe.setFont(new Font("MV Boli", Font.PLAIN, 20));
        // labe.setIcon(ima);
        labe.setBackground(Color.BLACK);
        labe.setOpaque(true);
        labe.setHorizontalTextPosition(JLabel.CENTER);
        labe.setBorder(border);
        JFrame frame = new JFrame();
        frame.setTitle("Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.add(labe);
        ImageIcon img = new ImageIcon("PicsArt_02-18-04.36.34.jpg");
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(200, 200, 200));
        frame.setLocationRelativeTo(null);

    }
}
