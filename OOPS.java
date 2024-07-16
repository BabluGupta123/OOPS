// Access Modifiers:-
// https://www.techopedia.com/definition/23/access-modifiers

// Getter and Setter
// https://www.baeldung.com/java-why-getters-setters

public class OOPS {

    public static void main(String[] args) {

        pen p1 = new pen();

        p1.setColor("Red");
        p1.setTip(5);

        System.out.println(p1.color);
        System.out.println(p1.tip);

        // OR
        p1.color = "Blue";
        p1.tip = 6;

        System.out.println(p1.color);
        System.out.println(p1.tip);
 

        BackAccount myAccount= new BackAccount();
        myAccount.UserName= "Bablu Gupta";
        myAccount.setPassword("abcdef");

        System.out.println(myAccount.UserName);

    }
}

// ---------------------------- Pen Class ---------------------------------
class pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// --------------------------------------x Pen x---------------------------

// --------------------------- BackAccount --------------------------------
class BackAccount {

   public String UserName;
    private String Password;

    public void setPassword(String pass) {
        Password = pass;

    }

}

// ---------------------------x BackAccount x--------------------------------
