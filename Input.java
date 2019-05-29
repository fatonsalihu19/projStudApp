import javax.swing.JOptionPane;

public class Input
{


public int getNr(String b)
{int i=0;
 String s=JOptionPane.showInputDialog(b);
 if(s==null){getNr(b);}
 else{s=s.trim();
      i =Integer.parseInt(s);}
      return i;
}

public String getString(String b)
{
 String s=JOptionPane.showInputDialog(b);
 if(s==null){getString(b);}
 else{s=s.trim().toUpperCase();}
      return s.charAt(0)+s.substring(1,s.length()).toLowerCase();
}
public char getChar(String b) {
	String s=JOptionPane.showInputDialog(b);
	 if(s==null){getString(b);}
	 else{s=s.trim().toUpperCase();}
	      return s.charAt(0);
}
}