import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Exercise04 {
    public static void main(String[] args) {
        //question01();
        //question02();
        //question03();
        //question04();
        //question05();
        //question06();
        //question07();
        //question08();
        //question09();
        //question10c2("anh", "hna");
        //question10c1();
        //question11();
        //question12("Ngay nao do");
        //question13cach1();
        //question13cach2();
        //question14();
       // question15();
        question16("anh  anh  ", 5);
    }

    //String
    private static final Scanner scanner = new Scanner(System.in);
    private static void question01(){
       // Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
        //thể cách nhau bằng nhiều khoảng trắng );
        String s1;

        System.out.println("Nhap chuoi: ");
        s1 = scanner.nextLine();
        String[] words = s1.split(" ");
        System.out.println("So ki tu: "+ words.length);
        scanner.close();
    }
    private static void question02(){
        //Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1
        System.out.println("Nhap vao 2 xau ki tu: ");
        System.out.println("Nhap vao xau ki tu thu nhat: ");
        String s1 = scanner.nextLine();

        System.out.println("Nhap vao xau ki tu thu hai: ");
        String s2 = scanner.nextLine();

        String s = s1.concat(s2);
        System.out.printf("Ket qua noi chuoi: %s.%n",s);

    }
    private static void question03(){
        //Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
        //viết hoa chữ cái đầu thì viết hoa lên
        System.out.println("Nhap vao ten: ");
        String name = scanner.next();
        System.out.printf("Ket qua: %s", StringUtils.capitalize(name));
    }
    private static void question04(){
        /*Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
        của người dùng ra
        VD:
        Người dùng nhập vào "Nam", hệ thống sẽ in ra
        "Ký tự thứ 1 là: N"
        "Ký tự thứ 1 là: A"
        "Ký tự thứ 1 là: M"*/
        System.out.println("Nhap vao ten: ");
        String name = scanner.next();
        for(int i=0; i<name.length(); i++) {
            System.out.printf("Ki tu thu %d la: %C. %n", i + 1, name.charAt(i));

        }
        }
    private static void question05(){
        System.out.println("Nhap vao ho: ");
        String ho = scanner.next();

        scanner.nextLine();
        System.out.println("Nhap vao ten: ");
        String ten = scanner.nextLine();

        System.out.printf("Ho va ten: %s %s%n", ho, ten);
    }

    private static void  question06(){
        /*Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
        sau đó hệ thống sẽ tách ra họ, tên , tên đệm
        VD:
        Người dùng nhập vào "Nguyễn Văn Nam"
        Hệ thống sẽ in ra
        "Họ là: Nguyễn"
        "Tên đệm là: Văn"
        "Tên là: Nam"*/
        System.out.println("Nhap vao ho va ten: ");
        String fullName = scanner.nextLine();
        String[] words = fullName.trim().split("\\s+");
        System.out.printf("Ho la: %s%n", words[0]);
        System.out.printf("Ten dem la: %s%n", String.join(" ", Arrays.copyOfRange(words,1,words.length-1)
        ));
        System.out.printf("Ten la: %s%n",words[words.length-1]);
    }


    private static void question08() {
        //In ra tất cả các group có chứa chữ "Java"
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.contains("Java")) {
                System.out.printf("Ket qua group: %s.%n", group);
            }
        }
    }
    private static void question09() {
        //In ra tất cả các group "Java"
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.equals("Java")) {
                System.out.printf("Ket qua group = %s.%n", group);
            }
        }
    }
    private static void  question10c1(){
        //Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
        //Nếu có xuất ra “OK” ngược lại “KO”.
        //Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
        Scanner scanner = new Scanner(System.in);
        String s1, s2, reverseS1 = "";
        System.out.println("Nhập chuỗi 1");
        s1 = scanner.nextLine();
        System.out.println("Nhập chuỗi 2");
        s2 = scanner.nextLine();
        scanner.close();
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverseS1 += s1.substring(i, i + 1);
        }
        if (s2.equals(reverseS1)) {
            System.out.println("OK");
        }
        else {
            System.out.println("KO");
        }

    }
    private static void question10c2(String s1, String s2) {
        String s = new StringBuilder(s2).reverse().toString();
        System.out.printf("=> %s.%n", s.equals(s1) ? "OK" : "KO"); /*toán tử ternary*/

    }

    private  static void question11(){
        /*Count special Character: Tìm số lần xuất hiện ký tự "a" trong chuỗi*/
        char kyTu = 'a';
        int count = 0;
        System.out.println("Nhap vao mot chuoi: ");
        String string = scanner.nextLine();

        scanner.close();

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == kyTu)
                count++;
        }
        System.out.println("So lan xuat hien ky tu 'a' trong chuoi " +"'" +string+"'" +" la: "+count);
    }

    private static void question12(String s){
        //Reverse String : Đảo ngược chuỗi sử dụng vong lap
        System.out.printf("Chuoi dao ngguoc la: %s.%n", new StringBuilder(s).reverse());

    }
    private static void question13cach1(){
       //Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false, ngược lại true.
        String str;
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < str.length(); i++) {
            if (checkKeyNumber(str.charAt(i))) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    public static boolean checkKeyNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;

    }

    private static void question13cach2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.println(" FALSE.");
                return;
            }
        }
        System.out.println(" TRUE.");
    }
    private static void question14( ){
        String s = "TET den noi roi";
        String replace = s.replace("TET", "Tet Tet Tet");
        System.out.println("repalce = " + replace);
    }
    private static void question15(){
        System.out.println("Nhap vao mot chuoi: ");
        String s =scanner.nextLine();
        String[] words = s.trim().split("\\s+");

        
    }
    private static void question15(String s) {
        String str;
        System.out.println("Chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

       String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }


        private static void question16 (String s,int n){
        /*Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
            bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
            hình “KO”.*/
            if (s.length() % n != 0) {
                System.out.println("=> KO.");
            }
        }



    }


