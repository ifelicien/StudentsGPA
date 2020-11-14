import java.util.Scanner;
import java.util.ArrayList;

public class gpaCounter {
    public static void main(String[] args) {
        String myClassName = subjectName();
        getName(myClassName);


    }

    public static String subjectName(){
        System.out.println("please select a subject: ");
        System.out.println("1. English\n2. Math\n3. Science\n4. Reading\n5. Writing");

        String [] subjectArray = {"English", "Math", "Science", "Reading", "Writing"};
        Scanner subjSelector = new Scanner(System.in);
        int subjSel = subjSelector.nextInt();

        switch (subjSel){
            case 1 :
                return subjectArray[0];
            case 2 :
                return subjectArray[1];
            case 3 :
                return subjectArray[2];
            case 4 :
                return subjectArray[3];
            case 5 :
                return subjectArray[4];
            default:
                return subjectName();

        }
    }

    public static String getName(String className){

        Scanner nameGetter = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("enter the students name: ");

        for(int i = 0; i < 2; i++){
            String studentName = nameGetter.next();
            names.add(studentName);
        }

        System.out.println(className + " " + names.get(0));
        return null;
    }


}
