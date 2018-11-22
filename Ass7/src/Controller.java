import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//Updated Author: Aidan Wadin
//Updated on: 11/22/2018
//Purpose: This class is the controller, and it "controls" the interaction between the user, the data, and the view. Anything that happens first must go through
//This controller, then the model is updated and the view accordingly
public class Controller extends KeyAdapter {
		
	private GameModel model;
	private GamePanel view;
	
	//Controller takes control of both a model and a view
	public Controller(GameModel m, GamePanel v) 
	{
		this.model = m;
		this.view = v;
		updateView();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			model.resetGame();
		}
		if (!model.canMove()) {
			model.setLoss(true);
		}
		
		if (!model.getWin() && !model.getLoss()) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					model.left();
					break;
				case KeyEvent.VK_RIGHT:
					model.right();
					break;
				case KeyEvent.VK_DOWN:
					model.down();
					break;
				case KeyEvent.VK_UP:
					model.up();
					break;
			}
		}
		
		if (!model.getWin() && !model.canMove()) {
			model.setLoss(true);
		}
		updateView();
		view.repaint();
	}
		
	//This is done to transfer data from the model to the view, so that changes in the model are updated visually to the user
	public void updateView()
	{
		view.setWin(model.getWin());
		view.setLose(model.getLoss());
		view.setScore(model.getScore());
		view.setTiles(model.getTiles());
	}
	}


