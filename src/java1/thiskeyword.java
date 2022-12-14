package java1;

public class thiskeyword {

    class alok2 {
        int id;
        String1 name;
        int a;
        int b;
        int num;
        int r;
        int marks;



        public void print() {
            System.out.println("printing id number " + this.id);
            System.out.println(this.name);
        }

        public void add() {
            int x = this.a + 3;
            System.out.println(x);
        }

        public void table() {
            for(int k = 0; k < 10; ++k) {
                System.out.println(this.num + "*" + (k + 1) + "=" + this.num * (k + 1));
            }

        }

        public void area() {
            double arg = 3.14 * (double)this.r * (double)this.r;
            System.out.println(arg);
        }

        public void result() {
            if (this.marks > 80 && this.marks < 100) {
                System.out.println("Excellent");
            } else {
                System.out.println("Prepare more");
            }

        }
    }


}
