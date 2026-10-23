import java.util.Scanner;

public class madlibs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String story = "I went to the zoo with <noun1> to see a <noun2>. " + "There were people <verb1> around the enclosure which made the <adjective1> apes go bananas. " +  "My friend <noun3> started to <verb2> near <place>. " + "I was so <adjective2> that I had to <verb3> and leave the zoo with my <noun4>.";
        
        System.out.println("Enter a name: ");
        String noun1 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        String noun2 = scanner.nextLine();
        System.out.println("Enter a verb (ending in -ing): ");
        String verb1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.println("Enter a friend's name: ");
        String noun3 = scanner.nextLine();
        System.out.println("Enter an action verb: ");
        String verb2 = scanner.nextLine();
        System.out.println("Enter a place: ");
        String place = scanner.nextLine();
        System.out.println("Emter a noun:");
        String noun4 = scanner.nextLine();
        System.out.println("Emter a verb:");
        String verb3 = scanner.nextLine();
        System.out.println("Emter an adjective:");
        String adjective2 = scanner.nextLine();
        
        int noun1Index = story.indexOf("<noun1>");
        int noun2Index = story.indexOf("<noun2>");
        int verb1Index = story.indexOf("<verb1>");
        int adjective1Index = story.indexOf("<adjective1>");
        int noun3Index = story.indexOf("<noun3>");
        int verb2Index = story.indexOf("<verb2>");
        int placeIndex = story.indexOf("<place>");
        int noun4Index = story.indexOf("<noun4>");
        int verb3Index = story.indexOf("<verb3>");
        int adjective2Index = story.indexOf("<adjective2>");

        String part1 = story.substring(0, noun1Index);
        String part2 = story.substring(noun1Index + 7, noun2Index);
        String part3 = story.substring(noun2Index + 7, verb1Index);
        String part4 = story.substring(verb1Index + 7, adjective1Index);
        String part5 = story.substring(adjective1Index + 12, noun3Index);
        String part6 = story.substring(noun3Index + 7, verb2Index);
        String part7 = story.substring(verb2Index + 7, placeIndex);
        String part8 = story.substring(placeIndex + 6, noun4Index);
        String part9 = story.substring(noun4Index + 7, verb3Index);
        String part10 = story.substring(verb3Index + 7, adjective2Index);

        System.out.println(part1 + noun1 + part2 + noun2 + part3 + verb1 + part4 + adjective1 +  part5 + noun3 + part6 + verb2 + part7 + place + part8 + noun4 + part9 + verb3 + part10 + adjective2);
        scanner.close();
    }
}
