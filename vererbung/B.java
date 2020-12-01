class B extends A {
  public String druckeWas()
  {
     return "B";
  }
  
  public static void main(String[] args)
  {
     A a = new A();
    System.out.println(a.druckeWas());
    B b = new B(); 
    System.out.println(b.druckeWas());
    System.out.println(((A)b).druckeWas());
  }
}
