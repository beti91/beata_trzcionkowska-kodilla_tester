public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public void getLastGrade() {
        int grade = grades[9];
        System.out.println(grades[9]);
    }
    public void getAverage() {
        int quantity = size;
        double sum = 0.0;
        for (int i =0; i < size; i++) {
            sum += grades[i];
        }
        double average = sum / quantity;
        System.out.println(average);
    }


}







