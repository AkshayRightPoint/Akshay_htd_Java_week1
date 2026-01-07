package com.week3.observer.designpattern;

class Level1SupportHandler implements SupportHandler{
    private  SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

class Level2SupportHandler implements SupportHandler{

    private Level1SupportHandler secondHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.INTERMEDIATE ) {
            System.out.println("Level 2 Support handled the request.");
        } else if (secondHandler != null) {
            secondHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler secondHandler) {
        this.secondHandler = (Level1SupportHandler) secondHandler;
    }
}

class Level3SupportHandler implements SupportHandler {

    private Level3SupportHandler lastHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.CRITICAL){
            System.out.println("Level 3 handling ");
        }else {
            System.out.println("Last person to handle");
        }
    }

    @Override
    public void setNextHandler(SupportHandler lastHandler) {
        this.lastHandler = (Level3SupportHandler) lastHandler;
    }
}


public class ChainResponsibility {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
    }

}
