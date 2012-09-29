import scala.actors.Actor;
import scala.actors.Actor._;
import java.lang.Integer;

case object Calculator1;

class Calculator1(taille: Integer, tab: Array[Integer], avenger: Actor) extends Actor {
  def act() {
    var moy = 0;
    
    for( i <- 0 until taille/2 ) {
      moy += tab(i);
    }
    println("Calculator1 : " + moy);
    
    avenger ! (Calculator1,moy);
    exit();
  }
}