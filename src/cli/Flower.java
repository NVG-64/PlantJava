package cli;

import utils.MyUtils;

@Deprecated
public class Flower extends Plant {
    public Flower() {
        super();
        int index = MyUtils.generateRandomInt(0, flowerList.length-1);
        plantName = flowerList[index];
    }

    // Nama Bunga
    // Link source:
    // https://id.wikipedia.org/wiki/Kategori:Bunga
    private final String[] flowerList = {
            "Ajang Kelicung",
            "Alternanthera",
            "Amarilis",
            "Anggrek Jamrud",
            "Anggrek Larat",
            "Anggrek Mutiara",
            "Anggrek Serat",
            "Anyelir",
            "Aster",
            "Azalea",
            "Bakung Lelabah Merah",
            "Bauhinia Coccinea",
            "Bellis Perennis",
            "Botan",
            "Bunga Air Mancur",
            "Bunga Kuku Macan",
            "Bunga Pukul Empat",
            "Bunga Tasbih",
            "Campsis Grandiflora",
            "Cempaka Hutan Kasar",
            "Crinum",
            "Crocus",
            "Dahlia",
            "Datura",
            "Daun Gedi",
            "Episcia",
            "Episcia Cupreata",
            "Euphorbia",
            "Flamboyan",
            "Gaillardia",
            "Gardenia",
            "Geranium",
            "Helianthus",
            "Herbras",
            "Hortensia",
            "Hymenocallis",
            "Ipomoea Obscura",
            "Jacaranda",
            "Kacapiring",
            "Kaliko",
            "Kenanga",
            "Kenikir Sulfur",
            "Kimilsungia",
            "Kuma-kuma",
            "Lavender",
            "Lili Hujan",
            "Lobelia Deckenii",
            "Mawar",
            "Mawar Biru",
            "Melati",
            "Narsis",
            "Oenothera",
            "Oshibana",
            "Pacar Iir",
            "Petunia",
            "Piretrum",
            "Primula",
            "Rafflesia",
            "Randa Tapak",
            "Rombusa",
            "Rosela",
            "Sakura",
            "Seroja",
            "Serunai",
            "Soka jawa",
            "Teratai",
            "Tulip",
            "Wrightia",
            "Wrightia Antidysenterica",
            "Xerochrysum Bracteatum",
            "Yareta",
            "Zinia",
            "Zodia",
    };
}
