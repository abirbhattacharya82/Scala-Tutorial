object ReversingString{
  def main(args: Array[String]): Unit = {
    var a = Array(1,2,3,4,5);
    var b = a.reverse
    b.foreach{i:Int=>{println(i)}}
  }
}