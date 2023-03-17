import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListenerDemo extends JFrame {
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;

    MouseListenerDemo(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Mouse Listener");

        Container c = this.getContentPane();
        c.setLayout(null);

        tf = new JTextField();
        tf.setBounds(20,20,150,50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBackground(Color.PINK);

        scroll = new JScrollPane(ta);
        scroll.setBounds(20,80,200,200);
        c.add(scroll);

        tf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ta.append("Mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.append("Mouse Released\n");
            }
        });

    }
}
