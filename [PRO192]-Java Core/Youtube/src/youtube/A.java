/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Dell
 */
final class A {
   public class Main
static void fun(A t) {t.x += 2;}
public static void main(String args[])
{A t = new A();
t.x = 99;
System.out.print(t.x + " ");
t.x++;
System.out.print(t.x + " ");
fun(t);
System.out.print(t.x);
}
}

