//  class First{
//     public static void main(String arg[]) {
//     System.out.println("welcome to java");
//     }
// }

// class Example{
//     public static void main(String args[]){
//         // System.out.println("this is good");
//         int myVar1;
//         int myVar2=2;
//         int myVar3=8;

//         myVar1 = 1024;
//         System.out.println(myVar1 + myVar3);
//         System.out.println(myVar3 * 2);
// System.out.println(myVar1/myVar2);
//    }
// }
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JFrame;

import javax.sound.midi.MidiFileFormat;
import javax.swing.JOptionPane;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.UMulHigh;

import sun.awt.windows.awtLocalization_zh_CN;




class Example{
    public static void main(String args[]){
    int v=10; // initialization
    double x=10.0;//initialization
    System.out.println(v/4);
    System.out.println(x/4);
    JOptionPane.showMessageDialog(null, "THIS WAS MY FIRST TRIAL.......\n.....YES MY FIRST TRIAL\n");
    System.exit(0);
}
}
class GalToLit{
public static void main(String args[]){
    double lites;
double gallon;
gallon=10;
lites=gallon*3.6854;

System.out.println(10+ "litres ="+lites+"litres");

}
}

class Example2{
    public static void main(String args[]){
    System.out.println("this is good");
        int myVar1;
        int myVar2=2;
        int myVar3=8;

        myVar1 = 1024;
        if (myVar1>myVar2) System.out.println("2 is greater than 8") ; 
        System.out.println(myVar1 + myVar3);
        System.out.println(myVar3 * 2);
System.out.println(myVar1/myVar2);
    }
}


class Addition{
public static void main(String args[]){
Scanner in= new Scanner(System.in);
int a=in.nextInt();
System.out.print("you entered the number "+a);

}
}
class Addition2{
public static void main(String args[]) {
    Scanner work=new Scanner(System.in);
    int num1;
    int num2;
    int sum;
System.out.println("enter integer");
num1=work.nextInt();
System.out.println("YOU ENTERED "+num1);
System.out.println("enter SECOND integer");
num2=work.nextInt();
System.out.println("YOU ENTERED "+num2);

sum=(num1+num2);
System.out.println("THEIR SUM IS ="+sum);
}
}

//DECISION MAKING AND RELATIONAL 

class comparison{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
int num1;
int num2;

System.out.println("enter first integer");
num1=in.nextInt();
System.out.println("ENTER SECOND INTEGER");
num2=in.nextInt();
if (num1>num2)
                System.out.println(num1+" is greater than "+num2);
                else
System.out.println(num1+"is less than "+num2);
if (num1==num2)
System.out.println(num1+"is equal to "+num2);
if (num1!=num2)
System.out.println(num1+"is not equal to "+num2);
    } 

}
// expressions
class expressions{
    public static void main(String arg[]){
    int x=3;
    int y=4;
    int z=(x+y);
    System.out.print("helkgggujh"+z);
}
}
// declaring a class with a mehod with a parameter

class GradeBook{
    public void display(String courseName){
 System.out.println("welcome to java grade book for  :\n"+courseName);//parameter decleration
    }
}

    class GradeBookTest{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);

GradeBook mybBook=new GradeBook();
System.out.print("ENTER NAME FOR THIS GRADE BOOK :-");
String nameofcourse=input.nextLine();
mybBook.display(nameofcourse);

        }
    }
class GradeBook2{// with instance variable coursename,and set method get method
    private String courseName;
    public void setcoursename(String name){
        courseName=name;
    }
    public String getcoursename(){
    return courseName;
    }
    public void displaymessage(){
        System.out.println("welcome to the grade book for\n"+getcoursename());
    }
    }

    class GradeBookTest2{
public static void main(String arg[]){
    Scanner input=new Scanner(System.in);
    GradeBook2 mygradebook=new GradeBook2();
    System.out.println("ENTER COURSE NAME");
    String thename=input.nextLine();
    mygradebook.setcoursename(thename);
    mygradebook.displaymessage();
    
}

}
class Anything{
    public static void main(String arg[]){
        int x;
        for(x=0;x<10;x++){
            if (x==6) break;
        }
             System.out.println(x);
        }
    }







class Sure{
    public void show(){
        System.out.println("method testing");
    }
}


    class AnotherWork{
public static void main(String arg[]){
    Sure work=new Sure();
    work.show();

}
}
    // defining a class
        class Vehicle{
    
            double passenger;
            double fuel_cap;//fuel capacity
            double mpg;
            double dis;
            // miles p
        Vehicle(double P,double f,double m,double d){
            passenger=P;
            fuel_cap=f;
            mpg=m;
            dis=d;
        }
        double range(){
       //System.out.println("rage is"+ fuel_cap*mpg );
        return mpg* fuel_cap; 
        }
        void range2(){
        System.out.println("rage is "+fuel_cap*mpg);
        }
        double FuelNeeded(double miles){
            return (double) miles/mpg;
        }
        }
    

    class VehicleTwo {
        public static void main(String arg[]){        
        Vehicle minivan=new Vehicle(7,12,3,235);
            Vehicle sportcar=new Vehicle(4,8,3,235);
        double G=235;
        
    double gallons=sportcar.FuelNeeded(G);
    
    System.out.println("minivan can carry "+minivan.passenger+"  with a range of " +  minivan.range());
    
    System.out.println("sportcarcan carry "+sportcar.passenger+"  with a range of ");
    sportcar.range2();
    System.out.println("fuel needed ");
    System.out.println("To go 252 miles sports car needs"+gallons);
    }
} 
    

class Loop{
    public static void main(String ars[]){
        int I=10;
        for(;I>-1;I--) {
            System.out.println( "hello "+ I);

        }
    }
}
class pwr{
    int base;
    int exp;
    int val;
    
    pwr(int b,int e){
    base=b;
        exp=e;
        val=1;
        if(exp==0) return;
        for ( ;exp>0;exp--)val =val*base;
    }
int Get_pwr(){
    return val;
}

}

class DemoPwr{
    public static void main(String arg[]){
pwr x=new pwr(4, 3);
pwr y=new pwr(6, 3);
System.out.println(x.Get_pwr());
    }
}


//usinkg arrays
class ArrayDemo{
public static void main(String args[]){
    int num[]=new int[10];
    int a=3;
    num [a]=6;
    num [5]=7;
    num [5]=77;
    num [4]=66;
    //int i=num [0];
    System.out.println(num [a]);
}
}
class Array2{
    public static void main(String args[]){
        int sample[]=new int[10];
        int i;
        for (i=0;i<10;i=i+1)
    sample[i]=i;
    for (i=0;i<10;i=i+1)
    System.out.println(sample[i]);
    }
}
    // finding minimum and max val in arrays
    class MinMax{
        public static void main(String arg[]){
        int num[]=new int[10];
        int min,max;
        num[0]=99;
        num[1]=-10;
        num[2]=100123;
        num[3]=18;
        num[4]=-978;
        num[5]=5623;
        num[6]=463;
        num[7]=-9;
        num[8]=287;
        num[9]=49;
        min=max=num[0];
        for (int i=1;i<10;i++){
            if (num[i]<min) min=num[i];
            if (num[i]>max) max=num[i];
        }
        System.out.println("minimum value =  "+min);
        System.out.println("maximum value =  "+max);
    }
}

class MaxVal{
    public static void main(String arg[]){
int num[]={77,87,88,-876,87,87,77};
int min,max;
min=max=num[0];
for (int i=1;i<7;i++){
    if (num[i]>max) max=num[i];
    if (num[i]<min) min=num[i];
}
System.out.println("maximum value is = "+max);
System.out.println("minimum value is = "+min);
    }
}
class Bubble{
    public static void main(String arg[]){
        int num[]={99,-10,100123,10,-978,5623,463,-9,287,49};
        int a,b,t;
        int size=10;
        System.out.println("original array is :  ");
        for (int i=0;i<10;i++)
        System.out.println(num[i]);
        //bubble sort
        for (a=1;a<10;a++)
        for (b=size-1;b>=a;b--){
            if (num[b-1] > num [b]){
                t=num[b-1];
                num[b-1]=num[b];
                num[b]=t;
            }
        }
System.out.println("SORTED ARRAY IS :");
for (int i=0;i<10;i++)
System.out.println("" +num[i]);
System.out.println("errfrrr");
    }
}

//Transversing in an array
class Transversing{
public static void main(String arg[]){
    int num[]={23,54,3,5,6,77,7,9,8,12};
    int max,min;
    int i;
    max=num[0];
    min=num[0];
    for (i=1;i<10;i++){
        if (num [i]>max) max=num[i];
        if (num [i]<min) min=num[i];
    }
System.out.println(max);
System.out.println(min);
    
}
}
//my bubble sort
class MyBubbleSort{
    public static void main(String arg[]){
        int Sort[]={15,16,6,8,5};
        int i,j,k,temp;
        for (i=0;i<4;i++){
        for (j=0;j<4;j++){
            if (Sort[j]>Sort[j+1]){
                temp=Sort[j];
            Sort[j]=Sort[j+1];
            Sort[j+1]=temp;
            }
            }
    }
    for (k = 0; k < 4; k++) 
    


    




        
    }
}
// two dimension array
class TwoD{
    public static void main(String arg[]){
        int a[][]= {{2,3,4},{5,6,7},{8,9,10}};
        for (int i=0;i<3;i++){

            for (int t=0;t<3;t++)
                System.out.println(a[i][t]);
        }
    }
}

        class TwoDA{
            public static void main(String arg[]){
        int Num[][]={{1,2,3,4,5},{6,7,8,9,10}};
        int r,c;
        for (r=0;r<2;r++){
            for (c=0;c<5;c++)
            System.out.println(Num[r][c]);
        }
        
            
    }
        }
    
class StringA{
    public static void main(String arg[]){
        String Name[][]={{"wale","ayo","quwiyg"},{"baba","shefif","ramadan"}};
        int r,c;
            for (r=0;r<2;r++){
            for (c=0;c<3;c++)
            System.out.println(Name[r][c]);
        }
        
    
        
    }
}

