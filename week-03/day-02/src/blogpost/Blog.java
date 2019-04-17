package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

	List<BlogPost> archive = new ArrayList<>();

	public void storePost(BlogPost item) {
		archive.add(item);
	}
	public void deletePost(int idxToDelete) {
		archive.remove(idxToDelete);
	}
	public void updatePost(int idxToUpdate, BlogPost item) {
		archive.set(idxToUpdate, item);
	}
	public void seeAllPosts() {
		for (BlogPost post : archive) {
			System.out.println(post.authorName + "; " + post.title + "; " + post.text + "; " + post.publicationDate);
		}
	}
}

