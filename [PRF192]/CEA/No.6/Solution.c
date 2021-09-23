#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	FILE * fptr;
	char filename[100],c;
	scanf("%s", filename);
	   
	   
	fptr = fopen(filename, "r");
	if(fptr == NULL){
	   	printf("Cannot open file\n");
		exit(0);
	}  
	c = fgetc(fptr);
	while(c != EOF){
	   	printf("%c",c);
	   	c = fgetc(fptr);
	}
	fclose(fptr);
	return 0;
}


