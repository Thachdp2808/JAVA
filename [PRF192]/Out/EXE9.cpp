#include<stdio.h>
#include<math.h>
int main(){
	int n;
	again:
	printf("\nNhap thang bang so: ");
	scanf("%d",&n);
	switch(n){
		case 1:
			printf("\nJanuary");break;
		case 2:
			printf("\nFebruary");break;
		case 3:
			printf("\nMatch");break;
		case 4:
			printf("\nApril");break;
		case 5:
			printf("\nMay");break;
		case 6:
			printf("\nJune");break;
		case 7:
			printf("\nJyly");break;
		case 8:
			printf("\nAugust");break;
		case 9:
			printf("\nSeptember");break;
		case 10:
			printf("\nOctober");break;
		case 11:
			printf("\nNovember");break;
		case 12:
			printf("\nDecember");break;
		default:
			printf("Khong co thang nay. Vui long nhap lai...");goto again;break;
	}
	return 0;
}
