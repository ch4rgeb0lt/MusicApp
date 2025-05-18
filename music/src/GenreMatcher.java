import java.util.HashMap;
import java.util.Map;

public class GenreMatcher {

    public static MusicGenre match(UserProfile user) {

        Map<String, Integer> genreScores = new HashMap<>();
        genreScores.put("pop", 0);
        genreScores.put("rock", 0);
        genreScores.put("hiphop", 0);
        genreScores.put("jazz", 0);
        genreScores.put("indie", 0);

        //Q1
        if (user.isPartyPerson()) {
            genreScores.put("pop", genreScores.get("pop") + 3);
            genreScores.put("hiphop", genreScores.get("hiphop") + 2);
            genreScores.put("rock", genreScores.get("rock") + 1);
        } else if (user.isLikesAdventure()) {
            genreScores.put("indie", genreScores.get("indie") + 2);
        } else {
            genreScores.put("jazz", genreScores.get("jazz") + 1);
        }

        //Q2
        if (user.isValuesFreedom()) {
            genreScores.put("rock", genreScores.get("rock") + 3);
            genreScores.put("hiphop", genreScores.get("hiphop") + 2);
            genreScores.put("pop", genreScores.get("pop") + 1);
        } else {
            genreScores.put("indie", genreScores.get("indie") + 3);
            genreScores.put("jazz", genreScores.get("jazz") + 2);
        }

        //Q3
        if (user.isFocusLyrics()) {
            genreScores.put("indie", genreScores.get("indie") + 1);
        } else if (user.isFocusMelody()) {
            genreScores.put("jazz", genreScores.get("jazz") + 1);
        } else if (user.isFocusEnergy()) {
            genreScores.put("rock", genreScores.get("rock") + 2);
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
        } else {
            genreScores.put("pop", genreScores.get("pop") + 1);
        }

        //Q4
        if (user.isLikesStreetStyle()) {
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
        } else if (user.isLikesRetroStyle()) {
            genreScores.put("jazz", genreScores.get("jazz") + 1);
        } else if (user.isLikesEdgyStyle()) {
            genreScores.put("rock", genreScores.get("rock") + 1);
        } else if (user.isLikesTrendyStyle()) {
            genreScores.put("pop", genreScores.get("pop") + 1);
        } else {
            genreScores.put("indie", genreScores.get("indie") + 1);
        }

        //Q5
        if (user.isListensLive()) {
            genreScores.put("rock", genreScores.get("rock") + 3);
            genreScores.put("pop", genreScores.get("pop") + 2);
        } else {
            genreScores.put("jazz", genreScores.get("jazz") + 3);
            genreScores.put("indie", genreScores.get("indie") + 2);
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
        }

        //Q6
        if (user.isLikesEnergeticMoves()) {
            genreScores.put("rock", genreScores.get("rock") + 2);
            genreScores.put("hiphop", genreScores.get("hiphop") + 2);
            genreScores.put("pop", genreScores.get("pop") + 1);
        } else {
            genreScores.put("jazz", genreScores.get("jazz") + 2);
            genreScores.put("indie", genreScores.get("indie") + 1);
        }

        //Q7
        if (user.isLikesHardAggressive()) {
            genreScores.put("rock", genreScores.get("rock") + 3);
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
        } else {
            genreScores.put("jazz", genreScores.get("jazz") + 3);
            genreScores.put("indie", genreScores.get("indie") + 2);
            genreScores.put("pop", genreScores.get("pop") + 1);
        }

        //Q8
        if (user.isMorningBooster()) {
            genreScores.put("pop", genreScores.get("pop") + 2);
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
        } else if (user.isCalmStarter()) {
            genreScores.put("indie", genreScores.get("indie") + 1);
        } else if (user.isNeedsWakeupMusic()) {
            genreScores.put("rock", genreScores.get("rock") + 2);
        } else {
            genreScores.put("jazz", genreScores.get("jazz") + 2);
        }

        //Q9
        if (user.isPrefersSeventies()) {
            genreScores.put("jazz", genreScores.get("jazz") + 1);
        } else if (user.isPrefersEighties()) {
            genreScores.put("rock", genreScores.get("rock") + 1);
        } else if (user.isPrefersNineties()) {
            genreScores.put("pop", genreScores.get("pop") + 1);
        } else {
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
            genreScores.put("indie", genreScores.get("indie") + 1);
        }

        //Q10
        if (user.isLovesSpontaneity()) {
            genreScores.put("rock", genreScores.get("rock") + 2);
            genreScores.put("indie", genreScores.get("indie") + 1);
        } else if (user.isPrefersPlanning()) {
            genreScores.put("hiphop", genreScores.get("hiphop") + 1);
        } else if (user.isBalancedApproach()) {
            genreScores.put("pop", genreScores.get("pop") + 1);
        } else {
            genreScores.put("jazz", genreScores.get("jazz") + 1);
        }

        //Max score
        String bestGenre = null;
        int maxScore = -1;

        for (Map.Entry<String, Integer> entry : genreScores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                bestGenre = entry.getKey();
            }
        }

        return switch (bestGenre) {
            case "pop" -> new Pop();
            case "rock" -> new Rock();
            case "hiphop" -> new HipHop();
            case "jazz" -> new Jazz();
            case "indie" -> new Indie();
            default -> throw new IllegalStateException("Unexpected value: " + bestGenre);
        };

    }
}
