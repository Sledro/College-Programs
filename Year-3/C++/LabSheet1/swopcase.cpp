#include <stdio.h>
#include <cstdlib>

int isupper(int  x) {

	if (x >= 65 && x <= 90) {
		return 1;
	}
	else {
		return 0;
	}
}

int islower(int  x) {

	if (x >= 97 && x <= 122) {
		return 1;
	}
	else {
		return 0;
	}
}

int tolower(int  x) {
	return x + 32;
}

int toupper(int  x) {
	return x - 32;
}

int main(void)
{
	int inchar = 0;
	printf("----------------------------------\nPress CTRL + Z and enter to exit.\n----------------------------------");
	printf("\nEnter characters to convert case:\n");
	inchar = getchar();

	do {

		if (isupper(inchar)) {
			putchar(tolower(inchar));
		}
		else if (islower(inchar)) {
			putchar(toupper(inchar));
		}
		else if (inchar == 32) {
			printf(" ");
		}
		else if (inchar != '\n') {
			printf("Please enter an alphabetic charater A-Z or a-z.");
		}

		inchar = getchar();
	} while (inchar != EOF);

	system("pause");
	return 0;
}
