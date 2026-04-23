public class Troglodyte extends Creature
{
    public Troglodyte()
    {
        super("Troglodyte", 100, "Goblin");
    }

    public float spearAttack()
    {
        return Rand.randomFloat(15, 30);
    }

    public float headButt()
    {
        return Rand.randomFloat(10, 20);
    }

    public void attack(Creature gremlin, Creature goblin)
    {
        Creature target = chooseTarget(gremlin, goblin);
        float power;

        if (Rand.randomInt(0, 10) < 5)
        {
            power = spearAttack();
            setAction(getName() + " used spear on " + target.getName());
        }
        else
        {
            power = headButt();
            setAction(getName() + " used headbutt on " + target.getName());
        }

        if (target.getName().equals(getWeakness()))
        {
            power = power * 1.5f;
            setAction(readAction() + " (weakness hit)");
        }

        target.defend(power);
    }
}
