package calm;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ScoreCollectionTest {
	@Test
	public void answerArithmeticMeanOfTwoNumbers() {
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 10);
		
		int actualResult = collection.arithmeticMean();
		
		assertThat(actualResult, equalTo(7));
	}
}
