package springboot.sample.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = Arrays.asList(
			new Topic("Java","Core Java Starter","Basics of Core Java"),
			new Topic("Spring","Spring Starter","Spring Framework basics"),
			new Topic("JavaScript","JavaScript Starter", "JavaScript basics")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
