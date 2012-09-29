import scala.actors.Actor;
import scala.actors.Actor._;
import java.lang.Integer;

case object Calculator2;

class Calculator2(taille: Integer, tab: Array[Integer], avenger: Actor) extends Actor {
  def act() {
    var moy = 0;
    
    for( i <- taille/2 until taille ) {
      moy += tab(i);
    }
    println("Calculator2 : " + moy);
    
    avenger ! (Calculator2,moy);
    exit();
  }
}