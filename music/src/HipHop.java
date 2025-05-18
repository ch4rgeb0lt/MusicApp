public class HipHop extends MusicGenre{

    public HipHop() {
        setName("Hip-Hop music");
        setDescription("Hip-Hop is lyrical, rhythmic, and expressive. " +
                "It blends strong beats with personal stories, social commentary, and sharp delivery." +
                " Perfect for motivation or deep thoughts.");
    }

    public void playSample() {
        System.out.println("\nTry these tracks:\n" +
                "Gorillaz – Ascension\n" +
               "N.W.A. – Appetite for destruction\n" +
                "MF Doom – Dooms Days");
    }

}
