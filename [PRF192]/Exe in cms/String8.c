#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
void acs(char str[]){
	while(str[0]==' '){
		strcpy(&str[0],&str[1]);
	}
}
int main(){
	char str[100];
	int i,j;
	int count=0;
	printf("NHap chuoi: ");
	gets(str);
	acs(str);
	char Ten[strlen(str)];
	j=0;
	for(i=0;str[i]!=' ';i++){
		Ten[j]=str[i];
		j++;
		count++;
	}
	Ten[j]='\0';
	printf("\nTen: %s",Ten);
	printf("\n%d",count);
	return 0;
}
