import java.util.Scanner;

public class madlibs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a noun:");
        String name = sc.next();

        System.out.println("Type a verb:");
        String friend = sc.next();

        System.out.println("Type an adjective:");
        String place = sc.next();


        String story = "I went to the zoo to see a <noun>. There were people <verb> around the enclosure which made the <adjective> apes go bananas.";

    }
}
