public class assignmentDemo {
    public static void main(String[] args) {
        bottle bttl1 = new bottle();
        thermos thr1 = new thermos();
        sportsBottle sprt1 = new sportsBottle();
        camera cmr1 = new camera();
        lamp lmp1 = new lamp();

        bttl1.setBrand("Tupperware");
        bttl1.setCapacity(500);
        bttl1.showInfo();
        bttl1.fillBottle();
        bttl1.drink();
        System.out.println();

        thr1.setBrand("Corkcicle");
        thr1.setCapacity(750);
        thr1.setInsulationType("Stainless steel");
        thr1.keepTemperature(5);
        thr1.showInfo();
        thr1.fillBottle();
        thr1.drink();
        System.out.println();

        sprt1.setBrand("Stanley");
        sprt1.setCapacity(1000);
        sprt1.hasNozzleStatus(true);
        sprt1.setCapstyle("Pop out");
        sprt1.showInfo();
        sprt1.fillBottle();
        sprt1.drink();
        System.out.println();

        cmr1.setZoom(2);
        cmr1.photoMode("Scenery");
        cmr1.showInfo();
        System.out.println();

        lmp1.setBrightness(50);
        lmp1.setColor("Purple");
        lmp1.showInfo();
    }
}
