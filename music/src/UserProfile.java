public class UserProfile {

    // Question 1
    private boolean PartyPerson = false;
    private boolean likesAdventure = false;
    private boolean SilentSeeker = false;

    // Question 2
    private boolean valuesFreedom = false;
    private boolean valuesDepth = false;

    // Question 3
    private boolean focusLyrics = false;
    private boolean focusMelody = false;
    private boolean focusEnergy = false;
    private boolean focusMood = false;

    // Question 4
    private boolean likesStreetStyle = false;
    private boolean likesRetroStyle = false;
    private boolean likesEdgyStyle = false;
    private boolean likesTrendyStyle = false;
    private boolean likesArtsyStyle = false;

    // Question 5
    private boolean listensLive = false;
    private boolean listensNotLive = false;

    // Question 6
    private boolean likesEnergeticMoves = false;
    private boolean likesSmoothDance = false;

    // Question 7
    private boolean likesHardAggressive = false;
    private boolean likesSoftSmooth = false;

    // Question 8
    private boolean MorningBooster = false;
    private boolean CalmStarter = false;
    private boolean needsWakeupMusic = false;
    private boolean startsSlowly = false;

    // Question 9
    private boolean prefersSeventies = false;
    private boolean prefersEighties = false;
    private boolean prefersNineties = false;
    private boolean prefersTwoThousands = false;

    // Question 10
    private boolean lovesSpontaneity = false;
    private boolean prefersPlanning = false;
    private boolean balancedApproach = false;
    private boolean fearsSpontaneity = false;

    // Question 1
    public void selectPartyPerson() {
        PartyPerson = true;
        likesAdventure = false;
        SilentSeeker = false;
    }

    public void selectLikesAdventure() {
        PartyPerson = false;
        likesAdventure = true;
        SilentSeeker = false;
    }

    public void selectSilentSeeker() {
        PartyPerson = false;
        likesAdventure = false;
        SilentSeeker = true;
    }

    // Question 2
    public void selectValuesFreedom() {
        valuesFreedom = true;
        valuesDepth = false;
    }

    public void selectValuesDepth() {
        valuesFreedom = false;
        valuesDepth = true;
    }

    // Question 3
    public void selectFocusLyrics() {
        focusLyrics = true;
        focusMelody = false;
        focusEnergy = false;
        focusMood = false;
    }

    public void selectFocusMelody() {
        focusLyrics = false;
        focusMelody = true;
        focusEnergy = false;
        focusMood = false;
    }

    public void selectFocusEnergy() {
        focusLyrics = false;
        focusMelody = false;
        focusEnergy = true;
        focusMood = false;
    }

    public void selectFocusMood() {
        focusLyrics = false;
        focusMelody = false;
        focusEnergy = false;
        focusMood = true;
    }

    // Question 4
    public void selectLikesStreetStyle() {
        likesStreetStyle = true;
        likesRetroStyle = false;
        likesEdgyStyle = false;
        likesTrendyStyle = false;
        likesArtsyStyle = false;
    }

    public void selectLikesRetroStyle() {
        likesStreetStyle = false;
        likesRetroStyle = true;
        likesEdgyStyle = false;
        likesTrendyStyle = false;
        likesArtsyStyle = false;
    }

    public void selectLikesEdgyStyle() {
        likesStreetStyle = false;
        likesRetroStyle = false;
        likesEdgyStyle = true;
        likesTrendyStyle = false;
        likesArtsyStyle = false;
    }

    public void selectLikesTrendyStyle() {
        likesStreetStyle = false;
        likesRetroStyle = false;
        likesEdgyStyle = false;
        likesTrendyStyle = true;
        likesArtsyStyle = false;
    }

    public void selectLikesArtsyStyle() {
        likesStreetStyle = false;
        likesRetroStyle = false;
        likesEdgyStyle = false;
        likesTrendyStyle = false;
        likesArtsyStyle = true;
    }

    // Question 5
    public void selectListensLive() {
        listensLive = true;
        listensNotLive = false;
    }

    public void selectListensNotLive() {
        listensLive = false;
        listensNotLive = true;
    }

    // Question 6
    public void selectLikesEnergeticMoves() {
        likesEnergeticMoves = true;
        likesSmoothDance = false;
    }

    public void selectLikesSmoothDance() {
        likesEnergeticMoves = false;
        likesSmoothDance = true;
    }

    // Question 7
    public void selectLikesHardAggressive() {
        likesHardAggressive = true;
        likesSoftSmooth = false;
    }

    public void selectLikesSoftSmooth() {
        likesHardAggressive = false;
        likesSoftSmooth = true;
    }

    // Question 8
    public void selectMorningBooster() {
        MorningBooster = true;
        CalmStarter = false;
        needsWakeupMusic = false;
        startsSlowly = false;
    }

    public void selectCalmStarter() {
        MorningBooster = false;
        CalmStarter = true;
        needsWakeupMusic = false;
        startsSlowly = false;
    }

    public void selectNeedsWakeupMusic() {
        MorningBooster = false;
        CalmStarter = false;
        needsWakeupMusic = true;
        startsSlowly = false;
    }

    public void selectStartsSlowly() {
        MorningBooster = false;
        CalmStarter = false;
        needsWakeupMusic = false;
        startsSlowly = true;
    }

    // Question 9
    public void selectPrefersSeventies() {
        prefersSeventies = true;
        prefersEighties = false;
        prefersNineties = false;
        prefersTwoThousands = false;
    }

    public void selectPrefersEighties() {
        prefersSeventies = false;
        prefersEighties = true;
        prefersNineties = false;
        prefersTwoThousands = false;
    }

    public void selectPrefersNineties() {
        prefersSeventies = false;
        prefersEighties = false;
        prefersNineties = true;
        prefersTwoThousands = false;
    }

    public void selectPrefersTwoThousands() {
        prefersSeventies = false;
        prefersEighties = false;
        prefersNineties = false;
        prefersTwoThousands = true;
    }

    // Question 10
    public void selectLovesSpontaneity() {
        lovesSpontaneity = true;
        prefersPlanning = false;
        balancedApproach = false;
        fearsSpontaneity = false;
    }

    public void selectPrefersPlanning() {
        lovesSpontaneity = false;
        prefersPlanning = true;
        balancedApproach = false;
        fearsSpontaneity = false;
    }

    public void selectBalancedApproach() {
        lovesSpontaneity = false;
        prefersPlanning = false;
        balancedApproach = true;
        fearsSpontaneity = false;
    }

    public void selectFearsSpontaneity() {
        lovesSpontaneity = false;
        prefersPlanning = false;
        balancedApproach = false;
        fearsSpontaneity = true;
    }


    public boolean isPartyPerson() {
        return PartyPerson;
    }

    public void setPartyPerson(boolean partyPerson) {
        PartyPerson = partyPerson;
    }

    public boolean isLikesAdventure() {
        return likesAdventure;
    }

    public void setLikesAdventure(boolean likesAdventure) {
        this.likesAdventure = likesAdventure;
    }

    public boolean isSilentSeeker() {
        return SilentSeeker;
    }

    public void setSilentSeeker(boolean silentSeeker) {
        SilentSeeker = silentSeeker;
    }

    public boolean isValuesFreedom() {
        return valuesFreedom;
    }

    public void setValuesFreedom(boolean valuesFreedom) {
        this.valuesFreedom = valuesFreedom;
    }

    public boolean isValuesDepth() {
        return valuesDepth;
    }

    public void setValuesDepth(boolean valuesDepth) {
        this.valuesDepth = valuesDepth;
    }

    public boolean isFocusLyrics() {
        return focusLyrics;
    }

    public void setFocusLyrics(boolean focusLyrics) {
        this.focusLyrics = focusLyrics;
    }

    public boolean isFocusMelody() {
        return focusMelody;
    }

    public void setFocusMelody(boolean focusMelody) {
        this.focusMelody = focusMelody;
    }

    public boolean isFocusEnergy() {
        return focusEnergy;
    }

    public void setFocusEnergy(boolean focusEnergy) {
        this.focusEnergy = focusEnergy;
    }

    public boolean isFocusMood() {
        return focusMood;
    }

    public void setFocusMood(boolean focusMood) {
        this.focusMood = focusMood;
    }

    public boolean isLikesStreetStyle() {
        return likesStreetStyle;
    }

    public void setLikesStreetStyle(boolean likesStreetStyle) {
        this.likesStreetStyle = likesStreetStyle;
    }

    public boolean isLikesRetroStyle() {
        return likesRetroStyle;
    }

    public void setLikesRetroStyle(boolean likesRetroStyle) {
        this.likesRetroStyle = likesRetroStyle;
    }

    public boolean isLikesEdgyStyle() {
        return likesEdgyStyle;
    }

    public void setLikesEdgyStyle(boolean likesEdgyStyle) {
        this.likesEdgyStyle = likesEdgyStyle;
    }

    public boolean isLikesTrendyStyle() {
        return likesTrendyStyle;
    }

    public void setLikesTrendyStyle(boolean likesTrendyStyle) {
        this.likesTrendyStyle = likesTrendyStyle;
    }

    public boolean isLikesArtsyStyle() {
        return likesArtsyStyle;
    }

    public void setLikesArtsyStyle(boolean likesArtsyStyle) {
        this.likesArtsyStyle = likesArtsyStyle;
    }

    public boolean isListensLive() {
        return listensLive;
    }

    public void setListensLive(boolean listensLive) {
        this.listensLive = listensLive;
    }

    public boolean isListensNotLive() {
        return listensNotLive;
    }

    public void setListensNotLive(boolean listensNotLive) {
        this.listensNotLive = listensNotLive;
    }

    public boolean isLikesEnergeticMoves() {
        return likesEnergeticMoves;
    }

    public void setLikesEnergeticMoves(boolean likesEnergeticMoves) {
        this.likesEnergeticMoves = likesEnergeticMoves;
    }

    public boolean isLikesSmoothDance() {
        return likesSmoothDance;
    }

    public void setLikesSmoothDance(boolean likesSmoothDance) {
        this.likesSmoothDance = likesSmoothDance;
    }

    public boolean isLikesHardAggressive() {
        return likesHardAggressive;
    }

    public void setLikesHardAggressive(boolean likesHardAggressive) {
        this.likesHardAggressive = likesHardAggressive;
    }

    public boolean isLikesSoftSmooth() {
        return likesSoftSmooth;
    }

    public void setLikesSoftSmooth(boolean likesSoftSmooth) {
        this.likesSoftSmooth = likesSoftSmooth;
    }

    public boolean isMorningBooster() {
        return MorningBooster;
    }

    public void setMorningBooster(boolean morningBooster) {
        MorningBooster = morningBooster;
    }

    public boolean isCalmStarter() {
        return CalmStarter;
    }

    public void setCalmStarter(boolean calmStarter) {
        CalmStarter = calmStarter;
    }

    public boolean isNeedsWakeupMusic() {
        return needsWakeupMusic;
    }

    public void setNeedsWakeupMusic(boolean needsWakeupMusic) {
        this.needsWakeupMusic = needsWakeupMusic;
    }

    public boolean isStartsSlowly() {
        return startsSlowly;
    }

    public void setStartsSlowly(boolean startsSlowly) {
        this.startsSlowly = startsSlowly;
    }

    public boolean isPrefersSeventies() {
        return prefersSeventies;
    }

    public void setPrefersSeventies(boolean prefersSeventies) {
        this.prefersSeventies = prefersSeventies;
    }

    public boolean isPrefersEighties() {
        return prefersEighties;
    }

    public void setPrefersEighties(boolean prefersEighties) {
        this.prefersEighties = prefersEighties;
    }

    public boolean isPrefersNineties() {
        return prefersNineties;
    }

    public void setPrefersNineties(boolean prefersNineties) {
        this.prefersNineties = prefersNineties;
    }

    public boolean isPrefersTwoThousands() {
        return prefersTwoThousands;
    }

    public void setPrefersTwoThousands(boolean prefersTwoThousands) {
        this.prefersTwoThousands = prefersTwoThousands;
    }

    public boolean isLovesSpontaneity() {
        return lovesSpontaneity;
    }

    public void setLovesSpontaneity(boolean lovesSpontaneity) {
        this.lovesSpontaneity = lovesSpontaneity;
    }

    public boolean isPrefersPlanning() {
        return prefersPlanning;
    }

    public void setPrefersPlanning(boolean prefersPlanning) {
        this.prefersPlanning = prefersPlanning;
    }

    public boolean isBalancedApproach() {
        return balancedApproach;
    }

    public void setBalancedApproach(boolean balancedApproach) {
        this.balancedApproach = balancedApproach;
    }

    public boolean isFearsSpontaneity() {
        return fearsSpontaneity;
    }

    public void setFearsSpontaneity(boolean fearsSpontaneity) {
        this.fearsSpontaneity = fearsSpontaneity;
    }
}
