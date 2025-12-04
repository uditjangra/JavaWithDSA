package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            String[] booleanArray = new String[candies.length];
            List<Boolean> result = new ArrayList<>();
            int maxCandies = 0;
            for(int candy : candies){
                maxCandies = Math.max(maxCandies, candy);
            }
            for(int i = 0; i < candies.length; i++){
                candies[i]=candies[i]+extraCandies;
                if(candies[i]>=maxCandies){
                    result.add(true);
                }else{
                    result.add(false);
                }
            }
            return result;
        }
    }
}
