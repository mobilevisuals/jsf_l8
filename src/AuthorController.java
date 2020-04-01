import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Admin
 */
@Named(value = "authorController")
@RequestScoped
public class AuthorController implements Serializable{


    private List<Author> authorList;

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }


    /**
     * Creates a new instance of AuthorController
     */
    public AuthorController() {
        authorList = new ArrayList<>();
        authorList.add(new Author("Josh", "Juneau"));
        authorList.add(new Author("Carl", "Dea"));
        authorList.add(new Author("Ced", "Dee"));
        authorList.add(new Author("Cc", "Derr"));
        authorList.add(new Author("Carl", "Deffer"));
    }





}