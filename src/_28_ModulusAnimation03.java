public class _28_ModulusAnimation03 {
    public static void main( String[] args ) throws Exception {
        int repeats = 5;
        int steps_per_second = 10;

        for ( int i=0; i<repeats*11 ; i++ ) {
            if ( i%11 == 0 )
                System.out.print(" ooOoooooo \r");
            else if ( i%11 == 1 )
                System.out.print(" oooOooooo \r");
            else if ( i%11 == 2 )
                System.out.print(" ooooOoooo \r");
            else if ( i%11 == 3 )
                System.out.print(" oooooOooo \r");
            else if ( i%11 == 4 )
                System.out.print(" ooooooOoo \r");
            else if ( i%11 == 5 )
                System.out.print(" oooooooOo \r");
            else if ( i%11 == 6 )
                System.out.print(" ooooooooO \r");
            else if ( i%11 == 7 )
                System.out.print(" Ooooooooo \r");
            else if ( i%11 == 8 )
                System.out.print(" oOooooooo \r");
            else if ( i%11 == 9 )
                System.out.print(" ooOoooooo \r");
            else if ( i%11 == 10 )
                System.out.print(" oooOooooo \r");

            Thread.sleep(1000/steps_per_second);
        }
    }
}
