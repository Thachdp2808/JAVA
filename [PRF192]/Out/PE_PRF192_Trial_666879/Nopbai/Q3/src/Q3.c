#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	char str[4];
	int i;
	for(i=0;i<4;i++){
		fflush(stdin);
		scanf("%c",&str[i]);
	}
	int j;
	for(i=0;i<3;i++){
		for(j=i+1;j<4;j++){
			if(str[i]>str[j]){
				char tg=str[i];
				str[i]=str[j];
				str[j]=tg;
			}
		}
	}
	printf("\nOUTPUT:\n");
	for(i=0;i<4;i++){
		printf("%c ",str[i]);
	}
	return 0;
}
