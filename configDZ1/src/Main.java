//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main
{
    public Main()
    {
    }

    public static void main(String[] var0)
    {
        try
        {
            Scanner var1 = new Scanner(System.in);
            String var2 = var0[0];
            VShell var3 = new VShell(var2);

            while(true)
            {
                String var4 = var1.nextLine();
                if ("q".equals(var4.trim().toLowerCase()) || "exit".equals(var4.trim().toLowerCase()))
                {
                    var3.pwd();
                    System.out.print("VShell System Deactivated.");
                    break;
                }

                var3.cmd(var4);
            }
        }
        catch (Exception var5)
        {
            System.out.println("!ERROR!");
        }

    }
}