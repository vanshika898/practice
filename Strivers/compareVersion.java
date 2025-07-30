public class compareVersion {


    public static int compareVersionsOf(String a1,String a2){
        String arr1[] = a1.split("\\.");
        String arr2[]  = a2.split("\\.");

        int length = Math.max(arr1.length,arr2.length);

        for(int i=0;i<length;i++){
            
           int num1 = i<arr1.length ? Integer.parseInt(arr1[i]):0;
           int num2 = i<arr2.length ? Integer.parseInt(arr2[i]):0;

           if(num1 >num2 ) return 1;
           if(num1<num2) return -1;

        }
        return 0;

    }
    public static void main(String args[]){
   String v1=  "1.02";
   String v2 = "1.10";

   System.out.println(compareVersionsOf(v1, v2));
    }
}
