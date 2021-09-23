#include<stdio.h>
#include<math.h>
double MTH(int n){
	int i;
	int count=0;
	for(i=1;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	return count;
}
int TH(int n){
	int a=sqrt(n);
	int OK;
	if(a*a==n){
		OK=1;
	}
	return OK;
}
void NT(int n[]){
	if(MTH(n)==1 ){
		printf("\n%d la so nguyen to",n);
	} else{
		printf("\n%d ko phai so nguyen to",n);
	}
}
void SCP(int n){
	if(TH(n)==1){
		printf("\n%d la so chinh phuong",n);
	}else{
		printf("\n%d khong la so chinh phuong",n);
	}
}
int UCLN(int a,int b){
	int a1=a;
	int b1=b;
	while(a!=b){
		if(a>b){
			a=a-b;
		}else{
			b=b-a;
		}
	}
	printf("\nUCLN(%d,%d)= %d",a1,b1,a);
	return a;
}
int BCNN(int a,int b){
	int a1=a;
	int b1=b;
	while(a!=b){
		if(a>b){
			b=b+b1;
		}else{
			a=a+a1;
		}
	}
	printf("\nBCNN=%d",a);
	return a;
}
int GT(int n){
	int i;
	int giaithua=giaithua*i;
	for(i=1;i<=n;i++){
		giaithua=giaithua*i;
	}
	return giaithua;
}
int GTLN(int a,int b){
	int max;
	if(a>b){
		max=a;
	}else{
		max=b;
	}
	printf("\nMax= %d",max);
	return max;
}
int GTNN(int a,int b){
	int min;
	if(a<b){
		min=a;
	} else{
		min=b;
	}
	printf("\nMin= %d",min);
	return min;
}
int input(int b[]){
	int n[5];
	do{
		printf("\n%d: ",b);
	    scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	    if(n<=0){
	    	printf("Phai nhap n>0");
		}
	}
	while(n<=0);
	return n;
}
int main(){
	int n[5]={a,b,c,d,e};
	printf("Nhap a,b,c,d,e: ");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	NT(a);
	SCP(a);SCP(b);SCP(c);SCP(d);SCP(e);

	return 0;
}
