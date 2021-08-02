package behavioral.template;

public abstract class QueryExecutor {
	protected abstract void beginTransaction();

	protected abstract void executeQuery();

	protected abstract void endTransaction();

	public final void execute() {
		this.beginTransaction();
		this.executeQuery();
		this.endTransaction();
	}
}
