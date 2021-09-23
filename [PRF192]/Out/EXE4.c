#include<stdio.h>
#include<math.h>
int main(){
	char n;
	printf("Nhap ky tu: ");
	scanf("%c",&n);
	if(n=='o'|| n=='a'|| n=='i' || n=='u' || n=='e' || n=='A' || n=='O' || n=='I' || n=='U'|| n=='E'){
		printf("\nThe alphabet is not a consonant");
	} else{
		if(n>='a' && n<='z' || n>='A' && n<='Z'){
			printf("The alphabet is a consonant");
		}
	}
	return 0;
}
