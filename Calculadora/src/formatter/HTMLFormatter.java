package formatter;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import menu.Menu;
public class HTMLFormatter extends Formatter{
	
	@Override
	public String getHead(Handler h) {
	return "<HTML>\n "
			+ "<HEAD><LINK rel=\"stylesheet\" href=\"style.css\"></HEAD>\n"
			+ "<BODY> \n "
			+ "<TABLE>\n"
			+ "<TR>\n"
			+ "<TH>Operacion</TH>"
			+ "<TH>Operando 1</TH>"
			+ "<TH>Operando 2</TH>"
			+ "<TH>Resultado</TH>\n</TR>\n";
	}
	@Override
	public String format(LogRecord record) {
	String msg = record.getMessage();
	String[] ret = msg.split(",");
 	return 
	 "<TR>\n<TD>" + ret[0] + "</TD>\n"
	+ "<TD>" + ret[1] + "</TD>\n"
	+ "<TH>" + ret[2] + "</TD>\n"
	+ "<TD>" + ret[3] + "</TD></TR>\n";
	}
	
	@Override
	public String getTail(Handler h) {
	return "</BODY>\n</HTML>\n";
	}
}
