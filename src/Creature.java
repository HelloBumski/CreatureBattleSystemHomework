public class Creature {
    private float health;
    private String name;
    private String action;
    private String weakness;

    public Creature(String name, float health, String weakness) {
        this.name = name;
        this.health = health;
        this.weakness = weakness;
        this.action = name + " is waiting";
    }

    public void setDefaultAction()
    {
        action = name + " is waiting";
    }

    public void setAction(String action)
    {
        this.action = action;
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
            action = name + " missed " + target.getName();
            return;
        }

        float power = Rand.randomFloat(10, 20);

        if (target.getName().equals(weakness))
        {
            power = power * 1.5f;
            action = name + " hit weakness of " + target.getName() + " for " + power;
        }
        else
        {
            action = name + " attacked " + target.getName() + " for " + power;
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

    public String getName()
    {
        return name;
    }

    public String getWeakness()
    {
        return weakness;
    }

    public boolean isAlive()
    {
        return health > 0;
    }

    public String toString()
    {
        return name + " health: " + health;
    }
}
