import javax.swing.*;

//Updated Author: Aidan Wadin
//Updated on: 11/22/2018
//Purpose: This class simply sets up the visual program window properly and launches the program

public class Launcher{

	public static void main(String[] args) {
		//Set up the output window properly
		JFrame gameFrame = new JFrame();
		gameFrame.setTitle("2048 Game");
		gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gameFrame.setSize(340, 400);
		gameFrame.setResizable(true);
		
		GameModel m = new GameModel();
		GamePanel v = new GamePanel();
		gameFrame.add(v);
		v.addKeyListener(new Controller(m,v));
		
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setVisible(true);
	}
}
