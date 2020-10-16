package java;

java.util.scanner;

public class factorial{
  public static void main(arg String[]){
  
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int f=1;
    for(int i=2;i<=n;i++){
        f=f*i;
    }
    System.out.println(f);
   
  }
  
}
