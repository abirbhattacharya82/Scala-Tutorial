object ClassesAndConstructors{
  // In this Class there are no global variables
  case class ClassWithoutAnyClassVariables(){}
  // In this Class there are global variables and this serves as a constructor as well.
  case class ClassWithClassVariable(var x:Int = 2,var y:Int = 3, var z:String = "This is a String"){}
  
  var obj1 = ClassWithClassVariable(); // This is a default constructor
  var obj2 = ClassWithClassVariable(1,2,"Hehe"); // This is a parameterized constructor
  
  var obj3 = ClassWithClassVariable(1); // This will be assigning x's value as 1. Rest will be default value.
  var obj4 = ClassWithClassVariable(1,3); // This will be assigning x's value as 1 and y's value as 3. Rest will be default value.
  
  var obj5 = ClassWithClassVariable(z="Hehe"); // If we want to skip the order and initialise a different variable then this is how we do it.
}