package behavioral.template;

public class MysqlQueryExecutor extends QueryExecutor {

	@Override
	public void beginTransaction() {
		System.out.println("MYSQL : Begin Transaction");
	}

	@Override
	public void executeQuery() {
		System.out.println("MYSQL : Perform Transaction");
	}

	@Override
	public void endTransaction() {
		System.out.println("MYSQL : End Transaction");
	}
}
