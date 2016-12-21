/*************************************************************************
	> File Name: PkgTest.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月21日 星期三 20时32分18秒
 ************************************************************************/
class PkgTest {
	public static void main(String[] args) {
		Package[] pkgs;

		pkgs = Package.getPackages();

		for (int i = 0; i < pkgs.length; i++) {
			System.out.println(pkgs[i].getName() + " - " +
					pkgs[i].getImplementationTitle() + " - "+
					pkgs[i].getImplementationVendor() + " - " +
					pkgs[i].getImplementationVersion()
					);
		}
	}
}
//包相关的操作
