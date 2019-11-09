package test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Colin Fleming
 */
public class Main {
  public static void main(String[] args) throws FileNotFoundException, ScriptException {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    engine.eval(new FileReader("vega.js"));
    engine.eval(new FileReader("index.js"));
  }
}
