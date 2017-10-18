package brickGame;

import javax.swing.JFrame;

public class brickMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameEngine gameEngine = new GameEngine();
		JFrame obj = new JFrame();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameEngine);  // needs to be a panel
		
		
		
	}

}
