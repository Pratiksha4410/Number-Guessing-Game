
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameTest extends Frame implements ActionListener
{
	Label label = new Label("Guass The Number...",Label.CENTER);
	TextField tf = new TextField();
	Button b = new Button("Check");
	//String str2 = "";
	//int myno = Integer.parseInt(tf.getText());
    int no2 = (int)(Math.random()*100+1);
    //int a = 0;
	GameTest()
	{
		setSize(380,280);
		setTitle("Number Gussing Game...");
		//setVisible(True);
		add(label);
		label.setBounds(30, 50, 250, 30);
		label.setFont(new Font("Time New Roman",Font.BOLD,25));
		add(tf);
		setLayout(null);
		tf.setBounds(50, 100, 200, 30);
		add(b);
		b.setBounds(100, 150, 100, 30);
		b.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});

	}

	public void actionPerformed(ActionEvent e)
	{
		int myno = Integer.parseInt(tf.getText());
		System.out.println(no2);
		if(myno==no2)
		{
			JOptionPane.showMessageDialog(this,"You Guessed The Correct Number");
		}
		else if(myno < 0 || myno > 100)
		{
			JOptionPane.showMessageDialog(this,"Invalid Gussed..");
		}
		else if(myno > no2)
		{
			JOptionPane.showMessageDialog(this,"You Enter Too High Number..");
		}
		else if(myno < no2)
		{
	  		JOptionPane.showMessageDialog(this,"You Enter Low Number..");
		}
	}
	public static void main(String[]args)
	{
		GameTest f = new GameTest();
		f.setVisible(true);
	}
}