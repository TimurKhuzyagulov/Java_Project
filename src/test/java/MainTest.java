import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void createOptionsTest()
    {
        Main.CreateOptions();
        Assert.assertNotNull(Main.options1[0].getId());
        Assert.assertNotNull(Main.options1[0].getText());
        Assert.assertNotNull(Main.options1[0].isCorrect());

        Assert.assertNotNull(Main.options1[1].getId());
        Assert.assertNotNull(Main.options1[1].getText());
        Assert.assertNotNull(Main.options1[1].isCorrect());

        Assert.assertNotNull(Main.options1[2].getId());
        Assert.assertNotNull(Main.options1[2].getText());
        Assert.assertNotNull(Main.options1[2].isCorrect());

    }

    @Test
    public void createQuestionsTest()
    {
        Main.CreateQuestions();
        Assert.assertNotNull(Main.questions[0].id);
        Assert.assertNotNull(Main.questions[0].text);
        Assert.assertNotNull(Main.questions[0].options);

        Main.CreateQuestions();
        Assert.assertNotNull(Main.questions[1].id);
        Assert.assertNotNull(Main.questions[1].text);
        Assert.assertNotNull(Main.questions[1].options);
    }

    @Test
    public void createQuizTest()
    {
        Main.CreateQuiz();
        Assert.assertNotNull(Main.Quiz01.getId());
        Assert.assertNotNull(Main.Quiz01.getName());
        Assert.assertNotNull(Main.Quiz01.getQuestionList());

    }
}