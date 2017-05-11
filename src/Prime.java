
public class Prime {

	public static boolean isPrime(int s){
		for(int i=2;i<s;i++){
			if(s%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]){
		int count =0;
		for(int i=2;i<100;i++){
			if(Prime.isPrime(i)){
				System.out.print(i+" ");
				count ++;
			}
		}
		System.out.println();
		System.out.print("Total Prime: "+count);
	}
}
