#include "playGame.h"
#include "leaderBoard.h"
#include <random>
#include <algorithm>
#include <iterator>
#include <iostream>

int q = 0;
int randomInt = 0;
int questionNo = 0;
vector<int> v2 = { 0,1,2,3,4,5,6,7,8,9 };
vector<int> v3;

playGame::playGame()
{
	if (!font.loadFromFile("font.ttf"))
		cout << "Error loading font!";
	loadQuestions();
}

playGame::playGame(int x)
{

	if (!font.loadFromFile("font.ttf"))
		cout << "Error loading font!";
	q = 0;
	questionNo = 0;
	loadQuestions();
}

playGame::~playGame()
{
}

void playGame::newQuestion() {
	randomInt = 0;
	//Get a random question
	question = getAQuestion();

	//Questions
	questionMenu[0].setFont(font);
	questionMenu[0].setCharacterSize(18);
	questionMenu[0].setFillColor(sf::Color::Green);
	questionMenu[0].setString(question[0]);
	questionMenu[0].setPosition(sf::Vector2f(200, 240));

	//Answer1
	questionMenu[1].setFont(font);
	questionMenu[1].setFillColor(sf::Color::White);
	questionMenu[1].setString("1) " + question[1]);
	questionMenu[1].setPosition(sf::Vector2f(200, 270));

	//Answer2
	questionMenu[2].setFont(font);
	questionMenu[2].setFillColor(sf::Color::White);
	questionMenu[2].setString("2) " + question[2]);
	questionMenu[2].setPosition(sf::Vector2f(200, 300));

	//Answer3
	questionMenu[3].setFont(font);
	questionMenu[3].setFillColor(sf::Color::White);
	questionMenu[3].setString("3) " + question[3]);
	questionMenu[3].setPosition(sf::Vector2f(200, 330));

	//Answer4
	questionMenu[4].setFont(font);
	questionMenu[4].setFillColor(sf::Color::White);
	questionMenu[4].setString("4) " + question[4]);
	questionMenu[4].setPosition(sf::Vector2f(200, 360));
}

//Load questions from file
void playGame::loadQuestions()
{
	std::ifstream myfile("quizQuestions.txt");
	if (!myfile) 
	{
		std::cout << "Error opening questions file quizQuestions.txt" << std::endl;
		system("pause");
	}
	while (std::getline(myfile, line))
	{
		questions.push_back(line);
	}	
}

vector<int> playGame::uniqueRandomInt() {

	std::random_device rd;
	std::mt19937 g(rd());

	//
	if (questionNo == 0) {
		std::shuffle(v2.begin(), v2.end(), g);
	}

	cout << "Question No-- " << questionNo << endl;

	v3 = v2;

	return v3;

}

//Get a random question from that file
std::vector<std::string> playGame::getAQuestion() {


	if (questionNo == 0) {
		 v2 = uniqueRandomInt();
	}

	randomInt = (v2[questionNo]*6);
	int randomInt2 = (rand() % 9);

	cout << "NextRandomInt-->" << randomInt << endl;

	v.insert(v.begin() + 0, questions[randomInt]);
	v.insert(v.begin() + 1, questions[randomInt+1]);
	v.insert(v.begin() + 2, questions[randomInt+2]);
	v.insert(v.begin() + 3, questions[randomInt + 3]);
	v.insert(v.begin() + 4, questions[randomInt + 4]);
	v.insert(v.begin() + 5, questions[randomInt + 5]);

	return v;
}

//Draw the quiz questions menu to screen
void playGame::draw(sf::RenderWindow &window)
{
	sf::Texture texture;

	if (!texture.loadFromFile("background2.png"))
		cout << "Error loading background!";

	sf::Sprite background(texture);

	
	window.draw(background);
	window.draw(score);
	window.draw(resultF);
	window.draw(questionMenu[0]);
	window.draw(questionMenu[1]);
	window.draw(questionMenu[2]);
	window.draw(questionMenu[3]);
	window.draw(questionMenu[4]);
	

}


//Draw the quiz questions menu to screen
void playGame::drawFinishedScreen(sf::RenderWindow &window)
{
	sf::Texture texture;

	if (!texture.loadFromFile("background2.png"))
		cout << "Error loading background!";

	sf::Sprite background(texture);

	//Finished Message
	resultF.setFont(font);
	resultF.setFillColor(sf::Color::White);
	resultF.setString("Game Over!");
	resultF.setPosition(sf::Vector2f(330, 110));

	//Finished Message
	menuOption.setFont(font);
	menuOption.setFillColor(sf::Color::White);
	menuOption.setString("Press 0 to return to main menu.");
	menuOption.setPosition(sf::Vector2f(330, 170));

	window.draw(background);
	window.draw(resultF);
	window.draw(menuOption);
	window.draw(score);


}

//See what the answer inputted by player was
void playGame::inputAnswer(int i, sf::RenderWindow &window)
{

	string result;

	if (questionNo < 9) {
		cout << "Player Answered: " << questions[randomInt + i] << endl;
		cout << "Correct Answer is: " << questions[randomInt + 5] << endl;
		cout << "Random In Used: " << randomInt << endl;

		if (questions[randomInt + i] == questions[randomInt + 5]) {
			q++;
			result = "Correct!";
			fontColour = sf::Color::Green;
			cout << "Curent Score: " << q << endl;
		}
		else {
			result = "Incorrect.";
			fontColour = sf::Color::Red;
		}
	}

	std::string s = std::to_string(q);

	//Score
	score.setFont(font);
	score.setFillColor(sf::Color::Green);
	score.setString("Score: " + s);
	score.setPosition(sf::Vector2f(330, 140));

	//result
	resultF.setFont(font);
	resultF.setFillColor(fontColour);
	resultF.setString(result);
	resultF.setPosition(sf::Vector2f(330, 180));

	if (questionNo < 9) {
		questionNo++;
		window.clear();
		newQuestion();
		draw(window);
		window.display();		
	}
	else {
		window.clear();
		drawFinishedScreen(window);
		leaderBoard leader;
		leader.writeToFile(s);
		window.display();
		cout << "---------NEW GAME---------";
	}
}