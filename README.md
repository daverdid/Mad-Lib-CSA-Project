# Mad Libs Java Program

This project is a simple Java-based Mad Libs game that asks the user for words such as nouns, verbs, adjectives, and places, then fills them into a story.

## Files

- `madlibs.java` - The Java source file containing the Mad Libs logic.

## How to Run

1. Open a terminal in this folder.
2. Compile the program:
   ```bash
   javac madlibs.java
   ```
3. Run the program:
   ```bash
   java madlibs
   ```

## What It Does

The program prompts the user for several words and then prints a completed story based on the inputs.

## Example

A sample story may look like this after input:

> I went to the zoo with Mia to see a tiger. There were people laughing around the enclosure which made the playful apes go bananas. My friend Sam started to run near the park. I was so excited that I had to sprint and leave the zoo with my backpack.

## Notes

- The program uses `Scanner` to read user input.
- It replaces placeholders like `<noun1>`, `<verb2>`, and `<adjective1>` in the story.
