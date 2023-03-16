import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws MyException {

        //Студент болсун сизде анын аты жана электрондук почтасы болсун
        // . Мэйнден Map тузунуз, ключ студенттин электрондук почтасы болсун, мааниси аты болот.
        // студент класстын бир объектин тузуп ошол объектти Мар ге салыныз.
        // Анан консолдон жаны студент тин маанилерин бериниз,
        // бирок маанилерди киргизгенче текшериниз сиздин базанызда ушундай эмайл мн студент барбы же жокбу деп,
        // жок болсо студентге маанилерди киргизип анан ал студентти базага кошунуз, эгерде ушундай эмайл мн студент
        // бар болсо «сиздин базанызда мындай эмайл менен студент бар» деп чыксын

        Map<String, String> students = new HashMap<>();
        Student students1 = new Student("Abdymomun", "Abdymomun@Gmail.com");
        Scanner scanner = new Scanner(System.in);
        students.put("example@email.com", "Example Student");
        String name = new Scanner(System.in).nextLine();

        try {
            if (students1.getName().toUpperCase().equals(name)) {
                throw new MyException("Name is same");
            }


            System.out.print("Enter student email: ");
            String email = scanner.nextLine();

            if (students.containsKey(email)) {
                System.out.println("Сиздин маалымат базаңызда бул электрондук почтасы бар студент мурунтан эле бар.");
            } else {
                if (!email.contains("@")) {
                    throw new MyException("Write @");
                }
                if (students1.getEmail().toUpperCase().equals(email)) {
                    throw new MyException("gmail is same");
                } else {
Student student = new Student(name,email);
Map<String,String>stringStringMap = new HashMap<>();
stringStringMap.put(students1.getEmail().toUpperCase(), students1.getName().toUpperCase());
stringStringMap.put(student.getEmail().toUpperCase(), student.getName().toUpperCase());
                    System.out.println(stringStringMap);

                }
            }

        }catch (MyException e){
            System.out.println(e.getMessage());
        }

    }
}