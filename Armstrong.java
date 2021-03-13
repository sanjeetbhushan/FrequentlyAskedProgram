
public class Armstrong {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int sum=0,rem;
	while(num>0){
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum){
		System.out.println("Given number is armstrong");
	}else{
		System.out.println("Not Armstrong");
	}
}
}
