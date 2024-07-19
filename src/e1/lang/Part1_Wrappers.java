package e1.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * Классы обертки
 */
public class Part1_Wrappers {

    public static void main(String[] args) {
        //Обертка над примитивом
        Boolean wrappedBoolean = true;

        //Примитивный тип
        boolean primitiveBoolean = true;

        int primitiveInt = 1;
        Integer wrappedInteger = 1;

        //Unboxing
        assert(wrappedBoolean == primitiveBoolean);

        //Boxing
        wrappedBoolean = primitiveBoolean;

        //Unboxing
        primitiveBoolean = wrappedBoolean;

        int[] intArray = new int[]{1, 2, 3};

        List objectList = new ArrayList();

        objectList.add(wrappedBoolean);
        objectList.add(primitiveBoolean);




    }
}
