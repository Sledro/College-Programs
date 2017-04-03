/**
* Title: leapyear.cpp
* Description: Enter a year and return if it is a leap year or not.
* @author Daniel Hayden
* @version 1.0
* @date 5/10/2016
*/

#include "stdafx.h"
#include <iostream>


int isLeapyear(int inputYear) {

	if (inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
		return true;
	}
	else {
		return false;
	}
}


int getNumbers()
{

	int inChar = 0;
	bool continueLoop = true;
	unsigned int num = 0;

	while (continueLoop) {

		inChar = getchar();

		if (inChar != 10) {
			//Get the number from getChar() ASCII
			inChar = inChar - 48;

			//Is the number valid 
			if (inChar >= 0 && inChar <= 9) {

				num = num * 10 + inChar;

			}
			else {

				printf("Error - Please numbers only 0-9\n");
				return getNumbers();
			}
			//Is the number within an unsigned ints bounds?
			if (num > INT_MAX) {
				printf("Enter a number between 0 and %i \n", INT_MAX);
				return getNumbers();
			}
		}else{
			continueLoop = false;
		}
	}
	return num;
}


int main()
{
	int inChar = -1;

	printf("**********************\nLeap Year Check Tool.\n**********************\n\n");
	printf("Enter 0 to Exit.\n");
	while (inChar != 0) {

		printf("\nEnter a year to check -> ");
		inChar = getNumbers();

		if (isLeapyear(inChar)) {
			printf("%i is a Leap Year\n", inChar);
		}
		else {
			printf("%i is NOT a Leap Year\n", inChar);
		}

	}

	system("pause");
	return 0;
}

