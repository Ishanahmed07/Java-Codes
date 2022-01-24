import java.awt.*;
import javax.swing.*;

class t extends Jframe {
    JTextArea textArea;
    JScrollPane scrollPane;

    t() {

        this.setSize(new Dimension(500, 500));
        this.setTitle("Editor");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        this.setFont(new Font("Arial", Font.PLAIN, 50));
        this.setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(400, 400));
        textArea.setLineWrap(true);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(350, 350));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        this.add(textArea);
        this.setVisible(true);

    }
}

public class t1 {
    public static void main(String[] args) {
        new t();
    }
}
