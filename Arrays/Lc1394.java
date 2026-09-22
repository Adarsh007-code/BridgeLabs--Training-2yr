class Lc1394 {
    public int findLucky(int[] arr) {
        int luckynum = -1;
        boolean visited[] = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count == arr[i]){
                luckynum = Math.max(luckynum, arr[i]);
            }
        }
        return luckynum;
    }
}