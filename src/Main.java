public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapasity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapasity - stuffWeight;
        System.out.println("Ещё можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchinWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchinWeight;
        var productWeight = vegetablesWeight + meatWeight + waterWeight + fruitWeight;
        System.out.println("Общий вес продуктов " + productWeight + " кг!");

        var leftWeight = liftingCapasity - stuffWeight - productWeight;
        System.out.println("места осталось " + leftWeight + "кг!");

        productWeight = productWeight * 2;
        System.out.println("Теперь вес продуктов " + productWeight + "кг!");

        leftWeight = liftingCapasity - stuffWeight - productWeight;
        System.out.println("теперь места осталось " + leftWeight + " кг!");

        var overLoad = (stuffWeight + productWeight) % liftingCapasity;
        System.out.println("перегруз на " + overLoad + "кг!");

        var productInOneCar = productWeight / 2;
        System.out.println("Продуктов на одной машине теперь " + productInOneCar + " кг!");

        short bananas = 126;
        System.out.println("вес бананов " + bananas + " кг!");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция весит " + onePortion + " кг!");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);

    }
}
