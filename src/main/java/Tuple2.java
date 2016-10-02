
public class Tuple2<A,B> {
    private A member1;
    private B member2;
    public Tuple2(A a, B b) {
        this.member1=a;
        this.member2=b;
    }
    public A _1() {
        return member1;
    }
    public B _2() {
        return member2;
    }
}
