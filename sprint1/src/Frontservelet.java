package src;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Frontservelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Récupérer l'URL complète de la requête
        String url = request.getRequestURL().toString();

        // Récupérer aussi la query string (paramètres après "?")
        String queryString = request.getQueryString();
        if (queryString != null) {
            url += "?" + queryString;
        }

        // Réponse en HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>URL de la page appelée :</h3>");
        out.println("<p>" + url + "</p>");
        out.println("</body></html>");
    }
}
