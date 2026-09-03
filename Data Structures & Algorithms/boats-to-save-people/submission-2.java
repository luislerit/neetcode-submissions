class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int counter = 0;
        int target = 0;
        int temp = 0;
        int L =0, R = people.length-1;
        int size = people.length;

        while (L<=R && size != 0) {
            if(people[L]+people[R]>limit) {
                counter++;
                R--;
                size--;
            } else if(people[L]+people[R] == limit) {
                counter ++;
                size--;
                R--;
                L++;
            } else {
                temp = people[L]+people[R];
                while(temp<limit) {
                    L++;
                    temp += people[L];
                }
                R--;
                counter++;
                size--;
            }
        }
        return counter;
    }
}