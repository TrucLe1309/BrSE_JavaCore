import entity.Department;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise05 {
    public static void main(String[] args) {
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";
        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";
        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Boss of director";
        Department department4 = new Department();
        department4.id = 4;
        department4.name = "Waiting room";
        Department department5 = new Department();
        department5.id = 5;
        department5.name = "Accounting";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;




        System.out.println("Question02: ");
        for (Department department : departments) {
            System.out.println(" department = " + department.toString());
        }



    question01(department1);
    question03(department1);
    question4(department1);
    question5(department1,department2);
    question06();
    question07();
    }
    public static void question01(Department department){
        System.out.println("Question 1: department = " + department.toString());
    }
    public static void question03(Department department){
    System.out.println("Question03: In ra địa chỉ của phòng ban thứ 1");
        System.out.println(department.hashCode());}

    public static void question4(Department department) {
        System.out.println("Question04: Kiểm tra xem phòng ban thứ 1 có tên là \"Phòng A\" không?");

        if (department.name.equals("Phòng A")) {
            System.out.println("Có tên là phòng A");
        } else {
            System.out.println("Không tên là phòng A");
        }
    }
    public static void question5(Department department1, Department department2) {
        if (department1.equals(department2)) {
            System.out.println("Có bằng nhau !");
        } else {
            System.out.println("Không bằng nhau !");
        }
    }
    public static void question6(Department[] departments) {

// order by
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                if (departments[i].name.compareToIgnoreCase(departments[j].name) < 0) {
// swap
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }

    }
    private static void question06() {
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort(Comparator.naturalOrder());
        for (String department : departments) {
            System.out.println("department = " + department);
        }
    }
    private static void question07() {
        System.out.println("\nQuestion07");
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort((o1, o2) -> {
            String lastWord1 = o1.substring(o1.lastIndexOf(" ") + 1);
            String lastWord2 = o2.substring(o2.lastIndexOf(" ") + 1);
            return lastWord1.compareToIgnoreCase(lastWord2);
        });
        for (String department : departments) {
            System.out.println("department = " + department);
        }
    }
}


