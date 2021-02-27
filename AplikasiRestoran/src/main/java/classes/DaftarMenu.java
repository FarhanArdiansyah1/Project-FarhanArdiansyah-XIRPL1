<<<<<<< HEAD
package classes;
import java.util.ArrayList;
public class DaftarMenu{
	private ArrayList<Menu> daftarMenu;
	public DaftarMenu() {}
	public void tambahMenu(Menu menu) {}
	public void getMenuByKategori(String kategori) {}
	public void tampilDaftarMenu() {}
=======
package classes;
import java.util.ArrayList;
public class DaftarMenu{
	private ArrayList<Menu> daftarMenu;
	public DaftarMenu() {
            daftarMenu = new ArrayList<>();
        }
	public void tambahMenu(Menu menu) {
            daftarMenu.add(menu);
        }
	public void getMenuByKategori(String kategori) {
            System.out.println("--------"+kategori+"--------");
            for (int i = 0; i<daftarMenu.size(); i++){
                Menu m = daftarMenu.get(i);
                if(m.getKategori().equals(kategori)) {
                    System.out.println((i+1)+". "+m.getNama_menu()+"\t"+m.getHarga());
                }
            }
        }
	public void tampilDaftarMenu() {
            System.out.println("======== ALDEBARAMEN ========");
            getMenuByKategori("Ramen");
            getMenuByKategori("Kuah");
            getMenuByKategori("Toping");
            getMenuByKategori("Minuman");
        }
>>>>>>> 8dd5cb0 (implementasi kelas modul C)
}