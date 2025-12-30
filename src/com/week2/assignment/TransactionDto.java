package com.week2.assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionDto {
    private String id;
    private String ticker;
    private String type;
    private int quantity;
    private double price;
    private LocalDateTime timestamp;
    private String currency;

    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public TransactionDto(String id, String ticker, String type, int quantity, double price, LocalDateTime timestamp, String currency) {
        this.id = id;
        this.ticker = ticker;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.timestamp = timestamp;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public String getTicker() {
        return ticker;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "TradeDto{" +
                "id='" + id + '\'' +
                ", ticker='" + ticker + '\'' +
                ", type=" + type +
                ", quantity=" + quantity +
                ", price=" + price +
                ", timestamp=" + timestamp +
                ", currency='" + currency + '\'' +
                '}';
    }

    public double getTotalValue(){
        return price*quantity;
    }
}
