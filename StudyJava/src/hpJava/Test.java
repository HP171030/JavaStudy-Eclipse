package hpJava;

public class Test {
		public static void main(String[] args) {
			Test test = new Test();
			test.solution(100);
		}
		
		  public int solution(int n) {
		      int answer = 0;
		      for(int i = 1; i*i <= n; i++){
		          if( n % i  == 0){
		              answer += i;
		              System.out.println(i);
		              if(n/i != i) {
			        	  answer += n/i;
			        	  System.out.println(String.format("약수 대칭 %d", n/i));
			          }
		          }
		          
		      }
		      System.out.println(String.format("총 합은 %d", answer));
		      return answer;
		  }
}
