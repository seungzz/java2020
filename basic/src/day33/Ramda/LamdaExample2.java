//package day33.Ramda;
//
//import java.util.function.Predicate;
//
//public class LamdaExample2 {
//	
//
//		private static Student[] students = {
//
//				new Student("강승지",92,90),
//				new Student("이은주",90,95)
//		};
//		public static double avg(Predicate<Student> predicate) {
//			int count =0, sum =0;
//			for(Student student : students) {
//				if(predicate.test(student)) {
//					count++;
//					sum +=student.getScore();
//				}
//			}
//			return (double)sum/count;
//		}
//		
//		public static void main(String[] args) {
//			double englishAvg = avg(s-> s.getEnglishScore());
//			System.out.println("영어평균점수: "+englishAvg);
//			double mathAvg = avg( s ->s.getMathScore());
//			System.out.println("수학평균점수: "+mathAvg);
//		}
//		
//		public static class Student{
//			private String name;
//			private int englishScore;
//			private int mathScore;
//			
//		}
//}
//		