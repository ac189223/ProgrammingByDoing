public class _28_ModulusAnimation01 {
    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<80; i++ ) {
            if ( i%10 == 0 )
                System.out.print(" blink \r");
            else
                System.out.print("    blink \r");
            Thread.sleep(200);
        }

    }
}
