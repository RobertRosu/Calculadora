package formatter;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import menu.Menu;
public class HTMLFormatter extends Formatter{
	
	@Override
	public String getHead(Handler h) {
	return "<HTML>\n "
			+ "<BODY> \n "
			+ "<HEAD><LINK rel=\"stylesheet\" href=\"style.css\"></HEAD>\n"
			+ "<TABLE> \n";
	}
	@Override
	public String format(LogRecord record) {
	String msg = record.getMessage();
	String[] cadena = msg.split(" ");
 	return 
	"<TR>"
	+ "\n<TH>Operación</TH>\n"
	+ "<TH>Operando 1</TH>\n"
	+ "<TH>Operando 2</TH>\n"
	+ "<TH>Resultado</TH>\n"
	+ "</TR>\n"
	
	+ "<TR>\n<TH>" + cadena[6] + "</TH>\n"
	+ "<TH>" + cadena[8] + "</TH>\n"
	+ "<TH>" + cadena[9] + "</TH>\n"
	+ "<TH>" + cadena[10] + "</TH></TR>\n";
	}
	
	@Override
	public String getTail(Handler h) {
	return " </TABLE>\n</BODY>\n</HTML>\n";
	}
}
