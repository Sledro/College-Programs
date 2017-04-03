#include <SFML/Graphics.hpp>
#include <iostream>


class bullet
{
public:
	bullet();
	~bullet();
	sf::RectangleShape & getMissile();
	void setLocation(float xpos, float ypos);
	void draw(sf::RenderWindow & win);
	bool isAlive();
	void kill();
	sf::RectangleShape missile;
	bool alive = true;
};

