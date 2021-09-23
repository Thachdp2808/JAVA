#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	char str[20];
	gets(str);
	int start=(strlen(str)-5)/2;
	int end=strlen(str)-start-1;
	char str1[5];
	int i,j=0;
	for(i=start;i<=end;i++){
		str1[j++]=str[i];
	}
	str1[j]='\0';
	printf("%s",str1);
	return 0;
	
}
