//Klasa Student sherben per ti kthyer te dhenat e studenteve po ashtu dhe regjistron lendet dhe notat per student
public class Student {
 
 private int id;	
 private String name;
 private String surname;
 public String[] lendet={"Diskrete","Elementare","Programim","Hyrje","Anglisht"};
 public int[] notat={5,5,5,5,5};
 public Student() {}
 public Student(int id,String name,String surname) 
 {
	 this.id = id;
     this.name=name;
     this.surname=surname;
 }
 
 public int getId()
 {
	 return id;
 }
 public String getName() {
	 return name;
 }
 public String getSurname()
 {
	 return surname;
 }
 public String getF()
 {
	 return id+":"+name+" "+surname;
 }
 public void setNota(int i,int nota)
 {notat[i]=nota;}
 
 public int getNota(int i)
 {return notat[i];}
}
