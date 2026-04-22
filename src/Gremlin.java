public class Gremlin extends Creature
{
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
            action = name + " scratched " + target.name;
        }
        else
        {
            power = kick();
            action = name + " kicked " + target.name;
        }

        if (target.name.equals(weakness))
        {
            power = power * 1.5f;
            action = action + " (weakness hit)";
        }

        target.defend(power);
    }
}