package com.app;

public class AppMAin {

	public static void main(String[] args) {
		// real article
		AppArticle article = new AppArticle(101, "Demo Article");
		article.setContents("This is demo contents");
		System.out.println(article);

		AppArticleMemento mem = article.createMemento();// creating immutable memento
		article.setContents("new contents"); // changed
		System.out.println(article);

		article.restore(mem);
		System.out.println(article);

	}

}
