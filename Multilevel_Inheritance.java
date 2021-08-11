class Value{
  int a;
}
class value1 extends Value{
   int b;

}
class value2 extends value1{
  void Multiply(){
    int c;
    c=a*b;
    System.out.println("The Multiplication is:"+c);
  }
}


class Multilevel_Inheritance {
  public static void main(String[] args) {
    value2 obj = new value2();
    obj.a=10;
    obj.b=20;
    obj.Multiply();

  }
}
