/**
* Title: palindrome.cpp
* Description: Enter and int and return if its a palindrome or not.
* @author Daniel Hayden
* @version 1.0
* @date 20/10/2016
*/

#include <iostream>
#include <cstdlib>


bool isPalindrome(int inputNum)
{
	int temp = inputNum;
	int reverse = 0;
	while (temp > 0){
		reverse = reverse * 10;
		reverse = reverse + temp % 10;
		temp = temp / 10;
	}

	// Ternary - (condition) ? ifTrue : ifFalse; 
	return (reverse == inputNum) ? true :  false;

}

int getNumbers()
{

	int inChar = 0;
	bool continueLoop = true;
	int multiple = 1;
	unsigned int num = 0;

	while (continueLoop){

		inChar = getchar();
	
		if (inChar != 10){
			//Get the number from getChar() ASCII
			inChar = inChar - 48;

			//Is the number valid 
			if (inChar >= 0 && inChar <= 9){

				num = num * multiple + inChar;
				multiple = 10;

			}else{

				printf("Error - Please numbers only 0-9\n");
				return getNumbers();
			}
			//Is the number within an unsigned ints bounds?
			if (num > INT_MAX){
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

	printf("****************************\nPalindrome Int Check Tool.\n****************************\n\n");
	printf("Enter 0 to Exit.\n");
	while (inChar != 0){

		printf("\nEnter a number to check -> ");
		inChar = getNumbers();

		if (isPalindrome(inChar)){
			printf("%i is a Palindrome\n", inChar);
		}else{
			printf("%i is NOT a Palindrome\n", inChar);
		}

	}
	system("pause");
	return 0;
}