
import java.util.Scanner;



// class CheckNum{

// boolean IsEven(int x){
//     if ((x%2)==0)return true;
//     else return false;

// }
// }
// class ParDemo{
// public static void main(String arg[]){
//  CheckNum E=new CheckNum();
// if (E.IsEven(10)) System.out.println("10 is an even number");
// if (E.IsEven(9)) System.out.println("9 is not Even");
// if (E.IsEven(8)) System.out.println("8 is  Even");   
// }
// }

class AGradeBook{
    public void displayMessage(String courseName){
        System.out.println("welcome to grade book for"+courseName);
        
    }
        } 
    class AGradeBookTest{
    public static void main(String[] args){ 
    Scanner Num=new Scanner(System.in); 
    AGradeBook thGradeBook=new AGradeBook();
    System.out.print("Enter the course name");
    String nameOfCourse=Num.nextLine();
    System.out.println();
thGradeBook.displayMessage(nameOfCourse);
        }
    }
    

// class MyEvenNo{
//     void Even(int x){

//         if ((x%2)==0)
//         System.out.println(x+"  IS AN EVEN NUMBER");
//         else System.out.println(x+"  IS AN ODD NUMBER");
//     }
// }
// class Insert{
//     public static void main(String[] args) { 
// Scanner EvenNo=new Scanner(System.in);
// MyEvenNo checkNo=new MyEvenNo();
// System.out.println("ENTER ANY NUMBER YOU LIKE I WILL KNOW IF ITS ODD OR EVEN");
// int x=EvenNo.nextInt();
// checkNo.Even(x);
//     }
//     }
class Person{
    String name;
    String gender;
    Person(String name, String gender) {
        // String name; String gender;
        this.name = name;
        this.gender = gender;
    } 
}


class Sum {
    int result;
        Sum(int a, int b){
// System.out.println(this);

        this.result = this.add(a, b);
        }


    int add(int a, int b) {
        return a + b;
    }
}
        
    class DemoPerson{
        public static void main(String args[]){
Person john = new Person("john", "male");
Person ayo = new Person("Ayomide", "male");
System.out.println(john.name + " " + ayo.name);
Sum add = new Sum(3, 2);
System.out.println(add.result);

        }
    }

//using argument and parameters
class AddNum{ int x=12;int y=10;
    
    int display(int x,int y,int z){
        System.out.println(x);
    this.x=10;this.y=88;
    System.out.println(y);
return x+y+z;
    }
}   
class AddNumDemo{
        public static void main(String[] args) {
        AddNum anyNum=new AddNum();
        int x=3;
        int y=4;
        int z=6;
    int w = anyNum.display(x, y, z);
    System.out.println(w);

    }
}

//using constructors
class MyClass{
    int x;
    MyClass(int i){
        x=i;
    }
}
class ConsDemo{
    public static void main(String args[]){
        MyClass ti=new MyClass(12);
        MyClass t2=new MyClass(4);
        System.out.println(ti.x);
    }
}


// class js2{
//     int girls;
//     int boys;
//     js2(int x,int y){
//         girls=x;
// boys=y;
// }
// int mean(int x,int y){
//     this.boys=4;
//     this.girls=5;
// return x*y;
// }
    
// }
// class GetMean{
//     public static void main(String args[]){
//         js2 Mymean=new js2(4,5);
//         System.out.println(Mymean.boys);
//     }
// }


 class BigVehicle{
//    public static void main(String args[]){
//        Vehicle Truck=new Vehicle();

//    } 
// }
//using parameters
class UsingParameter{
    public static void main(String args[]){

    } 
}





















class AClass{
    int x;
AClass(int i){
  x=i;
}
}
class AClassDemo{
    public static void main(String arg[]){
        AClass t1=new AClass(5);

        System.out.println(t1.x);
    }
}