#include "SFML/Graphics.hpp"
#include <iostream>
#include <fstream>
#include <vector>
#include <string>

using namespace std;

class leaderBoard
{
public:
	leaderBoard();
	void loadFile();
	void writeToFile(string s);
	void display(sf::RenderWindow &window);
private:
	std::string line;
	std::vector<std::string> leadersVector;
	sf::Font font;
	sf::Text rows[10];
	sf::Text text;
	sf::Text menuOption;
};

