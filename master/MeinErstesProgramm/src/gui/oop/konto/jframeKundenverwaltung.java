package gui.oop.konto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

import sun.swing.ImageIconUIResource;
import javax.swing.JLabel;

public class jframeKundenverwaltung extends JFrame {

	private JPanel contentPane;
	private JTextPane textPaneName;
	private JTextPane textPaneVorname;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane textPaneProzent;
	private JCheckBox checkBoxKatalogSchicken;
	private JRadioButton radioButtonBronzekunde;
	private JRadioButton radioButtonSilberkunde;
	private JRadioButton radioButtonGoldkunde;
	private JPanel panel;
	private JSlider slider;
	private JButton buttonNewButton;
	private JLabel labelfairytail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeKundenverwaltung frame = new jframeKundenverwaltung();
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
	public jframeKundenverwaltung() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 330);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			textPaneName = new JTextPane();
			textPaneName.setText("Name:");
			textPaneName.setEditable(false);
			textPaneName.setBounds(24, 88, 50, 20);
			contentPane.add(textPaneName);
		}
		{
			textPaneVorname = new JTextPane();
			textPaneVorname.setText("Vorname:");
			textPaneVorname.setEditable(false);
			textPaneVorname.setBounds(25, 119, 65, 20);
			contentPane.add(textPaneVorname);
		}
		{
			textField = new JTextField();
			textField.setBounds(100, 88, 86, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(100, 119, 86, 20);
			contentPane.add(textField_1);
		}
		
		{
			textPaneProzent = new JTextPane();
			textPaneProzent.setEditable(false);
			textPaneProzent.setBounds(24, 150, 50, 20);
			contentPane.add(textPaneProzent);
		}
		
		{
			checkBoxKatalogSchicken = new JCheckBox("Katalog schicken?");
			checkBoxKatalogSchicken.setBounds(24, 249, 145, 23);
			contentPane.add(checkBoxKatalogSchicken);
		}
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Kundenstatus", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(315, 91, 121, 98);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				radioButtonBronzekunde = new JRadioButton("Bronzekunde");
				radioButtonBronzekunde.setBounds(6, 16, 109, 23);
				panel.add(radioButtonBronzekunde);
			}
			{
				radioButtonSilberkunde = new JRadioButton("Silberkunde");
				radioButtonSilberkunde.setBounds(6, 68, 109, 23);
				panel.add(radioButtonSilberkunde);
			}
			{
				radioButtonGoldkunde = new JRadioButton("Goldkunde");
				radioButtonGoldkunde.setBounds(6, 42, 109, 23);
				panel.add(radioButtonGoldkunde);
			}
		}
		{
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					do_slider_stateChanged(e);
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMaximum(20);
			slider.setMinorTickSpacing(1);
			slider.setMajorTickSpacing(2);
			slider.setBounds(34, 191, 200, 51);
			contentPane.add(slider);
		}
		{

		}
		{
			buttonNewButton = new JButton("New button");
			buttonNewButton.setBounds(325, 200, 89, 23);
			contentPane.add(buttonNewButton);
		}
		{
			String pic;
			labelfairytail = new JLabel("");
			labelfairytail.setIcon(new ImageIcon(""));
			labelfairytail.setBounds(24, 0, 390, 80);
			contentPane.add(labelfairytail);
			
		}
	}
	protected void do_slider_stateChanged(ChangeEvent e) {
		int wert = slider.getValue();
		textPaneProzent.setText(Integer.toString(wert) + " %");
	}
}
