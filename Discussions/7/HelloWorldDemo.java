public class HelloWorldDemo{
    public static void main(String args[]){
        Hello h=new Hello();
        World w=new World();

        HelloWorld hw1=new HelloWorld();
        HelloWorld hw2=new HelloWorld(h,w);

        System.out.println(hw1);
        System.out.println(hw2);

        //method calls with different number of paramteres, these are examples but the number of parameters need to be handled can be anything.
        System.out.println(addThem(hw1,hw1,hw1));
        System.out.println(addThem(hw1,hw1,hw1,hw2,hw2,hw2));
        System.out.println(addThem(hw1,hw2));
    }

    public static String addThem(HelloWorld... args){
        String finalAnsweString= new String();

        for(HelloWorld msg: args){
            finalAnsweString += msg.toString();
            finalAnsweString += ' ';
        }

        return finalAnsweString;
    }
}

class HelloWorld{
    private Hello h1;
    private World w1;

    public HelloWorld(){
        h1=new Hello();
        w1=new World();
    }

    public HelloWorld(Hello h,World w){
        h1=new Hello(h);
        w1=new World(w);
    }

    public String toString(){
        return h1+" "+w1;
    }

}

class Hello{
    private String msg;

    public Hello(){
        msg="Hello";
    }

    public Hello(Hello h){
        msg=h.msg;
    }

    public String toString(){
        return msg;
    }
}

class World{
    private String msg;

    public World(){
        msg="World";
    }

    public World(World w){
        msg=w.msg;
    }

    public String toString(){
        return msg;
    }
}