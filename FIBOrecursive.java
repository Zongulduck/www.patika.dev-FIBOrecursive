import java.util.Scanner;
public class FIBOrecursive {
    public static int fib(int n){
        if(n==1 || n==2){
            return 1;}
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int say=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("kaçıncı basamağın değerini ögrenmek istiyorsun: ");
        say= inp.nextInt();
        System.out.println(fib(say));
    }
}
