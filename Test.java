import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test{

    String name;
    int age;

    Test(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInformation(){
        System.out.println(name + " " + age);
    }


    public static void main(String[] args){

//        Test t1=new Test("Arun", 23);
//        t1.displayInformation();
//        Test t2=new Test("Arjunan", 24);
//        t2.displayInformation();
//        int[] a = {1,2,3};
//        List<Integer> al = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
//        System.out.print(al);
//        int n=5;
//
//        for(int i=0; i<=2*n; i++){
//            for(int j=0; j<=2*n; j++){
//                int element = n - Math.min(Math.min(i,j), Math.min(2*n-i,2*n-j));
//                System.out.print(element+" ");
//            }System.out.println();
//        }
//            int n = 64, k = 6;
//            int ans = n & ~(1 << (k-1));
//           // System.out.println(ans);
//
//            int b = 10;
//            //System.out.println((int) (Math.log(n) / Math.log(b)) + 1);
//
//            boolean pow = (n & (n-1)) == 0;
//            System.out.print((char)(1 + '0'));
//        int[] heights = {2,4};
//        int len = heights.length;
//        int maxArea = 0;
//        for(int i=0; i<len; i++){
//            int curr = heights[i];
//            int rightInd = i;
//            for(int j=i+1; j<len; j++){
//                if(heights[i] < heights[j]) rightInd = j;
//                else break;
//            }
//            int leftInd = i;
//            for(int j=i-1; j>=0; j--){
//                if(heights[i] <heights[j]) leftInd = j;
//                else break;
//            }
//            int area = curr * (rightInd - leftInd + 1);
//            maxArea = Math.max(maxArea, area);
//        }
//        System.out.print(maxArea);
//        int a = 10;
//        int b = 7;
//        int i, xor=0;
//        for(i =0; i<=3; i++)
//        {
//            xor ^= i;
//        }
//        System.out.println(xor);
//        int[] arr1 = {0,1,1,2,2,3,4};
//        int[] arr2 = {1,2,2,3,5};
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        int i=0;
//        int j=0;
//
//        while(i<arr1.length && j < arr2.length){
//            if(arr1[i] == arr2[j]){
//                arr.add(arr1[i]);
//                i++;
//                j++;
//            }
//            else if(arr1[i] < arr2[j]){
//                i++;
//            }
//            else{
//                j++;
//            }
//        }
//        System.out.println(arr);;
//        List<String> l = new ArrayList<>();
//        l.add("Arun");
//        l.add("Ram");
//        l.add("Alexx");
//        l.add("Developer");
//        Collections.sort(l, (s1, s2) -> s1.length() - s2.length());
//        List<Integer> l = new ArrayList<>();
//        l.add(1050);
//        l.add(123);
//        l.add(51);
//        l.add(552);
//        Collections.sort(l, (o1, o2) -> (int)Math.log10(o1) - (int)Math.log10(o2));
  //      System.out.println(l);
        List<Integer> l = Arrays.asList(4,5,3,6,1,17,11,0);
        int res = l.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (a, b) -> a+b); //print ( sum of double of even num)
        int sum = l.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .mapToInt(Integer::intValue).sum();
        boolean match = l.stream().anyMatch(n -> n == 0);
        System.out.println(match);



    }
}
