import java.util.Scanner;

public class madlibs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = sc.next();

        System.out.println("Yesterday, " + name + " and " + friend + " decided to go to " + place + " to get some fresh air. ");
        System.out.println("While walking around, they suddenly spotted a gigantic piece of " + food + " sitting on a bench. ");
        System.out.println("Without hesitating, " + friend + " grabbed it and ran all the way to " + secondPlace + ". ");
        System.out.println(name + " laughed so hard that they tripped over a trash can and fell flat on their face.");

    }
}
