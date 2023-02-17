import java.util.ArrayList;

public class Right extends BuiltInFunctionNode {

	//Right someString, length, var resultString
	//ResultString = last length characters of someString

	@Override
	public void execute(ArrayList<InterpreterDataType> param) throws Exception {
		// TODO Auto-generated method stub
		if(param.size() != 3) {
			throw new Exception ("Invalid number of parameters");
		}
		
		if(!(param.get(0) instanceof StringDataType)) {
			throw new Exception("Invalid parameter type: needs String Data Type for first argument");
		}
		
		if(!(param.get(1) instanceof IntDataType)) {
			throw new Exception("Invalid parameter type: needs Int Data Type for second argument");
		}
		if(!(param.get(2) instanceof StringDataType)) {
			throw new Exception("Invalid parameter type: needs String Data Type for third argument");
		}
		
		//gets parameters and sets datatype 
		StringDataType strdata = (StringDataType)param.get(0);
		String str = strdata.typevalue;
		IntDataType intdata = (IntDataType)param.get(1);
		int length = intdata.typevalue;
		StringDataType strdata2 = (StringDataType)param.get(2);
		String temp = str.substring(str.length() - length);
		//sets value of last var variable
		strdata2.setValue(temp);
	

}
}
