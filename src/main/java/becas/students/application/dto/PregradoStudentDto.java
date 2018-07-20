package becas.students.application.dto;

public class PregradoStudentDto extends StudentsDto implements IBecable {

	@Override
	public float CalcularMonto() {
		
		return 500;
	}

	
}
