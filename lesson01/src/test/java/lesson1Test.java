import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson01.Greeting;
import ru.sberbank.jd.lesson01.GreetingImpl;


public class lesson1Test {
    GreetingImpl greeting = new GreetingImpl();

    @Test
    public void getFirstNameTest() {
        Assert.assertEquals(greeting.getFirstName(), "Константин");
    }

    @Test
    public void getLastNameTest() {
        Assert.assertEquals(greeting.getLastName(), "Поздеев");
    }

    @Test
    public void getBirtDateTest() {
        Assert.assertEquals(greeting.getBirthYear(), 1994);
    }

    @Test
    public void getHobbiesTest() {
        Assert.assertEquals(greeting.getHobbies().size(), 2);
    }

    @Test
    public void getRepoUrlTest() {
        Assert.assertEquals(greeting.getRepoUrl(), "https://github.com/pozdeevkv/home-assignments-0224/");
    }

    @Test
    public void getPhoneTest() {
        Assert.assertEquals(greeting.getPhone(), "89223130737");
    }

    @Test
    public void getCourseExpectationsTest() {
        Assert.assertEquals(greeting.getCourseExpectations().size(), 2);
    }

}
