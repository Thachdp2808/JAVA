#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int CheckSNT(int n){
	int i;
	int count=0;
	for(i=1;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	return count;
}
int SDX(int n){
	int temp,rem;
	int reverse =0;
	temp = n;
    while(temp != 0)
    {
        rem = temp % 10;
        reverse = reverse*10 + rem;
        temp /= 10;
    } 
    return reverse;
}
int main(){
	int n;
	do{
		printf("Nhap n: ");
		scanf("%d",&n);
	}
	while(n<0 || n>65  );
	if(CheckSNT(n)==1 && SDX(n)==n){
		printf("Verify if number is palindrome");
	}else{
		printf("Verify if number is not palindrome");
	}
	
	return 0;
}


