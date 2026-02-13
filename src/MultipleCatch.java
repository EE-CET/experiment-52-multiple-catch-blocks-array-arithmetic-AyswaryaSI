import java.util.scanner;
public class MultipleCatch{
       public static void main(String[]args){
                   Scanner sc = new Scanner(System.in):
                   int N = sc.nextInt();
                   int[] arr = new int[N];
                   for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                   }
                   int index = sc.nextInt();
                   int divisor = sc.nextInt();
                   
                   try{
                        int result = arr[index] / divisor;
                        System.out.println(result);
                   } catch(ArrayIndexOutOfBoundsException e){
                              System.out.print("Invalid Index");
                     }
                     catch(ArrayIndexOutOfBoundsException e){
                              System.out.print("Divide by Zero error");
                     }
       }
}            
