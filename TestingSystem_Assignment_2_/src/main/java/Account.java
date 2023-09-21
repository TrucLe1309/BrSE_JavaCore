import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    int id;
    String email;
    String userName;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;
    Group[] groups;

    @Override
    public String toString() {
        return "Account {" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department.name +
                ", position=" + position.name +
                ", createDate=" + createDate +
                '}';
    }
}
