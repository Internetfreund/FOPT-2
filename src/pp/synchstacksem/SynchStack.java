package pp.synchstacksem;

public class SynchStack
{
    private Object[] stack = new Object[0];
    
    // es wird das letzte Object im Array ausgelesen, 
    // dann wird der Array in einen um 1 kürzen Array kopiert
    // dann wird der neue Array zu dem alten geklont. So die Theorie
    public Object pop()
    {
        System.out.println("pop start");
        Object o = stack[stack.length - 1];
        Object[] newstack = new Object[stack.length-1];
        
        for (int i = 0; i < (stack.length - 1); i++)
        {
            newstack[i] = stack[i];
        }
        stack=newstack.clone();
        for (int i = 0; i < stack.length; i++)
        {
            System.out.println(stack[stack.length-1-i]);
        }
        System.out.println("pop ende");
        return o;
    }
    
    
    // Es wird ein neuer Stack um 1 längerer Array erstellt
    // Das letzte Objekt im Array ist das Parameterobjekt
    // Der alte Array wird in den neuen kopiert
    // dann wird der neue zu dem alten geklont. So die Theorie
    public void push(Object o)
    {
        System.out.println("push start");
        Object[] newstack = new Object[stack.length+1];
        newstack[stack.length]= o;
        for (int i = 0; i < (stack.length); i++)
        {
            newstack[i] = stack[i];
        }
        stack = newstack.clone();
        for (int i = 0; i < stack.length; i++)
        {
            System.out.println(stack[stack.length-1-i]);
        }
        System.out.println("push ende");
    }
    
    
    
    
    public static void main(String[] args)
    {
        SynchStack ss = new SynchStack();
        ss.push(1);
        ss.push(2);
        ss.push("hallo");
        ss.push("3");
        ss.pop();
        ss.pop();
        ss.push("vier");
        
        
    }
    
    
}
