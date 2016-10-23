import java.awt.event.*;

import javax.swing.*;

public class runit {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				window test = new window(new Game());
				test.runGame();
				ActionListener al = new ActionListener(){
					public void actionPerformed(ActionEvent e){
						test.runGame();
					}
				};
				Timer t = new Timer(200,al);
				t.start();
			}	
		});
	}
}
