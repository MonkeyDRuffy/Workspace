package erstegui.ersteGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframeuebertrag extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton buttonNewButton;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeuebertrag frame = new jframeuebertrag();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jframeuebertrag() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 190, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(24, 13, 114, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			buttonNewButton = new JButton("\u00DCbertragen");
			buttonNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonNewButton_actionPerformed(e);
				}
			});
			buttonNewButton.setBounds(24, 46, 114, 26);
			contentPane.add(buttonNewButton);
		}
		{
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(24, 95, 114, 20);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
		}
	}
	protected void do_buttonNewButton_actionPerformed(ActionEvent e) {
		
		textField_1.setText(textField.getText());
		textField.setText(null);
	}
}
