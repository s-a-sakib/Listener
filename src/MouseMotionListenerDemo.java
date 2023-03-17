import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MouseMotionListenerDemo extends JFrame {
    private Container c;
    private JTextArea ta;
    private JTextField tf;

   MouseMotionListenerDemo(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Mouse Motion Listener");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        ta = new JTextArea();
        ta.setBounds(10,20,200,200);
        //ta.setBackground(Color.PINK);
        c.add(ta);

        tf = new JTextField();
        tf.setBounds(220,20,150,50);
        c.add(tf);

        ta.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                tf.setText("Mouse Dragged  " + mouseEvent.getX() + "  " + mouseEvent.getY());
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                tf.setText("Mouse Moved   "  + mouseEvent.getX() + "  " + mouseEvent.getY());
            }
        });
    }

    public static void main(String[] args) {
        MouseMotionListenerDemo frame = new MouseMotionListenerDemo();
        frame.setVisible(true);
    }
}
