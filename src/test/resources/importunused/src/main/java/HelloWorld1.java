package notestsource.src.main.java;

import static com.google.truth.Truth.assertThat;
import static org.junit.Assert.fail;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Set;
import javax.annotations.Nullable;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class HelloWorld1 {

  <T> void check(@Nullable List<T> x) {
    Preconditions.checkNodeNull(x);
  }

  void f() {
    List<String> xs = null;
    assertThat(xs).isNull();
    try {
      check(xs);
      fail();
    } catch (NullPointerException e) {
    }
  }
}