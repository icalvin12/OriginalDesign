int x = 250;
int y = 100;
int changeX = 10;
int changeY = 7;
int width = 50;
int height = 50;
int r,g,b;
boolean pause = false;
boolean circle = true;

void setup()
{
	rectMode(CENTER);
	size(500,500);
}

void draw()

{	if(pause == true)
	{
		paused();
	}
	else
	{
		ball();	
	}
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

void ball()
{
	r = int(random(0, 255));
	g = int(random(0, 255));
	b = int(random(0, 255));
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

void paused()
{
	rect(280, 250, 40, 100);
	rect(220, 250, 40, 100);
}

void keyPressed()
{
	if(key == 'p')
	{
		pause = !pause;
	}
	if(pause==false)
	{
		if(key =='+')
		{
			width = width + 4;
  			height = height + 4;
		}
		if(key =='-')
		{
			width = width - 4;
  			height = height - 4;
		}
	}
}

void mousePressed()
{
	circle = !circle;
}
