#pragma once
#include "SFML/Graphics.hpp"
#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

class playGame
{
public:
	playGame();
	playGame(int x);
	~playGame();
	void newQuestion();
	void draw(sf::RenderWindow & window);
	void drawFinishedScreen(sf::RenderWindow & window);
	void inputAnswer(int i, sf::RenderWindow & window);
	std::vector<std::string> playGame::getAQuestion();
	void loadQuestions();
	int scoreInt;
	std::vector<std::string> question;
	std::vector<int> playGame::uniqueRandomInt();
private:
	sf::Font font;
	std::string line;
	std::vector<std::string> questions;
	std::vector<std::string> v;
	sf::Text questionMenu[5];
	sf::Text score;
	sf::Text resultF;
	sf::Text menuOption;
	sf::Color fontColour = sf::Color::Green;
};