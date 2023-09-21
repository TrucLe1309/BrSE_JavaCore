import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {
    public static void main(String[] args) {
    Question1();
    Question2();
    Question3();
    Question4();
    Question5();


    }
// Question1: Khai bao mot so nguyen bang 5 va su dung lenh System de in ta so nguyen do

    public static void Question1() {
        System.out.println("*　Question1: Khai bao mot so nguyen bang 5 va su dung lenh System de in ta so nguyen do"
        );
        int i = 5;
        System.out.printf("%d%n", i);
    }
///Question2
    public static void Question2() {
        System.out.println("\n*　Question 2: Khai bao mot so nguyen = 100 000 000 va su dung lenh sytem de in ra " +
                "so nguyen do thanh dinh sang nhu sau: 100,000,000");
        int j = 100000000;
        System.out.printf(Locale.US, "%,d%n ", j);
    }
//Question3

   public static void Question3(){
       System.out.println("\n*　Question3: Khai bao 1 so thuc =5,567098 va su dung lenh System" +
               " de in ra so thuc do chi bao gom 4 so dang sau");
       float a= 5.567098f ;
       System.out.printf("%5.4f%n", a);
   }

//Question4
    public static void Question4(){
        System.out.println("\n*　Question4: Khai bao ho va ten cua 1 hoc sinh va in ra" +
                "ho va ten hoc sinh do theo dinh dang nhu sau:");
        String b="Nguyen Van A";
        System.out.println("Ten toi la %b va toi dang doc than");

    }

//Question5
    public static void Question5(){
        System.out.println("\n* Question5: Lay thoi gian bay gio va in ra theo dinh dang sau ");
        String pattern ="dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

    }

    public static void Question6(){
        System.out.println("Question06: In ra thong tin account (nhu question 8 phan FOREACH theo dinh dang table" +
                "giong trong Daatabase");


    }

}
