public class Main {
    static Quiz Quiz01= new Quiz();
    static Option[] options1 = new Option[3];
    static Option[] options2 = new Option[3];
    static Question[] questions = new Question[4];


    public static void main() {

        CreateOptions();
        CreateQuestions();
        CreateQuiz();

    }

    public static void CreateOptions() {
        options1[0] = new Option();
        options1[1] = new Option();
        options1[2] = new Option();
        options1[0].setId(001);
        options1[0].setText("Вариант1");
        options1[0].setCorrect(true);
        options1[1].setId(002);
        options1[1].setText("Вариант2");
        options1[1].setCorrect(false);
        options1[2].setId(003);
        options1[2].setText("Вариант3");
        options1[2].setCorrect(false);



        options2[0] = new Option();
        options2[1] = new Option();
        options2[2] = new Option();
        options2[0].setId(001);
        options2[0].setText("Вариант1");
        options2[0].setCorrect(false);
        options2[1].setId(002);
        options2[1].setText("Вариант2");
        options2[1].setCorrect(true);
        options2[2].setId(003);
        options2[2].setText("Вариант3");
        options2[2].setCorrect(false);

    }

    public static void CreateQuestions() {
        questions[0] = new Question();
        questions[0].id = 001;
        questions[0].text = "Вопрос#1 для квиза";
        questions[0].options = options1;

        questions[1] = new Question();
        questions[1].id = 002;
        questions[1].text = "Вопрос#2 для квиза";
        questions[1].options = options2;
    }

    public static void CreateQuiz()
    {
       Quiz01.setId(01);
       Quiz01.setName("Квиз_001");
       Quiz01.setQuestionList(questions);
    }

}
