package com.devaldrete.domain;

import java.time.Instant;

public class Loan {
  private String id;
  private String userId;
  private String bookId;
  private Instant createdAt;
  private Instant dueDate;

  public Loan(String id, String userId, String bookId, Instant createdAt, Instant dueDate) {
    this.id = id;
    this.userId = userId;
    this.bookId = bookId;
    this.createdAt = createdAt;
    this.dueDate = dueDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getDueDate() {
    return dueDate;
  }

  public void setDueDate(Instant dueDate) {
    this.dueDate = dueDate;
  }

}
