public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        System.out.println(burn); /*hack!*/
        return burn;

//        int a = status.getAltitude();
//        int v = status.getVelocity();
//        int burn = 100;
//        if (a >1000 && v > 100) {
//            burn = 170;
//            burn *=10;
//        }
//        burn = (v*v)/(2*a);
//        System.out.println(burn); /*hack!*/
//        return burn;
//        }
    }
}
