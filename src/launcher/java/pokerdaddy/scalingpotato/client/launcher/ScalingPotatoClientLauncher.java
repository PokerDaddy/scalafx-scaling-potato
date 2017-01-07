package pokerdaddy.scalingpotato.client.launcher;

import java.io.IOException;

import org.kneelawk.cpcontrol.CPControl3;

public class ScalingPotatoClientLauncher {

	public static void main(String[] args) {
		CPControl3 cp = new CPControl3("pokerdaddy.scalingpotato.client.ScalingPotatoClient");
		cp.addExtractingFromFileLibrary(CPControl3.ME)
				.addLibrary("application", new CPControl3.DirectoryEntryFilter("app"), CPControl3.ALWAYS_DELETE)
				.addLibrary("libraries", new CPControl3.DirectoryEntryFilter("libs"), CPControl3.ALWAYS_DELETE);
		
		try {
			cp.launch(args);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
