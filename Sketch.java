import processing.core.PApplet;

/**
 * A sketch of a house with a background of the sun and the sky on a grass floor adjusting to the size of the variable (width, height).
 * @author RyanChan25
 * 
 */
public class Sketch extends PApplet {
	
  
  public void settings() {
	// Size of sketch
    size(550, 750);
  }

  public void setup() {
    // Sky background
    background(135, 206, 235);
  }

  public void draw() {

    // Circle Sun
    stroke(255, 255, 0);
    fill(255, 255, 0);
    ellipse((float) (width / (57.0 / 10.0)), (float) (height / (57.0 / 10.0)), (float) (width / 4.0), (float) (height / 4.0));

    // Rectangle Grass floor
    stroke(86, 125, 70);
    fill(86, 125, 70);
    rect((float) (width * 0), (float) (height / (8.0 / 7.0)), (float) (width / 1.0), (float) (height / 8.0));

    // Rectangle House base
    stroke(0);
    fill(168, 86, 50);
    rect((float) (width / 4.0), (float) (height / (8.0 / 3.0)), (float) (width / 2.0), (float) (height / 2.0));  
  
    // Traingle House roof
    stroke(0);
    triangle((float) (width / 4.0), (float) (height / (8.0 / 3.0)), (float) (width / 2.0), (float) (height / 8.0), (float) (width / (4.0 / 3.0)), (float) (height / (8.0 / 3.0)));

    // Rectangle House door
    stroke(0);
    fill(0);
    rect((float) (width / (80.0 / 37.0)), (float) (height / (4.0 / 3.0)), (float) (width / (40.0 / 3.0)), (float) (height / 8.0));

    // Rectangle House steps
    stroke(0);
    fill(211);
    rect((float) (width / (16.0 / 7.0)), (float) (height / (8.0 / 7.0)), (float) (width / 8.0), (float) (height / 16.0));
  
    stroke(0);
    fill(211);
    rect((float) (width / (16.0 / 7.0)), (float) (height / (16.0 / 15.0)), (float) (width / 8.0), (float) (height / 16.0));

    // Rectangle House base windows
    // Left window
    stroke(0);
    fill(255);
    rect((float) (width / (10.0 / 3.0)), (float) (height / (40.0 / 17.0)), (float) (width / 8.0), (float) (height / 8.0));
    
    // Right Window
    stroke(0);
    fill(255);
    rect((float) (width / (40.0 / 23.0)), (float) (height / (40.0 / 17.0)), (float) (width / 8.0), (float) (height / 8.0));

    // Rectangle House base window lines
    // Left Window lines
    stroke(0);
    line((float) (width / (80.0 / 29.0)), (float) (height / (40.0 /  17.0)), (float) (width / (80.0 / 29.0)), (float) (height / (20.0 / 11.0)));

    stroke(0);
    line((float) (width / (10.0 / 3.0)), (float) (height / (80.0 / 39.0)), (float) (width / (40.0 / 17.0)), (float) (height / (80.0 / 39.0)));

    // Right Window Lines
    stroke(0);
    line((float) (width / (80.0 / 51.0)), (float) (height / (40.0 / 17.0)), (float) (width / (80.0 / 51.0)), (float) (height / (20.0 / 11.0)));
    
    stroke(0);
    line((float) (width / (40.0 / 23.0)), (float) (height / (80.0 / 39.0)), (float) (width / (10.0 / 7)), (float) (height / (80.0 / 39.0)));    

    // Circle House roof window
    stroke(0);
    fill(255);
    ellipse((float) (width / 2.0), (float) (height / (40.0 / 11.0)), (float) (width / 8.0), (float) (height / 8.0));

    // House roof window lines
    stroke(0);
    line((float) (width / 2.0), (float) (height / (80.0 / 17.0)), (float) (width / 2.0), (float) (height / (80.0 / 27.0)));

    stroke(0);
    line((float) (width / (16.0 / 7.0)), (float) (height / (40.0 / 11.0)), (float) (width / (16.0 / 9.0)), (float) (height / (40.0 / 11.0)));

    
  }
  
  
}