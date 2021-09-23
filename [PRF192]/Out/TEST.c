#include<stdio.h>
#include<math.h>
int input(char str[]){
	int n;
	printf("\n%s",str);
	scanf("%d",&n);		
	return n;
}
int checkSNT(int n){
	int i;
	int count=0;
	for(i=1;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	return count;
}
void SNT(int a,int b){
	int i;
	printf("\nCac so lui la SNT la: ");
	for(i=a;i<=b;i++){
		if(checkSNT(i)==1){
			printf(" %d",i);
		}
	}
}

int SHH(int n){
	int i;
	int tong=0;
	for(i=1;i<n;i++){
		if(n%i==0){
			tong=tong+i;
		}
	}
	return tong;
}
int Check(int n){
	int OK;
	if(SHH(n)==n){
		OK=1;
	} else{
		OK=0;
	}
	return OK;
}
void IN(int a,int b){
	int i;
	for(i=a;i<=b;i++){
		if(SHH(i)==i){
			printf("\n%d",i);
		}
	}
}
int main(){
	int a,b;
	do{
		a=input("Nhap a: ");
		b=input("Nhap b: ");
		if(a>=b){
			printf("\nNhap a<b");
		}
	}
	while(a>=b);
	SNT(a,b);
	IN(a,b);
	return 0;

}
