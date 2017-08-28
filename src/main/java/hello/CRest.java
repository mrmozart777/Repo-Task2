package hello;

import org.springframework.util.DigestUtils;

import java.util.*;

public class CRest {

    public final String name;
    public final String sname;

    private static HashMap<String,String> Tablename = new HashMap<String, String>();
    private static HashMap<String,String> Tablesname = new HashMap<String, String>();
    private static HashMap<String,String> Tabledate = new HashMap<String, String>();
    private static HashMap<String,String> Tablepass = new HashMap<String, String>();

    public CRest(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }

    public void SetAll(String name, String sname, String date, String pass, String email) {
        Tablename.put(email, name);
        Tablesname.put(email, sname);
        Tabledate.put(email, date);
        Tablepass.put(email, MakeHash(pass));
        Tablename.put(email, name);
    }

    private String MakeHash(String pass){
        byte[] digest = pass.getBytes();
        return DigestUtils.md5DigestAsHex(digest);
    }

    public String FindName(String email){
        return Tablename.get(email);
    }

    public String FindSname(String email){
        return Tablesname.get(email);
    }

    public void RmUser(String email){
        Tablename.remove(email);
        Tablesname.remove(email);
        Tabledate.remove(email);
        Tablepass.remove(email);
        Tablename.remove(email);
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }
}