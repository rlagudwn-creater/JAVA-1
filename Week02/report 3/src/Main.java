//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;

    int person;
    String region;

    System.out.print("당신의 이름은? ");
    name = keyboard.nextLine();
    System.out.printf("%s님의 가족은 몇 명입니까?(예 4) ", name);
    person = keyboard.nextInt();
    keyboard.nextLine();
    System.out.printf("%s님의 가족은 어디에서 살지요? ", name);
    region = keyboard.nextLine();

    System.out.printf("%s님의 가족은 %d명 입니다.", name, person);
    System.out.printf(" %s님의 가족은 %s에서 살고 있습니다.", name, region);
}
