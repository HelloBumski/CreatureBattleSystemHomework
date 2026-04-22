public class Troglodyte extends Creature
{
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
            action = name + " used spear on " + target.name;
        }
        else
        {
            power = headButt();
            action = name + " used headbutt on " + target.name;
        }

        if (target.name.equals(weakness))
        {
            power = power * 1.5f;
            action = action + " (weakness hit)";
        }

        target.defend(power);
    }
}