package com.week3.structural.designPattern;
class HpPrinter{
    public static void printDocumnet(){
        System.out.println("Hp Printer, printing data");
    }
}

class PrinterAdapter implements Printer{

    private HpPrinter hpPrinter = new HpPrinter();
    @Override
    public void print() {
        hpPrinter.printDocumnet();
    }
}

public class AdapterPattern {
    static Printer PrinterAdapter = null;
    public static void clientCode(Printer printer){
        printer.print();
    }

    public static void main(String[] args) {
       PrinterAdapter printerAdapter = new PrinterAdapter();
        clientCode(PrinterAdapter);
    }
}
