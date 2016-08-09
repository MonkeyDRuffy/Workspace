package gui.oop.konto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameSparkonto extends JFrame {
	
	private Sparkonto sparkonto;
	private Person person;
	private JPanel contentPane;
	private JTextPane textPaneInhaberr;
	private JTextPane textPaneInhaber;
	private JTextPane textPaneBetragg;
	private JTextPane textPaneBetrag;
	private JButton buttonEinzahlen;
	private JButton buttonAuszahlen;
	private JTextPane textPaneSaldoo;
	private JTextPane textPaneSaldo;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public JFrameSparkonto(Sparkonto sparkonto) {
		initGUI();
		this.sparkonto = sparkonto;
		initFields();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			textPaneInhaberr = new JTextPane();
			textPaneInhaberr.setBackground(SystemColor.menu);
			textPaneInhaberr.setText("Inhaber:");
			textPaneInhaberr.setEditable(false);
			textPaneInhaberr.setBounds(10, 11, 63, 20);
			contentPane.add(textPaneInhaberr);
		}
		{
			textPaneInhaber = new JTextPane();
			textPaneInhaber.setBackground(SystemColor.controlHighlight);
			textPaneInhaber.setEditable(false);
			textPaneInhaber.setBounds(83, 11, 341, 20);
			contentPane.add(textPaneInhaber);
		}
		{
			textPaneBetragg = new JTextPane();
			textPaneBetragg.setText("Betrag:");
			textPaneBetragg.setEditable(false);
			textPaneBetragg.setBackground(SystemColor.menu);
			textPaneBetragg.setBounds(10, 42, 63, 20);
			contentPane.add(textPaneBetragg);
		}
		{
			textPaneBetrag = new JTextPane();
			textPaneBetrag.setBackground(SystemColor.inactiveCaption);
			textPaneBetrag.setBounds(83, 42, 100, 20);
			contentPane.add(textPaneBetrag);
		}
		{
			buttonEinzahlen = new JButton("Einzahlen");
			buttonEinzahlen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonEinzahlen_actionPerformed(e);
				}
			});
			buttonEinzahlen.setBounds(216, 42, 100, 23);
			contentPane.add(buttonEinzahlen);
		}
		{
			buttonAuszahlen = new JButton("Auszahlen");
			buttonAuszahlen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						do_buttonAuszahlen_actionPerformed(e);
					} catch (NumberFormatException
							| KreditlimitUeberschrittenException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			buttonAuszahlen.setBounds(326, 42, 98, 23);
			contentPane.add(buttonAuszahlen);
		}
		{
			textPaneSaldoo = new JTextPane();
			textPaneSaldoo.setText("Dublonen:");
			textPaneSaldoo.setEditable(false);
			textPaneSaldoo.setBackground(SystemColor.menu);
			textPaneSaldoo.setBounds(10, 73, 63, 20);
			contentPane.add(textPaneSaldoo);
		}
		{
			textPaneSaldo = new JTextPane();
			textPaneSaldo.setEditable(false);
			textPaneSaldo.setBackground(SystemColor.controlHighlight);
			textPaneSaldo.setBounds(83, 73, 100, 20);
			contentPane.add(textPaneSaldo);
		}
	}
	
	private void initFields(){
		textPaneInhaber.setText(sparkonto.getInhaber().getVorname() + " , " + sparkonto.getInhaber().getNachname());
		textPaneSaldo.setText(String.valueOf(sparkonto.getKontostand()));
		
		
		
	}
	
	protected void do_buttonEinzahlen_actionPerformed(ActionEvent e) {
		
		textPaneBetrag.getText();
		sparkonto.einzahlen(Integer.valueOf(textPaneBetrag.getText()));
		textPaneSaldo.setText(String.valueOf(sparkonto.getKontostand()));
		textPaneBetrag.setText(null);
		
	}
	protected void do_buttonAuszahlen_actionPerformed(ActionEvent e) throws NumberFormatException, KreditlimitUeberschrittenException {
		
		textPaneBetrag.getText();
		sparkonto.abheben(Integer.valueOf(textPaneBetrag.getText()));
		textPaneSaldo.setText(String.valueOf(sparkonto.getKontostand()));
		textPaneBetrag.setText(null);
		
		
	}
}
