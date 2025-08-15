package JavaPractice;

public class AvgArray {
    public static void main(String[] args) {
        double[] heights={5.11,5.10,5.11,5.7,5.8,5.6};
        double sum=0.0;
        for(int i=0;i<heights.length;i++){
            System.out.print(heights[i]+" | ");
            sum+=heights[i];
        }
        System.out.println();
        double avg = sum/ heights.length;
        System.out.println("the avg is:"+avg);
    }
}
