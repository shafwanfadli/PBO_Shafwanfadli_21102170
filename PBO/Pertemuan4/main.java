package com.Shafwan.PBO.Pertemuan4;

public class main {
    public class Main {
        public static void main(String[] args) { manajer manajerkan1 =
                new manajer();
            pegawai pegawaikan1 = new pegawai();
            manajerkan1.nip = 123456789; manajerkan1.nama = "Shafwan Fadli";
            pegawaikan1.nip = 987654321; pegawaikan1.nama = "Shani Indira";
            manajerkan1.showInfo(); manajerkan1.extraInfo();
            manajerkan1.bonus(1200000); manajerkan1.bonus();
            pegawaikan1.showInfo();
        }
}
