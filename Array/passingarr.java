import java.util.Scanner;

class passingarr {
    public static void main(String args[]){

        System.out.println("Enter the number");{
        int marks[] = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i =0 ;i<marks.length;i++){
            marks[i]=input.nextInt();
        }
        display(marks);
    }
    public static void dispay(int m[]){
        for(int k:m){
            System.out.println(k) ;
        }
    }
    }
}