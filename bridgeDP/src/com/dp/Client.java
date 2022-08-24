package com.dp;

public class Client {

	public static void main(String[] args) {

		String os = "Centos";

		FileDownloadAbs download = null;
		switch (os) {
		case "windows":
			download = new FileDownloadImpl(new WindowImpl());
			break;
		case "linux":
			download = new FileDownloadImpl(new LinuxImpl());
			break;
		case "Mac":
			download = new FileDownloadImpl(new MacImpl());
			break;
		case "Centos":
			download = new FileDownloadImpl(new CentosImpl());
			break;
		default:
			System.out.println("Not supportive OS");
		}
		Object filedata = download.download("add path");
		download.storedata(filedata);
	}

}
