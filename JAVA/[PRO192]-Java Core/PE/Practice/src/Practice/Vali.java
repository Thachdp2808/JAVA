package Practice;
import java.util.List;
/**
 *
 * @author alias
 */
public interface Vali {
    public void add(List<Student> list);
    public void display(List<Student> list);
    public void remove(List<Student> list, int index);
    public void edit(List<Student> list, int index);
}
