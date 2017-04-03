#include "enemy.h"
using namespace std;

enemy::enemy(int id) {
	alive = true;
	sf::RectangleShape alien;
	
}

sf::RectangleShape & enemy::getAlien()
{
	return alien;
}


void enemy::setLocation(float xpos, float ypos)
{
	alien.setPosition(xpos, ypos);
}


void enemy::draw(sf::RenderWindow &win)
{
	
	alien.setFillColor(sf::Color::Red);
	win.draw(alien);
	alien.setSize(sf::Vector2f(27, 27));
}

bool enemy::isAlive()
{
	return alive;
}

void enemy::kill() {
	alive = false;
}


