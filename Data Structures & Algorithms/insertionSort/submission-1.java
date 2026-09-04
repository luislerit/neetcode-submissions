// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        int L = 0;
        for(int i = 0; i < pairs.size(); i++) {
            L = i -1;
            while(L >= 0 && pairs.get(L).key > pairs.get(L+1).key) {
                
                Pair temp = pairs.get(L+1);
                pairs.set(L+1, pairs.get(L));
                pairs.set(L, temp);
                L--;
                
            }
            result.add(new ArrayList(pairs));
            
        }
        return result;
    }

}
