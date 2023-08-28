class box {
    int height;
    int length;
    int width;

    void volume(String boxName) {
        System.out.println("the volume of box "+boxName+ " is: " + height * length * width);
    }
}

class boxVolume {
    public static void main(String[] args) {

        box b1 = new box();
        box b2 = new box();
        b1.height=5;
        b1.length=6;
        b1.width=7;
        b2.height=7;
        b2.length=8;
        b2.width=9;
        b1.volume("b1");
        b2.volume("b2");


    }
}