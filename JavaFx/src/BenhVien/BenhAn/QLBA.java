package BenhVien.BenhAn;


import java.util.*;

public class QLBA {
    private Set<BenhAn> set;
    private LinkedList<BenhAn> list;

    public QLBA() {
        set = new LinkedHashSet<BenhAn>();
    }
    public QLBA(Set<BenhAn> set) {
        this.set = set;
    }

    public List<BenhAn> getList() {
        return new ArrayList<BenhAn>(set);
    }

    public Set<BenhAn> getSet() {
        return set;
    }

    public Boolean add(BenhAn v) {
        if (!set.contains(v)) {
            set.add(v);
            return true;
        }
        return false;
    }
    public void show() {
        if(set.size()==0){
            System.out.println("Rỗng");
        }
        else{
            set.forEach((i) -> System.out.println(i.toString()));
            System.out.println();
        }
    }
    public void removeAll() {
        set.clear();
    }
    public void remove(BenhAn v){
        list=new LinkedList<BenhAn>(set);
        remove(list.indexOf(v));
    }
    public void remove(int vt){
        list=new LinkedList<BenhAn>(set);
        list.remove(list.get(vt));

        set.clear();set.addAll(list);
    }
    public void sxTen() {
        list=new LinkedList<BenhAn>(set);
        Collections.sort(list, (v1, v2) -> v1.getTen().compareTo(v2.getTen()));
        removeAll();
        set.addAll(list);
    }
    public void sxTuoi() {
        set = new TreeSet<BenhAn>(set);
    }
    public void updata(BenhAn v){
        list=new LinkedList<BenhAn>(set);
        updata(list.indexOf(v));
    }

    public void updata(int vt){
        Scanner scanner=new Scanner(System.in);

        list=new LinkedList<BenhAn>(set);
        BenhAn updata= list.get(vt);

        System.out.print("Bạn muốn sửa thông tin gì?\n1) CMTND\n2) Tên\n3) Năm sinh\n4) Cả ba\nChọn: ");int chon=scanner.nextInt();
        while(chon<1 || chon>4){
            System.out.print("Chọn: ");chon=scanner.nextInt();
        }
        if (chon==1){
            System.out.print("Nhập CMTND: ");String cmt=scanner.next();
            updata.setCmt(cmt);
        }
        else if(chon==2){
            System.out.print("Nhập tên: ");scanner.nextLine();String ten=scanner.nextLine();
            updata.setTen(ten);
        }
        else if(chon==3){
            System.out.print("Nhập năm sinh: ");int ns=scanner.nextInt();
            updata.setNs(ns);
        }
        else{
            System.out.print("Nhập CMTND: ");String cmt=scanner.next();scanner.nextLine();
            System.out.print("Nhập tên: ");String ten=scanner.nextLine();
            System.out.print("Nhập năm sinh: ");int ns=scanner.nextInt();
            updata.setCmt(cmt);updata.setTen(ten);updata.setNs(ns);
        }

        list.set(vt,updata);
        set.clear();
        set.addAll(list);
    }

    public static void main(String[] args) {
        QLBA qlba=new QLBA();
        qlba.add(new BenhAn("1","Nguyễn Viet Anh","M",2001,"ốm"));
        qlba.add(new BenhAn("2","Nguyễn Anh","M",2001,"ho"));
        qlba.add(new BenhAn("3","Viet ANh","M",2001,"sốt"));
        qlba.add(new BenhAn("4","Trần Anh","M",2003,"Viêm họng"));
        qlba.add(new BenhAn("5","Văn Anh","M",2004,"gãy chân"));
        qlba.add(new BenhAn("6","Lê Anh","M",2002,"gẫy tay"));
        qlba.add(new BenhAn("7","Hồ Anh","M",2005,"Bong gân"));

        qlba.show();

//        System.out.println("Sx tên");qlba.sxTen();qlba.show();
//        System.out.println("Sx tuổi");qlba.sxTuoi();qlba.show();
//
//        System.out.println("\nSửa");
//        qlba.updata(new BenhAn("1","Nguyễn Anh","M",2001,"Hoa mắt"));qlba.show();
        qlba.updata(4);qlba.show();
//
//        System.out.println("Xóa");
//        qlba.remove(new BenhAn("5","Văn Anh","M",2004,"Gãy chân"));qlba.show();
//        qlba.remove(5);qlba.show();
//        qlba.removeAll();qlba.show();

    }

}
