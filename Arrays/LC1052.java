class LC1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int satisfied = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i] == 0){
            satisfied += customers[i];
            }
        }
        int current = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1){
                current += customers[i];
            }
        }
        int max = current;
        for(int i=minutes;i<n;i++){
            if(grumpy[i] == 1){
                current += customers[i];
            }
            if(grumpy[i-minutes] == 1){
                current -= customers[i-minutes];
            }
            max = Math.max(max, current);
        }
        int total = max + satisfied;
        return total;
    }
}