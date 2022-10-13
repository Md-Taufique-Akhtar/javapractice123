public class pairSumProblem {
    public static int pairsum(int [] arr , int target){
        int count =0, sum;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j< arr.length; j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    ++count;
                }
            }
        }
        return count;
    }
    public static int betterpairsum(int [] arr , int target){
        int count = 0, sum;
        int start =0, end = arr.length-1;
        while (start< end ){
            sum = arr [ start ] + arr [ end ];
            if(sum == target ){
                ++count;
                start++;
                end--;
            } else if (sum > target){
                end --;
            }
            else{
                start++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(pairsum(arr, 6));
        System.out.println(betterpairsum(arr , 6));
    }
}
