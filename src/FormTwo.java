import javax.swing.*;

public class FormTwo extends JFrame {
    private JPanel MainPanel;

    //This is our constructor
    public FormTwo ()
    {
        setContentPane(MainPanel);
        setTitle("Hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 600);
        setLocation(200, 500);
        setVisible(true);
    }
}
