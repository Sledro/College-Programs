/**
* Title: monthIF.cpp
* Description: See below.
* @author Daniel Hayden
* @version 1.0
* @date 5/10/2016
*/

#include "stdafx.h"
#include <iostream>

void printMonthName(int numOfMonth);


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
		}
		else {
			continueLoop = false;
		}
	}
	return num;
}

void printMonthName(int numOfMonth)
{
	if (numOfMonth == 1) {
		printf("January\n");
	}
	else if (numOfMonth == 2) {
		printf("February\n");
	}
	else if (numOfMonth == 3) {
		printf("March\n");
	}
	else if (numOfMonth == 4) {
		printf("April\n");
	}
	else if (numOfMonth == 5) {
		printf("May\n");
	}
	else if (numOfMonth == 6) {
		printf("June\n");
	}
	else if (numOfMonth == 7) {
		printf("July\n");
	}
	else if (numOfMonth == 8) {
		printf("August\n");
	}
	else if (numOfMonth == 9) {
		printf("September\n");
	}
	else if (numOfMonth == 10) {
		printf("October\n");
	}
	else if (numOfMonth == 11) {
		printf("November\n");
	}
	else if (numOfMonth == 12) {
		printf("December\n");
	}
}


int main()
{

	int inChar = -1;

	printf("**********************\nMonth Check Tool.\n**********************\n\n");
	while (inChar != 0) {

		printf("Enter a number to check the month -> ");
		inChar = getNumbers();

		printMonthName(inChar);

	}

	system("pause");
	return 0;
}

