package programming;

import junit.framework.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class JavaUtilityTest {

    private final JavaUtility utility = new JavaUtility();

    @Test
    public void testSomeLibraryMethod() {
        JavaUtility classUnderTest = new JavaUtility();
        Assert.assertEquals(classUnderTest.stringToInt("12345"), 12345);
    }

    @Test
    public void reverseString() {
        JavaUtility fun = new JavaUtility();
        final String cow = fun.reverseString("cow");
        Assert.assertEquals(cow, "woc");
    }

    @Test
    public void testStripWhitespace() {
        final String reversedString = utility.reverseString(" Monday");
        Assert.assertEquals(reversedString, "yadnoM");
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(utility.isPalindrome("cowwoc"));
    }

    @Test
    public void testForNull() {
        final String s = utility.reverseString(null);
        Assert.assertNotNull(s);
    }

    @Test
    public void testCantParse() {
        final int actual = utility.stringToInt("hi");
        Assert.assertEquals(actual, -1);
    }

    @Test
    public void numberOfOccurencesOfCharacters() {
        String word = "super-cali-fragil-istic";
        final Map<Character, Integer> results = utility.numberOfOcurrencesOfCharactersInWord(word);
        Assert.assertEquals(results.get('f'), (Integer)1);
        Assert.assertEquals(results.get('s'), (Integer)2);
        Assert.assertEquals(results.get('c'), (Integer)2);
        Assert.assertEquals(results.get('i'), (Integer)4);
    }

    @Test
    public void fizzBuzz() {
        final List<String> strings = utility.fizzBuzz();
        Assert.assertEquals(strings.size(), 14);
        Assert.assertEquals(strings.get(13), "FizzBuzz");
        Assert.assertEquals(strings.get(6), "FizzBuzz");
        Assert.assertEquals(strings.get(4), "Buzz");
        Assert.assertEquals(strings.get(2), "Fizz");
        Assert.assertEquals(strings.get(12), "Fizz");
        Assert.assertEquals(strings.get(3), "Fizz");
        Assert.assertEquals(strings.get(1), "Buzz");
        Assert.assertEquals(strings.get(0), "Fizz");

    }

    @Test
    public void removeDuplicateNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 3, 6, 8, 8, 9);
        final List<Integer> integers = utility.removeDuplicateNumbers(numbers);
        Assert.assertEquals(integers.size(), 5);
    }

    @Test
    public void removeDuplicateNumbersNullCheck() {
        final List<Integer> integers = utility.removeDuplicateNumbers(null);
        Assert.assertNotNull(integers);
    }

    @Test
    public void sortContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jill", "Marley", new Date()));
        contacts.add(new Contact("Garmino", "Zigley", new Date()));
        contacts.add(new Contact("Fred", "Anderson", new Date()));
        contacts.add(new Contact("Bob", "Jarbus", new Date()));
        final List<Contact> sortedContacts = utility.sortContacts(contacts);

        Assert.assertEquals(sortedContacts.size(), 4);
        Assert.assertEquals(sortedContacts.get(0).getFirstName(), "Fred");
        Assert.assertEquals(sortedContacts.get(1).getFirstName(), "Bob");
        Assert.assertEquals(sortedContacts.get(2).getFirstName(), "Jill");
        Assert.assertEquals(sortedContacts.get(3).getFirstName(), "Garmino");
    }

    @Test
    public void testListToReversedInteger() {
        final int number = utility.listToReversedInteger(Arrays.asList("7", "9", "3", "7"));
        Assert.assertEquals(number, 7397);

    }

}
