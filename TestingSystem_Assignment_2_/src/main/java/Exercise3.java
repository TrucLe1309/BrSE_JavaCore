import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("EXERCISE 3: DATE FORMAT\n");
        Question01();
        //question02();
        question03();
        question04();
        question05();


    }
    public static void Question01(){
        Exam exam1 = new Exam();
        exam1.id =1;
        exam1.code= "abc";
        exam1.title = "Java Core";
        exam1.createDate = LocalDate.from(LocalDateTime.of(2021,9,9,9,9));

        System.out.println("\nQuestion01: In ra thong tin exam thu 1 va property create date" +
                "se duoc format theo  dinh dang vietnamese ");
        System.out.println("Chu de exam la: "+exam1.title);
        System.out.println("Ma code: "+exam1.code);
        System.out.println("ID: "+ exam1.id);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(new Locale("vi", "VN"));
        System.out.println("CreateDate: "+exam1.createDate.format(formatter));


    }


    public static void question02() {
        Exam exam = new Exam();
        exam.createDate = LocalDate.from(LocalDateTime.now());
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy - MM - dd - HH - mm - ss");
        System.out.println("CreatedDate = "+exam.createDate.format(formatter1));
    }


    public static void question03(){
        System.out.println("Question 3:\n" +
                "Chỉ in ra năm của create date property trong Question 2");
        Exam exam = new Exam();
        exam.createDate = LocalDate.from(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("exam.createdDate = " + exam.createDate.format(formatter));

    }
    public static void question04(){
        System.out.println("Question 4:\n" +
                "Chỉ in ra tháng và năm của create date property trong Question 2");
        Exam exam = new Exam();
        exam.createDate = LocalDate.from((LocalDateTime.now()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy");
        System.out.println("exam.CreatedDate   = " +exam.createDate.format(formatter));

    }
    public static void question05(){
        System.out.println("Question 5:\n" +
                "Chỉ in ra \"MM-dd\" của create date trong Question 2");
        Exam exam = new Exam();
        exam.createDate = LocalDate.from((LocalDateTime.now()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println("CratedDate = "+ exam.createDate.format(formatter));

    }


}
