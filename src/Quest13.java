import java.util.Scanner;

public class Quest16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("INFORME O N TERMOS");
        double h=0.0;
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            h+=1.0/i;
            System.out.println(h);
        }
    }
}
