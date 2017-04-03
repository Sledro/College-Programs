#include <SFML/Graphics.hpp>
#include <iostream>

class enemy
{


private:


public:
	enemy() {};
	//enemy(int id);
	sf::RectangleShape alien;
	enemy(int id);
	sf::RectangleShape & getAlien();
	void draw(sf::RenderWindow & win);
	void setLocation(float, float);
	bool isAlive();
	void kill();
	float enemySpeed = 10.0f;
	int idd;
	bool alive = true;
};

