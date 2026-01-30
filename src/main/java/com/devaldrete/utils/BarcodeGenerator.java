package com.devaldrete.utils;

public class BarcodeGenerator {
  public static String generateBarcode() {
    return "BC-" + java.util.UUID.randomUUID().toString().substring(0, 8).toUpperCase();
  }
}
