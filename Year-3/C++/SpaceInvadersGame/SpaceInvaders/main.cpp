//Daniel Hayden 2017
//C00137009
//

#include <SFML/Graphics.hpp>
#include <iostream>
#include "string"
#include "enemy.h"
#include "bullet.h"

using namespace std;

int main()
{
	sf::Font font;
	if (!font.loadFromFile("ca.ttf"))
	{
		// error...
	}
	sf::Text gameOverText;
	sf::Text winnerText;
	// select the font
	gameOverText.setFont(font); // font is a sf::Font
	gameOverText.setString("GAME OVER!");
	gameOverText.setCharacterSize(30); // in pixels, not points!
	// set the text style
	gameOverText.setStyle(sf::Text::Bold);
	gameOverText.setPosition(200, 150);
	// select the font
	winnerText.setFont(font); // font is a sf::Font
	winnerText.setString("WINNER WIINER!");
	winnerText.setCharacterSize(30); // in pixels, not points!
									   // set the text style
	winnerText.setStyle(sf::Text::Bold);
	winnerText.setPosition(160, 190);

	int const NUMBER_OF_ENEMY_COLS = 5;
	int const NUMBER_OF_ENEMY_ROWS = 5;
	int const NUMBER_OF_ALIENS = 25;
	int lvl = 0;
	bool isFired=false;
	bool gameOver=false;
	bool winner = false;
	int furthestAlive = 4;
	int closestAlive = 0;

	//create Window
	sf::RenderWindow window(sf::VideoMode(600, 400), "First Graphics in C++");

	bullet missile;

	// setup any shapes.
	//Player
	sf::RectangleShape player(sf::Vector2f(80, 40));
	float playerX = 0;
	float playerY = 360;
	float playerSpeed = 10.0f;
	player.setFillColor(sf::Color::Green);

	player.setPosition(playerX, playerY);

	int whatsAlive[5]= { 5, 5, 5, 5, 5 };;

	//create a an array of enemys
	enemy alienArray[NUMBER_OF_ENEMY_ROWS][NUMBER_OF_ENEMY_COLS] = {};
	for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++){
		for (int i = 0; i<NUMBER_OF_ENEMY_COLS; i++){

			enemy alien(i);
			alien.setLocation(i * 50 + 30, x * 50);
			alienArray[x][i] = alien;
		}
		
	}

	// set timepeFrame to 1 60th of a second. 60 frames per second
	sf::Time timePerFrame = sf::seconds(1.0f / 60.0f);
	sf::Time timeSinceLastUpdate = sf::Time::Zero;

	// the clock object keeps the time.
	sf::Clock clock;
	clock.restart();
	// the clock object keeps the time.
	sf::Clock aliens;
	aliens.restart().asSeconds();

	while (window.isOpen())
	{
		// chek if the close window button is clicked on.
		sf::Event event;
		while (window.pollEvent(event))
		{
			if (event.type == sf::Event::Closed)
				window.close();
		}

		//get the time since last update and restart the clock
		timeSinceLastUpdate += clock.restart();

		//update every 60th of a second
		//only when the time since last update is greate than 1/60 update the world.
		if (timeSinceLastUpdate > timePerFrame)
		{

			if (gameOver == false) {
				// get keyboard input.
				if (sf::Keyboard::isKeyPressed(sf::Keyboard::Left))
				{

					if (playerX < 0) {
						playerX = 520;
					}

					playerX = playerX - playerSpeed;

				}
				if (sf::Keyboard::isKeyPressed(sf::Keyboard::Right))
				{

					if (playerX > 520) {
						playerX = 0;
					}

					playerX = playerX + playerSpeed;

				}

				if (!isFired) {

					if (sf::Keyboard::isKeyPressed(sf::Keyboard::Space)) {

						missile.setLocation(player.getPosition().x + 40, player.getPosition().y - 20);
						isFired = true;

					}
				}


				// update any variables...
				player.setPosition(playerX, playerY);

				window.display();

				//Bebug cols
				int result = 0;
				for (int n = 0; n < 5; ++n){
					cout << "[" << whatsAlive[n] << "]";
				}
				cout << endl;


				if (whatsAlive[0] == 0 && whatsAlive[1] == 0 && whatsAlive[2] == 0 && whatsAlive[3] == 0 && whatsAlive[4] == 0) {
					gameOver = true;
					winner = true;
				}
				
				
				sf::Time t = aliens.getElapsedTime();

				bool dirRight;

				//Update current furthest full col alive
				if (whatsAlive[4] == 0) {
					furthestAlive = 3;

					if (whatsAlive[3] == 0) {
						furthestAlive = 2;

						if (whatsAlive[2] == 0) {
							furthestAlive = 1;

							if (whatsAlive[1] == 0) {
								furthestAlive = 0;
							}
						}
					}
				}

				//Update current closest full col alive
				if (whatsAlive[0] == 0) {
					closestAlive = 1;

					if (whatsAlive[1] == 0) {
						closestAlive = 2;

						if (whatsAlive[2] == 0) {
							closestAlive = 3;

							if (whatsAlive[3] == 0) {
								closestAlive = 4;
							}
						}
					}
				}

				//When left edge is reached
				if (alienArray[0][closestAlive].getAlien().getPosition().x == 1) {
					//Change direction
					dirRight = true;

					//Drop down a level
					for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++)
					{
						for (int i = 0; i < NUMBER_OF_ENEMY_COLS; i++)
						{
							alienArray[x][i].getAlien().setPosition(alienArray[x][i].getAlien().getPosition().x, alienArray[x][i].getAlien().getPosition().y + 27);

						}

					}
				}


				//When right edge is reached
				if (alienArray[0][furthestAlive].getAlien().getPosition().x == 570) {
					//Change direction
					dirRight = false;

					//Drop down a level
					for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++)
					{
						for (int i = 0; i < NUMBER_OF_ENEMY_COLS; i++)
						{
							alienArray[x][i].getAlien().setPosition(alienArray[x][i].getAlien().getPosition().x, alienArray[x][i].getAlien().getPosition().y + 27);

						}

					}
				}

				if (dirRight) {
					//Move Right
					for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++)
					{
						for (size_t i = 0;i < NUMBER_OF_ENEMY_COLS;i++)
						{
							alienArray[x][i].getAlien().move(1, 0);
						}

					}
				}
				else {
					//Move Left
					for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++)
					{
						for (size_t i = 0;i < NUMBER_OF_ENEMY_COLS;i++)
						{
							alienArray[x][i].getAlien().move(-1, 0);
						}

					}
				}


				//Check for bottom collission
				for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++)
				{
					for (size_t i = 0;i < NUMBER_OF_ENEMY_COLS;i++)
					{

						if (alienArray[x][i].getAlien().getPosition().y + alienArray[x][i].getAlien().getGlobalBounds().height > 350 && alienArray[x][i].isAlive())
						{
							if (!gameOver) {
								gameOver = true;
								winner = false;
							}
						}
					}
				}

				// clear the screen and  all the shapes
				window.clear();
				window.draw(player);


				if (gameOver) {
					window.draw(gameOverText);
					if(winner)
						window.draw(winnerText);
				}

				//Missile movement
				if (isFired && missile.alive) {
					missile.draw(window);
					missile.getMissile().move(0, -10);
				}


				if (missile.getMissile().getPosition().y < 0)

					isFired = false;

					for (int x = 0; x < NUMBER_OF_ENEMY_ROWS; x++){
						for (size_t i = 0;i < NUMBER_OF_ENEMY_COLS;i++){
							if (alienArray[x][i].isAlive()) {
								alienArray[x][i].draw(window);
							}

							if (alienArray[x][i].getAlien().getGlobalBounds().intersects(missile.getMissile().getGlobalBounds()) == true && alienArray[x][i].alive == true){
								alienArray[x][i].kill();
								missile.kill();
								missile.setLocation(player.getPosition().x + 40, player.getPosition().y - 20);
								missile.alive = true;
								isFired = false;
								whatsAlive[i] = whatsAlive[i] - 1;
							}
						}
					}
				}

				window.display();

				// reset the timeSinceLastUpdate to 0 
				timeSinceLastUpdate = sf::Time::Zero;
			}
		
		
	}
	
	return 0;
}
