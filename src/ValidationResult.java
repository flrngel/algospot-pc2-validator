import java.util.*;

public class ValidationResult
{
	private String outcome;
	private String message;

	public ValidationResult(String outcome, String message)
	{
		this.outcome = outcome;
		this.message = message;
	}

	public String toPC2Result(String resultFileName)
	{
		StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);

		f.format("{\"result\":\"%s\", \"message\":\"%s\"}",
			outcome,
			message);

		return sb.toString();
	}
}
