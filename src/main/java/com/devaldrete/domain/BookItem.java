package com.devaldrete.domain;

import java.time.Instant;

public class BookItem {
  private String id;
  private String barcode;
  private String bookDefId;
  private Status status;
  private Instant acquisitionDate;

  public BookItem(String id, String barcode, String bookDefId, Status status, Instant acquisitionDate) {
    this.id = id;
    this.barcode = barcode;
    this.bookDefId = bookDefId;
    this.status = status;
    this.acquisitionDate = acquisitionDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public String getBookDefId() {
    return bookDefId;
  }

  public void setBookDefId(String bookDefId) {
    this.bookDefId = bookDefId;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Instant getAcquisitionDate() {
    return acquisitionDate;
  }

  public void setAcquisitionDate(Instant acquisitionDate) {
    this.acquisitionDate = acquisitionDate;
  }
}
