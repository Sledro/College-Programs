#include "mainMenu.h"
#include "playGame.h"
using namespace std;

mainMenu::mainMenu(unsigned int width, unsigned int height)
{

	if (!font.loadFromFile("font.ttf"))
		cout << "Error loading font!";

	text.setFont(font);
	text.setString("Select an option from the  menu below using the number keys.");
	text.setCharacterSize(24);
	text.setFillColor(sf::Color::White);
	text.setPosition(230, 150);

	mMenu[0].setFont(font);
	mMenu[0].setFillColor(sf::Color::Green);
	mMenu[0].setString("1) Play");
	mMenu[0].setPosition(sf::Vector2f(330, 240));

	mMenu[1].setFont(font);
	mMenu[1].setFillColor(sf::Color::White);
	mMenu[1].setString("2) High Score Leaderboard");
	mMenu[1].setPosition(sf::Vector2f(330, 290));

	mMenu[2].setFont(font);
	mMenu[2].setFillColor(sf::Color::White);
	mMenu[2].setString("3) Exit");
	mMenu[2].setPosition(sf::Vector2f(330, 340));

}


mainMenu::~mainMenu()
{
}

//Draw main menu heading text and options to screen
void mainMenu::draw(sf::RenderWindow &window)
{
	window.draw(text);
	
	for (int i = 0; i < MAX_NUMBER_OF_ITEMS; i++)
	{
		window.draw(mMenu[i]);
	}
}

//Option 1 (Play New Game)
void mainMenu::playNewGame(sf::RenderWindow &window)
{
	window.clear();
	playGame play(0);
	play.newQuestion();
	play.draw(window);
	window.display();
}

playGame play()
{
	return playGame();
}