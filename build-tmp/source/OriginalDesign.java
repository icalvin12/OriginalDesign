import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x = 250;
int y = 100;
int changeX = 10;
int changeY = 7;
int width = 50;
int height = 50;
boolean pause = false;

public void setup()
{
  size(500,500);
}

public void draw()
{
	if(pause == true)
	{
		pause();
	}
	else 
	{
		ball();		
	}
}

public void ball()
{
	fill(0,0,0,50);
	rect(0,0,500,500);
	noFill();
	stroke(255,255,255);
	ellipse(x, y, width, height);
	if(x>475)
	{
		changeX = changeX *-1;
	}
	if(x<25)
	{
		changeX = changeX *-1;
	}
	if(y>475)
	{
		changeY = changeY *-1;
	}
	if(y<25)
	{
		changeY = changeY *-1;
	}
	x = x + changeX;
	y = y + changeY;
}

public void pause()
{

	rect(200, 200, 40, 100);
	rect(260, 200, 40, 100);
}

public void keyPressed()
{
	if(key == 'p')
	{
		pause = !pause;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
