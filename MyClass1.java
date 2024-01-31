class Constructor1 {
    int id;

    public Constructor1() {
        this.id = 132;
    }

    void increment() {
        this.id = this.id + 1;
    }

    void decrement() {
        this.id = this.id - 1;
    }

    int get_id() {
        return this.id;
    }
}

class MyClass1 {
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        System.out.println(c1.get_id());
        c1.increment();
        System.out.println(c1.get_id());
    }
}