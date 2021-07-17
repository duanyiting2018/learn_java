package builder_pattern.main;

import builder_pattern.main.ceilling.LevelTwoCeiling;
import builder_pattern.main.coat.DuluxCoat;
import builder_pattern.main.coat.LiBangCoat;
import builder_pattern.main.floor.ShengXiangFloor;
import builder_pattern.main.tile.DongPengTile;
import builder_pattern.main.tile.MarcoPoloTile;

public class Builder {
    public IMenu levelOne(Double area){
        return new DecorationPackageMenu(area,"豪华欧式").appendCeiling(
                new LevelTwoCeiling()).appendCoat(new DuluxCoat()).
                appendFloor(new ShengXiangFloor());
    }
    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area,"轻奢田园").appendCeiling(
                new LevelTwoCeiling()).appendCoat(new LiBangCoat()).
                appendFloor(new MarcoPoloTile());
    }
    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area,"现代简约")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new DongPengTile());
    }
}
