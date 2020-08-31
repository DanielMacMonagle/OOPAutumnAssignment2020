import java.awt.FlowLayout;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MyGui extends JFrame implements ActionListener {




    public MyGui() {

    JFrame addingJButton = new JFrame("Button Question");
    JButton button1 = new JButton("Click me for message");
    
    button1.setBounds(300,200,300,200);
    addingJButton.add(button1);

    addingJButton.getContentPane().setLayout(new FlowLayout());
    addingJButton.setSize(300,200);
    addingJButton.setLocationRelativeTo(null);

    addingJButton.setVisible(true);

    button1.addActionListener(this);

    


    }

    public static void main(String args[]) {

    new MyGui();
}



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Button has been clicked");
    }
}