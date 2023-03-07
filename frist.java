// run time jvm is responsible for ensuring that there is main method or not in that java file.
// if there is no main method then it will give runtime error that there no such main method.
public class frist 
{
   // this main method for a java like a in home theier is main gate to enter to the home  
   // jvm allways sreach main method to enter to the in the  code of java.
   // why main method is alawys public 
   // to call main method  from anywhere else by jvm should be public
   //why there should be static keyword in java main method 
   // because jvm is calling from  anywhwere there and without critsing object jvm has to call main method
  // why main method should be void 
  // because main method want return anything to the jvm
  // main method should have main name which is configured inside jvm
  //string []args is known as command line arguments
  // we can write as static public void main(String[] args)
  // because oder of modifers is important in java.
  //string []args is written in any way like
  // string args[]
  //string[] args
  //string []vinayak
  //string []durga
  // main overloading is expected in jvm but public void main(String[] args) 
  //  
   public static void main(String[] args) 
   {
     System.out.println("parent method");
   }
}
//class c extends frist
//{

//but override is not is not exepected.
// in this case the parent class method is default inthertained by to child class
