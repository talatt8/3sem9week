class MinMaxCalculator {

    // 1. For Integers
    void minMaxAdd(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = a + b;
        System.out.println("Integers -> Min: " + min + ", Max: " + max + ", Addition: " + sum);
    }

    // 2. For Real Numbers (double)
    void minMaxAdd(double a, double b) {
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        double sum = a + b;
        System.out.println("Reals -> Min: " + min + ", Max: " + max + ", Addition: " + sum);
    }

    // 3. For Characters (compared by ASCII values)
    void minMaxAdd(char a, char b) {
        char min = (a < b) ? a : b;
        char max = (a > b) ? a : b;
        int sum = a + b;  // Addition of ASCII values
        System.out.println("Characters -> Min: " + min + ", Max: " + max + ", ASCII Addition: " + sum);
    }

    public static void main(String[] args) {
        MinMaxCalculator obj = new MinMaxCalculator();

        obj.minMaxAdd(10, 20);      // Integer version
        obj.minMaxAdd(12.5, 4.8);   // Real number version
        obj.minMaxAdd('A', 'Z');    // Character version
    }
}

