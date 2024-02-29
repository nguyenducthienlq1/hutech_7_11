class main {
    public static void main(String[] args){
        conTho s=new conTho();
        s.layten("Thỏ");
        s.thucan("Rau củ");
        s.laychan(4);
        s.setTapTinh("Đào hang làm nơi chú ẩn");
        System.out.println("Name: "+s.ten());
        System.out.println("Eat: "+s.thucan());
        System.out.println("Legs: "+s.sochan());
        System.out.println("Tập tính: "+s.getTapTinh());

        System.out.println("--------------------------------------");

        conHo t=new conHo();
        t.layten("Hổ");
        t.thucan("Thịt");
        t.laychan(4);
        t.setBanNang("Săn mồi");
        System.out.println("Name: "+t.ten());
        System.out.println("Eat: "+t.thucan());
        System.out.println("Legs: "+t.sochan());
        System.out.println("Khả năng: "+t.getbanNang());

        System.out.println("--------------------------------------");

        conBo c=new conBo();
        c.layten("Bò");
        c.thucan("Cỏ");
        c.laychan(4);
        c.setSua("Sữa");
        System.out.println("Name: "+c.ten());
        System.out.println("Eat: "+c.thucan());
        System.out.println("Legs: "+c.sochan());
        System.out.println("Lợi nhuận: "+c.getSua());
    }
}
