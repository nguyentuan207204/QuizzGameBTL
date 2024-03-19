import javax.swing.*;
import java.awt.*;

public class Login {
    public Login(){
        JFrame f= new JFrame();
        JButton b= new JButton("Login");
        b.setForeground(new Color(1,1,1));

        b.setBounds(140,600,120,50);

        f.add(b);
        f.setSize(400,1000);
        f.setBackground();
        f.setLayout(null);
        f.setVisible(true);
    }
}
