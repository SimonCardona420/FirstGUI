import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame
{
    private JPanel MainPanel;
    private JButton button1Button;
    private JButton button2Button;
    private JButton button3Button;
    private JButton button4Button;
    private JButton exitButton;

//    //This is our constructor
    public MenuForm ()
   {
        setContentPane(MainPanel);
        setTitle ("Hello");
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setSize ( 300, 600 );
        setLocationRelativeTo ( null );
        setVisible ( true );


        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0); //Close the application
            }
        });


        button1Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog( null, "You pressed button 1" );
                new FormOne();
            }
        });


        button2Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog( null, "You pressed button 2" );
                new FormTwo();
            }
        });


        button3Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog( null, "You pressed button 3" );
                new FormThree();
            }
        });


        button4Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog( null, "You pressed button 4" );
                new FormFour();
            }
        });
    }

    public static void main (String[]args )
    {
        //This is our entry point into the program
        new MenuForm ();
    }
}
