class Value{
  int a;
}
class value1 extends Value{
   int b;
  void addition(){
    int c;
    c=a+b;
    System.out.println("The addition is:"+c);
  }
}

class Single_Inheritance {
  public static void main(String[] args) {
    value1 obj = new value1();
    obj.a=10;
    obj.b=20;
    obj.addition();
  }
}
