

   public class MethodVoid {
	public static String tulisan = "Selamat Belajar Method pada Java!";

	public static void cetakTulisan(){
		System.out.println(tulisan);
	}

	public static void cetakNama(String nama){
		System.out.println("Nama saya adalah "+nama);
	}

	public static void main(String[] args){
		cetakTulisan();
		cetakNama("Damas Amirul Karim");
	}
}