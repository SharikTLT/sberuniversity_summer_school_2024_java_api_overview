package e1.lang;

/**
 * Классы обертки
 */
public class Part1_Wrappers {

    public static void main(String[] args) {
        //Обертка над примитивом
        Boolean wrappedBoolean = true;

        //Примитивный тип
        boolean primitiveBoolean = true;

        //Unboxing
        assert(wrappedBoolean == primitiveBoolean);

        //Boxing
        wrappedBoolean = primitiveBoolean;

        //Unboxing
        primitiveBoolean = wrappedBoolean;
    }
}
