
package currencyconverter;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AboutWindow extends JFrame {

	private JPanel contentPane;
	private static AboutWindow windowInstance = null;

	private AboutWindow() {
		setTitle("Dev info"); 
		setBounds(100, 100, 347, 260);
		setLocationRelativeTo(null);
		setResizable( false );

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setBounds(65, 12, 219, 33);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
		contentPane.add(lblTitle);
                
                
		JLabel lblLicenceMit = new JLabel("Team Hexalgo by Ruhul Amin");
		lblLicenceMit.setBounds(65, 77, 219, 33);
		lblLicenceMit.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLicenceMit);

	}

	// Check if the window is already created to launch only one instance of the window.
	public static AboutWindow getInstance() {
		if (windowInstance == null) {
			windowInstance = new AboutWindow();
		}
		 return windowInstance;
	}
}