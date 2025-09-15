public class KoperasiDemo {

    public static void main(String[] args) {
        Member member1 = new Member("Iwan", "Mawar St.");
        System.out.println("Saving " + member1.getName()+ " : Rp " + member1.getSaving());

        member1.setName("Iwan Setiawan");
        member1.setAddress("Sukarno Hatta Avenue no 10");
        member1.deposit(100000);
        System.out.println("Saving " + member1.getName()+ " : Rp "+ member1.getSaving());

        member1.borrow(5000);
        System.out.println("Saving " + member1.getName()+ " : Rp "+ member1.getSaving());

    }
}