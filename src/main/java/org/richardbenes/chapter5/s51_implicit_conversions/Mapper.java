package org.richardbenes.chapter5.s51_implicit_conversions;

import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface Mapper {

    Mapper mapper = Mappers.getMapper(Mapper.class);

    WrapperModel primitiveToWrapper(PrimitiveModel p);
    PrimitiveModel wrapperToPrimitive(WrapperModel w);

    StringModel primitiveToString(PrimitiveModel p);
    PrimitiveModel stringToPrimitive(StringModel s);

    StringModel wrapperToString(WrapperModel w);
    WrapperModel stringToWrapper(StringModel s);

//    PrimitiveModel intToChar(PrimitiveModelIntType pi);
    PrimitiveModelIntType charToInt(PrimitiveModel p);
    PrimitiveModelFloatRatio doubleToFloat(PrimitiveModel p);


    static void main(String[] args) {

        System.out.println("-------------------------------");
        System.out.println("<<< Wrappers and Primitives >>>");
        System.out.println("-------------------------------");

        System.out.println();

        System.out.println("## Valid wrapper to Primitive");
        System.out.println(mapper.wrapperToPrimitive(WrapperModel.initializedWithValues()));

        System.out.println();

        System.out.println("## Valid primitive to Wrapper");
        System.out.println(mapper.primitiveToWrapper(PrimitiveModel.initializedWithValues()));

        System.out.println();

        System.out.println("## Wrapper initialized with `null`s to Primitives");
        System.out.println(mapper.wrapperToPrimitive(WrapperModel.initializedWithNulls()));

        System.out.println();

        System.out.println("## Wrapper initialized with zeros to Primitives");
        System.out.println(mapper.wrapperToPrimitive(WrapperModel.initializedWithZeros()));

        System.out.println();

        System.out.println("------------------------------");
        System.out.println("<<< Strings and Primitives >>>");
        System.out.println("------------------------------");

        System.out.println();

        System.out.println("## Valid Primitives to Strings");
        System.out.println(mapper.primitiveToString(PrimitiveModel.initializedWithValues()));

        System.out.println();

        System.out.println("## Valid Strings to Primitives");
        System.out.println(mapper.stringToPrimitive(StringModel.initializedWithValues()));

        System.out.println();

        System.out.println("## Null Strings to Primitives");
        System.out.println(mapper.stringToPrimitive(StringModel.initializedWithNulls()));

        System.out.println();

        System.out.println("## Empty Strings to Primitives");
        try {
            System.out.println(mapper.stringToPrimitive(StringModel.initializedWithEmpty()));
        } catch (Exception e) {
            System.out.println("Threw %s: %s".formatted(
                    e.getClass().getSimpleName(), e.getMessage()));
        }

        System.out.println();

        System.out.println("----------------------------");
        System.out.println("<<< Strings and Wrappers >>>");
        System.out.println("----------------------------");

        System.out.println();

        System.out.println("## Valid Strings to Wrappers");
        System.out.println(mapper.stringToWrapper(StringModel.initializedWithValues()));

        System.out.println();

        System.out.println("## Null Strings to Wrappers");
        System.out.println(mapper.stringToWrapper(StringModel.initializedWithNulls()));

        System.out.println();

        System.out.println("## Empty Strings to Wrappers");
        try {
            System.out.println(mapper.stringToWrapper(StringModel.initializedWithEmpty()));
        } catch (Exception e) {
            System.out.println("Threw %s: %s".formatted(
                    e.getClass().getSimpleName(), e.getMessage()));
        }

        System.out.println();

        System.out.println("## Valid Wrappers to Strings");
        System.out.println(mapper.wrapperToString(WrapperModel.initializedWithValues()));

        System.out.println();

        System.out.println("## Null Wrappers to Strings");
        System.out.println(mapper.wrapperToString(WrapperModel.initializedWithNulls()));

        System.out.println();

        System.out.println("## Zero Wrappers to Strings");
        System.out.println(mapper.wrapperToString(WrapperModel.initializedWithZeros()));

        System.out.println();

        System.out.println("----------------------");
        System.out.println("<<< Strange Things >>>");
        System.out.println("----------------------");

        System.out.println();

        System.out.println("## Strings to Primitives - Overflows");
        try {
            System.out.println(
                    mapper.stringToPrimitive(StringModel.initializedWithOverflowingValues()));
        } catch (Exception e) {
            System.out.println("Threw %s: %s".formatted(
                    e.getClass().getSimpleName(), e.getMessage()));
        }

        System.out.println();

        System.out.println("## Strings to Wrappers - Overflows");
        try {
            System.out.println(
                    mapper.stringToWrapper(StringModel.initializedWithOverflowingValues()));
        } catch (Exception e) {
            System.out.println("Threw %s: %s".formatted(
                    e.getClass().getSimpleName(), e.getMessage()));
        }

        System.out.println();

        System.out.println("## Strings to Primitives - Multi-character Char");
        try {
            System.out.println(
                    mapper.stringToPrimitive(StringModel.initializedWithMultiCharacterChar()));
        } catch (Exception e) {
            System.out.println("Threw %s: %s".formatted(
                    e.getClass().getSimpleName(), e.getMessage()));
        }

        System.out.println();

        System.out.println("## Primitives to Primitives - Numeric char to int");
        System.out.println(mapper.charToInt(PrimitiveModel.initializedWithValues('5')));

        System.out.println();

        char c = '0';
        System.out.println(
                "## Primitives to Primitives - Non-number char '%s' to int (field `type`)"
                        .formatted(c));
        System.out.println(mapper.charToInt(PrimitiveModel.initializedWithValues(c)));

        System.out.println();

        System.out.println("## Primitives to Primitives - Int to char");
        System.out.println("Impossible - user-specified (int -> char) mapping required");
//        System.out.println(mapper.intToChar(PrimitiveModelIntType.initializedWithValues()));

        System.out.println();

        double e = 2.7182818284590d;
        System.out.println("## Primitives to Primitives - double %s to float".formatted(e));
        System.out.println(mapper.doubleToFloat(PrimitiveModel.initializedWithValues(e)));

    }
}
