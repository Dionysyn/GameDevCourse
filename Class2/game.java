/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author kynanbertulli
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class firstGame extends JFrame{

	private Canvas canvas = new Canvas();

	public firstGame(){
		//turn program off when exited
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//set size of frame
		setBounds(0,0,1000, 800);  

		//put frame in the center of the screen
		setLocationRelativeTo(null);

		//add canvas component
		add(canvas);
                setVisible(true);
		// create 3 graphics buffers 
		canvas.createBufferStrategy(3);			//BufferStrategy is our mechanism to handle graphics buffering	
												// works in background
												// handles switching
		BufferStrategy bufferStrategy = canvas.getBufferStrategy();

                
		//set frame to visble
		
                
                while(true){
                	//canvas is a component of JFrame that we can use to draw graphics
                    bufferStrategy = canvas.getBufferStrategy();
                    Graphics graphics = bufferStrategy.getDrawGraphics();
                    super.paint(graphics); 					// used to call paint class and refresh paint
                    graphics.setColor(Color.red);
                    graphics.fillOval(200,200, 50, 100);	// int x, int y, int width, int height
                    bufferStrategy.show();
                }
                
	}


		//class to create simple shapes 
	
	// public void paint(Graphics graphics){
	// 	super.paint(graphics); 					// used to call paint class and refresh paint
	// 	graphics.setColor(Color.red);
	// 	graphics.fillOval(200,200, 50, 1000);	// int x, int y, int width, int height

	// }

	public static void main( String [] args){
		new firstGame();


}
}