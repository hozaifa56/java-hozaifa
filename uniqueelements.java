public class uniqueelements {
    int uniqueno(int[] nums){
        int k=0;
        for(int i=0;i<nums.length;i++){
            for (int j = 0; j < i; j++) {
                if (nums[i]==nums[j]) {
                    k++;
                    break;
                }
            }
        }
        return nums.length-k;
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        uniqueelements uniqueElements = new uniqueelements();
        int number = uniqueElements.uniqueno(nums);
        System.out.println("Number of unique elements: " + number);
    }
    
}