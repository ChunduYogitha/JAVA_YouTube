import java.io.*;
class Main{
    public static void main(String[] args){
        int n = 2;
        for(int i=0;i<10;i++){
            System.out.println(n +" * " +(i+1) +" = " +(n*(i+1)));
        }      
    }
}

OUTPUT
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20



import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(n +" * " +(i+1) +" = " +(n*(i+1)));
        }
        
        
    }
}

INPUT : 5
OUTPUT :5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        5 * 4 = 20
        5 * 5 = 25
        5 * 6 = 30
        5 * 7 = 35
        5 * 8 = 40
        5 * 9 = 45
        5 * 10 = 50
        
