package am.kanachsnund.kanachsnund.state;

import java.util.LinkedList;
import java.util.List;

public class MenuState {

    public static List<MenuState> x = new LinkedList<>();
    static {
        x.add(new MenuState(
                new LanguageState("Համմոս դասական","хумус классический", "sdfgh"),
                new LanguageState("Համմոս դասական\n" +
                        "Բաղադրիչներ․ սիսեռ, թահին, աղ, լիմոնի աղ, սխտոր, քիմիոն: \n" +
                        "1 կգ - 1600 դրամ,\n" +
                        "1 տուփ (250 գր) - 550 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 7 օր։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Համմոս բիբարով","фывапро", "sdfgh"),
                new LanguageState("Համմոս բիբարով\n" +
                        "Բաղադրիչներ․ սիսեռ, սիսեռ, թահին, աղ, լիմոնի աղ, սխտոր, քիմիոն, կարմիր բիբարի մածուկ: \n" +
                        "1 կգ - 2000 դրամ,\n" +
                        "1 տուփ ( 250 գր) - 650 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 7 օր։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Մութաբբալ","фывапро", "sdfgh"),
                new LanguageState("Մութաբբալ\n" +
                        "Բաղադրիչներ․ սմբուկ, թահին, աղ, լիմոնի աղ, սխտոր: \n" +
                        "1 կգ - 2000 դրամ,\n" +
                        "1 տուփ (250 գր) - 650 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 9 օր։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Մուհամմարա","фывапро", "sdfgh"),
                new LanguageState("Մուհամմարա\n" +
                        "Բաղադրիչներ․ կարմիր բիբար,նարշարաբ (նռան դոշաբ), բուսայուղ, պաքսիմատ,շաքարավազ, աղ, լիմոնի աղ, քիմիոն: \n" +
                        "1 կգ - 2000 դրամ,\n" +
                        "1 տուփ (200 գր) - 600 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 15 օր։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Զաթար (ձեթով)","фывапро", "sdfgh"),
                new LanguageState("Զաթար (ձեթով)\n" +
                        "Բաղադրիչներ․ բոված քունջութ, բոված սիսեռ, ծիտրոն, զոպա, աղ, խնկածաղիկ, սումախ, գետնանուշ +\n" +
                        "զեյթունի ձեթ,\n" +
                        "1 կգ - 4000 դրամ,\n" +
                        "1 տուփ (200 գր) - 850 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 1 տարի։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Զաթար (չոր)","фывапро", "sdfgh"),
                new LanguageState("Զաթար չոր (առանց ձեթ)\n" +
                        "Բաղադրիչներ․ բոված քունջութ, բոված սիսեռ, ծիտրոն, զոպա, աղ, խնկածաղիկ, սումախ, գետնանուշ։\n" +
                        "1 կգ - 3500 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 1 տարի։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Թահին","фывапро", "sdfgh"),
                new LanguageState("Քունջութի ամբողջական սերմերի մածուկ","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Մանթի","фывапро", "sdfgh"),
                new LanguageState("Մանթի (սառեցված)\n" +
                        "Բաղադրիչներ․ տավարի թարմ միս, սոխ, ձեթ, ալյուր, աղ, կարմիր և սև պղպեղ:\n" +
                        "1 կգ - 4000 դրամ,\n" +
                        "1 տուփ (430 գր) - 2800 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս։\n" +
                        "Պատրաստման և մատուցման եղանակը․ նախապես դնել նախօրոք տաքացրած 200 °C ջեռոցի մեջ։" +
                        " Եփելուց հետո դնել մատուցելիք ափսեի մեջ, ըստ ցանկության վրան լցնել մի քիչ արգանակ, սխտոր - մածուն," +
                        " հալեցված կարագ կարմիր պղպեղով և աղտոր։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Աչմա","фывапро", "sdfgh"),
                new LanguageState("Աչմա (սառեցված)\n" +
                        "Բաղադրիչներ․ Կարագ, պանիր, ալյուր, աղ, ձեթ, ձու, մաղադանոս:\n" +
                        "3000 դրամ ( 1 տուփ - 700 գր․)\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ դնել ջեռոցի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Սինի քյուֆթա","фывапро", "sdfgh"),
                new LanguageState("Սինի քյուֆթա (սառեցված)\n" +
                        "Բաղադրիչներ․ քյուֆթայի միս, բլղուր, իսկ միջուկը տավարի միս, ընկույզ, սոխ և համեմունքներ:\n" +
                        "4800 դրամ ( 1 տուփ- 900 գր․)\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ վրան քսել կարագ/ձեթ/յուղ և դնել ջեռոցի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Ֆալաֆել","фывапро", "sdfgh"),
                new LanguageState("Ֆալաֆել (սառեցված)\n" +
                        "Բաղադրիչներ․ սիսեռ, քիմիոն, աղ, սխտորի փոշի, սոխ բահար, սև պղպեղ, փխրեցուցիչ, կոճապղպեղ, ծիտրոն, համեմի սերմ: \n" +
                        "1 հատ (25 գր) - 100 դրամ,\n" +
                        "1 տուփ (630 գր) - 2800 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ պարտադիր սառած վիճակում տապակել շատ տաք ձեթի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Իշլի քյուֆթա","фывапро", "sdfgh"),
                new LanguageState("Իշլի քյուֆթա (սառեցված)\n" +
                        "Բաղադրիչներ․ տավարի մսի քյուֆթա և բլղուր։ Միջուկը՝ տավարի միս, , սոխ և համեմունքներ +ընկույզ \n" +
                        "1 հատ (փոքր, 35 գր) - 250 դրամ,\n" +
                        "1 հատ (մեծ, 55 գր) - 300 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ պարտադիր սառած վիճակում տապակել շատ տաք ձեթի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Քրոքեթ","фывапро", "sdfgh"),
                new LanguageState("Քրոքեթ (սառեցված)\n" +
                        "Բաղադրիչներ․ հավի միս, պանիր և համեմունքներ: \n" +
                        "1 հատ (40 գր) - 200 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ պարտադիր սառած վիճակում տապակել շատ տաք ձեթի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Քորդոն բլու","фывапро", "sdfgh"),
                new LanguageState("Քորդոն բլու (սառեցված)\n" +
                        "Բաղադրիչներ․ հավի միս և պանիր:\n" +
                        "1 հատ (65 գր) - 300 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ պարտադիր սառած վիճակում տապակել շատ տաք ձեթի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Երշիկ մարթադելլա","фывапро", "sdfgh"),
                new LanguageState("Երշիկ մարթադելլա (սառեցված)\n" +
                        "Բաղադրիչներ․ տավարի միս, սիրիական պիստակ և համեմունքներ:\n" +
                        "1 հատ (250 գր) - 2000 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Մատուցման եղանակը․ ուտելուց 4 ժամ առաջ հանել սառցախցիկից։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("Նրբաբլիթ","фывапро", "sdfgh"),
                new LanguageState("Նրբաբլիթ (սառեցված)\n" +
                        "Բաղադրիչներ․ կաթ, ձու, ալյուր և ձեթ։ Միջուկը՝ տավարի միս, սոխ, համեմ:\n" +
                        "1 հատ (45 գր) - 300 դրամ,\n" +
                        "Պահպաման Ժամկետը՝ 6 ամիս,\n" +
                        "Պատրաստման եղանակը․ տապակել ձեթի մեջ։","rfg","g")));

        x.add(new MenuState(
                new LanguageState("գհյ","фывапро", "sdfgh"),
                new LanguageState("g","rfg","g")));
    }
    private final LanguageState title;
    private final LanguageState desc;

    private MenuState(LanguageState title, LanguageState desc ) {
        this.title = title;
        this.desc = desc;
    }

}
