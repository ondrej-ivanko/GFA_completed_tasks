package blogpost;

public class TestBlogClass {
	public static void main(String[] args) {

		BlogPost blogPostObject = new BlogPost();
		BlogPost blogPostObject2 = new BlogPost();
		BlogPost blogPostObject3 = new BlogPost();

		blogPostObject.authorName = "John Doe";
		blogPostObject.title = "Lorem Ipsum";
		blogPostObject.text = "Lorem ipsum dolor sit amet.";
		blogPostObject.publicationDate = "2000.05.04.";

		blogPostObject2.authorName = "Tim Urban";
		blogPostObject2.title = "Wait but why";
		blogPostObject2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
		blogPostObject2.publicationDate = "2010.10.10.";

		blogPostObject3.authorName = "William Turton";
		blogPostObject3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
		blogPostObject3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center " +
						                     "of attention. When I asked to take his picture outside one of IBM’s " +
						                     "New York City offices, he told me that he wasn’t really into the whole " +
						                     "organizer profile thing.";
		blogPostObject3.publicationDate = "2017.03.28.";

		Blog newBlog = new Blog();
		newBlog.storePost(blogPostObject);
		newBlog.storePost(blogPostObject2);
		newBlog.storePost(blogPostObject3);
		newBlog.updatePost(2, blogPostObject2);
		newBlog.deletePost(0);

		newBlog.seeAllPosts();

	}
}
