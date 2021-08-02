package behavioral.template;

public class OracleQueryExecutor extends QueryExecutor {

	@Override
	public void beginTransaction() {
		System.out.println("ORACLE : Begin Transaction");
	}

	@Override
	public void executeQuery() {
		System.out.println("ORACLE : Perform Transaction");
	}

	@Override
	public void endTransaction() {
		System.out.println("ORACLE : End Transaction");
	}
}
