package no.jjohansen.master;

import android.app.Activity;
import android.os.Bundle;
import org.library.*;

/**
 *
 * @author Jan Rune Johansen
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // Aktivitet starter her
        setContentView(R.layout.main);
	
		String test = libfunc.getMessage();

    }

}
