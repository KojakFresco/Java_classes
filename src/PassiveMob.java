public class PassiveMob extends Mob {
    public PassiveMob() {
        super();
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + "is walking");
    }

    public void walk(String name) {
        System.out.println(name + "is walking");
    }
}
