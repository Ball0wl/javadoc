/**
 *
 * @author f.ulmer.
 * @version 1.0.
 */
public class Main {
    /**
     * @param args Der Parameter, den der Benutzer angibt, wenn er das Programm startet.
     */
    public static void main(String[] args){
        int i = 0;
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        Test t = null;

        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
            t = new Test();
        }
    }
}
