package currencyconverter;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class CurrencyConverter {

    
    public static void main(String[] args) {
        
       
        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainWindow mainWindow = new MainWindow();
					mainWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    
}
