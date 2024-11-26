import javax.swing.*;

public class FormThree extends JFrame {
    private JPanel MainPanel;

    //This is our constructor
    public FormThree ()
    {
        setContentPane(MainPanel);
        setTitle("Hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 600);
        setLocation(200, 500);
        setVisible(true);
    }
}

