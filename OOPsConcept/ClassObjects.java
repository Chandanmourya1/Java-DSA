package OOPsConcept;

public class ClassObjects {
    public static void main(String[]args){
        // Boys b1=new Boys();
        
        // Boys b2=new Boys("Chandan");
        // Boys b3=new Boys(123);
        
    }   
}
class Boys{
    String name;
    int rollNo;


    Boys(){ 
        System.out.println("no arguement constructor");
    }

    Boys(String name){
        this.name=name;

    }
    Boys(int rollNo){
        this.rollNo=rollNo;
    }

}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void CalPercentage(int math,int phy,int chem){
        percentage=(phy+math+chem)/3;
    }
 
}
class Animal{
    String color;
    
    void Eats(){
        System.out.println("Eats");

    }
    void Breath(){
        

    }
}
