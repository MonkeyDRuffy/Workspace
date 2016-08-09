package erstegui.ersteGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframeTaschenrechner extends JFrame {

	private JPanel contentPane;
	private JTextPane textPaneZahl;
	private JTextPane textPaneZahl_1;
	private JTextField textFieldZahl1;
	private JTextField textFieldZahl2;
	private JButton buttonPLUS;
	private JButton buttonMAL;
	private JButton buttonMINUS;
	private JButton buttonGETEILT;
	private JTextField textFieldErgebnis;
	private JButton buttonNewButton;
	private JButton buttonEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeTaschenrechner frame = new jframeTaschenrechner();
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
	public jframeTaschenrechner() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			textPaneZahl = new JTextPane();
			textPaneZahl.setText("Zahl 1");
			textPaneZahl.setBounds(10, 11, 35, 20);
			contentPane.add(textPaneZahl);
		}
		{
			textPaneZahl_1 = new JTextPane();
			textPaneZahl_1.setText("Zahl 2");
			textPaneZahl_1.setBounds(10, 38, 35, 20);
			contentPane.add(textPaneZahl_1);
		}
		{
			textFieldZahl1 = new JTextField();
			textFieldZahl1.setBounds(55, 11, 86, 20);
			contentPane.add(textFieldZahl1);
			textFieldZahl1.setColumns(10);
		}
		{
			textFieldZahl2 = new JTextField();
			textFieldZahl2.setBounds(55, 38, 86, 20);
			contentPane.add(textFieldZahl2);
			textFieldZahl2.setColumns(10);
		}
		{
			buttonPLUS = new JButton("+");
			buttonPLUS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonPLUS_actionPerformed(e);
				}
			});
			buttonPLUS.setBounds(169, 11, 41, 23);
			contentPane.add(buttonPLUS);
		}
		{
			buttonMAL = new JButton("*");
			buttonMAL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonMAL_actionPerformed(e);
				}
			});
			buttonMAL.setBounds(169, 38, 41, 23);
			contentPane.add(buttonMAL);
		}
		{
			buttonMINUS = new JButton("-");
			buttonMINUS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonMINUS_actionPerformed(e);
				}
			});
			buttonMINUS.setBounds(220, 11, 41, 23);
			contentPane.add(buttonMINUS);
		}
		{
			buttonGETEILT = new JButton("/");
			buttonGETEILT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonGETEILT_actionPerformed(e);
				}
			});
			buttonGETEILT.setBounds(220, 38, 41, 23);
			contentPane.add(buttonGETEILT);
		}
		{
			textFieldErgebnis = new JTextField();
			textFieldErgebnis.setEditable(false);
			textFieldErgebnis.setBounds(31, 80, 110, 57);
			contentPane.add(textFieldErgebnis);
			textFieldErgebnis.setColumns(10);
		}
		{
			buttonNewButton = new JButton("Neu");
			buttonNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonNewButton_actionPerformed(e);
				}
			});
			buttonNewButton.setBounds(172, 80, 89, 23);
			contentPane.add(buttonNewButton);
		}
		{
			buttonEnde = new JButton("Ende");
			buttonEnde.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonEnde_actionPerformed(e);
				}
			});
			buttonEnde.setBounds(172, 114, 89, 23);
			contentPane.add(buttonEnde);
		}
	}
	protected void do_buttonPLUS_actionPerformed(ActionEvent e) {

		if(eingabePruefen(textFieldZahl1,textFieldZahl2) == true){

			String zahl1 = textFieldZahl1.getText();
			String zahl2 = textFieldZahl2.getText();

			double wert1 = Double.parseDouble(zahl1);
			double wert2 = Double.parseDouble(zahl2);

			double ergebnis = wert1 + wert2;


			textFieldErgebnis.setText(Double.toString(ergebnis));

		}
	}
	protected void do_buttonMAL_actionPerformed(ActionEvent e) {
		
		if(eingabePruefen(textFieldZahl1,textFieldZahl2) == true){

		String zahl1 = textFieldZahl1.getText();
		String zahl2 = textFieldZahl2.getText();

		double wert1 = Double.parseDouble(zahl1);
		double wert2 = Double.parseDouble(zahl2);

		double ergebnis = wert1 * wert2;

		textFieldErgebnis.setText(Double.toString(ergebnis));
		}

	}
	protected void do_buttonMINUS_actionPerformed(ActionEvent e) {
		
		if(eingabePruefen(textFieldZahl1,textFieldZahl2) == true){

		String zahl1 = textFieldZahl1.getText();
		String zahl2 = textFieldZahl2.getText();

		double wert1 = Double.parseDouble(zahl1);
		double wert2 = Double.parseDouble(zahl2);

		double ergebnis = wert1 - wert2;

		textFieldErgebnis.setText(Double.toString(ergebnis));
		}

	}
	protected void do_buttonGETEILT_actionPerformed(ActionEvent e) {
		
		if(eingabePruefen(textFieldZahl1,textFieldZahl2) == true){

		String zahl1 = textFieldZahl1.getText();
		String zahl2 = textFieldZahl2.getText();

		double wert1 = Double.parseDouble(zahl1);
		double wert2 = Double.parseDouble(zahl2);

		double ergebnis = wert1 / wert2;

		textFieldErgebnis.setText(Double.toString(ergebnis));
		}

	}
	protected void do_buttonNewButton_actionPerformed(ActionEvent e) {

		textFieldZahl1.setText(null);
		textFieldZahl2.setText(null);
		textFieldErgebnis.setText(null);

	}
	protected void do_buttonEnde_actionPerformed(ActionEvent e) {

		System.exit(0);

	}
	
	private boolean eingabePruefen(JTextField textFieldZahl1, JTextField textFieldZahl2){
		try{
			Double.parseDouble(textFieldZahl1.getText());
			return true;
		}

		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,"Bitte nur zahlen erfassen", "Eingabe Fehler", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		catch(Exception e){
			System.err.println(e.getMessage());
			return false;
		}

	}
}
