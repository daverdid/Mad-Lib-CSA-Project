import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String story = "I went to the zoo with <noun1> to see a <noun2>. " + "There were people <verb1> around the enclosure which made the <adjective1> apes go bananas. " +  "My friend <noun3> started to <verb2> near <place>. ";
        
        System.out.print("Enter a name: ");
        String noun1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        String noun2 = scanner.nextLine();
        System.out.print("Enter a verb (ending in -ing): ");
        String verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.print("Enter a friend's name: ");
        String noun3 = scanner.nextLine();
        System.out.print("Enter an action verb: ");
        String verb2 = scanner.nextLine();
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();
        
        int noun1Index = story.indexOf("<noun1>");
        int noun2Index = story.indexOf("<noun2>");
        int verb1Index = story.indexOf("<verb1>");
        int adjective1Index = story.indexOf("<adjective1>");
        int noun3Index = story.indexOf("<noun3>");
        int verb2Index = story.indexOf("<verb2>");
        int placeIndex = story.indexOf("<place>");
        
        String part1 = story.substring(0, noun1Index);
        String part2 = story.substring(noun1Index + 7, noun2Index);
        String part3 = story.substring(noun2Index + 7, verb1Index);
        String part4 = story.substring(verb1Index + 7, adjective1Index);
        String part5 = story.substring(adjective1Index + 12, noun3Index);
        String part6 = story.substring(noun3Index + 7, verb2Index);
        String part7 = story.substring(verb2Index + 7, placeIndex);
        System.out.println(part1 + noun1 + part2 + noun2 + part3 + verb1 + part4 + adjective1 +  part5 + noun3 + part6 + verb2 + part7 + place);
        scanner.close();
    }
}
