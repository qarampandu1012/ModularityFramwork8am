package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.DownloadModule;

public class DownloadModuleTest extends DownloadModule {

	@Test(priority = 0)

	public void verifyDownloadPage() throws IOException {
		validateDownloadPage();
	}

	@Test(priority = 1)
	public void verifyAllJqueryUiDownloadPage() throws IOException {
		validateAllJqueryUiDownloadPage();
	}
}
