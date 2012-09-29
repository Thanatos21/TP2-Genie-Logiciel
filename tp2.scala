import java.lang.Integer;
import scala.util.Random;

object Tp2 {
  def main (args: Array[String]) {
    val n: Integer = 100;
    val tab = new Array[Integer](n);
    val r = new Random();
    
    // Declaration of the actors
    val avenger = new Avenger(n, tab);
    val somme1 = new Calculator1(n,tab,avenger);
    val somme2 = new Calculator2(n,tab,avenger);
    
    for(i <- 0 until n) {
      tab(i) = r.nextInt(100);
    }
    
    // Displays the sum of each half of the table for testing purpose
    println("-----------------------------------------------------------");
    
    var test: Integer = 0;
    for(j <- 0 until n/2) {
      test += tab(j);
    }
    println("Values in the first half of the table : " + test);
    
    test = 0;
    for(j <- n/2 until n) {
      test += tab(j);
    }
    println("Values in the second half of the table : " + test);
    
    /*
    for(i <- 0 until n) {
      println("Valeur " + (i+1) + "   -   " + tab(i));
    }
    */
    
    avenger.start;
    somme1.start;
    somme2.start;
  }
}