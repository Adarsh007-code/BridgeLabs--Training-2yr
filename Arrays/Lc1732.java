class Lc1732 {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int currentAlt = 0;
        for (int g : gain) {
            currentAlt += g;          
            if (currentAlt > maxAlt) {
                maxAlt = currentAlt; 
            }
        }
        return maxAlt;
    }
}