#include<stdio.h>
#include<math.h>
int main(){
	int n ;
	int a,b,c,d;
	again:
	printf("\n\n1.Tinh dien tich hinh vuong.");
	printf("\n2.Tinh dien tich hinh chu nhat.");
	printf("\n3.Tinh dien tich tam giac.");
	printf("\n4.Tinh dien tich hinh thang.");
	printf("\n5.Tinh dien tich hinh tron.");
	printf("\nChoose an option: ");
	scanf("%d",&n);
	switch(n){
		case 1:{
			
			int a;
			printf("Nhap mot canh: ");
			scanf("%d",&a);
			printf("\nDien tich hinh vuong la= %d",a*a);
			break;
		}
		case 2:{
			int b ;
			printf("\nNhap chieu dai: ");
			scanf("%d",&a);
			printf("\nNhap chieu rong: ");
			scanf("%d",&b);
			printf("\nDien tich hinh chu nhat: %d",a*b);
			break;
		}
		case 3:{
		    int a,b,c;
		    printf("\nNhap canh a: ");
		    scanf("%d",&a);
		    printf("\nNhap canh b: ");
		    scanf("%d",&b);
		    printf("\nNhap canh c: ");
		    scanf("%d",&c);
		    int p=a+b+c;
		    float S = (float)sqrt(p*(p-a)*(p-b)*(p-c));
		    printf("\nDien tich tam giac la: %f",S);
		    break;
		}
		case 4:{
			int a,b,c,d,h;
			printf("\nNhap canh day nho: ");
			scanf("%d",&a);
			printf("\nNhap canh day lon: ");
			scanf("%d",&b);
			printf("\nNhap canh ben thu nhat: ");
			scanf("%d",&c);
			printf("\nNhap canh ben thu hai: ");
			scanf("%d",&d);
			printf("\nNhap chieu cao: ");
			scanf("%d",&h);
			float Sth=(h*(a+b))/2;
			printf("\nDien tich hinh thang la: %f",Sth);
			break;
		    }
		case 5:{
			int a;
			printf("\nNhap ban kinh: ");
			scanf("%d",&a);
			float Str= (pow(a,2))*3.14;
			printf("\nDien tich hinh tron la: %f",Str);
			break;
		}
		default:printf("\nKhong co trong danh sach. Vui long nhap lai...");goto again;break;
			
	}
	return 0;
}
