#pragma once
#include "SFML/Graphics.hpp"
using namespace std;
#include <iostream>
#define MAX_NUMBER_OF_ITEMS 3

class mainMenu
{
public:
	mainMenu(unsigned int width, unsigned int height);
	~mainMenu();
	void draw(sf::RenderWindow & window);
	void playNewGame(sf::RenderWindow & window);
	int GetPressedItem() { return selectedItemIndex; }
	int selectedItemIndex;

private:
	sf::Font font;
	sf::Text mMenu[MAX_NUMBER_OF_ITEMS];
	sf::Text text;
};