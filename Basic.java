package com.vaishnavi;

 public class Basic {
		int num;
		void display() {
			System.out.println("display");
		}
		public static void main(String[] args) {
			System.out.println("hello");
			Basic ob=new Basic();
			ob.num=200;
			Basic ob2=new Basic();
			ob.num=400;
			System.out.println(ob2.num);
			ob2.display();
		}
	}

