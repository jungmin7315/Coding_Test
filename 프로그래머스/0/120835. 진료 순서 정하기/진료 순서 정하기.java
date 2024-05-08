class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int temp = i;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[temp] < emergency[j]) {
                    temp = j;
                }
            }
            answer[temp] = i+1;
            emergency[temp] = -1;
        }

        return answer;
    }
}