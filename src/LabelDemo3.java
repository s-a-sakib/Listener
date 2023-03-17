import javax.swing.*;
import java.awt.*;

class LabelDemo3 extends JFrame {
    private Container c;
    private JLabel label;
    private ImageIcon image;
    LabelDemo3(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Label Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        image = new ImageIcon(getClass().getResource("avro_icon.jpeg"));
        label = new JLabel("Avro Keyboard",image,JLabel.RIGHT);
        label.setBounds(50,50,400,250);
        c.add(label);

    }
    public static void main(String[] args) {
        LabelDemo3 frame = new LabelDemo3();
        frame.setVisible(true);
    }
}
