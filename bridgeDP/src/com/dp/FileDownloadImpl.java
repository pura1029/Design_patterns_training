package com.dp;

public class FileDownloadImpl implements FileDownloadAbs {

	private FileDownloadIplemntr provider = null;

	public FileDownloadImpl(FileDownloadIplemntr provider) {
		super();
		this.provider = provider;
	}

	@Override
	public Object download(String path) {

		return provider.downloadFile(path);
	}

	@Override
	public boolean storedata(Object object) {
		return provider.storeFile(object);
	}

}
