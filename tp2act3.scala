import scala.actors.Actor;
import scala.actors.Actor._;
import java.lang.Integer;

case object Calculator1;
case object Calculator2;

// I guess the real name should be Averager... Whatever!
// Nothing difficult here!
class Avenger(taille: Integer, tab: Array[Integer]) extends Actor {
  def act() {
    var res: Double = 0;
    var x1: Integer = 0;
    var x2: Integer = 0;
    var x3: Integer = 0;
    loop {
      react {
	case (Calculator1,x1) =>
	  react {
	    case (Calculator2,x2) =>
	      res = (x1.asInstanceOf[Integer] + x2.asInstanceOf[Integer]).asInstanceOf[Double] / taille;
	      println("-----------------------------------------------------------");
	      println("Moyenne : " + res);
	      println("-----------------------------------------------------------");
	      exit();
	  }
      }
    }
  }
}