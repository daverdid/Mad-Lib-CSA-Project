import java.util.Scanner;

public class madlibs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = sc.next();

        System.out.println("Type your friend's name:");
        String friend = sc.next();

        System.out.println("Type a place:");
        String place = sc.next();

        System.out.println("Type a food:");
        String food = sc.next();
        
        System.out.println("Type a second place:");
        String secondplace = sc.next();

        String story = "Yesterday, <name> and <friend> decided to go to <place> to get some fresh air. While walking around, they suddenly spotted a gigantic piece of <food> sitting on a bench. Without hesitating, <friend> grabbed it and ran all the way to <secondplace>. <name> laughed so hard that they tripped over a trash can and fell flat on their face.";

    }
}
