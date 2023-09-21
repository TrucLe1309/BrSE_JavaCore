public class Exercise03 {
    public static void main(String[] args) {
    question01();
    question02();
    question03();
    }
    private static void question01(){
        Integer salary = 5000;
        System.out.printf("Salary = %.2f%n",salary.floatValue() );

    }
    private static void question02(){
        //Khai báo 1 String có value = "1234567"
        //Hãy convert String đó ra số int
        int n = Integer.parseInt("1234567");
        System.out.println("n = " + n);
    }
    private static void question03(){
        //Khởi tạo 1 số Integer có value là chữ "1234567"
        //Sau đó convert số trên thành datatype int
        Integer i = 1234567;
        int i1= i.intValue();
        System.out.println("i1 = " + i1);

    }
}
