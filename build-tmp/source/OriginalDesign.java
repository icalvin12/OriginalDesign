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
int r,g,b;
boolean pause = false;
boolean circle = true;

public void setup()
{
  size(500,500);
  rectMode(CENTER);
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
		mouseWheel();		
	}
}

public void ball()
{
	r = PApplet.parseInt(random(0, 255));
	g = PApplet.parseInt(random(0, 255));
	b = PApplet.parseInt(random(0, 255));
	fill(0,0,0,50);
	rect(250,250,550,550);
	noFill();
	stroke(r,g,b);
	if(circle==true)
	{
		ellipse(x, y, width, height);
	}
	else 
	{
		rect(x,y,width,height);
	}
	if(x>500-(width/2))
	{
		changeX = changeX *-1;
		x = x + changeX;
	}
	if(x<(width/2))
	{
		changeX = changeX *-1;
		x = x + changeX;
	}
	if(y>500-(width/2))
	{
		changeY = changeY *-1;
		y = y + changeY;
	}
	if(y<(width/2))
	{
		changeY = changeY *-1;
		y = y + changeY;
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

public void mousePressed()
{
	circle = !circle;
}

public void mouseWheel(MouseEvent event) 
{
  width = width + (2*event.getCount());
  height = height + (2*event.getCount());
  if(width > 200)
  {
  	width = 200;
  	height = 200;
  }
  if(width < 5)
  {
  	width = 5;
  	height = 5;
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
