package Pirat;
@Csv
class Pirate {
  @CsvColumn String name;
  @CsvColumn String profession;
  @CsvColumn int height;
  @CsvColumn( format = "### €" ) double income;
  @CsvColumn( format = "###.00" ) Object weight;
  String secrets;
}

