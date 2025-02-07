 
 import java.awt.*;
import java.awt.event.*;

public class HelloWorldFrame extends Frame {

    public HelloWorldFrame() {
        setTitle("Hello World AWT");
        setSize(300, 200);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Button button = new Button("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorldFrame();
    }
}
