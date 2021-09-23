#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <conio.h>
void chuanhoa(char str[]){
	//dau cau
	while(str[0]==' '){
		strcpy(&str[0],&str[1]);
	}
	//cuoi cau
	while(str[strlen(str)-1]==' '){
		strcpy(&str[strlen(str)-1],&str[strlen(str)]);
	}
	//giua cau
	int i;
	for(i=0;i<strlen(str)-1;i++){
		if(str[i]==' ' && str[i+1]==' '){
			strcpy(&str[i],&str[i+1]);
			i--;
		}
	}
	
}
void viethoa(char str[]){
	int i;
	int len=strlen(str);
	if(len>0){
		str[0]=toupper(str[0]);
	}
	for(i=0;i<len;i++){
		if(str[i]==' '||str[i]=='.'||str[i]=='!'||str[i]=='?'){
			str[i+1]=toupper(str[i+1]);
		}
	}
}
int main(){
	char str[100];
	printf("\nenter str: ");
	gets(str);
	chuanhoa(str);
	viethoa(str);
	printf("%s",str);
	return 0;
}
