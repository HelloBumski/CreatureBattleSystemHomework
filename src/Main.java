public class Main {
    public static void main(String[] args) {

        Creature troglodyte = new Troglodyte();
        Creature gremlin = new Gremlin();
        Creature goblin = new Goblin();

        troglodyte.name = "Troglodyte";
        troglodyte.health = 100;
        troglodyte.weakness = "Goblin";

        gremlin.name = "Gremlin";
        gremlin.health = 100;
        gremlin.weakness = "Troglodyte";

        goblin.name = "Goblin";
        goblin.health = 100;
        goblin.weakness = "Gremlin";

        BattleSystem battleSystem = new BattleSystem();
        battleSystem.battle(troglodyte, gremlin, goblin);
    }
}