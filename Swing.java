package globaltime;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Swing extends JFrame implements ActionListener{
	 int i = 0;
	 JLabel label;
	  public static void main(String args[]){
	    Swing frame = new Swing("カウントアップ");

	    frame.setVisible(true);

	  }

	  Swing(String title){
		    setTitle(title);
		    setBounds(100, 100, 300, 250);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JPanel p = new JPanel();
		    JPanel p2 = new JPanel();
		    label = new JLabel("");

		    JButton button1 = new JButton("カウントup");
		    button1.addActionListener(this);
		    button1.setActionCommand("button 1");
		    JButton button2 = new JButton("リセット");
		    button2.addActionListener(this);
		    button2.setActionCommand("button 2");

		    p.add(button1,BorderLayout.NORTH);
		    p.add(button2,BorderLayout.NORTH);
		    p2.add(label,BorderLayout.CENTER);


		    Container contentPane = getContentPane();
		    contentPane.add(p, BorderLayout.NORTH);
		    contentPane.add(p2, BorderLayout.CENTER);
		    label.setHorizontalAlignment(SwingConstants.CENTER);
	  }
	  public void actionPerformed(ActionEvent event) {
		  String cmd = event.getActionCommand();
		  if(cmd.equals("button 1")) {
			  i++;
			  label.setText(String.valueOf(i) + "回");
		  }else if(cmd.equals("button 2")) {
			  i = 0;
			  label.setText(String.valueOf(i) + "回");
		  }

	  }
}
