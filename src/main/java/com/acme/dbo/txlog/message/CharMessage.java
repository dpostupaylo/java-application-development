package com.acme.dbo.txlog.message;


public class CharMessage extends MessageDecorator implements Message{
    private char message;

    public CharMessage(char message){
        super("char:");
        this.message = message;
    }

    @Override
    public String getDecoratedMessage(){
        return super.decorateMessage(Character.toString(this.message));
    }

    @Override
    public void aggregate(Message message) {

    }


    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;
        CharMessage compareMessage = (CharMessage) o;

        if (!(this.message == compareMessage.message))
            return false;

        return true;
    }
}
