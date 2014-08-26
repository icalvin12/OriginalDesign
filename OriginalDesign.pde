int x = 250;
int y = 100;
int changeX = 10;
int changeY = 7;
int width = 50;
int height = 50;
boolean pause = false;

void setup()
{
  size(500,500);
}

void draw()
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

void ball()
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

void pause()
{

	rect(200, 200, 40, 100);
	rect(260, 200, 40, 100);
}

void keyPressed()
{
	if(key == 'p')
	{
		pause = !pause;
	}
}