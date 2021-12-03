public class ArithmeticOperator {
    public static void main(String[] args){

        // OPERATOR ADDING
        var a = 10;
        var b = 20;
        System.out.println(a + " + " + b + " = " + (a + b));

        var c = a + b;
        System.out.println(a + " + " + b + " = " + c);


        // SUBSTRACT OPERATOR
        var d = 50;
        var e = 25;
        System.out.println(d + " - " + e + " = " + (d - e));

        var f = (d - e);
        System.out.println(d + " - " + e + " = " + f);


        // DIVISION OPERATOR
        var g = 100;
        var h = 50;
        System.out.println(g + " / " + h + " = " + (g / h));

        var i = (g / h);
        System.out.println(g + " / " + h + " = " + i);


        // MULTIPLE OPERATOR
        var j = 10;
        var k = 5;
        System.out.println(j + " * " + k + " = " + (j * k));

        var l = (j * k);
        System.out.println(j + " * " + k + " = " + l);


        // MODULUS / SISA BAGI
        var m = 20;
        var n = 3;
        System.out.println(m + " % " + n + " = " + (m % n));

        var o = (m % n);
        System.out.println(m + " % " + n + " = " + o);


        // COMPUND ASSIGNMENT
        var x = 20;
        var y = 10;

        // +=
        System.out.println(x += y);

        // -=, saat disini x = 30
        System.out.println(x -= y);

        // *=
        System.out.println(x *= y);

        // /=
        System.out.println(x /= y);
    }
}
