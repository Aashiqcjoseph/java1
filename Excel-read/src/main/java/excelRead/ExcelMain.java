package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ExcelRead1.getStringData(1, 0));
		System.out.println(ExcelRead1.getIntegerData(1, 1));
		System.out.println(ExcelRead1.getStringData(2, 0));
		System.out.println(ExcelRead1.getIntegerData(2, 1));
		System.out.println(ExcelRead1.getStringData(3, 0));
		System.out.println(ExcelRead1.getIntegerData(3, 1));
		System.out.println(ExcelRead1.getStringData(4, 0));
		System.out.println(ExcelRead1.getIntegerData(4, 1));

	}

}
