package Repository;

import modele.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface BookRepository extends JpaRepository <Book, Long> {
    public List<Book> findByTitleContainingOrContentContaining(String key1, String key2);
}
