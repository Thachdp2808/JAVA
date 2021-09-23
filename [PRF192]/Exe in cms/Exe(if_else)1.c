 #include<stdio.h>
 #include<math.h>
 int main(){
 	int a,b,c,d;
 	printf("Nhap a,b,c,d: ");
 	scanf("%d%d%d%d",&a,&b,&c,&d);
 	if(a>b && a>c && a>d){
 		printf("Max= %d",a);
	 } else{
	 	if(b>a && b>c && b>c){
	 		printf("Max= %d",b);
		 } else{
		 	if(c>a && c>b && c>d){
		 		printf("Max= %d",c);
			 } else{
			 	printf("Max= %d",d);
			 }
		 }
		 
	 }
 	return 0;
 }
