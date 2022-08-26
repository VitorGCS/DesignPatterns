package behavioralPatterns.interpreter.example1;

// This interpreter just check if the data is same as the interpreter data.
class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpreter(String con){
        if(con.contains(data))
            return true;
        else
            return false;
    }
}