public class Grade {
    public static void main(String[] args) {
        int score=6;
        if (score >=90 && score <=100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <90) {
            System.out.println("好");
        } else if (score >= 60 && score < 80) {
            System.out.println("及格");
        } else if (score >=0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("成绩输入错误");
        }
    }
}
