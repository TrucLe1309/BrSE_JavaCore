import java.util.Random;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();

    }

    public static void question01(){
        float salary1;
        float salary2;
        salary1= 5240.5f;
        salary2= 10970.055f;

        int s1= (int) salary1;
        int s2 = (int) salary2;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

    }
    public static int question02(){
        Random random = new Random();
        int n = 10000 + random.nextInt(99999-10000 +1);
        return n;

    }
    public static void question03(){
        //q2=12345
        int q2 = question02();
        System.out.println("q2 = " + q2);
        System.out.println("Hai so cuoi la: "+ q2%100);
        // 00 <= x <=99
        //00 <= y <= 99
    }
    public static void question04() {
        //Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a = ");
        int a = scanner.nextInt();
        System.out.println("Nhap b = ");
        int b = scanner.nextInt();
        System.out.println("Ket qua la:" + (double) a / b);
    }


}
