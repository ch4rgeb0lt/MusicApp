public class Rock extends MusicGenre{

    public Rock() {
        setName("Rock music");
        setDescription("Rock is powerful, energetic, and often rebellious. " +
                "From classic riffs to modern alternative vibes, it channels emotion through raw vocals and " +
                "electric guitar energy.");
    }

    public void playSample() {
        System.out.println("\nTry these tracks:\n"+
                "Beatles – Helter skelter\n" +
                "George Harrison – Art of dyeing\n" +
                "The doors – Soul kitchen\n");
    }

}
