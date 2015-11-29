class Tester{
	public Tester(){
	}

	public static void main(String[] args)
	{
		EndlessArray array = new EndlessArray();

		array.add(new Vector(0, 10, 10));
		array.add(new Vector(5, 5, 5));

		Vector v = (Vector)array.get(0);

		System.out.println(v.toString());
	}
}
