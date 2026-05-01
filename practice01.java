public class practice01 {
    public static void main(String[] args) {
        
        // String [] array= new String [];
        // double [] array= new double [5];
        // int [] age = {12,4,5,6,9,};

        // int [] age =new int [5]; - declare
        // age [0]=12; 
        // age[1]= 4      - initialize

        // access elemeent of an array
        //array[index]

        //  for(int a : age) { - for each loop
        String [] array= new String [100];
        for(int i=0;i<array.length;i++){
            array[i]="Hello";
            System.out.println(array[i]);
        }
    }
}
