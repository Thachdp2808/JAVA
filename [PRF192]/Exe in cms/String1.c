#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int Check(char a[]){
	int i;
	int n= strlen(a)-1;
	for(i=n;i>=0;i--){
		printf("%c",a[i]);
	}

}
int main(){
	char a[100];
	printf("NHap chuoi: ");
	gets(a);
	int i;
	int n= strlen(a)-1;
	for(i=n;i>=0;i--){
		printf("%c",a[i]);
	}
	return 0;
}
	
