class twosum {
    void logic(int num[], int target) {

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println(num[i] + " and " + num[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int target = 7;
        int num[] = { 2, 3, 4, 5 };
        twosum obj = new twosum();
        obj.logic(num, target);

    }
}
