#include "leaderBoard.h"
#include <stdio.h>
#include <time.h>
#include <functional>   // std::greater
#include <algorithm>    // std::sort

leaderBoard::leaderBoard()
{
	loadFile();
}

//Load questions from file
void leaderBoard::loadFile()
{

	std::ifstream myfile("leaderboard.txt");
	if (!myfile)
	{
		std::cout << "Error opening questions file quizQuestions.txt" << std::endl;
		system("pause");
	}
	while (std::getline(myfile, line))
	{
		leadersVector.push_back(line);
	}
}


void leaderBoard::writeToFile(string s)
{
	std::ofstream myfile("leaderboard.txt", std::ios_base::app | std::ios_base::out);

	if (myfile)
	{
		char buff[20];
		struct tm *sTm;

		time_t now = time(0);
		sTm = gmtime(&now);

		strftime(buff, sizeof(buff), "%Y-%m-%d %H:%M:%S", sTm);
		
		myfile << "Score: " << s << "/10    Date/Time: " << buff << endl;
	}
	else {
		system("pause");
		cout << "File not found leaderboard.";
	}

}

//Load questions from file
void leaderBoard::display(sf::RenderWindow &window) {

	if (!font.loadFromFile("font.ttf"))
		cout << "Error loading font!";

	sf::Texture texture;

	if (!texture.loadFromFile("background2.png"))
		cout << "Error loading background!";

	sf::Sprite background(texture);

	text.setFont(font);
	text.setString("Leaderboard Top 10");
	text.setCharacterSize(24);
	text.setColor(sf::Color::White);
	text.setPosition(410, 100);

	for (int i = 1; i < 6; i++)
	{
		std::string s = std::to_string(i);

		sort(leadersVector.begin(), leadersVector.end(), std::greater<string>());

		rows[i].setFont(font);
		rows[i].setFillColor(sf::Color::Green);
		rows[i].setString(s + ") " + leadersVector[i]);
		rows[i].setPosition(sf::Vector2f(230, 140 + i * 30));

	}

	//Setup Menu Option for printing
	menuOption.setFont(font);
	menuOption.setFillColor(sf::Color::White);
	menuOption.setString("Press 0 to return to main menu.");
	menuOption.setPosition(sf::Vector2f(330, 370));

	window.clear();
	window.draw(background);
	window.draw(text);
	window.draw(menuOption);

	for (int i = 0; i < 6; i++)
	{
		window.draw(rows[i]);
	}

	window.display();

}