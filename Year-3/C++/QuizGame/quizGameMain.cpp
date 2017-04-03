#include "SFML/Graphics.hpp"
#include <iostream>
#include "mainMenu.h"
#include "playGame.h"
#include "leaderBoard.h"

int activeWindow = 0;

int main()
{
	sf::RenderWindow window(sf::VideoMode(1024, 600), "Dan's Quiz Game");

	sf::Texture texture;
	
	if (!texture.loadFromFile("background2.png"))
		cout << "Error loading background!";
	sf::Sprite background(texture);

	mainMenu mMenuObj(window.getSize().x, window.getSize().y);

	//Display background and main menu
	window.draw(background);
	mMenuObj.draw(window);
	window.display();

	while (window.isOpen())
	{
		sf::Event event;

		while (window.pollEvent(event))
		{

			if (event.type == sf::Event::Closed)
				window.close();

			//Main Menu
			if(activeWindow == 0){
				switch (event.type)
				{
				case sf::Event::KeyReleased:
					switch (event.key.code)
					{
					case sf::Keyboard::Num1:
					{
						mMenuObj.playNewGame(window);
						activeWindow = 1;
						break;
					}
					case sf::Keyboard::Num2:
					{
						leaderBoard leaderss;
						leaderss.display(window);
						activeWindow = 2;
						break;
					}
					case sf::Keyboard::Num3:
					{
						window.close();
						break;
					}
					}
					break;
				}
			}
			//GameMenu
			else if (activeWindow == 1) {
				switch (event.type)
				{
				case sf::Event::KeyReleased:
					switch (event.key.code)
					{
					case sf::Keyboard::Num1:
						playGame().inputAnswer(1, window);
						break;
					case sf::Keyboard::Num2: 
						playGame().inputAnswer(2, window);
						break;
					case sf::Keyboard::Num3:
						playGame().inputAnswer(3, window);
						break;
					case sf::Keyboard::Num4:
						playGame().inputAnswer(4, window);
						break;
					case sf::Keyboard::Num0:
						window.clear();
						window.draw(background);
						mMenuObj.draw(window);
						window.display();
						activeWindow = 0;
						break;
					}
					break;
				}
			}
			//Leaderboard Menu
			else if (activeWindow == 2) {
				switch (event.type)
				{
				case sf::Event::KeyReleased:
					switch (event.key.code)
					{
					case sf::Keyboard::Num0:
						window.clear();
						window.draw(background);
						mMenuObj.draw(window);
						window.display();
						activeWindow = 0;
						break;
					}
					break;
				}
			}
		}
	}
}

int getActiveWindow(int activeWindow) {
	return activeWindow;
}