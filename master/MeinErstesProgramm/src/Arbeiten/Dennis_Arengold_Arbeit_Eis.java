package Arbeiten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.SystemColor;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class Dennis_Arengold_Arbeit_Eis extends JFrame {

	private JPanel contentPane;
	private JTextPane textPaneKugeln;
	private JTextField textFieldKugeln;
	private JComboBox comboBox;
	private JCheckBox checkBoxSahne;
	private JCheckBox checkBoxStreusel;
	private JCheckBox checkBoxKrokant;
	private JPanel panel;
	private JCheckBox checkBoxAuerHaus;
	private JTextPane textPaneNetto;
	private JTextPane textPaneMwst;
	private JTextPane textPaneBrutto;
	private JTextField textFieldNetto;
	private JTextField textFieldMwSt;
	private JTextField textFieldBrutto;
	private JButton buttonBerechnen;
	private JPanel panel_1;
	private JButton buttonKassieren;
	private JButton buttonStornieren;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dennis_Arengold_Arbeit_Eis frame = new Dennis_Arengold_Arbeit_Eis();
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
	public Dennis_Arengold_Arbeit_Eis() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(SystemColor.menu);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eis", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(16, 11, 170, 165);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				textPaneKugeln = new JTextPane();
				textPaneKugeln.setBounds(6, 16, 46, 20);
				panel.add(textPaneKugeln);
				textPaneKugeln.setBackground(SystemColor.menu);
				textPaneKugeln.setEditable(false);
				textPaneKugeln.setText("Kugeln");
			}
			{
				textFieldKugeln = new JTextField();
				textFieldKugeln.setBounds(58, 16, 86, 20);
				panel.add(textFieldKugeln);
				textFieldKugeln.setColumns(10);
			}
			{
				comboBox = new JComboBox();
				comboBox.setBounds(16, 47, 130, 20);
				panel.add(comboBox);
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Waffel", "Pappbecher", "Schale"}));
			}
			{
				checkBoxSahne = new JCheckBox("Sahne");
				checkBoxSahne.setBounds(6, 82, 97, 23);
				panel.add(checkBoxSahne);
			}
			{
				checkBoxStreusel = new JCheckBox("Streusel");
				checkBoxStreusel.setBounds(6, 108, 97, 23);
				panel.add(checkBoxStreusel);
			}
			{
				checkBoxKrokant = new JCheckBox("Krokant");
				checkBoxKrokant.setBounds(6, 134, 97, 23);
				panel.add(checkBoxKrokant);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.menu);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Preis", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(231, 11, 170, 165);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			{
				checkBoxAuerHaus = new JCheckBox("Au\u00DFer Haus");
				checkBoxAuerHaus.setBounds(6, 16, 97, 23);
				panel_1.add(checkBoxAuerHaus);
			}
			{
				textPaneNetto = new JTextPane();
				textPaneNetto.setBackground(SystemColor.menu);
				textPaneNetto.setBounds(6, 46, 89, 20);
				panel_1.add(textPaneNetto);
				textPaneNetto.setEditable(false);
				textPaneNetto.setText("Netto");
			}
			{
				textPaneMwst = new JTextPane();
				textPaneMwst.setBackground(SystemColor.menu);
				textPaneMwst.setBounds(6, 77, 89, 20);
				panel_1.add(textPaneMwst);
				textPaneMwst.setEditable(false);
			}
			{
				textPaneBrutto = new JTextPane();
				textPaneBrutto.setBackground(SystemColor.menu);
				textPaneBrutto.setBounds(6, 108, 89, 20);
				panel_1.add(textPaneBrutto);
				textPaneBrutto.setEditable(false);
				textPaneBrutto.setText("Brutto");
			}
			{
				textFieldNetto = new JTextField();
				textFieldNetto.setEditable(false);
				textFieldNetto.setBounds(105, 46, 60, 20);
				panel_1.add(textFieldNetto);
				textFieldNetto.setColumns(10);
			}
			{
				textFieldMwSt = new JTextField();
				textFieldMwSt.setEditable(false);
				textFieldMwSt.setBounds(105, 77, 60, 20);
				panel_1.add(textFieldMwSt);
				textFieldMwSt.setColumns(10);
			}
			{
				textFieldBrutto = new JTextField();
				textFieldBrutto.setEditable(false);
				textFieldBrutto.setBounds(105, 108, 60, 20);
				panel_1.add(textFieldBrutto);
				textFieldBrutto.setColumns(10);
			}
			{
				buttonBerechnen = new JButton("Berechnen");
				buttonBerechnen.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						do_buttonBerechnen_actionPerformed(e);
					}
				});
				buttonBerechnen.setMnemonic('B');
				buttonBerechnen.setBounds(39, 139, 97, 23);
				panel_1.add(buttonBerechnen);
			}
		}
		{
			{
				panel_2 = new JPanel();
				panel_2.setBackground(SystemColor.menu);
				panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Rechnung", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_2.setBounds(38, 181, 355, 77);
				contentPane.add(panel_2);
				panel_2.setLayout(null);
				buttonKassieren = new JButton("Kassieren");
				buttonKassieren.setMnemonic('K');
				buttonKassieren.setBounds(6, 16, 343, 23);
				panel_2.add(buttonKassieren);
				{
					buttonStornieren = new JButton("Stornieren");
					buttonStornieren.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							do_buttonStornieren_actionPerformed(e);
						}
					});
					buttonStornieren.setMnemonic('S');
					buttonStornieren.setBounds(6, 47, 343, 23);
					panel_2.add(buttonStornieren);
				}
				buttonKassieren.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						do_buttonKassieren_actionPerformed(arg0);
					}
				});
			}
		}
	}
	private boolean eingabetestenKugeln(JTextField textfieldKugeln){
		try{
			Double.parseDouble(textfieldKugeln.getText());
			return true;
		}

		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,"Kugeln anzahl nicht angegeben oder buchstaben gesetzt", "Eingabe Fehler", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		catch(Exception e){
			System.err.println(e.getMessage());
			return false;
		}

	}
	
	protected void do_buttonKassieren_actionPerformed(ActionEvent arg0) {

		int behälter = comboBox.getSelectedIndex();
		System.out.println("Kassenbon:");

		if(behälter == 0){
			System.out.println(textFieldKugeln.getText() + " Kugeln: " + textFieldKugeln.getText() + " €");
			System.out.println("Waffel : 0,00 €");
			if(checkBoxSahne.isSelected()){
				System.out.println("Sahne: 0,50 €");
			}
			if(checkBoxStreusel.isSelected()){
				System.out.println("Streuseln: 0,20 €");
			}
			if(checkBoxKrokant.isSelected()){
				System.out.println("Krokant: 0,20 €");
			}
			System.out.println("Netto: " + textFieldNetto.getText());
			if(checkBoxAuerHaus.isSelected()){
				System.out.println("MwSt. 7%: "+ textFieldMwSt.getText());
			}else{
				System.out.println("MwSt. 19%: "+ textFieldMwSt.getText());
			}
		}
		if(behälter == 1){
			System.out.println(textFieldKugeln.getText() + " Kugeln: " + textFieldKugeln.getText() + " €");
			System.out.println("Becher : 0,50 €");
			
			if(checkBoxSahne.isSelected()){
				System.out.println("Sahne: 0,50 €");
			}
			if(checkBoxStreusel.isSelected()){
				System.out.println("Streuseln: 0,20 €");
			}
			if(checkBoxKrokant.isSelected()){
				System.out.println("Krokant: 0,20 €");
			}
			System.out.println("Netto: " + textFieldNetto.getText());
			if(checkBoxAuerHaus.isSelected()){
				System.out.println("MwSt. 7%: "+ textFieldMwSt.getText());
			}else{
				System.out.println("MwSt. 19%: "+ textFieldMwSt.getText());
			}
		}
		if(behälter == 2){
			System.out.println(textFieldKugeln.getText() + " Kugeln: " + textFieldKugeln.getText() +" €");
			System.out.println("Schale: 0,50 €");
			
			if(checkBoxSahne.isSelected()){
				System.out.println("Sahne: 0,50 €");
			}
			if(checkBoxStreusel.isSelected()){
				System.out.println("Streuseln: 0,20 €");
			}
			if(checkBoxKrokant.isSelected()){
				System.out.println("Krokant: 0,20 €");
			}
			System.out.println("Netto: " + textFieldNetto.getText());
			if(checkBoxAuerHaus.isSelected()){
				System.out.println("MwSt. 7%: "+ textFieldMwSt.getText());
			}else{
				System.out.println("MwSt. 19%: "+ textFieldMwSt.getText());
			}
		}

		
		System.out.println("===========================");
		System.out.println("Brutto: " + textFieldBrutto.getText());
		
		textFieldBrutto.setText(null);
		textFieldKugeln.setText(null);
		textFieldMwSt.setText(null);
		textFieldNetto.setText(null);
		checkBoxAuerHaus.setSelected(false);
		checkBoxKrokant.setSelected(false);
		checkBoxSahne.setSelected(false);
		checkBoxStreusel.setSelected(false);
		
	}



	protected void do_buttonBerechnen_actionPerformed(ActionEvent e) {
		eingabetestenKugeln(textFieldKugeln);

		double netto = 0;
		double brutto = 0;
		int kugeln = 0;
		double mwst = 0;


		int behälter = comboBox.getSelectedIndex();

		kugeln = Integer.valueOf(textFieldKugeln.getText());
		brutto = brutto + kugeln;

		if(behälter == 0){

			if(checkBoxSahne.isSelected()){
				brutto = brutto + 0.5;
			}
			if(checkBoxStreusel.isSelected()){
				brutto = brutto + 0.2;
			}
			if(checkBoxKrokant.isSelected()){
				brutto = brutto + 0.2;
			}
			if(checkBoxAuerHaus.isSelected()){
				netto = brutto*100/107;
				textPaneMwst.setText("MwSt. 7%:");
				mwst = brutto - netto;
			}else{
				netto = brutto*100/119;
				textPaneMwst.setText("MwSt. 19%:");
				mwst = brutto - netto;
			}


		}

		if(behälter == 1){
			brutto = brutto + 0.3;

			if(checkBoxSahne.isSelected()){
				brutto = brutto + 0.5;
			}
			if(checkBoxStreusel.isSelected()){
				brutto = brutto + 0.2;
			}
			if(checkBoxKrokant.isSelected()){
				brutto = brutto + 0.2;
			}
			if(checkBoxAuerHaus.isSelected()){
				netto = brutto*100/107;
				textPaneMwst.setText("MwSt. 7%:");
				mwst = brutto - netto;
			}else{
				netto = brutto*100/119;
				textPaneMwst.setText("MwSt. 19%:");
				mwst = brutto - netto;
			}


		}

		if(behälter == 2){
			brutto = brutto + 0.5;

			if(checkBoxSahne.isSelected()){
				brutto = brutto + 0.5;
			}
			if(checkBoxStreusel.isSelected()){
				brutto = brutto + 0.2;
			}
			if(checkBoxKrokant.isSelected()){
				brutto = brutto + 0.2;
			}
			if(checkBoxAuerHaus.isSelected()){
				netto = brutto*100/107;
				textPaneMwst.setText("MwSt. 7%:");
				mwst = brutto - netto;
			}else{
				netto = brutto*100/119;
				textPaneMwst.setText("MwSt. 19%:");
				mwst = brutto - netto;
			}


		}
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String bruttoString = formatter.format(brutto);
		NumberFormat formatter1 = NumberFormat.getCurrencyInstance();
		String MwStString = formatter.format(mwst);
		NumberFormat formatter2 = NumberFormat.getCurrencyInstance();
		String NettoString = formatter.format(netto);
		textFieldBrutto.setText(bruttoString);
		textFieldNetto.setText(NettoString);
		textFieldMwSt.setText(MwStString);
	}
	protected void do_buttonStornieren_actionPerformed(ActionEvent e) {

		textFieldBrutto.setText(null);
		textFieldKugeln.setText(null);
		textFieldMwSt.setText(null);
		textFieldNetto.setText(null);
		checkBoxAuerHaus.setSelected(false);
		checkBoxKrokant.setSelected(false);
		checkBoxSahne.setSelected(false);
		checkBoxStreusel.setSelected(false);
	}
}
