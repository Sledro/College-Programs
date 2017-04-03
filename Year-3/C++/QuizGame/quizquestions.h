#pragma once
#include <iostream>
#include "mainMenu.h"
#include <fstream>
#include <string>
#include <vector>

class quizQuestions
{
public:
	quizQuestions();
	~quizQuestions();
	void print();
	std::string getQuestion();
	std::string question;
	std::string answerA;
	std::string answerB;
	std::string answerC;
	std::string answerD;
	char correctAnswer;
	std::string line;

};

