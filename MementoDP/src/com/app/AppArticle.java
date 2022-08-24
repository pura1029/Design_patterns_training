package com.app;

public class AppArticle {

	private int id;
	private String title;
	private String contents;

	public AppArticleMemento createMemento() {
		AppArticleMemento apm = new AppArticleMemento(id, title, contents);
		return apm;
	}

	public void restore(AppArticleMemento m) {
		this.id = m.getId();
		this.title = m.getTitle();
		this.contents = m.getContents();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AppArticle(int id, String title) {
		super();
		this.id = id;
		this.title = title;

	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "AppArticle [id=" + id + ", title=" + title + ", contents=" + contents + "]";
	}

}
