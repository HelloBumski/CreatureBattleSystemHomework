public class Creature {
    public float health;
    public String name;
    public String action;
    public String weakness;

    public void setDefaultAction()
    {
        action = name + " is waiting";
    }

    public Creature chooseTarget(Creature gremlin, Creature goblin)
    {
        if (Rand.randomInt(0, 10) < 5)
        {
            return gremlin;
        }
        else
        {
            return goblin;
        }
    }

    public void attack(Creature gremlin, Creature goblin)
    {
        Creature target = chooseTarget(gremlin, goblin);

        if (Rand.randomInt(0, 10) < 2)
        {
            action = name + " missed " + target.name;

        }

        float power = Rand.randomFloat(10, 20);

        if (target.name.equals(weakness))
        {
            power = power * 1.5f;
            action = name + " hit weakness of " + target.name + " for " + power;
        }
        else
        {
            action = name + " attacked " + target.name + " for " + power;
        }

        target.defend(power);
    }

    public void defend(float incomingPower)
    {
        if (Rand.randomInt(0, 10) < 1)
        {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage";
        }
        else
        {
            action = name + " did not defend";
        }

        health -= incomingPower;
    }

    public String readAction()
    {
        return action;
    }

    public String toString()
    {
        return name + " health: " + health;
    }
}