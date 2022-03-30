//TYPES OF INTERFACE AND WAYS
interface one{
void m1();
}
interface two{
void m2();
}

interface three extends one, two{   //multiple inheritance

   void m3();
}

class MyClass implements three{
   public void m1(){
}
public void m2(){
}
public void m3(){
}
}
______________________________________________________
interface one{
void m1();
}
interface two{
void m2();
}
interface three 
   void m3();
}

class MyClass implements one,two,three{
   public void m1(){
}
public void m2(){
}
public void m3(){
}
}

__________________________________
class A{
}
class B extends A{
}

class C extends B implements one,two,three{
}

