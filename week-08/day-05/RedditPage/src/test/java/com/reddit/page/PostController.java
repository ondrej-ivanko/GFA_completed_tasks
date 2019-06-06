package com.reddit.page;

import com.reddit.page.model.Post;
import com.reddit.page.repository.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@WebMvcTest(PostController.class)
public class PostController {

	@Autowired
	MockMvc mockMvc;

	PostRepository mockPostRepository = Mockito.mock(PostRepository.class);

	@MockBean
	Post post;

	@Test
	public void upVoteCheckShouldRaiseCountOfUpvotes() throws Exception {
		Long id = 2L;
		/*Mockito.when(mockPostRepository.findById(id).get()).thenReturn(new Post("Tell me", "what is this about"))
				.then(post.upVote())
				.then(mockPostRepository.save(post))*/
	}
}
