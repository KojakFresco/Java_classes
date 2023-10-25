public class Mob {
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Mob(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Mob() {

    }

    public void walk() {
        System.out.println("mob is walking");
    }
}
