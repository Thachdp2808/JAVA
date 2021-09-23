#include<stdio.h>
#include<math.h>
int main(){
	int a, x = 0, y;
	printf("Input a positive number less than 500: \n");
    scanf("%d", & a);
    int i;
    int S=0;
    while(a!=0){
    	S=S+(a%10);
    	a=a/10;
	}
	printf("%d",S);
	return 0;
}
