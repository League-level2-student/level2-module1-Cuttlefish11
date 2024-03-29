package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList<String> Guests = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	int num = 1;

	public GuestBook() {
		// TODO Auto-generated constructor stub
		panel.add(add);
		panel.add(view);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		add.setText("Add Name");
		view.setText("View Name");
		add.addActionListener(this);
		view.addActionListener(this);
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String q = JOptionPane.showInputDialog("Enter a name");
			Guests.add("Guest " + num + ": " + q);
			num+=1;
		}
		if (e.getSource() == view) {
			JOptionPane.showMessageDialog(null, Guests);
		}
	}
}
