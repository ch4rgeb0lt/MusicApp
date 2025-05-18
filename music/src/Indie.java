public class Indie extends MusicGenre{

    public Indie() {
        setName("Indie music");
        setDescription("Indie is unique, emotional, and artist-driven. " +
                "It blends genres, voices, and vibes into something raw and authentic. " +
                "Great for introspection and late-night listening.");
    }

    public void playSample() {
        System.out.println("\nTry these tracks:\n" +
               "Arctic Monkeys – Bigger Boys And Stolen Sweethearts \n" +
                "Cavetown – Sweet Tooth\n" +
                "James Marriott – Grapes");
    }

}
