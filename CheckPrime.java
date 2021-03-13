
public class CheckPrime {
public static void main(String[] args) {
	int num=11,count=0;
	for(int i=2;i<num;i++){
		if(num%i==0){
			count++;
			break;
			}
	}
	if(count==0){
		System.out.println("Number is a prime");
	}else{
		System.out.println(" not prime number");
	}
}
}
