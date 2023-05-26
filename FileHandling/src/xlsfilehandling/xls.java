package xlsfilehandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xls {
	
	public static void main(String[] args) throws BiffException, IOException {
		{
			File f = new File("../FileHandling/file_example_XLS_10.xls");
			Workbook wk=Workbook.getWorkbook(f);
			Sheet s=wk.getSheet(0);
			int r=s.getRows();
			int c=s.getColumns();
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					Cell wc=s.getCell(j,i);
					System.out.println(wc.getContents());
				}
			}
		
	}
}

}
