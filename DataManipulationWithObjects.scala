object DataManipulationWithObjects{
  case class student(name: String, age: Int, marks: Int){}
  def main(args: Array[String]): Unit = {
    var students = Array (
        student("Arnab",22,100),
        student("Inchara",23,99),
        student("Abir",24,40),
        student("Namra",21,60)
      );
    
    println(students.head); // head shows the first element of the array
    println(students.tail.head); // tail shows all the elements except the first element of the array
    
    students.foreach(i=>println(i)); // Showing all the elements of the array
    
    println("Students who failed:-");
    
    var failed=students.filter(i=>i.marks<=40);
    failed.foreach(i=>println(i)); // Use of Filter on objects
    
    var partitioning=students.partition(i=>i.marks>=60); // this will be partitioning the students array in a tuple consititng of two parts. One will be consisting of elements where students with marks above 60 and equal will be present. The other one will have those below 60.
    var part1=partitioning._1;
    var part2=partitioning._2;
    println("Part 1");
    part1.foreach(i=>println(i));
    println("Part 2");
    part2.foreach(i=>println(i));
  }
}