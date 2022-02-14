class Prog3{
	public static void main(String[] args){
		String space = " ";
		String street="magarpatta";
		String city="pune";

		String address = street + space + city;
		System.out.println(address );
		System.out.println(address.length() );
		System.out.println(address.indexOf("pune") );
		System.out.println(street.concat(space).concat(city) );
	}
}