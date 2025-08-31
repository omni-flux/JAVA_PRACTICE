package JavaPrograms.StringPrograms;

public class DigitsToWord {
    public static void main(String[] args) {
        String[] arr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int n = 12290;
        int rem = 0;
        String ans = "";
        while(n!=0){
            rem=n%10;
            ans = arr[rem] + ans;
            n/=10;
        }
        System.out.println(ans);


//      using     Switch      case
//        int n = 978421;
//        int c = 0;
//        String ans = "";
//        while(n!=0){
//            c = n%10;
//            switch(c){
//                case 1: ans = "One"+ans;
//                    break;
//                case 2: ans = "Two"+ans;
//                    break;
//                case 3: ans = "Three"+ans;
//                    break;
//                case 4: ans = "Four"+ans;
//                    break;
//                case 5: ans = "Five"+ans;
//                    break;
//                case 6: ans = "Six"+ans;
//                    break;
//                case 7: ans = "Seven"+ans;
//                    break;
//                case 8: ans = "Eight"+ans;
//                    break;
//                case 9: ans = "Nine"+ans;
//                    break;
//            }
//            n/=10;
//        }
//        System.out.println(ans);
//
    }
}
