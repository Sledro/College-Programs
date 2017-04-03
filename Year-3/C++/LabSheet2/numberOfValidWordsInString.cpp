/*
@author Daniel Hayden
Student Number: C00137009
Date: November '16
Purpose: Write a program which will input a string from the keyboard, and output the number of separate words, where a 
		word is one or more characters separated by spaces. Your program should only count as words groups of characters 
		in the ranges A..Z and a..z. For example the characters “dd  3  f4  fff  ff2 dd” would return a word count of 3.
*/


#include <iostream>
using namespace std;


void buildString(char *arrayIndex)
{

	char inChar;
	inChar = getchar();

	while (inChar != 10){
		*arrayIndex = inChar;
		arrayIndex++;
		inChar = getchar();
	}

	*arrayIndex = '\0';
}

bool checkValidChar(char * testChar)
{
	if (*testChar >= 'a' && *testChar <= 'z') {
		return true;
	}
	else if (*testChar >= 'A' && *testChar <= 'Z') {
		return true;
	}
	else {
		return false;
	}
}

int wordCount(char *arrayIndex) {

	int count = 0;

	while (*arrayIndex != '\0'){

		bool isValid;
	
		while (*arrayIndex != '\0' && *arrayIndex == ' '){
			arrayIndex++;
		}

		if (*arrayIndex != '\0'){
			
			isValid = true;
			while (*arrayIndex != '\0' && *arrayIndex != ' ') {
				if (!checkValidChar(arrayIndex)){
					isValid = false;
				}
				arrayIndex++;
			}

			if (isValid){
				count++;
			}
		}
	}
	return count;

}


int main()
{
	char stringArray[512];
	cout << "Please enter a string: " << endl;
	buildString(stringArray);
	cout << "There was " << wordCount(stringArray) << " valid words in the string." << endl;
	system("pause");
	return 0;
}

