package servlets;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {
    
     Note note = new Note();
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        note.setTitle(br.readLine());
        note.setContent(br.readLine());
        
        request.setAttribute("title", note.getTitle());
        request.setAttribute("contents", note.getContent());
       
        if (request.getParameter("edit") == null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
            
        } else {

            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
            
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        String newTitle = request.getParameter("editTitle");
        String newContent = request.getParameter("editContents");
        
        pw.println(newTitle);
        pw.print(newContent);
        pw.close();
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        note.setTitle(br.readLine());
        note.setContent(br.readLine());
        
        request.setAttribute("title", note.getTitle());
        request.setAttribute("contents", note.getContent());
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;   
    }

}
