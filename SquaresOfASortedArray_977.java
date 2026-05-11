class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int[] res = new int[nums.length];
        int id = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                a.add(nums[i]);
            } else {
                b.add(nums[i]);
            }
        }
        if(a.size()==0) {
            for(int i=0; i<b.size(); i++) {
                res[id] = b.get(i) * b.get(i);
                id++;
            }
            return res;
        }
        if(b.size() == 0) {
            for(int i=a.size() - 1; i>=0; i--) {
                res[id] = a.get(i) * a.get(i);
                id++;
            }
            return res;
        }
        int ptA = a.size() - 1;
        int ptB = 0;
        while(ptA >= 0 && ptB < b.size()) {
            int sqA = a.get(ptA) * a.get(ptA);
            int sqB = b.get(ptB) * b.get(ptB);
            if(sqA > sqB) {
                res[id] = sqB;
                ptB++;
                id++;
            } else {
                res[id] = sqA;
                ptA--;
                id++;
            }
        }
        while(ptA>=0) {
            res[id] = a.get(ptA) * a.get(ptA);
            id++;
            ptA--;
        }
        while(ptB < b.size()) {
            res[id] = b.get(ptB) * b.get(ptB);
            id++;
            ptB++;
        }
        return res;
    }
}