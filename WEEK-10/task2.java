class Edible {

    // Static Inner Class - Fruit
    static class Fruit {

        // Static Method
        static void fruitDetails() {
            System.out.println("Fruit: Mango, Color: Yellow, Taste: Sweet");
        }

        // Non-static Method
        void fruitPackaging() {
            System.out.println("Fruit is packed in a cardboard box.");
        }
    }

    // Static Inner Class - Vegetable
    static class Vegetable {

        // Static Method
        static void vegetableDetails() {
            System.out.println("Vegetable: Carrot, Color: Orange, Type: Root");
        }

        // Non-static Method
        void vegetablePackaging() {
            System.out.println("Vegetable is packed in a mesh bag.");
        }
    }

    public static void main(String[] args) {

        // Calling static methods directly
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        // Calling non-static methods using object
        Edible.Fruit fruitObj = new Edible.Fruit();
        fruitObj.fruitPackaging();

        Edible.Vegetable vegObj = new Edible.Vegetable();
        vegObj.vegetablePackaging();
    }
}

