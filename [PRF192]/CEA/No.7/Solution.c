#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	int i;
	printf("Vua ga vua cho\n");
	printf( "Bo lai cho tron\n");
	printf( "Ba muoi sau(36) con\n");
	printf( "Mot tram(100) chan chan\n");
	printf( "Hoi may ga, may cho?\n");
	for(i=0;i<36;i++){
		if(i*2+(36-i)*4==100){
			printf("So ga la: %d",i);
			printf("\nSo cho la: %d",36-i);
		}
	}
	return 0;
}


