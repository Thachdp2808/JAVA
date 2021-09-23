#include<stdio.h>
#include<math.h>
int main(){
	char n;
	printf("Nhap ky tu: ");
	scanf("%c",&n);
	if(isalpha(n)){
		printf("\nThis is an alphabet character");
	} else{
		if(isdigit(n)){
			printf("\nThis is a digit character");
		} else{
			printf("\nThis is a special character");
		}
	}
	return 0;
}
