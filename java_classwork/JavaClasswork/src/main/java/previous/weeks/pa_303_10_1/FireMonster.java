package previous.weeks.pa_303_10_1;

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
