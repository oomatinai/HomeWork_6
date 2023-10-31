public class Main {
    public static void main(String[] args) {
        // Создаем оружие для босса
        Weapon bossWeapon = new Weapon(WeaponType.AXE, "Orcish Axe");

        // Создаем экземпляр босса и задаем ему свойства
        Boss boss = new Boss(500, 50, bossWeapon);

        // Выводим информацию о боссе
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getName());
    }
}
