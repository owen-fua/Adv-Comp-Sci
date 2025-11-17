public class Unit1ExercisesTester {
    public static void main(String[] args) {
        // testing helloName
        System.out.println("testing helloName:");
        System.out.println(Unit1Exercises.helloName("Bob"));
        System.out.println(Unit1Exercises.helloName("Sally"));
        // testing makeOutWord
        System.out.println("testing makeOutWord:");
        System.out.println(Unit1Exercises.makeOutWord("<<>>", "Bob"));
        System.out.println(Unit1Exercises.makeOutWord("{{}}", "Justin"));
        // testing withoutEnd
        System.out.println("testing withoutEnd:");
        System.out.println(Unit1Exercises.withoutEnd("java"));
        System.out.println(Unit1Exercises.withoutEnd("coding"));
        // testing comboString
        System.out.println("testing comboString:");
        System.out.println(Unit1Exercises.comboString("hi", "hello"));
        System.out.println(Unit1Exercises.comboString("aaaa", "b"));
        // testing left2
        System.out.println("testing left2:");
        System.out.println(Unit1Exercises.left2("java"));
        System.out.println(Unit1Exercises.left2("Hi"));
        // testing middleThree
        System.out.println("testing middleThree:");
        System.out.println(Unit1Exercises.middleThree("candy"));
        System.out.println(Unit1Exercises.middleThree("solving"));
        // testing withoutEnd2
        System.out.println("testing withoutEnd2:");
        System.out.println(Unit1Exercises.withoutEnd2("hello"));
        System.out.println(Unit1Exercises.withoutEnd2("ab")); // empty
        // testing stringEnds
        System.out.println("testing stringEnds:");
        System.out.println(Unit1Exercises.stringEnds("chocolate", 3));
        System.out.println(Unit1Exercises.stringEnds("Hello", 2));
        // testing hasBad
        System.out.println("testing hasBad:");
        System.out.println(Unit1Exercises.hasBad("xxbadxx")); // false
        System.out.println(Unit1Exercises.hasBad("xbadbad")); // true
        // testing countVowels
        System.out.println("testing countVowels:");
        System.out.println(Unit1Exercises.countVowels("hello"));
        System.out.println(Unit1Exercises.countVowels("abcdefgh"));
        // testing countCode
        System.out.println("testing countCode:");
        System.out.println(Unit1Exercises.countCode("cozexxcope"));
        System.out.println(Unit1Exercises.countCode("acbcore"));


    }
}
