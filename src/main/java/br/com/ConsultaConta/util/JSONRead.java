package br.com.ConsultaConta.util;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Service;

@Service
public class JSONRead {

	public Object lerarquivo(){
	
	Reader in = new InputStreamReader(getClass().getResourceAsStream("/br/com/ConsultaConta/util/lancamento-conta-legado.json") );
	Object json = JSONValue.parse(in);
	return json;
	}
}