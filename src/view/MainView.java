// imports packages
package view;

import javax.swing.JFrame;

public class MainView {
	
	private JFrame frame;
	
	public MainView(String title) {
			frame = new JFrame(title);

			// set a title for the frame
			//frame.setTitle("Hello World!");

			// set the size of the window to 800 x 600
			frame.setSize(800, 600);

			// display the window
			frame.setVisible(true);
	}

}