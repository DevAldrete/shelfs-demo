package com.devaldrete.utils;

import java.util.Random;

public class ISBNGenerator {

  /**
   * Generates a valid ISBN-13 number
   * Format: 978/979 (Bookland) + publisher/group + title + check digit
   */
  public static String generateISBN13() {
    Random random = new Random();
    StringBuilder isbn = new StringBuilder();

    // Start with Bookland prefix (978 or 979)
    int prefix = random.nextBoolean() ? 978 : 979;
    isbn.append(prefix);

    // Generate remaining 9 digits (total 12 before check digit)
    for (int i = 0; i < 9; i++) {
      isbn.append(random.nextInt(10));
    }

    // Calculate check digit
    char checkDigit = calculateISBN13CheckDigit(isbn.toString());
    isbn.append(checkDigit);

    // Format with hyphens (optional)
    return formatISBN13(isbn.toString());
  }

  private static char calculateISBN13CheckDigit(String isbnWithoutCheck) {
    int sum = 0;

    for (int i = 0; i < 12; i++) {
      int digit = Character.getNumericValue(isbnWithoutCheck.charAt(i));
      // Multiply by 1 or 3 alternately
      sum += digit * (i % 2 == 0 ? 1 : 3);
    }

    int remainder = sum % 10;
    int checkDigit = (10 - remainder) % 10;

    return Character.forDigit(checkDigit, 10);
  }

  private static String formatISBN13(String isbn) {
    // Format: 978-1-23456-789-0
    return isbn.substring(0, 3) + "-" +
        isbn.substring(3, 4) + "-" +
        isbn.substring(4, 9) + "-" +
        isbn.substring(9, 12) + "-" +
        isbn.substring(12);
  }

  /**
   * Validates an ISBN-13 number
   */
  public static boolean validateISBN13(String isbn) {
    // Remove hyphens
    String cleanIsbn = isbn.replaceAll("-", "");

    if (cleanIsbn.length() != 13 || !cleanIsbn.matches("\\d{13}")) {
      return false;
    }

    char actualCheckDigit = cleanIsbn.charAt(12);
    char calculatedCheckDigit = calculateISBN13CheckDigit(cleanIsbn.substring(0, 12));

    return actualCheckDigit == calculatedCheckDigit;
  }
}
