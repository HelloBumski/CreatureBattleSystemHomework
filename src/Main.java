public class Main {
    public static void main(String[] args)
    {
        Creature troglodyte = new Troglodyte();
        Creature gremlin = new Gremlin();
        Creature goblin = new Goblin();

        BattleSystem battleSystem = new BattleSystem();
        battleSystem.battle(troglodyte, gremlin, goblin);
    }
}
