package gui.oop.konto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class JFrameStart extends JFrame {

	private JPanel contentPane;
	private JButton buttonSparkonto;
	private JButton buttonGirokonto;
	private JTextPane textPaneBitteWhlenSie;
	private Sparkonto sparkonto;
	private Person person;
	private Adresse adresse;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameStart frame = new JFrameStart();
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
	public JFrameStart() {
		initGUI();
	}
	private void initGUI() {
		setTitle("Kontoverwaltung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			buttonSparkonto = new JButton("Sparkonto");
			buttonSparkonto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonSparkonto_actionPerformed(e);
				}
			});
			buttonSparkonto.setBounds(30, 52, 100, 23);
			contentPane.add(buttonSparkonto);
		}
		{
			buttonGirokonto = new JButton("Girokonto");
			buttonGirokonto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonGirokonto_actionPerformed(e);
				}
			});
			buttonGirokonto.setBounds(162, 52, 100, 23);
			contentPane.add(buttonGirokonto);
		}
		{
			textPaneBitteWhlenSie = new JTextPane();
			textPaneBitteWhlenSie.setForeground(Color.DARK_GRAY);
			textPaneBitteWhlenSie.setEditable(false);
			textPaneBitteWhlenSie.setText("Bitte w\u00E4hlen sie die gew\u00FCnschte Kontoart:");
			textPaneBitteWhlenSie.setBounds(30, 11, 232, 20);
			contentPane.add(textPaneBitteWhlenSie);
		}
	}
	
	protected void do_buttonGirokonto_actionPerformed(ActionEvent e) {
	}
	
	protected void do_buttonSparkonto_actionPerformed(ActionEvent e) {
		
		
		adresse = new Adresse("Pokestraﬂe", "88", "AnimeWorld", "29975");
		person = new Person("Saitama","OnePunchMan", adresse);
		sparkonto = new Sparkonto(person);		
		sparkonto.einzahlen(500.00);
		JFrameSparkonto frame = new JFrameSparkonto(sparkonto);
		frame.setVisible(true);
		
	}
}
