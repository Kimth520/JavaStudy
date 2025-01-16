package com.app.test;

import java.util.ArrayList;
import java.util.List;

import com.app.dao.LibDAO;
import com.app.domain.BookDTO;
import com.app.domain.RentalDTO;
import com.app.domain.UserDTO;

public class Main {
	public static void main(String[] args) {
		// 연결 테스트

//      try {
//         Connection conn = DBConnector.getConnection();
//         System.out.println("연결성공");
//         conn.close();
//      } catch (SQLException e) {
//         // TODO Auto-generated catch block
////         e.printStackTrace();
//         System.out.println("연결실패");
//      }

		UserDTO userDTO = new UserDTO();
		BookDTO bookDTO = new BookDTO();
		RentalDTO rentalDTO = new RentalDTO();
		LibDAO libDAO = new LibDAO();
		List<BookDTO> list = new ArrayList<>();

		// 회원가입
		//생성자
//		libDAO.join(new UserDTO("asd", "1234", "맹구", "01044445555"));

//		userDTO.setUserId("abc");
//		userDTO.setUserPw("1234");
//		userDTO.setUserName("홍길동");
//		userDTO.setUserPhone("123asdasdasd");
//
//		libDAO.join(userDTO);

		// 로그인
		if (libDAO.login("aaa", "1234") == -1) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("사용자 님의 사용자 번호는 " + libDAO.login("aaa", "1234"));
		}
		

//		libDAO.login("aaa", "1234");

//		// 도서 등록 - 형우
//		bookDTO.setBookTitle("웹 표준의 정석");
//		bookDTO.setBookAuthor("고경희");
//		libDAO.addBook(bookDTO);
//
//		bookDTO.setBookTitle("DBMS의 정석");
//		bookDTO.setBookAuthor("노형우");
//		libDAO.addBook(bookDTO);
//
//		bookDTO.setBookTitle("Java의 정석");
//		bookDTO.setBookAuthor("송명진");
//		libDAO.addBook(bookDTO);
//
//		bookDTO.setBookTitle("JavaScript의 정석");
//		bookDTO.setBookAuthor("김태현");
//		libDAO.addBook(bookDTO);
//
//		bookDTO.setBookTitle("정석의 정석");
//		bookDTO.setBookAuthor("신동석");
//		libDAO.addBook(bookDTO);
//
		// 도서 목록 조회 - 지수
//		list = libDAO.bookList();
//		list.forEach(System.out::println);
//
//		// 책번호로 도서조회 - 동석
//
//		BookDTO book = libDAO.bookSearch(2);
//		System.out.println(book);
		
// 대여 정보 입력 명진	
//		libDAO.rental(1,1, 7);

//// 대여상태확인 rentalCheck 태현

//		RentalDTO rental = libDAO.rentalCheck(1);
//		System.out.println(rental);

	}
}
