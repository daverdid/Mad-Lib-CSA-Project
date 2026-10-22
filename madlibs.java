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

        String story = "Yesterday, <name> decided to leave their house to get some fresh air. While walking around, they saw <friend>. Then they suddenly spotted a gigantic piece of <food> sitting on a bench. Without hesitating, they grabbed it and ran all the way to <place>. They laughed so hard then went to <secondplace> to celebrate their find.";

        int nameIndex = story.indexOf("<name>");
        int friendIndex = story.indexOf("<friend>");
        int placeIndex = story.indexOf("<place>");
        int foodIndex = story.indexOf("<food>");
        int secondplaceIndex = story.indexOf("<secondplace>");
    }
}
