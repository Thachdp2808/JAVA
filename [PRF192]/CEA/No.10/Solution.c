#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	unsigned int x;
	int y;
	do{
		printf("Nhap x: ");
		scanf("%u",&x);
		printf("Nhap y: ");
		scanf("%d",&y);
		printf("%ld",(long int)x+y);
	}
	while(x<=0 || x>=pow(10,10));
	return 0;
}


