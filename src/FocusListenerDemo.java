import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class FocusListenerDemo extends JFrame {
    private Container c;
    private JButton btn;
    private JTextArea ta;

    FocusListenerDemo(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Focus Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        btn = new JButton();
        btn.setText("Button");
        btn.setBounds(10,50,100,50);
        c.add(btn);

        ta = new JTextArea();
        ta.setBounds(120,30,200,200);
        c.add(ta);

        btn.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                ta.append("Focus Gained\n");
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                ta.append("Focus Lost\n");
            }
        });
    }

    public static void main(String[] args) {
        FocusListenerDemo frame = new FocusListenerDemo();
        frame.setVisible(true);
    }
}
