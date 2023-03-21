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
        user.setDegreeProgram("Software Enineering");
        assertEquals("Software Enineering", user.getDegreeProgram());
    }

    @Test
    public void testGetIntake() {
        User user = new User();
        user.setIntake("38");
        assertEquals("38", user.getIntake());
    }

    @Test
    public void testGetDob() {
        User user = new User();
        user.setDob("08-10-2001");
        assertEquals("08-10-2001", user.getDob());
    }

    @Test
    public void testGetId() {
        User user = new User();
        user.setId(1L);
        assertEquals(1L, user.getId().longValue());
    }

    @Test
    public void testNewUser() {
        User user = new User();
        user.setStudentName("Sanithi");
        user.setRegno("D-BSE-21-0013");
        user.setFaculty("FOC");
        user.setDegreeProgram("Software Engineering");
        user.setIntake("38");
        user.setDob("08-10-2001");
        

        when(StudentRepository.save(any(User.class))).thenReturn(Student);

        User savedUser = StudentController.newUser(user);

        assertEquals(user.getStudentName(), savedUser.getStudentName());
        assertEquals(user.getRegno(), savedUser.getRegno());
        assertEquals(user.getFaculty(), savedUser.getFaculty());
        assertEquals(user.getDegreeProgram(), savedUser.getDegreeProgram());
        assertEquals(user.getIntake(), savedUser.getIntake());
        assertEquals(user.getDob(), savedUser.getDob());
}


}
