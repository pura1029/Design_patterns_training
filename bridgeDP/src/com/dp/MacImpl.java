package com.dp;

public class MacImpl implements FileDownloadIplemntr {

	@Override
	public Object downloadFile(String path) {

		return new Object();
	}

	@Override
	public boolean storeFile(Object object) {
		System.out.println("File is downloaded and ready in Mac");
		return true;
	}

}
