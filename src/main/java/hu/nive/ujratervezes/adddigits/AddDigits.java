package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public static int addDigits(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }
        String[] justNumbers = input.replaceAll("[^0-9]", "").split("");
        if (justNumbers[0].equals("")) {
            return 0;
        } else {
            int[] inNumbers = inputsNumbersToArray(justNumbers);
            int result = calculateSumOfDigits(inNumbers);
            return result;
        }
    }

    private static int calculateSumOfDigits(int[] inNumbers) {
        int result = 0;
        for (int i = 0; i < inNumbers.length; i++) {
            result += inNumbers[i];
        }
        return result;
    }

    private static int[] inputsNumbersToArray(String[] justNumbers) {
        int[] inNumbers = new int[justNumbers.length];
        for (int i = 0; i < justNumbers.length; i++) {
            inNumbers[i] = Integer.parseInt(justNumbers[i]);
        }
        return inNumbers;
    }
}
