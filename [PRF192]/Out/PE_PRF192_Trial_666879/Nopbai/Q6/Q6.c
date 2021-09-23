#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	char name[5][100];
	int i;
	for(i=0;i<5;i++){
		fflush(stdin);
		gets(name[i]);
	}
	
	int j;
	char temp[100];
	for(i=0;i<4;i++){
		for(j=i+1;j<5;j++){
			if(strcmp(name[i],name[j])>0){
				strcpy(temp,name[i]);
				strcpy(name[i],name[j]);
				strcpy(name[j],temp);
			}
		}
	}
	printf("\nOUTPUT:\n");
	for(i=0;i<5;i++)
		printf("%s ",name[i]);
	return 0;
}
