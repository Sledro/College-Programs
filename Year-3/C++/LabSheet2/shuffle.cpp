/*
@author Daniel Hayden
Student Number: C00137009
Date: November '16
Purpose: Write an application called SHUFFLE.CPP that will search a string  for a single ‘*’ character which may or may 
		not be present. If the asterisk is present the string will be copied to another string in such a way that all that 
		came after the ‘*’ will now come first, followed by the ‘*’, followed by all that originally came before the ‘*’. 
		In other words, the two parts of the string separated by ‘*’ will be swapped. If there is no asterisk present, 
		then the string will be copied as it is, that is, with no shuffling taking place. If there is more than one 
		asterisk present, shuffling will take place about the first occurrence. 
*/

#include "stdafx.h"
#include <iostream>
using namespace std;


void buildString(char * arrayIndex){

	bool foundSpace = false;
	char inChar;
	int charCount = 1;
	inChar = getchar();

	while (inChar != 10 && charCount < 512){
		*arrayIndex = inChar;
		arrayIndex++;
		charCount++;
		inChar = getchar();
	}

	*arrayIndex = '\0';
}

void shuffle(char * input, char * output)
{
	bool hasAsterix = false;
	char * inputStart;
	inputStart = input;
	int startLength = 0;
	
	while (*input != '*' && *input != '\0'){
		input++;
	}
	
	if (*input == '*'){
		hasAsterix = true;
		input++;
	}

	while (*input != '\0'){
		*output = *input;
		input++;
		output++;
	}

	if (hasAsterix){
		*output = '*';
		output++;
	}

	input = inputStart;
	
	while (*input != '*' && *input != '\0'){
		*output = *input;
		output++;
		input++;
	}

	*output = '\0';
}

int main()
{
	char input[512];
	char output[512];
	buildString(input);
	shuffle(input, output);
	cout << output << endl;
	system("pause");
	return 0;
}