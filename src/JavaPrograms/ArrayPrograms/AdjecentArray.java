package JavaPrograms.ArrayPrograms;

public class AdjecentArray {
    public static void main(String[] args) {
//        int[] nums = {1,1,2,2,3,3,4,4,5,5};
//        boolean flag = false;
//        for(int i = 0;i < nums.length;i+=2){
//            if(nums[i]==nums[i+1]){
//                flag=true;
//            }
//            else{
//                flag=false;
//            }
//        }
//        System.out.println(flag);
        int[] nums = {1,1,2,2,3,3,4,4,5,5};
        boolean flag = true;
        for(int i = 0;i < nums.length;i=i+2){
            if(nums[i]!=nums[i+1]){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
