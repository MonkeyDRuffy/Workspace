package Rechnen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Main extends JFrame {

static JTextField time = new JTextField();
static JButton but1 = new JButton("Größe festlegen");
static int countdown;
static int countdownReset;
static boolean stopp = false;

public static void main(String[] args) throws IOException {
Main main = new Main();
}

public Main() {
super("Erstellen Array");

time.setFont(new Font("SansSerif", Font.BOLD, 20));
time.setMargin(new Insets(5, 2, 5, 2));
time.setPreferredSize(new Dimension(65, 30));
time.setText(String.valueOf(1));
setResizable(false);

but1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
starten();
}
});
setLayout(new FlowLayout());

add(time);
add(but1);

setSize(300, 80);
centreWindow(Main.this);
setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

addWindowListener(
new WindowAdapter() {

@Override
public void windowClosing(WindowEvent we) {
if (!stopp) {

}
System.exit(0);
}
});

setVisible(true);

}

public static int testNumber(String str) {
try {
return Integer.parseInt(str);
} catch (NumberFormatException e) {
return -1;
}
}

public static void centreWindow(Window frame) {
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
frame.setLocation(x, y);
}

public static void starten() {
countdown = testNumber(time.getText());
countdownReset = countdown;
if (countdown >= 0) {
try {
Runtime.getRuntime().exec("shutdown /s /t " + countdown + " /c \"Shutdown in " + countdown + " Sekunden\"");
time.setEnabled(false);
but1.setEnabled(false);
Thread th = new Thread() {

@Override
public void run() {
long millicount = countdown * 1000;
for (long i = millicount; i >= 0 && !stopp; i -= 1) {
try {
Thread.sleep(1000);
countdown--;
time.setText(String.valueOf(countdown));
} catch (InterruptedException e) {
}
}
stopp = false;
time.setText(String.valueOf(countdownReset));
}
};
th.start();

} catch (IOException ex) {
}
} else {
String zahl = "5";
for (int i = 0; i < time.getText().length(); i++) {
if (Character.isDigit(time.getText().charAt(i))) {
zahl += time.getText().charAt(i);
}
}
time.setText(zahl);
}
}



}
