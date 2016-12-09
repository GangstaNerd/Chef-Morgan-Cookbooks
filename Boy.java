/**
*Author: Morgan-Revision
*Project: Get Boys Age "Revision to GetPuppy"
*/

public class Boy{

  int boyAge;

   public Boy(string name)
      // This constructir has one parameter, name.
      System.out.println("Name chosen is :" + name );
}


public void setAge( int age ){
      boyAge =age;
}

public int getAge( ){
      System.out.println(" Boy's age is :" + boyAge );
      return boyAge;
}

public static void main(String []args){
  /* object creation */
  Boy myBoy = new Boy(  "Nagrom" );

  /* Call class method to set boy's age */
  myBoy.setAge( 2 );

  /* Call another class method to get the Boy's age */
  myBoy.getAge();

  /* instance Variable */
     System.out.println("Variable Value :" + myBoy.boyAge );

}
