package devops_grp_proj;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterTest {
	@Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    private RegisterTest servlet;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
        servlet = new RegisterTest();
    }


	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testDoPost() throws ServletException, IOException {
        when(request.getParameter("userName")).thenReturn("testUsername");
        when(request.getParameter("password")).thenReturn("testPassword");
        when(request.getParameter("email")).thenReturn("testEmail");
        when(request.getParameter("phonenumber")).thenReturn("testPhonenumber");

        servlet.doPost(request, response);
	}


	private void doPost(HttpServletRequest request2, HttpServletResponse response2) {
		// TODO Auto-generated method stub
		
	}
}
