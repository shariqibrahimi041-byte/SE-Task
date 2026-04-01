import java.util.Scanner;

public class Teacher{
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    static String[] names = new String[100];
    static String[] subjects = new String[100];
    static String[] emails = new String[100];
    static int[] ages = new int[100];

    public static void main(String[] args) {
        System.out.println("TEACHER MANAGEMENT");

        while(true) {
            System.out.println("\n1. Add  2. View  3. Search  4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // Menu ke baad buffer clear ✅

            if(ch==1) add();
            else if(ch==2) view();
            else if(ch==3) search();
            else if(ch==4) {
                System.out.println("Bye!");
                break;
            }
        }
    }

    static void add() {
        System.out.print("Name: ");
        names[count] = sc.nextLine();

        System.out.print("Subject: ");
        subjects[count] = sc.nextLine();

        System.out.print("Email: ");
        emails[count] = sc.nextLine();

        System.out.print("Age: ");
        ages[count] = sc.nextInt();
        sc.nextLine(); // int ke baad buffer clear ✅

        System.out.println("✅ Added! Total: " + ++count);
    }

    static void view() {
        if(count==0) {
            System.out.println("No teachers!");
            return;
        }

        System.out.println("\n📚 TEACHERS (" + count + "):");
        System.out.println("ID | Name       | Subject  | Email");
        System.out.println("--|----------------|----------|---------------");

        for(int i=0; i<count; i++) {
            System.out.printf("%-2d | %-11s | %-8s | %s%n",
                    (i+1), names[i], subjects[i], emails[i]);
        }
    }

    static void search() {
        System.out.print("Name: ");
        String find = sc.nextLine(); // direct input ✅

        for(int i=0; i<count; i++) {
            if(names[i].toLowerCase().contains(find.toLowerCase())) {
                System.out.println("Found: " + names[i] + " - " + subjects[i]);
                return;
            }
        }
        System.out.println("Not found!");
    }
}