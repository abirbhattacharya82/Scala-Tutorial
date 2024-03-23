object ComparingTwoObjects{
  case class ValueOfX(var x:Int = 2){
    def isGreater(obj:ValueOfX): Boolean ={
        if(x>obj.x)
        return true;
        else
        return false;
    }
  }  
  def main(args: Array[String]): Unit = {
    var obj1 = ValueOfX(3);
    var obj2 = ValueOfX(2);
    
    println(obj1.isGreater(obj2))
  }
}