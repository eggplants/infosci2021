/**
 * kadai 08-01
 *
 * @author haruna wataru
 * @version 2021-06-10
 */
class Mine
{
	private int		no;
	private String	name;

	void setData(int n, String s) {
		no =	n;
		name =	s;
	}
	void print() {
		System.out.println(no);
		System.out.println(name);
	}
	void formalPrint() {
		System.out.println("No	: " + no);
		System.out.println("Name	: " + name);
	}
}

class Person
{
	public static void main(String args[]) {
		Mine m = new Mine();
		m.setData(1, "Tanaka");
		m.print();
		String hr = "-".repeat(20);
		System.out.println(hr);
		m.formalPrint();
		System.out.println(hr);
	}
}
