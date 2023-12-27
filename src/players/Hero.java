package players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage,name);
        this.ability =ability;
    }

    public SuperAbility getAbility(){return ability;}
    public void attack(Boss boss){boss.setHealth(boss.getHealth());}

    public abstract void applySuperPower(Boss boss, Hero[] heroes);
}