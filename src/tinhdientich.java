import java.util.Scanner;

public class tinhdientich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Width: ");
        int width=sc.nextInt();
        System.out.print("Enter Height: ");
        int height=sc.nextInt();
        float s=width*height;
        System.out.print("Area is: "+s);
    }
}
