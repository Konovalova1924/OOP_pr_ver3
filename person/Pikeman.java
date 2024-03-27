package person;
import behavior.ActionInterfase;
import java.util.ArrayList;

// Копейщик
public class Pikeman extends PersonBase {
    
    public Pikeman(String name, int x, int y){
        super(name, 80, 30, 41, 30, 50, "pike", 20, "Копейщик", x, y);
    }
    public void attack(PersonBase person){
        person.health -= this.power;
    }
    @Override
    public void step(ArrayList<PersonBase> enemies) {

    }    

}
