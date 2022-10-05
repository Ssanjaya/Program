package javaapplication1;

public class Static {
    String model;
    int price;
    static  String brand="Honda";
    static void change(){
    brand="Hero";
}
  Static(String m,int p){
        model=m;
        price=p;
        System.out.print(model+"  "+price+" "+brand);
    }
 
    public static void main(String[] args){
        Static.change();
        Static s=new Static("Dio",12345);
        
        
    }
    
}
