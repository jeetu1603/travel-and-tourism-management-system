import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener {
    Paytm() {
        setBounds(500, 200, 800, 600);

        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        try {
            pane.setPage("https://paytm.com/rent-payment");
        } catch (Exception e) {
            // TODO: handle exception
            pane.setContentType("text/html");
            pane.setText("<html>couldn't load Error 404</html>");
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);

        JButton back = new JButton("back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }

    public static void main(String[] args) {
        new Paytm();
    }
}
