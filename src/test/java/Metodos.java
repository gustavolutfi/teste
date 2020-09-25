import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Metodos {

    int senha;


    public void LerArquivo(){

        File file = new File("");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //CRIA UM WORKBOOK = PEGA TODAS AS ABAS DAS PLANILHAS
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            //PEGA APENAS A ABA DEMANDADA NO INDEX
            XSSFSheet sheet = workbook.getSheetAt(0);

            //RETORNA TODAS AS LINHAS DA PLANILHA DEMANDADA NO INDEX (ABA)
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()){
                //RECEBE CADA LINHA DA PLANILHA
                Row row = rowIterator.next();
                //PEGAMOS TODAS AS CELULAS DESTA LINHA
                Iterator<Cell> cellIterator = row.iterator();
                //VARREMOS TODAS AS CELULAS  DA LINHA ATUAL
                while (cellIterator.hasNext()){
                    //CRIAMOS UMA CELULA
                    Cell cell = cellIterator.next();

                    System.out.println(cell);



                    //switch (cell.getCellType()){


//                        case Cell.CELL_TYPE_STRING:
//                            System.out.println("TIPO STRING: "+cell.getStringCellValue());
//                            break;
//
//                        case Cell.CELL_TYPE_NUMERIC:
//                            System.out.println("TIPO NUMERICO "+ cell.getNumericCellValue());
//                            break;
//
//                        case Cell.CELL_TYPE_FORMULA:
//                            System.out.println("TIPO FORMULA "+cell.getCellFormula());
//                            break;
                    }
                }
            //}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public void digiteSenha(String _senha){
//        if (_senha.equalsIgnoreCase("22")){
//            this.LerArquivo();
//        }else {
//            System.out.println("DIGITE NOVAMENTE");
//        }
//
//
//    }

    public void nome(){
        LerArquivo();
    }

}

