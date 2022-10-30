//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class VShell {
    private Path dir = Path.of("");
    private final ZipFile zipFile;
    List<String> entries = new ArrayList();

    VShell(String var1) throws IOException
    {
        this.zipFile = new ZipFile(var1);
        Enumeration var2 = this.zipFile.entries();

        while(var2.hasMoreElements())
        {
            this.entries.add(((ZipEntry)var2.nextElement()).getName());
        }

        this.pwd();
        System.out.println("VShell System Activated. Type 'q' or 'exit' to turn VShell off.");
        this.pwd();
    }

    public void pwd()
    {
        System.out.print(this.dir.toString().isEmpty() ? "/> " : this.dir + "> ");
    }

    public void pwdCommand()
    {
        System.out.println(this.dir.toString().isEmpty() ? "/" : this.dir + "/");
    }

    public void ls()
    {
        Iterator var1 = this.entries.iterator();

        while(var1.hasNext()) {
            String var2 = (String)var1.next();
            if (var2.startsWith(this.dir.toString())) {
                String var3 = this.dir.toString().isEmpty() ? var2 : var2.substring(this.dir.toString().length() + 1);
                if (!this.nestedFileExists(var3) && !var3.isBlank()) {
                    System.out.println(var3);
                }
            }
        }

        this.pwd();
    }

    public void cd(Path var1)
    {
        if (var1.toString().equals("..")) {
            this.dir = this.dir.getParent() == null ? Path.of("") : this.dir.getParent();
            this.pwd();
        } else {
            Path var2 = this.dir.toString().isEmpty() ? var1 : Path.of(this.dir + "/" + var1);
            if (this.exists(var2)) {
                this.dir = var2.toString().charAt(var2.toString().length() - 1) != '/' ? Path.of(var2.toString() + "/") : var2;
                this.pwd();
            } else {
                this.pwd();
                System.out.println("No such file or directory");
                this.pwd();
            }
        }
    }

    public void cat(String var1) throws IOException
    {
        Iterator var2 = this.entries.iterator();

        while(var2.hasNext()) {
            String var3 = (String)var2.next();
            String var4 = this.dir.toString().isEmpty() ? var3 : var3.substring(this.dir.toString().length() + 1);
            if (var1.equals(var4)) {
                InputStream var5 = this.zipFile.getInputStream(this.zipFile.getEntry(var3));
                System.out.println(new String(var5.readAllBytes()));
            }
        }

        this.pwd();
    }

    public void cmd(String var1)
    {
        if (var1.toLowerCase().trim().equals("ls")) {
            this.ls();
        } else if (var1.toLowerCase().trim().equals("pwd")) {
            this.pwdCommand();
        } else if (var1.toLowerCase().trim().startsWith("cd ")) {
            this.cd(Path.of(var1.substring(2).trim()));
        } else if (var1.toLowerCase().trim().startsWith("cat ")) {
            try {
                this.cat(var1.substring(3).trim());
            } catch (Exception var3) {
                System.out.println("РћС€РёР±РєР° РІС‹РїРѕР»РЅРµРЅРёСЏ cat!");
            }

        } else {
            System.out.println("РќРµРёР·РІРµСЃС‚РЅР°СЏ РєРѕРјР°РЅРґР°!");
        }
    }

    private boolean exists(Path var1)
    {
        Iterator var2 = this.entries.iterator();

        String var3;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            var3 = (String)var2.next();
        } while(!Path.of(var3).toString().toLowerCase().equals(var1.toString().toLowerCase()));

        return true;
    }

    private boolean nestedFileExists(String var1)
    {
        for(int var2 = 0; var2 < var1.length(); ++var2) {
            if (var1.charAt(var2) == '/' && var1.length() > var2 + 1) {
                return true;
            }
        }

        return false;
    }
}