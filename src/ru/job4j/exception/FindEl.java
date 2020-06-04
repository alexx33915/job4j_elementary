package ru.job4j.exception;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("key not found in array.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] arrayValue = {"124", "125", "126"};
        try {
            int index = indexOf(arrayValue, "127");
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

}