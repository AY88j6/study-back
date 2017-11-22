package com.wt.javaeeDesignPatterns.part04;

/**
 * 单例模式代码实现
 */
public class SingletonTest {

    public static void main(String args[]){
        CodeSingleton codeSingleton = CodeSingleton.getInstance();
        CodeSingleton codeSingleton1 = CodeSingleton.getInstance();
        NoSingleton noSingleton = new NoSingleton();
        NoSingleton noSingleton1 = new NoSingleton();

        CodeSingleton2 codeSingleton2 = CodeSingleton2.INSTANCE;
        CodeSingleton2 codeSingleton21 = CodeSingleton2.INSTANCE;

        if(codeSingleton==codeSingleton1){
            System.out.println("一致");
        }else{
            System.out.println("不一致");
        }

        if(noSingleton==noSingleton1){
            System.out.println("一致");
        }else{
            System.out.println("不一致");
        }

        if(codeSingleton2==codeSingleton21){
            System.out.println("一致");
        }else{
            System.out.println("不一致");
        }
    }

}

class CodeSingleton{
    private static CodeSingleton codeSingleton;

    private CodeSingleton(){

    }

    public static synchronized CodeSingleton getInstance(){
        if(codeSingleton==null){
            codeSingleton = new CodeSingleton();
        }
        return codeSingleton;
    }
}

/**
 * 通过静态代码块实现，在加载类的同时，完成实例创建，由于是在getInstance调用之前完成的，所以没问题
 */
class CodeSingleton1{
    private static CodeSingleton1 codeSingleton1;
    {
        codeSingleton1 = new CodeSingleton1();
    }

    public static synchronized CodeSingleton1 getInstance(){
        return codeSingleton1;
    }
}

/**
 * 枚举方式创建单例类，推荐的方式。枚举本身就是单例的
 */
enum CodeSingleton2{
    INSTANCE;
    public void doSomething(){

    }
}

class NoSingleton{

}