package springboot.sample.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
//	List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("Java","Core Java Starter","Basics of Core Java"),
//			new Topic("Spring","Spring Starter","Spring Framework basics"),
//			new Topic("JavaScript","JavaScript Starter", "JavaScript basics")
//			));
	
	public List<Topic> getAllTopics(){
		//return topics;
		ArrayList<Topic> topic = new ArrayList<>();
		topicRepository.findAll().forEach(topic::add);
		return topic;
	}
	
	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
//		for(int i=0;i< topics.size();i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}

}
