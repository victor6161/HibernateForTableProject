import java.util.ArrayList;
import java.util.List;

import com.iba.kozlov.bl.service.BookServiceImpl;
import com.iba.kozlov.bl.service.ReaderService;
import com.iba.kozlov.bl.service.WriterService;
import com.iba.kozlov.db.dto.BookDto;
import com.iba.kozlov.db.dto.ReaderDto;
import com.iba.kozlov.db.dto.WriterDto;

public class Main {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {
		case 1: {
			System.out.println("1 - read writer");
			List<WriterDto> writerDto = new ArrayList<WriterDto>();
			writerDto = new WriterService().readWriters();
			for (WriterDto writer : writerDto) {
				System.out.println(writer.toString());
			}
		}
			break;

		case 2: {
			System.out.println("2 - create writer");
			WriterDto writerDto = new WriterDto();
			writerDto.setName("Fedor");
			writerDto.setSurname("Dostoevsky");
			new WriterService().createWriter(writerDto);
		}
			break;
		case 3: {
			System.out.println("3 - update writer");
			WriterDto writerDto = new WriterDto();
			writerDto.setId(48);
			writerDto.setName("Feodor");
			writerDto.setSurname("Dostoeeeeeeeeeeeeevsky");
			new WriterService().editWriter(writerDto);
		}
			break;
		case 4: {
			System.out.println("4 - read readers");
			List<ReaderDto> readerDto = new ArrayList<ReaderDto>();
			readerDto = new ReaderService().readReaders();

			for (ReaderDto reader : readerDto) {
				System.out.println(reader.toString());
			}
		}
			break;
		case 5: {
			System.out.println("5 - update book");
			BookDto bookDto = new BookDto();
			bookDto.setId(22);
			bookDto.setBookname("kniga ilay");
			bookDto.setPrice(20);
			WriterDto writerDto = new WriterDto();
			writerDto.setId(48);
			bookDto.setWriter(writerDto);
			new BookServiceImpl().editBooks(bookDto);
		}
			break;

		case 6: {
			System.out.println("6 - search writer");
			List<WriterDto> writerDtoResult = new ArrayList<WriterDto>();
			WriterDto writerDto =new WriterDto();
			writerDto.setId(1);
			writerDtoResult = new WriterService().searchWriters(writerDto);
			for (WriterDto writer : writerDtoResult) {
				System.out.println(writer.toString());
			}
		}
			break;
			
		case 7: {
			System.out.println("7 - search book");
			List<BookDto> writerDtoResult = new ArrayList<BookDto>();
			BookDto bookDto =new BookDto();
			bookDto.setId(1);
			List <WriterDto> writerDtoList=new ArrayList<WriterDto>();
			WriterDto writer= new WriterDto();
			writer.setId(1);
			writerDtoList.add(writer);
			writer.setId(2);
			writerDtoList.add(writer);
			bookDto.setWriters(writerDtoList);
			writerDtoResult = new BookServiceImpl().searchBooks(bookDto);
		/*	for (WriterDto writer : writerDtoResult) {
				System.out.println(writer.toString());
			}*/
		}
			break;
		}
	}
}
