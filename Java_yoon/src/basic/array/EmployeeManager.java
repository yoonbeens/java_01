package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int i;

		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		init: 
			while(true) {
				System.out.println("\n========== 사원 관리 프로그램 ========="+count);
				System.out.println("# 1. 사원 정보 신규 등록");
				System.out.println("# 2. 모든 사원 정보 보기");
				System.out.println("# 3. 사원 정보 검색");
				System.out.println("# 4. 사원 정보 수정");
				System.out.println("# 5. 사원 정보 삭제");
				System.out.println("# 6. 프로그램 종료");
				System.out.println("====================================");

				System.out.println("> ");
				int menu = sc.nextInt();

				//입력, 출력, 조회, 수정, 삭제
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)

				
					if(menu == 1) {
						System.out.println("사원의 사번: ");
						String num = sc.next();

						for(i=0; i<count; i++) {
							if(num.equals(userNums[i])) {
								System.out.println("이미 존재하는 사번입니다. 시작메뉴로 돌아갑니다.");
								continue init;
							}
						}
						userNums[count] = num;

						System.out.println("사원의 이름: ");
						String name = sc.next();
						names[count] = name;

						System.out.println("사원의 나이: ");
						int age = sc.nextInt();
						ages[count] = age;

						System.out.println("사원의 부서: ");
						String depart = sc.next();
						departments[count] = depart;
						count++;

						System.out.println(Arrays.toString(userNums));
						System.out.println(Arrays.toString(names));
						System.out.println(Arrays.toString(ages));
						System.out.println(Arrays.toString(departments));
					} //if 1 end		
					else if(menu == 2) {
						//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
						//만약 사용자가 사원 등록을 한 명도 하지 않았다면
						//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
						System.out.println();
						if(count == 0) {
							System.out.println("등록된 사원 정보가 없습니다.");
							continue init;

						}
						for(i=0; i<count; i++) {
							System.out.println();
							System.out.println("사원 목록: ");
							System.out.println("사번: " + userNums[i]);
							System.out.println("이름: " + names[i]);
							
							
						} 





					}//if 2 end			

					else if(menu == 3) {
						//Modify, D2Q
						//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
						//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
						System.out.println("사번을 입력하세요: ");
						String num2 = sc.next();

						for(i=0; i<count; i++) {
							if(num2.equals(userNums[i])){
								System.out.println();

								System.out.println(" ");
								System.out.println("사번: " + userNums[i]);
								System.out.println("이름: " + names[i]);
							}
							
							}//for
						if(i==count) {
							System.out.println("조회하신 사원의 정보가 없습니다.");
						}
						}//if 3 end		

							else if(menu == 4) {
								//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
								//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
								//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
								//사번이 존재하지 않는다면 없다고 얘기해 주세요.
								System.out.println("사번을 입력하세요: ");
								String num2 = sc.next();
								
								for(i=0; i<count; i++) {
									if(num2.equals(userNums[i])) {
										System.out.println("1. 나이변경");
										System.out.println("2. 부서변경");
										System.out.println("3. 취소");
										
										System.out.println("> ");
										int num3 = sc.nextInt();
										
										if(num3 == 1) {
											System.out.println("변경 나이: ");
											int numAge = sc.nextInt();
											ages[i] = numAge;
											System.out.println(numAge + "로 변경되었습니다.");
										} else if(num3 == 2) {
											System.out.println("변경 부서: ");
											String numDepart = sc.next();
											departments[i] = numDepart;
											System.out.println(numDepart + "로 변경되었습니다.");
										} else {
											continue init;
										}
										
										
									}
									if(i==count) {
										System.out.println("조회하신 사원의 정보가 없습니다.");
									}
									
									
								}
								
								

							}//if 4 end		
							else if(menu == 5) {
								//DeleteQuiz
								//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
								//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
								//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
								//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
								//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
								//배열의 길이는 고정
								System.out.println("삭제하실 사번을 입력하세요.");
								String num2 = sc.next();


								for(i=0; i<count; i++) {
									if(num2.equals(userNums[i])) {//입력받은 사번 == 배열[i]에 있는사번 
										System.out.println("선택하신 " + num2 + " 를 삭제 하시겠습니까? Y/N");
										String yon = sc.next();
										if(yon.equals("Y")||yon.equals("y")) {
											for(int j=i; j<count; j++) {
												userNums[j] = userNums[j + 1];
												names[j] = names[j + 1];
												ages[j] = ages[j + 1];
												departments[j] = departments[j + 1];											
												
											}
										} else {
											continue init;
										}
									}
								}
								count--;
								
								System.out.println("삭제가 완료되었습니다.");
								for(int k=0;k<count;k++)
								System.out.printf("userNums[%d]: %s\n",k,userNums[k]);
								
								

							}//if 5 end		
							else if(menu == 6) {
								System.out.println("프로그램을 종료합니다.");
								sc.close();
								break; //while true break
							}//if 6 end		 
							else {
								System.out.println("메뉴를 잘못 입력하셨습니다.");

							}//else end		



						} //end while
					
				}//main
	}//class

				




				//						boolean flag = false;
				//		for(int i = 0; i<userNums.length; i++) {
				//			if(name.equals(userNums[i])) {
				//				flag = true;
				//				for(int j=i; j<userNums.length-1; j++) {
				//					userNums[j] = userNums[j+1];
				//				}
				//				break;
				//			}
				//		}









