package com.lsp;

public abstract class SocialMedia {
	
	// supports whatsapp,FB,INsta
	public abstract void chatwithfriends();
	// supports FB,INsta
	public abstract void publishPost(Object post);
	// supports whatsapp,FB,INsta
	public abstract void sendPhotosAndVideos();
	// supports whatsapp,FB
	public abstract void groupVideoCall(String ...users);

}
