#include "bullet.h"

bullet::bullet()
{
	sf::RectangleShape missile;
	alive = true;
}


bullet::~bullet()
{
}

sf::RectangleShape & bullet::getMissile()
{
	return missile;
}

void bullet::setLocation(float xpos, float ypos)
{
	missile.setPosition(xpos, ypos);
}


void bullet::draw(sf::RenderWindow &win)
{

	missile.setFillColor(sf::Color::Red);
	win.draw(missile);
	missile.setSize(sf::Vector2f(5, 15));
}

bool bullet::isAlive()
{
	return alive;
}

void bullet::kill() {
	alive = false;
}