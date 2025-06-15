import java.util.*;

public class Array{
    public static void update(int temperature[]){
        for(int i=0; i<temperature.length; i++){
            temperature[i]=temperature[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Marks array and percentage declaration
        int marks[]=new int[10]; // Zeros(null value) are stored in the array by default
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the marks of Subject 1:");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of Subject 2:");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of Subject 3:");
        marks[2] = sc.nextInt();

        System.out.println("Subject 1 marks: "+ marks[0]);
        System.out.println("Subject 2 marks: "+ marks[1]);
        System.out.println("Subject 3 marks: "+ marks[2]);
        System.out.println(Arrays.toString(marks));

        int percentage = ((marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5]+marks[6]+marks[7]+marks[8]+marks[9])/10);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Marks array length: "+ marks.length);
        
        //Temperature array and updation
        int temperature[] = new int[5];
        System.out.println("Enter the temperature for 5 days:");
        for(int i=0;i<temperature.length;i++){
            temperature[i] = sc.nextInt();
        }
        System.out.println("Temperature array: " + Arrays.toString(temperature));
        update(temperature);
        System.out.println("Updated temperature array: "+ Arrays.toString(temperature));
    }   
}