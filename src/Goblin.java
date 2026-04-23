public class Goblin extends Creature {
    public Goblin()
    {
        super("Goblin", 100, "Gremlin");
    }

    public float batSwing()
    {
        return Rand.randomFloat(10, 25);
    }

    public float bite()
    {
        return Rand.randomFloat(12, 24);
    }

    public void attack(Creature troglodyte, Creature gremlin)
    {
        Creature target = chooseTarget(troglodyte, gremlin);
        float power;

        if (Rand.randomInt(0, 10) < 5)
        {
            power = batSwing();
            setAction(getName() + " swung bat at " + target.getName());
        }
        else
        {
            power = bite();
            setAction(getName() + " bit " + target.getName());
        }

        if (target.getName().equals(getWeakness()))
        {
            power = power * 1.5f;
            setAction(readAction() + " (weakness hit)");
        }

        target.defend(power);
    }
}
