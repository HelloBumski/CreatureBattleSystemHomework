public class Gremlin extends Creature
{
    public Gremlin()
    {
        super("Gremlin", 100, "Troglodyte");
    }

    public float scratch()
    {
        return Rand.randomFloat(10, 20);
    }

    public float kick()
    {
        return Rand.randomFloat(12, 22);
    }

    public void attack(Creature troglodyte, Creature goblin)
    {
        Creature target = chooseTarget(troglodyte, goblin);
        float power;

        if (Rand.randomInt(0, 10) < 5)
        {
            power = scratch();
            setAction(getName() + " scratched " + target.getName());
        }
        else
        {
            power = kick();
            setAction(getName() + " kicked " + target.getName());
        }

        if (target.getName().equals(getWeakness()))
        {
            power = power * 1.5f;
            setAction(readAction() + " (weakness hit)");
        }

        target.defend(power);
    }
}
