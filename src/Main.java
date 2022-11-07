
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","555");
        Teacher t2 = new Teacher("Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("KülYutmaz","BIO","1111");

        Course tarih = new Course("Tarih","101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","100","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Kaan ceylan","1453","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,200,50,100,25,56);
        s1.isPass();

        Student s2 = new Student("Max Foxall","345","4",tarih,fizik,biyo);
        s2.isPass();

        Student s3 =new Student("Alfie","2222","4",tarih, fizik, biyo);
        s3.isPass();



        }
    }

































