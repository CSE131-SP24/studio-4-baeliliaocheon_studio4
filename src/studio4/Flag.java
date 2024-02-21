package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {

	public static void main(String[] args) {

		double smirk = 0.2;
		double move = 0.020; 
		double rotation = 30.0; 

		while (true) {
			StdDraw.clear(); 

			smirk = smirk + move;  

			if(smirk > 0.8) { 
				move = -move; 
				rotation = rotation + 45; 
			}


			if(smirk < 0.2) { 
				move = -move; 
				rotation = rotation + 45; 
			}


			StdDraw.setPenColor(Color.RED);
			StdDraw.filledRectangle(smirk, 0.5, 0.4, 0.3); 

			StdDraw.setPenColor(Color.GREEN);
			StdDraw.text(smirk - 0.28, 0.3, "$$$");
			StdDraw.text(smirk - 0.28, 0.7, "$$$");
			StdDraw.text(smirk + 0.28, 0.3, "$$$");
			StdDraw.text(smirk + 0.28, 0.7, "$$$");


			StdDraw.picture(smirk, 0.5, "resources/pngtree-hot-dog-food-realistic-element-png-image_5199484.png", 0.4, 0.3, rotation); 
			StdDraw.picture(smirk, 0.25, "resources/Screenshot 2023-09-28 at 12.04.34 PM.png", 0.2, 0.2); 
			StdDraw.picture(smirk, 0.75, "resources/Screenshot 2023-09-28 at 12.04.34 PM.png", 0.2, 0.2); 
			
	


			StdDraw.show(10);

		}
	}
}