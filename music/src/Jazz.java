public class Jazz extends MusicGenre{

    public Jazz() {
        setName("Jazz music");
        setDescription("Jazz is smooth, soulful, and complex. " +
                "It’s all about improvisation, emotion, and musical freedom. " +
                "Ideal for relaxing, thinking, or simply enjoying live instrumentation.");
    }

    public void playSample() {
        System.out.println("\nTry these tracks:\n" +
               "Miles Davis – So What\n" +
                "Norah Jones – Don't Know Why\n" +
                "John Coltrane – My Favorite Things");
    }

}
