package com.week2.assignment;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DataSetFormat {
    public static void main(String[] args) {
        List<String> transactions = List.of(
                "TXN001|AAPL|BUY|10|150.00|2024-01-15T10:30:00|USD",
                "TXN002|TSLA|SELL|5|700.00|2024-01-16T11:00:00|USD",
                "TXN003|RELIANCE|BUY|100|2400.00|2024-01-20T09:15:00|INR",
                "TXN004|AAPL|BUY|20|155.50|2024-02-10T14:20:00|USD",
                "TXN005|MSFT|BUY|15|300.00|2024-02-12T10:00:00|USD",
                "TXN006|INFY|SELL|50|1600.00|2024-02-15T15:45:00|INR",
                "TXN007|TSLA|BUY|2|650.00|2024-03-01T09:30:00|USD",
                "TXN008|RELIANCE|SELL|30|2500.00|2024-03-05T10:10:00|INR",
                "TXN009|AAPL|SELL|5|170.00|2024-03-10T11:30:00|USD",
                "TXN010|GOOGL|BUY|8|2800.00|2024-03-25T13:00:00|USD",
                "TXN011|TCS|BUY|40|3500.00|2024-04-02T09:20:00|INR",
                "TXN012|MSFT|SELL|10|310.00|2024-04-05T16:00:00|USD",
                "TXN013|RELIANCE|BUY|200|2350.00|2024-04-10T11:00:00|INR",
                "TXN014|INFY|BUY|100|1550.00|2024-05-12T09:45:00|INR",
                "TXN015|AAPL|BUY|12|180.00|2024-05-15T14:00:00|USD",
                "TXN016|TCS|SELL|20|3600.00|2024-06-01T10:30:00|INR",
                "TXN017|GOOGL|SELL|3|2900.00|2024-06-10T12:00:00|USD",
                "TXN018|ZOMATO|BUY|1000|120.00|2024-06-15T15:00:00|INR",
                "TXN019|MSFT|BUY|5|320.00|2024-06-20T10:00:00|USD",
                "TXN020|RELIANCE|SELL|50|2600.00|2024-06-25T11:30:00|INR"
        );

       // id | ticker | type | quantity | price | timestamp | currency
        List<TransactionDto> transactionDtoList = transactions.stream().map(t -> {
            String[] split = t.split("\\|");
            return new TransactionDto(split[0],
                    split[1],
                    split[2],
                    Integer.parseInt(split[3]),
                    Double.parseDouble(split[4]),
                    LocalDateTime.parse(split[5]),
                    split[6]);
        }).collect(Collectors.toList());

      //  Task B: High-Value Filtering -> BUY
        List<TransactionDto> buy = transactionDtoList.stream().filter(x -> x.getType().equals("BUY"))
                .filter(e -> e.getTotalValue() >= 500).toList();

        System.out.println(buy);

        // Total Sum

        Map<String, Double> toalSum =  transactionDtoList.stream().collect(Collectors.
                groupingBy(TransactionDto::getCurrency,
                        Collectors.summingDouble(TransactionDto::getTotalValue)));
        System.out.println(toalSum);

        // find peak trade
        Optional<TransactionDto> peakTrade = DataSetFormat.findPeak(transactionDtoList, "AAPL");
        String result = peakTrade.map(TransactionDto::toString).orElse("No Data Found");
        System.out.println(result);

        //Activity TimeLine

        transactionDtoList.stream().collect(Collectors.groupingBy(t -> t.getTimestamp().getMonth(), Collectors.counting())).forEach((month, aLong)
                -> System.out.println(month + " " + aLong));
    }

    //optional method to find peak

    public static Optional<TransactionDto> findPeak(List<TransactionDto> transactions, String ticker){
         return transactions.stream().filter(x -> x.getTicker().equals(ticker)).
                 max(Comparator.comparing(TransactionDto::getTotalValue));
    }
}
