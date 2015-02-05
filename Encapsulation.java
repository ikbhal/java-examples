/* File name : EncapTest.java */
class Person{

   private String name;
   private String idNum;
   private int age;

   public int getAge(){
      return age;
   }

   public String getName(){
      return name;
   }

   public String getIdNum(){
      return idNum;
   }

   public void setAge( int newAge){
      age = newAge;
   }

   public void setName(String newName){
      name = newName;
   }

   public void setIdNum( String newId){
      idNum = newId;
   }
}

public class Encapsulation{

   public static void main(String args[]){
      Person p = new Person();
      p.setName("James");
      p.setAge(20);
      p.setIdNum("12343ms");

      System.out.print("Name : " + p.getName()+ 
                             " Age : "+ p.getAge());
    }
}