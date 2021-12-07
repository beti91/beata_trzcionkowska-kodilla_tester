public class GradesAplication
{
    public static void main(String[] args) {
        Grades oceny = new Grades();
        oceny.add(5);
        oceny.add(4);
        oceny.add(2);
        oceny.add(4);
        oceny.add(5);
        oceny.add(6);
        oceny.add(3);
        oceny.add(4);
        oceny.add(5);
        oceny.add(4);

   oceny.getAverage();
   oceny.getLastGrade();
   System.out.println(oceny.getLastGrade());


    }


}
