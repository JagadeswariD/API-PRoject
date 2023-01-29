package jpa.service;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import jpa.entitymodels.Course;

class CourseServiceTest {
	private Course expectedCourse;
	private static CourseService courseService;

	//BeforeAll method used for initializing CourseService
	
	@BeforeAll
	public static void openSession() {
		courseService = new CourseService();
	}
	
	//Testing GetCourseById method using Parameterized Query Test
	
	@ParameterizedTest
	@CsvSource({
	"1,English,Anderea Scamaden",
	"2,Mathematics,Eustace Niemetz"
	})
	void testGetCourseById(ArgumentsAccessor arguments) {
		expectedCourse = new Course();
		expectedCourse.setCid(arguments.getInteger(0));
		expectedCourse.setCName(arguments.getString(1));
		expectedCourse.setCInstructorName(arguments.getString(2));
		Course actualCourse = courseService.GetCourseById(arguments.getInteger(0));
		Assertions.assertEquals(expectedCourse, actualCourse);
	}

}
