public class Pop extends MusicGenre{

    public Pop() {
        setName("Pop music");
        setDescription("Pop music is catchy, emotional, and designed to be universally enjoyable." +
                " It focuses on melody, relatable themes, and vibrant production. " +
                "Great for dancing, driving, or just vibing.");
    }

    public void playSample () {
        System.out.println("\nTry these tracks:\n" +
               "Diana Ross – Upside Down\n" +
               "Sabrina Carpenter – Busy Woman \n" +
               "S Club – Don't Stop Movin'");
    }

}
