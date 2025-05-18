
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class MusicAppIntro {

    private Scanner sc = new Scanner(System.in);
    private UserProfile user = new UserProfile();

    private int question1;
    private int question2;
    private int question3;
    private int question4;
    private int question5;
    private int question6;
    private int question7;
    private int question8;
    private int question9;
    private int question10;

    private String name;



    public void start() {
        System.out.println("\n" +
                "                     .__                         __         .__      \n" +
                "  _____  __ __  _____|__| ____     _____ _____ _/  |_  ____ |  |__   \n" +
                " /     \\|  |  \\/  ___/  |/ ___\\   /     \\\\__  \\\\   __\\/ ___\\|  |  \\  \n" +
                "|  Y Y  \\  |  /\\___ \\|  \\  \\___  |  Y Y  \\/ __ \\|  | \\  \\___|   Y  \\ \n" +
                "|__|_|  /____//____  >__|\\___  > |__|_|  (____  /__|  \\___  >___|  / \n" +
                "      \\/           \\/        \\/        \\/     \\/          \\/     \\/  \n");
        System.out.println("~~~TIME TO DISCOVER YOUR MUSICAL MATCH~~~");

        //Greeting
        System.out.print("Enter your name or nickname: ");
        name = sc.nextLine();
        System.out.println("\nHi " + name + ".\nAnswer a few questions, unlock your perfect genre");

        //Test
        AskQuestions();

        //Matching
        matcher();
        MusicGenre genre = GenreMatcher.match(user);

        //Results
        System.out.println("═══════════════════════════════════════════════════════════════════════\n" +
                "\uD83C\uDFB6 Discover Your Sound: Music Genre Vibes & Starter Tracks\n" +
                "═══════════════════════════════════════════════════════════════════════\n");

        System.out.println("Your perfect genre is " + genre.getName());
        System.out.println(genre.getDescription());
        genre.playSample();

        //File

        writeFile(name, genre.getName());
    }
    private void AskQuestions() {

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     What's your ideal weekend plan?                        ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Party all night                                         ║");
        System.out.println("║ 2. Coffee shop & books                                     ║");
        System.out.println("║ 3. Road trip with loud music                               ║");
        System.out.println("║ 4. Art gallery or indie film                               ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question1 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     Pick a word that resonates with you:                   ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Freedom                                                 ║");
        System.out.println("║ 2. Flow                                                    ║");
        System.out.println("║ 3. Soul                                                    ║");
        System.out.println("║ 4. Depth                                                   ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question2 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     What do you focus on more in music?                    ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Lyrics                                                  ║");
        System.out.println("║ 2. Melody                                                  ║");
        System.out.println("║ 3. Energy                                                  ║");
        System.out.println("║ 4. Mood                                                    ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question3 = askValidatedInput(sc, 1, 4);


        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     What kind of style do you prefer?                      ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Streetwear & bold                                       ║");
        System.out.println("║ 2. Retro & smooth                                          ║");
        System.out.println("║ 3. Leather & edgy                                          ║");
        System.out.println("║ 4. Trendy & bright                                         ║");
        System.out.println("║ 5. Artsy & chill                                           ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-5): ");
        question4 = askValidatedInput(sc, 1, 5);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     Choose a perfect music setting:                        ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Headphones while walking                                ║");
        System.out.println("║ 2. Live band in a lounge                                   ║");
        System.out.println("║ 3. Stadium concert                                         ║");
        System.out.println("║ 4. Car ride with bass                                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question5 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     What’s your favorite type of dance?                    ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Hip-hop dance                                           ║");
        System.out.println("║ 2. Slow dance                                              ║");
        System.out.println("║ 3. Headbanging                                             ║");
        System.out.println("║ 4. Groove dance                                            ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question6 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     How do you prefer your music:                          ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Hard and aggressive                                     ║");
        System.out.println("║ 2. Soft and smooth                                         ║");
        System.out.println("║ 3. Catchy and upbeat                                       ║");
        System.out.println("║ 4. Deep and atmospheric                                    ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question7 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     What’s your energy level in the morning?               ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Full of energy and ready to go                          ║");
        System.out.println("║ 2. Calm and peaceful                                       ║");
        System.out.println("║ 3. I need something to wake me up                          ║");
        System.out.println("║ 4. Slow and laid back                                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question8 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     Which decade has the best music in your opinion?       ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. 70s                                                     ║");
        System.out.println("║ 2. 80s                                                     ║");
        System.out.println("║ 3. 90s                                                     ║");
        System.out.println("║ 4. 2000s                                                   ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question9 = askValidatedInput(sc, 1, 4);

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     How do you feel about spontaneous moments?             ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Love them!                                              ║");
        System.out.println("║ 2. I prefer planning everything                            ║");
        System.out.println("║ 3. I need a balance between the two                        ║");
        System.out.println("║ 4. Spontaneity scares me                                   ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("Your choice (1-4): ");
        question10 = askValidatedInput(sc, 1, 4);
        }

    private int askValidatedInput(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.println("Please enter a number between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Try again!");
            }
        }
    }

    public void matcher() {
        // Question 1
        switch (question1) {
            case 1:
                user.selectPartyPerson();
                break;
            case 2, 4:
                user.selectSilentSeeker();
                break;
            case 3:
                user.selectLikesAdventure();
                break;
        }

        // Question 2
        switch (question2) {
            case 1, 2:
                user.selectValuesFreedom();
                break;
            case 3, 4:
                user.selectValuesDepth();
                break;
        }

        // Question 3
        switch (question3) {
            case 1:
                user.selectFocusLyrics();
                break;
            case 2:
                user.selectFocusMelody();
                break;
            case 3:
                user.selectFocusEnergy();
                break;
            case 4:
                user.selectFocusMood();
                break;
        }

        // Question 4
        switch (question4) {
            case 1:
                user.selectLikesStreetStyle();
                break;
            case 2:
                user.selectLikesRetroStyle();
                break;
            case 3:
                user.selectLikesTrendyStyle();
                break;
            case 4:
                user.selectLikesArtsyStyle();
                break;
        }

        // Question 5
        switch (question5) {
            case 1, 4:
                user.selectListensNotLive();
                break;
            case 2, 3:
                user.selectListensLive();
                break;
        }

        // Question 6
        switch (question6) {
            case 1, 3:
                user.selectLikesEnergeticMoves();
                break;
            case 2, 4:
                user.selectLikesSmoothDance();
                break;
        }

        // Question 7
        switch (question7) {
            case 1, 3:
                user.selectLikesHardAggressive();
                break;
            case 2, 4:
                user.selectLikesSoftSmooth();
                break;
        }

        // Question 8
        switch (question8) {
            case 1:
                user.selectMorningBooster();
                break;
            case 2:
                user.selectCalmStarter();
                break;
            case 3:
                user.selectNeedsWakeupMusic();
                break;
            case 4:
                user.selectStartsSlowly();
                break;
        }

        // Question 9
        switch (question9) {
            case 1:
                user.selectPrefersSeventies();
                break;
            case 2:
                user.selectPrefersEighties();
                break;
            case 3:
                user.selectPrefersNineties();
                break;
            case 4:
                user.selectPrefersTwoThousands();
                break;
        }

        // Question 10
        switch (question10) {
            case 1:
                user.selectLovesSpontaneity();
                break;
            case 2:
                user.selectPrefersPlanning();
                break;
            case 3:
                user.selectBalancedApproach();
                break;
            case 4:
                user.selectFearsSpontaneity();
                break;
        }
    }


    public void writeFile(String name, String genreName) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write("══════════════════════════════════════════════\n");
            writer.write("User: " + name + " | Best Genre: " + genreName + "\n");
            writer.write("──────────────────────────────────────────────\n");
            writer.write("Active Profile Traits:\n");

            // Check and write all true boolean flags
            if (user.isPartyPerson()) writer.write("- Party Person\n");
            if (user.isLikesAdventure()) writer.write("- Adventure Lover\n");
            if (user.isSilentSeeker()) writer.write("- Silent Seeker\n");
            if (user.isValuesFreedom()) writer.write("- Values Freedom\n");
            if (user.isValuesDepth()) writer.write("- Values Depth\n");
            if (user.isFocusLyrics()) writer.write("- Focuses on Lyrics\n");
            if (user.isFocusMelody()) writer.write("- Focuses on Melody\n");
            if (user.isFocusEnergy()) writer.write("- Focuses on Energy\n");
            if (user.isFocusMood()) writer.write("- Focuses on Mood\n");
            if (user.isLikesStreetStyle()) writer.write("- Likes Street Style\n");
            if (user.isLikesRetroStyle()) writer.write("- Likes Retro Style\n");
            if (user.isLikesEdgyStyle()) writer.write("- Likes Edgy Style\n");
            if (user.isLikesTrendyStyle()) writer.write("- Likes Trendy Style\n");
            if (user.isLikesArtsyStyle()) writer.write("- Likes Artsy Style\n");
            if (user.isListensLive()) writer.write("- Prefers Live Music\n");
            if (user.isListensNotLive()) writer.write("- Prefers Recorded Music\n");
            if (user.isLikesEnergeticMoves()) writer.write("- Likes Energetic Dancing\n");
            if (user.isLikesSmoothDance()) writer.write("- Likes Smooth Dancing\n");
            if (user.isMorningBooster()) writer.write("- Morning Energy Booster\n");
            if (user.isCalmStarter()) writer.write("- Calm Morning Person\n");
            if (user.isNeedsWakeupMusic()) writer.write("- Needs Wake-Up Music\n");
            if (user.isStartsSlowly()) writer.write("- Slow Starter\n");
            if (user.isPrefersSeventies()) writer.write("- Loves 70s Music\n");
            if (user.isPrefersEighties()) writer.write("- Loves 80s Music\n");
            if (user.isPrefersNineties()) writer.write("- Loves 90s Music\n");
            if (user.isPrefersTwoThousands()) writer.write("- Loves 2000s Music\n");
            if (user.isLikesHardAggressive()) writer.write("- Likes Hard/Aggressive Music\n");
            if (user.isLikesSoftSmooth()) writer.write("- Likes Soft/Smooth Music\n");
            if (user.isLovesSpontaneity()) writer.write("- Loves Spontaneity\n");
            if (user.isPrefersPlanning()) writer.write("- Prefers Planning\n");
            if (user.isBalancedApproach()) writer.write("- Balanced Lifestyle\n");
            if (user.isFearsSpontaneity()) writer.write("- Dislikes Spontaneity\n");

            writer.write("══════════════════════════════════════════════\n\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }



    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public int getQuestion1() {
        return question1;
    }

    public void setQuestion1(int question1) {
        this.question1 = question1;
    }

    public int getQuestion2() {
        return question2;
    }

    public void setQuestion2(int question2) {
        this.question2 = question2;
    }

    public int getQuestion3() {
        return question3;
    }

    public void setQuestion3(int question3) {
        this.question3 = question3;
    }

    public int getQuestion4() {
        return question4;
    }

    public void setQuestion4(int question4) {
        this.question4 = question4;
    }

    public int getQuestion5() {
        return question5;
    }

    public void setQuestion5(int question5) {
        this.question5 = question5;
    }

    public int getQuestion6() {
        return question6;
    }

    public void setQuestion6(int question6) {
        this.question6 = question6;
    }

    public int getQuestion7() {
        return question7;
    }

    public void setQuestion7(int question7) {
        this.question7 = question7;
    }

    public int getQuestion8() {
        return question8;
    }

    public void setQuestion8(int question8) {
        this.question8 = question8;
    }

    public int getQuestion9() {
        return question9;
    }

    public void setQuestion9(int question9) {
        this.question9 = question9;
    }

    public int getQuestion10() {
        return question10;
    }

    public void setQuestion10(int question10) {
        this.question10 = question10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
