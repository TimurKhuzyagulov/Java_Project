public class Main {
    static Quiz Quiz01= new Quiz();
    static Option[] options = new Option[3];
    static Question[] questions = new Question[4];


    public static void main(String[] args) {

        CreateQuiz();
        System.out.println(Quiz01.getId() +" "+Quiz01.getName());

    }

    public static void CreateQuiz()
    {
        options[0]=new Option();
        options[1]=new Option();
        options[0].setId(001);
        options[0].setText("Варинт1");
        options[0].setCorrect(true);
        options[1].setId(002);
        options[1].setText("Варинт2");
        options[1].setCorrect(false);

       questions[0]=new Question();
       questions[0].id=001;
       questions[0].text="Вопрос01 для квиза";
       questions[0].options=options;


       Quiz01.setId(001);
       Quiz01.setName("Квиз_001");
       Quiz01.setQuestionList(questions);
    }
}
