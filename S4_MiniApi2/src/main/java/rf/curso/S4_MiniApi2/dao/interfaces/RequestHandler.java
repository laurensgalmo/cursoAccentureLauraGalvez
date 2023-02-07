package rf.curso.S4_MiniApi2.dao.interfaces;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public interface RequestHandler {

    public abstract String handleRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException;

}