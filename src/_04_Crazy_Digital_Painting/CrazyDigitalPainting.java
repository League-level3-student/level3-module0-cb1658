package _04_Crazy_Digital_Painting;
import java.awt.Color;

public class CrazyDigitalPainting {
    // 1. Create two final static integers for the width and height of the display.
	
	static final int WIDTH = 500;
	static final int HEIGHT = 500;

    // 2. Create a 2D array of Color objects. You will need to import
    //    java.awt.Color. Initialize the size of the array using the 
    //    integers created in step 1.
	
	Color[][] colors = new Color[WIDTH][HEIGHT];



    public CrazyDigitalPainting() {
        // 3. Open the crazy_digital_painting.png file and look at the image.

    	System.out.println("check");
    	
        // 4. Iterate through the 2D array and initialize each Color object
        //    to a new color. The sample image was created using the following 
        //    pattern:
        //    colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);

        // 5. Come up with your own pattern to make a cool crazy image.

    	for(int i = 0; i < WIDTH; i++) {
    		for(int j = 0; j < HEIGHT; j++) {
    			colors[i][j] = new Color(i%100, j%100, (i*j)%100);
    		}
    		
    	}
    	
        // 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
        //    to show off your picture.
    	
    	ColorArrayDisplayer.displayColorsAsImage(colors);
    	
    }

    public static void main(String[] args) {
        new CrazyDigitalPainting();
    }
}
