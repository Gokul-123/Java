class Value{
  int a;
  int b;
}
class value1 extends Value{
   void Subtraction(){
    int c;
    c=a-b;
    System.out.println("The Subtraction is:"+c);
  }

}
class value2 extends Value{
  void Division(){
    int d;
    d=a/b;
    System.out.println("The Division is:"+d);
  }
}


class Hierarchical_Inheritance {
  public static void main(String[] args) {
    value1 obj = new value1();
    value2 obj1 = new value2();
    obj.a=20;
    obj.b=10;
    obj.Subtraction();
    obj1.a=100;
    obj1.b=5;
    obj1.Division();

  }
}
