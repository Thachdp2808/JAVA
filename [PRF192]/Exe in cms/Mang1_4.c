#include<stdio.h>
#include<math.h>
int main(){
	int n,i;
	int a[100];
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("\nNhap phan tu thu %d: ",i);
		scanf("%d",&a[i]);
	}
	int Check=0;
	int max=0;
	for(i=1;i<=n;i++){
		if(a[i]%2==0){
			Check=1;
			max=a[i];
			break;
		}
	}
	if(Check=0){
		printf("\nKhong co gia tri lon nhat trong cac phan tu chan");
	} else{
    for(i = 1; i <= n; i++){
        if(max < a[i] && a[i]%2==0)
        {
            max = a[i];  
        }           
    }
    printf("\nGia tri lon nhat trong cac phan tu chan la: %d",max);
	}
    //.....
    int count=0;
    for(i=1;i<=n;i++){
    	if(a[i]>=max){
    		count++;
		}
	}
    printf("\nCo %d gia tri >= max tren",count);
	return 0;
}
