#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	char s[255];
     
    FILE *fptr;
     
    fptr = fopen("README2.md","w");
     
    if(fptr == NULL){
     	 printf("Error!");
     	 exit(1);
	}
	printf("Enter string:\n");
	fgets(s,sizeof(s), stdin);
	fprintf(fptr,"%s",s);
	fclose(fptr);
	return 0;
}


