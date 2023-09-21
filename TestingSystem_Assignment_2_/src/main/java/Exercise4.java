import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
        question05();
        question06();
        question07();
    }

    public static void question01(){
        System.out.println("✾ Question01: ");
        Random random = new Random();
        System.out.println( "So nguyen ngau nhien: " + random.nextInt());
    }
    public static void question02(){

        System.out.println("\n✾ Question02: ");
        Random random = new Random();
        System.out.println("So thuc ngau nhien: "+random.nextDouble());
    }
    public static void question03(){
        System.out.println("\n ✾ Question03: Khai bao mot array bao gom cac ten cua cac ban trong lop, " +
                "sau do in ra ngau nhien ten cua mot ban");
        Random random = new Random();
        String[] names = {"Trang", "Hang", "Duy", "Tai"};
        //0 <= index <length
        int i =random.nextInt(names.length);
        System.out.println("Ten ngau nhien: " + names[i]);

    }
    public static void question04(){
        System.out.println("\n✾ Question04: Lay ra ngau nhien mot ngay trong khoang thoi gian tu 24/7/1995 den ngay 20/10/1995 ");
        Random random= new Random();
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 10, 20).toEpochDay();
        System.out.println("minDay: "+minDay);
        System.out.println("maxDay :"+maxDay);
        long randomInt = minDay + random.nextInt(maxDay-minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
        System.out.println("Ngay ngau nhien: "+ randomDay);
    }

    public static void question05(){
        System.out.println("\n✾ Question05: Lay ngau nhien mot ngay trong khoang thoi gian tu mot nam tro lai day: ");

        int now = (int) LocalDate.now().toEpochDay();
        Random random = new Random();
        int randomDate = now - random.nextInt(365);
        LocalDate resultDate = LocalDate.ofEpochDay(randomDate);
        System.out.println("Ngay ngau nhien la : "+ resultDate);

    }
    public static void question06(){
        System.out.println("\n✾ Question06: Lay ngau nhien mot ngay trong qua khu");
        int maxDay1 = (int) LocalDate.now().toEpochDay();
        Random random = new Random();
        int randomDate1 = random.nextInt(maxDay1);
        LocalDate resultDate1 = LocalDate.ofEpochDay(randomDate1);
        System.out.println("Ngay ngau nhien trong qua khu: "+resultDate1);

    }





    public static void question07(){
        System.out.println("\n✾ Question 07: Lay ngau nhien mot so co 3 chu so");
        Random random = new Random();
        int x = random.nextInt(1000-100)+100;
        System.out.println("So co 3 chu so la : "+x);


    }
}
