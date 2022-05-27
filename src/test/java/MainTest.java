import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void createData()
    {
        Main.CreateQuiz();
        Main.CreateQuestions();
        Main.CreateOptions();
    }

    @Test
    public void createOptionsTest()
    {
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
        Assert.assertNotNull(Main.questions[0].id);
        Assert.assertNotNull(Main.questions[0].text);
        Assert.assertNotNull(Main.questions[0].options);

        Assert.assertNotNull(Main.questions[1].id);
        Assert.assertNotNull(Main.questions[1].text);
        Assert.assertNotNull(Main.questions[1].options);
    }

    @Test
    public void createQuizTest()
    {
        Assert.assertNotNull(Main.Quiz01.getId());
        Assert.assertNotNull(Main.Quiz01.getName());
        Assert.assertNotNull(Main.Quiz01.getQuestionList());

    }
}