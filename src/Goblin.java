public class Goblin extends Creature
{
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
            action = name + " swung bat at " + target.name;
        }
        else
        {
            power = bite();
            action = name + " bit " + target.name;
        }

        if (target.name.equals(weakness))
        {
            power = power * 1.5f;
            action = action + " (weakness hit)";
        }

        target.defend(power);
    }
}