class Solution {
    public int solution(int price) {
        double answer = 0;
        if(price >= 500000) {
            answer = price * 0.2;
        }else if(price >= 300000){
            answer = price * 0.1;
        }else if(price >= 100000){
            answer = price * 0.05;
        }
        return (int)(price - answer);
    }
}