package becas.students.application.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import becas.students.domain.entity.Student;

@Service
public class StudentsDAO implements IStudentsDAO{

	@Override
	public List<Student> getallStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add( new Student("Pedro", "Medreiros"));
		students.add( new Student("Jose", "Tovar Marquino"));
		students.add( new Student("Jose", "Ilizarbe Tolentino"));		
		students.add( new Student("Alejandro", "Medreiros"));
		students.add( new Student("Ticte", "Tovar Marquino"));
		students.add( new Student("Grano", "Ilizarbe Tolentino"));		
		students.add( new Student("Jonas", "Medreiros"));
		students.add( new Student("Barrabas", "Tovar Marquino"));
		students.add( new Student("Keiko", "Ilizarbe Tolentino"));		
		return students;
	}

	@Override
	public List<Student> getallPosgradoStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add( new Student("Pedro", "Medreiros"));
		students.add( new Student("Jose", "Tovar Marquino"));
		students.add( new Student("Jose", "Ilizarbe Tolentino"));		

		return students;
	}

	@Override
	public List<Student> getallPregradoStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add( new Student("Jonas", "Medreiros"));
		students.add( new Student("Barrabas", "Tovar Marquino"));
		students.add( new Student("Keiko", "Ilizarbe Tolentino"));		

		return students;	}

	@Override
	public List<Student> getallDoctoradoStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add( new Student("Alejandro", "Medreiros"));
		students.add( new Student("Ticte", "Tovar Marquino"));
		students.add( new Student("Grano", "Ilizarbe Tolentino"));		

		return students;
	}

}

