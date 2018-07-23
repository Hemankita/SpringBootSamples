package springboot.sample.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
//	List<course> courses = new ArrayList<>(Arrays.asList(
//			new course("Java","Core Java Starter","Basics of Core Java"),
//			new course("Spring","Spring Starter","Spring Framework basics"),
//			new course("JavaScript","JavaScript Starter", "JavaScript basics")
//			));
	
	public List<Course> getAllCourses(){
		//return courses;
		ArrayList<Course> course = new ArrayList<>();
		courseRepository.findAll().forEach(course::add);
		return course;
	}
	
	public Optional<Course> getCourse(String id) {
		//return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		//courses.add(course);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
//		for(int i=0;i< courses.size();i++) {
//			course t = courses.get(i);
//			if(t.getId().equals(id)) {
//				courses.set(i, course);
//				return;
//			}
//		}
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		//courses.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
		
	}

}
