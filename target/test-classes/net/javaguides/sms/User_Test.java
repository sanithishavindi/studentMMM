import com.example.sms.model.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class User_Test {
    
    @Test
    public void testGetStudentName() {
        User user = new User();
        user.setStudentName("Sanithi");
        assertEquals("Sanithi", user.getStudentName());
    }

    @Test
    public void testGetRegno() {
        User user = new User();
        user.setRegno("D-BSE-21-0013");
        assertEquals("D-BSE-21-0013", user.getRegno());
    }

    @Test
    public void testGetFaculty() {
        User user = new User();
        user.setFaculty("FOC");
        assertEquals("FOC", user.getFaculty());
    }

    @Test
    public void testGetDegreeProgram() {
        User user = new User();
        user.setDegreeProgram("gayaherath9468@gmail.com");
        assertEquals("gayaherath9468@gmail.com", user.getDegreeProgram());
    }

    @Test
    public void testGetId() {
        User user = new User();
        user.setId(1L);
        assertEquals(1L, user.getId().longValue());
    }


}
