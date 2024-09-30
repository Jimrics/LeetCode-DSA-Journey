/* Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit 
assignment problems before the lecture. Today, he got one tricky question. The problem statement is “A 
positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits 
of it after the most significant bit including the most significant bit. Print the positive integer value after 
toggling all bits”. */



import java.util.Scanner;

class Tcs2{
    public int calc(int n){
        String bi=Integer.toBinaryString(n);
        StringBuilder toggledBinary = new StringBuilder();
        for(int i=0;i<bi.length();i++){
            if(bi.charAt(i)=='0'){
                toggledBinary.append(1);
            }
            else{
                toggledBinary.append(0);
            }
        }
    return Integer.parseInt(toggledBinary.toString(),2);  //only parseInt can convert it from binary to number by base 2, valueOf cant
    //i also converted toggledBinry(a stringbuilder) to string so that it can be convereted to int 
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Tcs2 t=new Tcs2();
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    System.out.println("The toggled binary value of the interger you have enetered is: "+t.calc(n));
}
}