//BTVN:
//1.Tong cac so nguyen tu 1 den n
//2.Kiem tra n co phai la so chinh phuong?
//3.Co so chinh phuong noa tu 1 den n?Neu co thi hien cac so do
//4.Tinh n!=1*2*3*4*5....n
//5.Tinh S3=2n+4+6+8+....2n
//6.Tinh S4=1!+3!+5!+.....(2n+1)!
#include<stdio.h>
#include<math.h>
    //1.Tong cac so nguyen to tu 1 den n
int main(){
	int n;
	printf("Nhap n: ");
	scanf("%d",&n);
	int i;
	int count=0;
	int sum=0;
	int j;
	int a=sqrt(n);
	for(i=1;i<=n;i++){
		sum=sum+i; 
	}
	printf("\nTong cac so nguyen tu 1 den n la: %d",sum);
	
	//2.Kiem tra n co phai la so chinh phuong?
	
	if(a*a==n){
		printf("\nn la so chinh phuong");
	} else{
		printf("\nn khong phai so chinh phuong");
	}
	
	//3.Cach 1:
	printf("\nCac so chinh phuong tu 1 den n la: ");
	for(i=1;i<=n;i++){
		if(sqrt(i)*sqrt(i)==i){
			printf("%d ",i);
		}
	}
	
	//3.Co so chinh phuong noa tu 1 den n?Neu co thi hien cac so do.  Cach 2:
	
	printf("\nCac so chinh phuong tu 1 den n la: ");
	for(i=1;i<=sqrt(n);i++){
		printf("%d ",i*i);
    }
    
    
    //4.Tinh n!=1*2*3*4*5....n
    int tich=1;
    for(i=1;i<=n;i++){
    	tich=tich*i;
	}
	printf("\nn!= %d",tich);
    
    //5.S3=2n+4+6+8+....2n
    int S3=2*n;
    for(i=2;i<=n;i++){
    	S3=S3+2*i;
	}
	printf("\nS3= %d",S3);
	
	//6.Tinh S4=1!+3!+5!+.....(2n+1)!
	
	int giaithua=1;
	int S4=0;
	for(i=1;i<=n;i++){
		if((2*i+1)%2 !=0){
		giaithua=giaithua*i;
		S4=S4+ giaithua;
	}
	}
	printf("\nS4= %d",S4);

	return 0;
}
