import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster (String name, int hitPoints, int strength){
        this.hitPoints=hitPoints;
        this.name=name;
        this.strength=strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {

        List <String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1, String.valueOf(this.hitPoints));
        values.add(2, String.valueOf(this.strength));
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null&&savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));

        }
    }
}
