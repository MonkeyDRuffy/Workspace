package erstegui.ersteGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;

import java.awt.Panel;

import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframeTaxi extends JFrame {
	private JComboBox comboBox;
	private JTextField textfieldkm;
	private JCheckBox checkBoxNachtfahrt;
	private JCheckBox checkBoxKindersitz;
	private JCheckBox checkBoxBar;
	private JTextField textfieldgast;
	private JTextPane entfernung;
	private JTextPane hi;
	private JPanel panel;
	private JTextField textfieldnetto;
	private JTextField textfieldMwst;
	private JTextPane textPaneNettobetrag;
	private JTextPane textPaneMehrwertsteuer;
	private JTextField textfieldbrutto;
	private JTextPane textPaneBruttobetrag;
	private JPanel panel_1;
	private JSeparator separator;
	private JTextPane textPaneAuswahlDesFahrzeugtyps;
	private JButton buttonBerechnen;
	private JButton buttonDrucken;
	private JButton buttonNeu;
	private JButton buttonEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeTaxi frame = new jframeTaxi();
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
	public jframeTaxi() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 430);
		getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eingaben", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(34, 12, 319, 176);
			getContentPane().add(panel);
			panel.setLayout(null);
			{
				comboBox = new JComboBox();
				comboBox.setBounds(199, 16, 114, 20);
				panel.add(comboBox);
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Taxi", "Grossraumtaxi", "Strechlimousine"}));
				comboBox.setMaximumRowCount(3);
			}
			{
				textfieldkm = new JTextField();
				textfieldkm.setBounds(227, 47, 86, 20);
				panel.add(textfieldkm);
				textfieldkm.setColumns(10);
			}
			{
				checkBoxNachtfahrt = new JCheckBox("Nachtfahrt");
				checkBoxNachtfahrt.setBounds(6, 88, 86, 23);
				panel.add(checkBoxNachtfahrt);
			}
			{
				checkBoxKindersitz = new JCheckBox("Kindersitz");
				checkBoxKindersitz.setBounds(6, 117, 86, 23);
				panel.add(checkBoxKindersitz);
			}
			{
				checkBoxBar = new JCheckBox("Bar");
				checkBoxBar.setBounds(6, 146, 86, 23);
				panel.add(checkBoxBar);
			}
			{
				textfieldgast = new JTextField();
				textfieldgast.setBounds(262, 147, 51, 20);
				panel.add(textfieldgast);
				textfieldgast.setColumns(10);
			}
			{
				entfernung = new JTextPane();
				entfernung.setBounds(6, 47, 135, 20);
				panel.add(entfernung);
				entfernung.setText("Entfernung in km");
			}
			{
				hi = new JTextPane();
				hi.setBounds(170, 146, 68, 20);
				panel.add(hi);
				hi.setText("Fahrg\u00E4ste");
			}
			{
				textPaneAuswahlDesFahrzeugtyps = new JTextPane();
				textPaneAuswahlDesFahrzeugtyps.setText("Auswahl des Fahrzeugtyps");
				textPaneAuswahlDesFahrzeugtyps.setBounds(6, 16, 150, 20);
				panel.add(textPaneAuswahlDesFahrzeugtyps);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Rechnungs\u00FCbersicht", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(33, 207, 199, 136);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			{
				textfieldnetto = new JTextField();
				textfieldnetto.setEditable(false);
				textfieldnetto.setBounds(118, 16, 75, 20);
				panel_1.add(textfieldnetto);
				textfieldnetto.setColumns(10);
			}
			{
				textfieldMwst = new JTextField();
				textfieldMwst.setEditable(false);
				textfieldMwst.setBounds(118, 47, 75, 20);
				panel_1.add(textfieldMwst);
				textfieldMwst.setColumns(10);
			}
			{
				textPaneNettobetrag = new JTextPane();
				textPaneNettobetrag.setBounds(6, 16, 102, 20);
				panel_1.add(textPaneNettobetrag);
				textPaneNettobetrag.setText("Nettobetrag");
			}
			{
				textPaneMehrwertsteuer = new JTextPane();
				textPaneMehrwertsteuer.setBounds(6, 47, 102, 20);
				panel_1.add(textPaneMehrwertsteuer);
				textPaneMehrwertsteuer.setText("Mehrwertsteuer");
			}
			{
				textfieldbrutto = new JTextField();
				textfieldbrutto.setEditable(false);
				textfieldbrutto.setBounds(118, 103, 75, 20);
				panel_1.add(textfieldbrutto);
				textfieldbrutto.setColumns(10);
			}
			{
				textPaneBruttobetrag = new JTextPane();
				textPaneBruttobetrag.setBounds(6, 103, 102, 20);
				panel_1.add(textPaneBruttobetrag);
				textPaneBruttobetrag.setText("Bruttobetrag");
			}
			{
				separator = new JSeparator();
				separator.setBounds(6, 90, 183, 2);
				panel_1.add(separator);
			}
		}
		{
			buttonBerechnen = new JButton("Berechnen");
			buttonBerechnen.setMnemonic('B');
			buttonBerechnen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonBerechnen_actionPerformed(e);
				}
			});
			buttonBerechnen.setBounds(262, 215, 102, 23);
			getContentPane().add(buttonBerechnen);
		}
		{
			buttonDrucken = new JButton("Drucken");
			buttonDrucken.setMnemonic('D');
			buttonDrucken.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonDrucken_actionPerformed(e);
				}
			});
			buttonDrucken.setBounds(262, 249, 102, 23);
			getContentPane().add(buttonDrucken);
		}
		{
			buttonNeu = new JButton("Neu");
			buttonNeu.setMnemonic('N');
			buttonNeu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonNeu_actionPerformed(e);
				}
			});
			buttonNeu.setBounds(262, 283, 102, 23);
			getContentPane().add(buttonNeu);
		}
		{
			buttonEnde = new JButton("Ende");
			buttonEnde.setMnemonic('E');
			buttonEnde.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_buttonEnde_actionPerformed(e);
				}
			});
			buttonEnde.setBounds(262, 317, 102, 23);
			getContentPane().add(buttonEnde);
		}
	}

	private boolean eingabetestengast(JTextField textfieldgast){
		try{
			Double.parseDouble(textfieldgast.getText());
			return true;
		}

		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,"Gast anzahl nicht angegeben oder buchstaben gesetzt", "Eingabe Fehler", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		catch(Exception e){
			System.err.println(e.getMessage());
			return false;
		}

	}

	private boolean eingabetestenkm(JTextField textfieldkm){
		try{
			Double.parseDouble(textfieldkm.getText());
			return true;
		}

		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,"KM zahl nicht angegeben oder buchstaben gesetzt", "Eingabe Fehler", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		catch(Exception e){
			System.err.println(e.getMessage());
			return false;
		}
	}


	protected void do_buttonBerechnen_actionPerformed(ActionEvent e) {
		eingabetestengast(textfieldgast);
		eingabetestenkm(textfieldkm);
		double brutto = 0;
		double netto = 0;
		double mwst = 0;
		double km = Double.parseDouble(textfieldkm.getText());
		int gast = Integer.parseInt(textfieldgast.getText());
		int kfz = comboBox.getSelectedIndex();

		if (kfz == 0){
			brutto = km * 0.5;
			if (checkBoxNachtfahrt.isSelected()){
				brutto = brutto * 1.1;
			}
			if (checkBoxKindersitz.isSelected()){
				brutto = brutto + 1;
			}
			if (checkBoxBar.isSelected()){
				brutto = brutto + (gast * 15);
			}
		}

		if (kfz == 1){
			brutto = km * 1;
			if (checkBoxNachtfahrt.isSelected()){
				brutto = brutto * 1.1;
			}
			if (checkBoxKindersitz.isSelected()){
				brutto = brutto + 1;
			}
			if (checkBoxBar.isSelected()){
				brutto = brutto + (gast * 15);
			}
		}

		if (kfz == 2){
			brutto = km * 2;
			if (checkBoxNachtfahrt.isSelected()){
				brutto = brutto * 1.1;
			}
			if (checkBoxKindersitz.isSelected()){
				brutto = brutto + 1;
			}
			if (checkBoxBar.isSelected()){
				brutto = brutto + (gast * 15);
			}
		}

		brutto = brutto + 3.9;
		netto = brutto * 100 / 107;
		mwst = brutto - netto;
		textfieldbrutto.setText(String.valueOf(Methoden.Runden.runden(brutto)));
		textfieldnetto.setText(String.valueOf(Methoden.Runden.runden(netto)));
		textfieldMwst.setText(String.valueOf(Methoden.Runden.runden(mwst)));

	}
	protected void do_buttonDrucken_actionPerformed(ActionEvent e) {

		int kfz= comboBox.getSelectedIndex();

		if(kfz == 0){
			System.out.println("Fahrzeugtyp: Taxi");
			System.out.println("Fahrweite in Km: " + textfieldkm.getText());
			System.out.println("Gast anzahl: " + textfieldgast.getText());

			if(checkBoxNachtfahrt.isSelected()){
				System.out.println("Mit Nachtfahrt");
			}else{
				System.out.println("ohne Nachtfahrt");
			}
			if(checkBoxKindersitz.isSelected()){
				System.out.println("Mit Kindersitz");
			}else{
				System.out.println("Ohne Kindersitz");
			}
			if(checkBoxBar.isSelected()){
				System.out.println("Mit Bar");
			}else{
				System.out.println("Ohne Bar");
			}

			System.out.println("Nettobetrag: " + textfieldnetto.getText());
			System.out.println("Bruttobetrag: " + textfieldMwst.getText());
			System.out.println("Mwst: " + textfieldMwst.getText());

		}
		if(kfz == 1){
			System.out.println("Fahrzeugtyp: Groﬂraumtaxi");
			System.out.println("Fahrweite in Km: " + textfieldkm.getText());
			System.out.println("Gast anzahl: " + textfieldgast.getText());

			if(checkBoxNachtfahrt.isSelected()){
				System.out.println("Mit Nachtfahrt");
			}else{
				System.out.println("ohne Nachtfahrt");
			}
			if(checkBoxKindersitz.isSelected()){
				System.out.println("Mit Kindersitz");
			}else{
				System.out.println("Ohne Kindersitz");
			}
			if(checkBoxBar.isSelected()){
				System.out.println("Mit Bar");
			}else{
				System.out.println("Ohne Bar");
			}

			System.out.println("Nettobetrag: " + textfieldnetto.getText());
			System.out.println("Bruttobetrag: " + textfieldMwst.getText());
			System.out.println("Mwst: " + textfieldMwst.getText());
		}
		if(kfz == 2){
			System.out.println("Fahrzeugtyp: Strechlimousine");
			System.out.println("Fahrweite in Km: " + textfieldkm.getText());
			System.out.println("Gast anzahl: " + textfieldgast.getText());

			if(checkBoxNachtfahrt.isSelected()){
				System.out.println("Mit Nachtfahrt");
			}else{
				System.out.println("ohne Nachtfahrt");
			}
			if(checkBoxKindersitz.isSelected()){
				System.out.println("Mit Kindersitz");
			}else{
				System.out.println("Ohne Kindersitz");
			}
			if(checkBoxBar.isSelected()){
				System.out.println("Mit Bar");
			}else{
				System.out.println("Ohne Bar");
			}

			System.out.println("Nettobetrag: " + textfieldnetto.getText());
			System.out.println("Bruttobetrag: " + textfieldMwst.getText());
			System.out.println("Mwst: " + textfieldMwst.getText());
		}

	}
	protected void do_buttonNeu_actionPerformed(ActionEvent e) {
		
		textfieldkm.setText(null);
		textfieldnetto.setText(null);
		textfieldMwst.setText(null);
		textfieldbrutto.setText(null);
		textfieldgast.setText(null);
		checkBoxNachtfahrt.setSelected(false);
		checkBoxBar.setSelected(false);
		checkBoxKindersitz.setSelected(false);
		
	}
	
	protected void do_buttonEnde_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

