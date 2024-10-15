package Slip11;


	abstract class shape

	{

		abstract void area();

		abstract void volume();

	}

	class sphere extends shape

	{

		double pi=3.14;

		double radius=4.35;

		void area()

		{

			        double ar=4*pi*radius*radius;

				System.out.println("Area of Sphere is :"+ar);

		}

		void volume()

		{

			double vol=(4/3)*(pi*radius*radius*radius);

			System.out.println("Volume of Sphere is :"+vol);

		}

	}

	class cone extends shape

	{

		double pi=3.14;

		double radius=4.35;

		double height=6.45;

		void area()

		{

			double tot=pi*radius*height;

			System.out.println("Area of cone is :"+tot);

		}

		void volume()

		{

			double vol=(pi*radius*radius)*(height/3);

			System.out.println("Volume of Cone is :"+vol);

		}

	}

	class cylinder extends shape

	{

		double pi=3.14;

		double radius=4.35;

		double height=6.45;

		void area()

		{

			double A=(2*pi*radius*height)+(2*pi*radius*radius);

			System.out.println("Area of Cylinder is :"+A);

		}

		void volume()

		{

			double V=pi*radius*radius*height;

			System.out.println("Volume of Cylinder is :"+V);

		}

	}

	class box extends shape

	{

		int length=5;

		int breadth=7;

		double height=4.35;

		void area()

		{

			double a=(2*height*breadth)+(2*height*length)+(2*breadth*length);

			System.out.println("Area of Box is :"+a);

		}

		void volume()

		{

			double v=length*breadth*height;

			System.out.println("Volume of Box is :"+v);

		}

		public static void main(String a[])

		{

			sphere s=new sphere();

			s.area();

			s.volume();

			cone c=new cone();

			c.area();

			c.volume();

			cylinder cy=new cylinder();

			cy.area();

			cy.volume();

			box b=new box();

			b.area();

			b.volume();

		}

	}



