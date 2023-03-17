import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenDemo extends JFrame {
    private Container c;
    WindowListenDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Window Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {
                System.out.println("Window Opened \n");
            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.out.println("Window Closing\n");
            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {
                System.out.println("Window Closed\n");
            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {
                System.out.println("Window Iconified\n");
            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {
                System.out.println("Window Deiconified\n");
            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {
                System.out.println("Window Activated\n");
            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {
                System.out.println("Window Deactivated\n");
            }
        });
    }
    public static void main(String[] args) {
        WindowListenDemo frame = new WindowListenDemo();
        frame.setVisible(true);
    }
}
