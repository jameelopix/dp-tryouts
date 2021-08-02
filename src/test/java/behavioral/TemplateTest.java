package behavioral;

import org.junit.Test;

import behavioral.template.MysqlQueryExecutor;
import behavioral.template.OracleQueryExecutor;
import behavioral.template.QueryExecutor;

public class TemplateTest {

	@Test
	public void testQueryExecutor() {
		QueryExecutor executor = new OracleQueryExecutor();
		executor.execute();
		System.out.println("--------------------------------");
		executor = new MysqlQueryExecutor();
		executor.execute();
		System.out.println("--------------------------------");
	}
}
