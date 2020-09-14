/**
 * Created by Sabab on 5/5/2016.
 */
import java.io.*;

class MyClass {

    void printFunction()
    {
        print("Hello Dum-E" + '\n');
    }

    static void inputFunction()
    {
        /*def console = System.console()
        if(console)
        {
            def username = console.readLine()
            println ("Hello ${username}");
        }
        else
            println("not found")*/

        println "What is your name?"
        def d = System.in.newReader().readLine()
        int i = d.toInteger()
        println(i)
        //println "Your name is ${System.in.newReader().readLine()}"
    }

    static void main(String[] args) {

//        new File("E:/Example.txt").eachLine {
  //           line -> println "$line";
        //inputFunction()

        File file = new File("E:/Example.txt")
        println "Below is the content of the file ${file.absolutePath}"
        def lineNo = 1
        def line
        def numList = []
        file.withReader { reader ->
            while ((line = reader.readLine()) != null) {
                println "${lineNo}. ${line}"
                lineNo++
                numList.add(line.toInteger())
            }
        }

        for(int i = 0; i < numList.size(); i++)
            println(numList[i])

        int i = 900
        String sr = i.toString()
        println(sr)
    }
}
