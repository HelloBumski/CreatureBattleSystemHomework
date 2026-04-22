public class BattleSystem
{
    public void battle(Creature troglodyte, Creature gremlin, Creature goblin)
    {
        while (troglodyte.health > 0 && gremlin.health > 0 && goblin.health > 0)
        {
            troglodyte.setDefaultAction();
            gremlin.setDefaultAction();
            goblin.setDefaultAction();

            troglodyte.attack(gremlin, goblin);

            System.out.println(troglodyte.readAction());
            System.out.println(gremlin.readAction());
            System.out.println(goblin.readAction());

            System.out.println(troglodyte);
            System.out.println(gremlin);
            System.out.println(goblin);
            System.out.println();

            Creature temp = troglodyte;
            troglodyte = gremlin;
            gremlin = goblin;
            goblin = temp;
        }
    }
}